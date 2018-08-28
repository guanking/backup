var fs =require("fs");
var data = fs.readFileSync("rf.js");
console.log(data.toString());
fs.readFile("rf.js", function(err,buf){
    if (err) {
        return console.error(err);
    }
    console.log(buf.toString());
});
console.log("程序执行结束");