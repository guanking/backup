function read_test(){
    var fs = require("fs");
    var data = "";
    var readerStream = fs.createReadStream("input.txt");
    readerStream.setEncoding("utf-8");
    readerStream.on('data', function(chunk){
        data += chunk;
    });
    readerStream.on("end", function(){
        console.log(data);
    });
    readerStream.on("error", function(err){
        console.log(err);
    });
    console.log("finished !");
}
function write_test(){
    var fs = require("fs");
    var data = "caoguanjie使用\n输入流";
    var writerStream = fs.createWriteStream("output.txt");
    writerStream.write(data, "utf-8");
    writerStream.write(data, "utf-8");
    writerStream.end();
    console.log("before");
    writerStream.on("finish", function(){
        console.log("写入完成");
    });
    console.log("after");
    writerStream.on("error", function(err){
        console.log(err);
    });
    console.log("finish!");
}
function test_pipe(){
    fs = require("fs");
    var readerStream = fs.createReadStream("input.txt");
    var writerStream = fs.createWriteStream("output.txt");
    readerStream.pipe(writerStream);
    readerStream.on("data", function(chunk){
        console.log(chunk);
    });
    writerStream.on("finish", function(){
        console.log("write finish");
    });
    console.log("finish !");
}
// read_test();
// write_test();
test_pipe();