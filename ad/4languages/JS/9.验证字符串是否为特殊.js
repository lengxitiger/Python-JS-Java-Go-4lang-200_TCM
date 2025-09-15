// ==================== 中药校验模块 ====================
// 药方是否可打印检测  // 道士画符基本功 🖌️
// 处方空白处校验  // 神农留下的神秘代码 🌀
// 药材名合法标识检查  // 禁用语：长生不老药 💊
// 煎法是否以"先煎"开头  // VIP药材待遇 👑
// 方剂是否以"汤"结尾  // 不是汤难道是奶茶？ 🧋
// ⚠️虎山老药师：乱改药方会被雷劈

// JavaScript 版本
const printWord = "\n\t"; // 非打印字符
const printWord1 = "name\t"; // 混合字符
const printWord2 = "红花red"; // 可打印字符

// JavaScript 没有直接的 isprintable 方法，可以模拟
function isPrintable(str) {
    return !/[^\x20-\x7E\u4E00-\u9FA5]/.test(str); // 简单模拟，包含ASCII可打印字符和汉字
}

console.log(isPrintable(printWord));     // false
console.log(isPrintable(printWord1));    // false
console.log(isPrintable(printWord2));    // true
console.log("-".repeat(40));

const empty = " ";    // 纯空字符
const emptyNo = "红花 丹参";  // 含有空字符

console.log(/^\s+$/.test(empty), "是否为空字符,True");    // true
console.log(/^\s+$/.test(emptyNo), "是否为空字符,False"); // false

// 检查有效标识符
function isIdentifier(str) {
    return /^[a-zA-Z_$][a-zA-Z0-9_$]*$/.test(str);
}

console.log(isIdentifier("if"), "if是否为有效标识符或变量名:True");    // true
console.log(isIdentifier("name"), "name是否为有效标识符或变量名:True"); // true
console.log(isIdentifier("8a"), "8a是否为有效标识符或变量名:False");    // false
console.log("-".repeat(40));

const baidu = "www.baidu.com";
console.log(baidu.startsWith("www"), "是否为www开头:True"); // true
console.log(baidu.startsWith("www", 5), "是否为www第6索引开头:False"); // false
console.log(baidu.endsWith("com"), "是否为com结尾:True"); // true
        
        
// ===========================================================================JS
// [中医极客] 药材数据库 JSON 结构规范
// 
// 本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
//   - "性味归经" → 类属性约束
//   - "最大剂量" → API调用限制
//   - "编程寄语" → 设计模式建议
//
// 技术交流请通过GitHub Issues，严禁医疗用途
// ===========================================================================JS
/*

{
  "白术": {
    "技术分类": [
      "流量健脾丸",       # 治Ingress水肿
      "服务网格祛湿散",   # 消Istio虚胖
      "CPU燥湿丹"        # 防容器湿气（CPU抖动）
    ],
    "系统特性": "苦甘温",  # 带“苦”字，专治苦逼运维
    "作用域": ["LB", "ServiceMesh", "Container"],
    "健运阈值": "10Gbps",  # 原“最大剂量”
    "基础功能": "消除Nginx水肿，提升API消化能力",
    "高阶用法": "云原生脾虚疗法（配合K8s HorizontalPodAutoscaler更佳）",
    "架构建议": "如同给F5吃白术——既要抗流量洪峰，又要防湿气（Latency）滞留",
    "教主警示": {
      "经典翻车": "2023年某厂白术过量导致LB主动拒食（健康检查误杀）",
      "抢救方案": "kubectl rollout restart deployment/白术健脾服务"
    },
    "养生黑话": "运维常服可防过劳肥（但会引发KPI焦虑）"
  }
}

*/
// ===========================================================================JS
// 数据协议声明：
// 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
// 2. 实际应用需遵守MIT协议附加条款
// 3. 企业合作请通过GitHub邮箱联系
// 
// 冷溪虎山数字本草实验室 © 2025
// ===========================================================================JS
