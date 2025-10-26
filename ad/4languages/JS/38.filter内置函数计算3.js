// ==================== 中药筛选模块 ====================
// 数字筛选：从药方中提取毒性>5的药材 ☠️
// 字符串筛选：筛选带"先煎"标记的药材 ♨️
// 字典筛选：捕获归经包含"肝经"的药材 🌿
// ⚠️虎山老药师：误筛会引发丹炉核爆

console.log("⚓⚓⚓⚓⚓⚓ 以下是数字筛选");
// def方法
function isEven(num) {
    return num % 2 === 0;
}
const newlistDef = Array.from({length: 10}, (_, i) => i).filter(isEven);
console.log(newlistDef);

// lambda方法
const newlistLambda = Array.from({length: 10}, (_, i) => i).filter(a => a % 2 !== 0);
console.log(newlistLambda);

console.log("\n", "🌌🌌🌌🌌🌌🌌 以下是字符串筛选");
function contain(string) {
    return string.includes("焦"); // 定义筛选
}
const three = ["山楂", "神曲", "麦芽", "焦山楂", "焦神曲", "焦麦芽"];

const threeFilter = three.filter(contain); // def 筛选焦三仙
console.log(threeFilter);

const threeLambda = three.filter(string => !string.includes("焦")); // lambda筛选
console.log(threeLambda);

console.log("\n", "🌟🌟🌟🌟🌟🌟 以下是字典筛选");
function keyContain(key) {
    return key.includes("莪术"); // 筛选key
}
function valueContain(value) {
    return value.includes("破血") || value.includes("补血"); // 多条件筛选值
}
function dictContain(item) {
    return item[0].includes("莪术") || item[0].includes("醋莪术"); // 多条件筛选字典
}
const dictBlood = {"当归": "补血", "丹参": "活血", "莪术": "破血", "醋莪术": "加强破血"}; // 血分药 正常字典

// key筛选
const keyBlood = Object.keys(dictBlood).filter(keyContain);
console.log(keyBlood);

// value筛选
const valueBlood = Object.values(dictBlood).filter(valueContain);
console.log(valueBlood);

// 字典筛选
const dictBloodAll = Object.fromEntries(
    Object.entries(dictBlood).filter(dictContain)
);
console.log(dictBloodAll);
        
        
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
  "桂枝": {
    "技术分类": ["微服务温经通阳散", "Serverless暖宫丸"],
    "核心功效": {
      "发汗解肌": "强制冷启动的Lambda函数预热（减少Shivering Cold Starts）",
      "温通经脉": "治疗gRPC接口寒厥（自动重试+熔断机制）",
      "助阳化气": "提升K8s Pod阳气（QPS从萎靡到勃起）"
    },
    "脉象诊断": {
      "缓脉": "如`setInterval(() => {}, 1000)`般稳定有力",
      "迟脉": "如同主库同步到从库的延迟（`SHOW REPLICA STATUS`）"
    },
    "舌象预警": {
      "舌红少苔": "Serverless阴虚（冷启动频率>5次/分钟）",
      "舌紫暗": "微服务血瘀（gRPC调用链超过10跳）"
    },
    "禁忌症": {
      "实热证": "Rust团队禁用（体内`Arc<Mutex>`过热会烧毁药性）",
      "血热妄行": "频繁`git push --force`者慎用（可能导致Commit历史大出血）"
    },
    "老中医坐镇": {
      "配伍禁忌": "严禁与`大黄`（暴力重构）同用，否则会引发`git reset --hard`级事故",
      "名场面": "某厂用桂枝+Kafka后，消息队列阳气过旺，把运维小哥鼻血喷成了`/var/log/messages`"
    },
    "开源建议": "需在`README.md`中加入**温阳警示**：『本方如`sudo rm -rf`，非阳虚勿服！』"
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
