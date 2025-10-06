// ==================== 中药集合模块 ====================
// 子集校验：药引是否在仙草库 🌿
// 相等判断：丹方是否被篡改 🔮
// 超集验证：药柜是否包含全部药材 🏺
// 交集分析：君臣药性相生相克 ☯️
// 并集计算：全药材大合集 🧪
// 差集处理：剔除相克药材 ⚠️
// ⚠️虎山老药师：算错五行会引发丹炉爆炸

console.log("🥯🥯🥯🥯🥯🥯🥯 以下是集合判断");
// JavaScript使用Set对象
const hd = new Set(["山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘"]); // 消化药
const hd3 = new Set(["山楂", "神曲", "麦芽"]); // 三仙单形态
const hd6 = new Set(["山楂", "神曲", "麦芽", "焦山楂", "焦神曲", "焦麦芽"]); // 三仙两种形态

// JavaScript的Set没有直接的集合运算符(<=, ==, >=)，需要手动实现
function isSubset(setA, setB) {
    for (const elem of setA) {
        if (!setB.has(elem)) {
            return false;
        }
    }
    return true;
}

function isEqual(setA, setB) {
    if (setA.size !== setB.size) return false;
    for (const elem of setA) {
        if (!setB.has(elem)) {
            return false;
        }
    }
    return true;
}

function isSuperset(setA, setB) {
    return isSubset(setB, setA);
}

console.log("<=判断当前集合是否为另一个集合子集,消化药<=单三仙:", isSubset(hd, hd3));
console.log("==判断两个集合是否相等消化药==单三仙:", isEqual(hd, hd3));
console.log(">=判断当前集合是否为另一个集合超集,消化药>=单三仙:", isSuperset(hd, hd3));

console.log("\n", "🧊🧊🧊🧊🧊🧊 以下是交并集运算");
// 交集
const intersection = new Set([...hd].filter(x => hd6.has(x)));
console.log("消化药和三仙两种形态的交集:", [...intersection]);

// 并集
const union = new Set([...hd, ...hd6]);
console.log("消化药和三仙两种形态的并集:", [...union]);

console.log("\n\n", "🥂🥂🥂🥂🥂🥂 以下是差集互减运算");
// 差集 (hd - hd6)
const difference1 = new Set([...hd].filter(x => !hd6.has(x)));
console.log("消化药和三仙两种形态的差集:", [...difference1]);

// 差集 (hd6 - hd)
const difference2 = new Set([...hd6].filter(x => !hd.has(x)));
console.log("三仙两种形态和消化药的差集:", [...difference2]);
        
        
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
  "谷芽": {
    "技术分类": [
      "日志膨松剂（轻量版）",  # 防ELK日志板结但力度＜麦芽
      "API调用酵母粉",        # 优化低并发接口消化
      "数据库健胃颗粒"       # 防SQLite积食
    ],
    "系统特性": "甘平",
    "适用场景": "日常维护型积食（如每日定时任务堆积）",
    "教主点评": "如同`kubectl logs --tail=100`——温和但不够劲爆"
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
