// ==================== 中药迭代模块 ====================
// 初始化炼丹迭代器  // 给仙草发炼丹顺序牌 🏷️
// 获取下味药材  // 神农氏的抓药机械臂 🤖
// 生成药效流  // 老君牌仙丹生成器 🌀
// 全药性检测  // 君臣佐使都要乖 ☯️
// 毒性快速筛查  // 发现一味毒药就警报 ☠️
// ⚠️虎山老药师：迭代错乱会炸炉

// 模拟Python的next()函数
function next(iterable, defaultValue) {
    const iterator = iterable[Symbol.iterator]();
    const result = iterator.next();
    return result.done ? defaultValue : result.value;
}

// 模拟Python的迭代器
const blood = ["当归", "丹参", "莪术"];
console.log(next(blood, "结束")); // 当归
console.log(next(blood, "结束")); // 丹参
console.log(next(blood, "结束")); // 莪术
console.log(next(blood, "结束")); // "结束"（模拟Python的默认值）

// 模拟Python的生成器
function* bloodThree() {
    yield "补血";
    yield "活血";
    yield "破血";
}

const three = bloodThree();
console.log("\n🔱🔱🔱🔱🔱🔱 以下是更高效的迭代器输出");
console.log(three.next().value); // 补血
console.log(three.next().value); // 活血
console.log(three.next().value); // 破血
// 再次调用会返回 { value: undefined, done: true }（类似Python的StopIteration）

// 模拟Python的all()和any()
function all(iterable) {
    for (const item of iterable) {
        if (!item) return false; // 短路求值
    }
    return true;
}

function any(iterable) {
    for (const item of iterable) {
        if (item) return true; // 短路求值
    }
    return false;
}

// 测试all()和any()
console.log("\n🔱🔱🔱🔱🔱🔱 以下是all和any判断迭代对象,类似于and和or");
// 检查所有输入是否非空（这里blood是数组，直接检查）
console.log(all(blood)); // true（所有元素非空）

const networkInterfaces = [false, false, true, false];
console.log(any(networkInterfaces)); // true（至少有一个true）
        
        
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
  "辛夷": {
    "技术定位": ["微服务通鼻膏", "API网关玉兰香"],
    "核心功效": {
      "发散风寒": "治疗`nginx`配置伤风（鼻塞级`502 Bad Gateway`）",
      "通鼻窍": "疏通`WebSocket`的长连接鼻窦炎"
    },
    "轻浮特性": {
      "药力评级": "⭐（毛多力弱，需`for循环`煎煮3次）",
      "封装要求": "必须用`JSON Schema`纱布包裹（防毛刺污染）"
    },
    "黑暗配方": {
      "增效方案": "辛夷炭（烧焦版）可治疗`TCP`的三次握手鼻炎",
      "致命组合": "搭配`麻黄`会引发`WebRTC`的狂暴级流鼻血"
    },
    "运维骚操作": {
      "熏蒸疗法": "放在`/dev/null`上方熏蒸，可缓解`console.log`打喷嚏",
      "教主偏方": "用玉兰花瓣擦SSD接口，提升`IOPS`芬芳度"
    },
    "开源警示": {
      "毛刺风险": "未经包裹直接煎煮会导致`Kafka`消息队列花粉过敏",
      "疗效质疑": "不如`鹅不食草`能打，但适合`Serverless`娇嫩体质"
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
