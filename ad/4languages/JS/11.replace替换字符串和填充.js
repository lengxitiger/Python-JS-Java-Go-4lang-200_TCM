// ==================== 中药炼丹房 ====================
// 药方.replace("附子", "制附子")  // 毒性减肥术 ☠️➡️🌿
// 煎法.expandtabs(2)  // 火候间隔标准化 🕒
// 药名.center(8)  // 让君药站C位 👑
// 剂量.ljust(4)  // 左靠齐防止手抖 🫳
// 用法.rjust(6)  // 右对齐仙气飘飘 🧚
// ⚠️虎山老药师：乱改药方会遭天谴

let wide_hot = "防风,荆芥,紫苏,白芷,桂枝,麻黄,辛夷,鹅不食草,干姜,香薷"; //辛温解表 字符串
let wide = "防风\t辛温\t解表";
let wide1 = "防风辛温解表";

// 替换逗号为空字符串
console.log(wide_hot.replace(/,/g, "")); // old,new
console.log(wide_hot.replace(/,/g, "-").replace(/-/, "-").replace(/-/, "-").replace(/-/, "-").replace(/-/, "-")); // 替换前5个逗号为"-"

// 更简单的方式是使用split和slice
let parts = wide_hot.split(",");
let firstFiveReplaced = parts.slice(0, 5).join("-") + parts.slice(5).join("");
console.log(firstFiveReplaced);

console.log("\n-------------以下是TAB制表符转换为空格------------------");
console.log(wide);
console.log(wide.replace(/\t/g, "        ")); // 替换默认字符数为8
console.log(wide.replace(/\t/g, "  ")); // 字符数为2


console.log("\n-------------以下是对齐填充------------------");
// 对齐填充
function center(str, width, char) {
    let padLength = width - str.length;
    if (padLength <= 0) return str;
    let leftPad = Math.ceil(padLength / 2);
    let rightPad = Math.floor(padLength / 2);
    return char.repeat(leftPad) + str + char.repeat(rightPad);
}

function ljust(str, width, char) {
    return str + char.repeat(width - str.length);
}

function rjust(str, width, char) {
    return char.repeat(width - str.length) + str;
}

console.log(center(wide1, 10, "-"));
console.log(ljust(wide1, 10, "-"));
console.log(rjust(wide1, 10, "-"));

        
        
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
  "黄芪核心法则": {
    "第一定律（能量守恒）": "补气量 - 破气量 = 系统实际吞吐增量",
    "第二定律（药材质检）": "野生黄芪API延迟必须<50ms，栽培黄芪TPS波动≤15%",
    "第三定律（体质感知）": "kubectl top node的CPU负载就是患者的‘脉象’"
  },
  "行气药分级表": {
    "温和派（陈皮/木香）": {
      "技术映射": "Istio流量镜像 + SQS死信队列",
      "适用场景": "日常流量波动（相当于程序员喝陈皮茶）",
      "教主质检法": "kubectl describe pod | grep 'Restarts' ≤3次"
    },
    "危险派（枳实/青皮）": {
      "技术映射": "kubectl drain node --force",
      "死亡案例": "2024年某厂用枳实破Kafka积压，结果分区直接瘫痪",
      "质检标准": "必须满足：
1. Prometheus P99<200ms
2. 有完整的Rollback方案
3. 教主亲自开光"
    },
    "核弹派（莱菔子）": {
      "技术映射": "rm -rf /var/log/kafka/*",
      "使用条件": "当且仅当：
• 集群已备份
• 业务低峰期
• 烧三炷香再执行",
      "教主亲签": "如需使用，请先联系@分布式神农 视频面诊"
    }
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
