var strs = [
    3052,
    2738,
    2727,
    2738,
    2727,
    3052,
    2738,
    2727,
    2738,
    2727,
    1063,
    2727,
    2727,
    1063,
    22,
    2738,
    2727,
    2738,
    2727,
    22,
    22];
var result = [];
function exist(a, ele){
    for (let i = 0; i < a.length; i++) {
        if (ele == a[i]) {
            return true;
        }        
    }
    return false;
}
for (let i = 0; i < strs.length; i++) {
    const ele = strs[i];
    if (!exist(result, ele)) {
        result.push(ele);
    }
}
for (let i = 0; i < result.length; i++) {
    const ele = result[i];
    console.log(ele);
}