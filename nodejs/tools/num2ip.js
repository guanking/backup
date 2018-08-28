var num = 175705907;
var str = num.toString(2);
if(23 != str.length){
    let zeros = "00000000000000000000000000000000";
    str = zeros.substr(0, 32 - str.length) + str;
}
var result = "";
var val;
for (let i = 0; i < 4; i++) {
    val = parseInt(str.substr(i * 8, 8), 2).toString();
    if (0 == i) {
        result = val;
    }else{
        result += "." + val;
    }
}
console.log(result);