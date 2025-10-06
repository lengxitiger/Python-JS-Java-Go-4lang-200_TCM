// ==================== 中药随机模块 ====================
// 随机选取君药  // 天命之子选拔赛 👑
// 多味药材配伍  // 炼丹盲盒大礼包 🎁
// 无重复抽样检测  // 仙草质检抽查术 🔬
// 打乱煎药顺序  // 太上老君的恶作剧 😈
// 随机火候时间  // 丹炉温度摇号器 ♨️
// 阶梯式剂量  // 神农氏的量杯把戏 🥄
// 浮动药效系数  // 仙丹的不确定性 🌈
// ⚠️虎山老药师：过度随机会召唤丹炉怨灵

// JavaScript没有内置的random.choices和random.sample，需要自己实现
function randomChoice(arr) {
    return arr[Math.floor(Math.random() * arr.length)];
}

function randomChoices(arr) {
    const result = [];
    for (let i = 0; i < 1; i++) { // 只取一个元素，模拟random.choices
        result.push(randomChoice(arr));
    }
    return result;
}

function randomSample(arr, k) {
    const shuffled = [...arr].sort(() => 0.5 - Math.random());
    return shuffled.slice(0, k);
}

function shuffleArray(arr) {
    for (let i = arr.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [arr[i], arr[j]] = [arr[j], arr[i]];
    }
    return arr;
}

const hd = ['山楂','神曲','麦芽','谷芽','鸡矢藤','鸡内金','蜘蛛香','沙棘']; //消化药
const number = [1,2,3,4,5,6];

console.log("✒️✒️✒️✒️✒️✒️ 以下是返回指定序列单值");
console.log(randomChoices(hd));     //输出字符串列表随机值
console.log(randomChoice(number));  //输出数字列表随机数

console.log("\n🏷️🏷️🏷️🏷️🏷️🏷️ ️以下是随机生成指定列表不重复随机数");
console.log(randomSample(hd, 4));       //生成制定列表数量4不重复随机数
console.log(randomSample(number, 3));   //生成制定列表数量3不重复随机数

console.log("\n","📽️📽️📽️📽️📽️📽️ ️以下是打乱原列表的顺序");
shuffleArray(hd);
shuffleArray(number);
console.log(hd);     //打乱消化药顺序
console.log(number); //打乱1-6序列顺序

console.log("\n","🔢🔢🔢🔢🔢🔢🔢 以下是随机整数操作");
console.log(Math.floor(Math.random() * 11)); //返回0-10中间随机整数
console.log(Math.floor(Math.random() * 8));      //返回0-7中间随机整数
console.log(Math.floor(Math.random() * 10) + 10); //返回10-19中间随机整数（模拟步长为2需要更复杂的逻辑）
console.log((Math.random() * (6.0 - 2.0) + 2.0).toFixed(2)); //指定浮点数 返回范围随机浮点数
console.log((Math.random() * (9 - 5) + 5).toFixed(2));      //指定整数 返回范围随机浮点数
        
        
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
  "鸡矢藤": {
    "技术分类": [
      "死信队列除臭丸",      # 专治Kafka腐臭消息（三日未消费自动发酵）
      "内存泄漏驱虫散",      # 根治RSS内存驻留（比Valgrind更懂野指针）
      "技术债化尸水",       # 溶解祖传代码（兼容COBOL和IE6）
      "会议室清场喷雾"      # PM提无理需求时使用（物理驱散）
    ],
    "系统特性": "甘酸微凉（但臭味属大热）",
    "臭味等级": {
      "实验室环境": "💩💩💩（需N95 Sidecar）",
      "生产环境": "💩💩💩💩💩（触发AWS异味报警）",
      "教主认证": "相当于`sudo rm -rf node_modules/`的嗅觉冲击"
    },
    "核心优势": {
      "强制消积": "如同`kill -9`级药效，但支持优雅回滚",
      "附加效果": [
        "自动触发相邻工位CI/CD（闻到就精神）",
        "提高代码审查通过率（都想快点逃离）"
      ]
    },
    "玄学机制": {
      "臭味转化率": "1臭单位=1000QPS处理能力",
      "最佳实践": "将药渣部署在通风管道（全楼层共享疗效）"
    },
    "教主亲历": {
      "名场面1": "2015年用鸡矢藤熏走甲方驻场监工（需求文档都熏没了）",
      "名场面2": "某次运维事故后，机房老鼠集体搬家（附带除鼠效果）"
    },
    "运维仪式": {
      "启用咒语": "git push --force-with-lease",
      "禁用警告": "孕妇/心脏病患者禁止`kubectl exec`进入容器"
    }
  }
}

虎山数据智库消食药天梯榜
药材	    消积力度	    臭味等级	    必配牵制药	适用场景
蜘蛛香	☢️☢️☢️☢️☢️	💩💩💩💩	黄连/麦冬	    生产环境宿便危机
鸡矢藤	☢️☢️☢️	    💩💩💩💩💩	可单用	    Kafka腐臭消息
焦三仙	☢️☢️☢️☢️	  💩	    视情况	    常规技术债
鸡内金	☢️☢️	      💩	      无需	    接口毛刺抛光
沙棘	    ☢️	          🌸	    可配蜂蜜	    日常预防性维护


*/
// ===========================================================================JS
// 数据协议声明：
// 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
// 2. 实际应用需遵守MIT协议附加条款
// 3. 企业合作请通过GitHub邮箱联系
// 
// 冷溪虎山数字本草实验室 © 2025
// ===========================================================================JS
