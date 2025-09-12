const text = "实验室报告：WBC 6×10⁹/L, RBC 8×10¹²/L（正常）";

// 匹配科学计数数字和中文注释
const pattern = /[\p{Number}×10⁰-⁹]+\/\p{Letter}|[\p{Script=Han}]+/gu;

const results = text.match(pattern);

console.log(results);  // Output: ["6×10⁹/L", "8×10¹²/L", "正常"]