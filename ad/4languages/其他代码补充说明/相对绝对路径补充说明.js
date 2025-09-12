const path = require('path');
const os = require('os');
// const iconv = require('iconv-lite'); //转GBK要这个库

// 相对路径的四种写法           [🔽🔽🔽🔽🔽🔽🔽🔽🔽🔽]
const dirPath = path.resolve(__dirname, "相对绝对路径补充说明.js");  // 隐式写法（推荐）
const dirPath1 = path.resolve(__dirname, ".\\相对绝对路径补充说明.js"); // 显式[单反斜杆]+无r（Windows风格）
const dirPath2 = path.resolve(__dirname, "./相对绝对路径补充说明.js"); // 显式[正单斜杆]写法（跨平台推荐）
const dirPath3 = path.resolve(__dirname, ".\\\\相对绝对路径补充说明.js"); // 显式[四反斜杆]写法  不推荐

console.log("💳💳💳💳💳💳 以下是相对路径四种写法\n");
console.log(dirPath);  // 获取完整路径 写法1
console.log(dirPath1); // 获取完整路径 写法2
console.log(dirPath2); // 获取完整路径 写法3
console.log(dirPath3); // 获取完整路径 写法4

// 绝对路径的三种写法 绝对路径都是显式写法---------------------------------------
const absPath = path.resolve("D:\\ad\\4languages\\其他代码补充说明\\相对绝对路径补充说明.js");     // [双反斜杆]写法
const absPath1 = path.resolve("D:/ad/4languages/其他代码补充说明/相对绝对路径补充说明.js");         // [正单斜杆]写法
const absPath2 = path.resolve("D:\\\\ad\\\\4languages\\\\其他代码补充说明\\\\相对绝对路径补充说明.js"); // [四反斜杆]写法 不推荐

console.log("\n🧰🧰🧰🧰🧰🧰 以下是绝对路径三种写法");
console.log(absPath);  // 获取绝对路径文件目录 写法1
console.log(absPath1); // 获取绝对路径文件目录 写法2
console.log(absPath2); // 获取绝对路径文件目录 写法3


console.log("\n🏆🏆🏆🏆🏆🏆 以下是其他高阶引用写法,开发人员必会");

// -------------------------------
// 父目录引用写法
// -------------------------------
const dirPath4 = path.resolve(__dirname, "../其他代码补充说明/相对绝对路径补充说明.js");
console.log(`\n父目录引用: ${dirPath4}`);

// -------------------------------
// 跨平台安全写法（推荐！）
// -------------------------------
const dirPath5 = path.resolve(__dirname, "4languages", "其他代码补充说明", "相对绝对路径补充说明.js");
console.log(`跨平台拼接: ${dirPath5}`);


// -------------------------------
// 环境变量动态路径（生产环境常用）
// -------------------------------
// 注意：Node.js 中对应的是 process.env.USERPROFILE（Windows）或 process.env.HOME（macOS/Linux）
const userHome = process.env.USERPROFILE || process.env.HOME; // 跨平台兼容获取用户目录
if (!userHome) {
    console.warn("⚠️ 未检测到用户主目录环境变量 USERPROFILE 或 HOME");
}

const absPath3 = path.resolve(userHome, "4languages", "相对绝对路径补充说明.js");
console.log(`\n环境变量路径: ${absPath3}`);


// -------------------------------
// UNC网络路径（企业开发必备）
// -------------------------------
// UNC 路径在 Windows 上是 \\host\share\...，Node.js 可以直接处理这种字符串
const absPath4 = path.resolve("\\\\192.168.1.1\\共享文件夹\\test.js");
console.log(`UNC网络路径: ${absPath4}`);


// -------------------------------
// 短文件名兼容（复古但有用）
// -------------------------------
// Windows 的短文件名（如 D:\AD~1\...），Node.js 字符串可以原样支持，但实际文件系统需存在该短名
const absPath5 = path.resolve("D:\\AD~1\\4LAN~1\\相对绝对路径补充说明.js");
console.log(`\n短文件名兼容: ${absPath5}`);


// -------------------------------
// 原始 bytes 路径（极端情况处理）
// -------------------------------
// Node.js 中没有直接的 bytes 类型像 Python 的 b''，但可以用 Buffer 模拟
// Windows 中文环境下常见编码有 gbk / utf8，这里用 gbk 演示解码
const pathBytes = Buffer.from("D:\\ad\\test.txt"); // 模拟 bytes 数据
// 注意：实际项目中遇到非 UTF-8 文件路径，可能需要根据系统环境转码，比如 utf8
console.log(`bytes路径: ${pathBytes.toString('utf8')}`); // 模拟 utf8 解码


// -------------------------------
// 路径诊断函数（path_doctor）
// -------------------------------
function pathDoctor(inputPath) {
    console.log(`\n诊断报告：`);
    console.log(`原始路径: ${inputPath}`);

    // 绝对路径
    const abs = path.resolve(inputPath);
    console.log(`绝对路径: ${abs}`);

    // 规范化路径（去除 ./ ../ 等冗余部分）
    const normalized = path.normalize(inputPath);
    console.log(`规范化: ${normalized}`);

    // 判断文件/目录是否存在
    // 注意：Node.js 中检查文件是否存在建议用 fs.existsSync (同步) 或 fs.promises.access (异步)
    const fs = require('fs');
    const exists = fs.existsSync(abs);
    console.log(`存在?: ${exists ? '✅' : '❌'}`);
}

// 调用诊断函数
pathDoctor("相对绝对路径补充说明.js");