var ip = "10.121.15.6";
var a = ip.split(".");
var num = 0;
num += parseInt(a[0]) * Math.pow(2,24);
num += parseInt(a[1]) * Math.pow(2, 16);
num += parseInt(a[2]) * Math.pow(2, 8);
num += parseInt(a[3]) * Math.pow(2, 0);
console.log(num);
