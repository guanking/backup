const buf = Buffer.from("ABCDEF", "ascii");
console.log(buf.toString("hex"));
console.log(buf.toString("binary"));
const str_base64 = buf.toString("base64");
console.log(str_base64);
const buf2 = Buffer.from(str_base64, "base64");
console.log(buf2.toString("ascii"));
console.log(buf.toJSON());
console.log(buf.length);
buf[0] += 32;
console.log(buf.toString("ascii"));
function name(fdsa) {
    fasdfdsafdsa=2;fdsafdsa=1;
}
