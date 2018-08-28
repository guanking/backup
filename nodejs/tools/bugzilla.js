/**
 * 使用说明：
 * 1、执行 svn log --search caoguanjie -l 100 --xml > result.xml 命令；
 * 2、把平台代码目录下的result.xml通过文件交互平台传到桌面；
 * 3、使用vscode打开文件，执行xml to json将xml转化为json，保存文件；
 * 4、修改改脚本中的file_path变量，只想脚本；
 * 5、将run函数复制到开发者工具中，回车进行函数定义；
 * 6、把第4步中的数组，作为run函数的参数，执行run函数；
 */
var file_path = "F:\\数据库审计\\res.xml";
var fs = require("fs");
var data = fs.readFileSync(file_path);
data = JSON.parse(data);
data = data.log.logentry;
result = {};
var reg = /^\s*bug\s*(\d+)\s*by\s*caoguanjie\s*$/i;
data.forEach((ele, index) => {
    var t = ele.msg.match(reg);
    if (t == null || t.length != 2) {
        console.error(index + " " + ele.msg);
    } else {
        result[t[1]] = 1;
    }
});
r = Object.keys(result);
r.sort();
console.log("BUG ID:");
console.log(r);

function run(ids) {
    var reg = /<title>(.*?)<\/title>/i;
    var result = {};
    ids.forEach(ele => {
        if (window.XMLHttpRequest) {// code for IE7, Firefox, Opera, etc.
            xmlhttp = new XMLHttpRequest();
        }
        else if (window.ActiveXObject) {// code for IE6, IE5
            xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
        }
        if (xmlhttp != null) {
            xmlhttp.open("GET", "http://192.168.2.253/bugzilla-2015/show_bug.cgi?id=" + ele, false);
            xmlhttp.send(null);
            if (xmlhttp.status == 200) {
                let r = xmlhttp.responseText.match(reg);
                if (r == null) {
                    console.error("bug " + ele + " match failed!");
                } else if (2 == r.length) {
                    let t_div = document.createElement("div");
                    t_div.innerHTML = r[1];
                    console.log(ele + " => " + t_div.innerText);
                    result[ele] = t_div.innerText;
                } else {
                    console.warn(ele + " " + r);
                }
            } else {
                console.error("bug " + ele + " not find! status : " + xmlhttp.status);
            }
        }
        else {
            console.error("Your browser does not support XMLHTTP.");
        }
    });
    return result;
}