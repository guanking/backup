var http = require("http");
var queryString = require("querystring");
var data = queryString.stringify({
    "redirect": "http://www.sina.com/",
    "username": "c02804",
    "userpass": "D3LYmnG2g9"
});
var req = http.request({
    "hostname":"1.0.0.2",
    "port":"5281",
    "path":"/fun/web_main/webauth_login",
    "method":"POST",
    "headers": {
        'Content-Type': 'application/x-www-form-urlencoded',
        'Content-Length': data.length,
        "Connection":"keep-alive",
        "Cache-Control":"max-age=0",
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36(KHTML, like Gecko) Chrome/63.0.3236.0 Safari/537.36",
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
        "Accept-Encoding": "gzip,deflate",
        "Accept-Language": "zh-CN,zh;q=0.9",
        "Cookie":"rurl=http://www.sina.com/",
        "Origin": "http://1.0.0.2:5281",
        "Upgrade-Insecure-Requests": "1",
        "Referer": "http://1.0.0.2:5281/func/web_main/display/portal/webauth_http/webauth_http_web_login?redirect=http%3A%2F%2Fwww.sina.com%2F"
    }
}, function(res){
    var html = "";
    res.on("data", function(data){
        html += data;
    });
    res.on("end", function(){
        console.log(html);
    });
    console.log(res.statusCode);
});
req.on("error", function(err){
    console.error(err);
});
req.write(data);
req.end();
console.log("\nfinish !\n");

$.ajax({
    type: "post",
    url: "http://1.0.0.2:5281/fun/web_main/webauth_login",
    data: {
        "redirect": "http://www.sina.com/",
        "username": "c02804",
        "userpass": "D3LYmnG2g9"
    },
    dataType: "json",
    success: function (data) {
        console.log(data);
    },
    error:function(e){
        console.log(e);
    }
});