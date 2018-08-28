var http = require("http");
http.createServer(function(request, response){
    response.writeHead(200, {"Content-Type":"text/plain"});
    response.end("Hello World!");
}).listen(8888);
console.log("server running at http://127.0.0.1:8888/");
function test(webpage_title) {
    var title_arr = webpage_title.split("");
    webpage_title = "";
    for (var i = 0; i < title_arr.length; i++)
    {
        if ('\\' == title_arr[i] && '\\' == title_arr[i + 1])
        {
            webpage_title += title_arr[i];
            i++;
            webpage_title += title_arr[i];
        }
        else if (('\\' == title_arr[i] && 'n' == title_arr[i + 1]) || 
                ('\\' == title_arr[i] && 'r' == title_arr[i + 1]))
        {
            i = i++;
        } 
        else 
        {
            webpage_title += title_arr[i];
        }        
    }
    console.log(webpage_title);
}
function find(str, sub_str) { 
    str = str.toLowerCase();
    sub_str = sub_str.toLowerCase();
    return -1 != str.indexOf(sub_str);
 }
