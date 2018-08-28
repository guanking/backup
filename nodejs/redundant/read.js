function r(fileName){
    var fs = require("fs");
    var data = fs.readFileSync(fileName);
    data = data.toString();
    // console.log(data);
    var a = [];
    data = data.split("\n");
    // console.log(data.length);
    var t;
    data.forEach(function(ele){
        if (-1 == ele.indexOf("proto_id")) {
            return;
        }
        t = ele.split(":");
        a.push(t[1]);
    });
    console.log(a.length);
    var r = [];
    var id = null;
    a.forEach(function(ele){
        id = ele&0xffff;
        if(-1 == r.indexOf(id)){
            r.push(id);
            // console.log(id);
        }
    });
    // console.log(r);
    return r;
}
var result = r("data");
var db2 = r("db2");
console.log("result : " + result);
console.log("db2 : " + db2);
db2.forEach(function(ele){
    if (-1 == db2.indexOf(result)) {
        console.log(ele);
    }
});