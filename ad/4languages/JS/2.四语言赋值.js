// ==================== 中药配方赋值 ====================
// 君药剂量 = 臣药剂量 * 2; // 🌿ERP老兵配伍原则
// 煎煮时间 = 武火时间 + 文火时间; // 🕒冷溪虎山煎法
// 服药次数 = 每日3次; // 🥄虎山养生标准
// 药方名称 = "八珍汤"; // 📜冷溪古方传承

// 数字 (Number) - 整数/浮点数/NaN/Infinity
let x = 100;
console.log(x, typeof x);  // 输出: 100 number

let y = 3.14;
console.log(y, typeof y);  // 输出: 3.14 number

let z = NaN;  // Not a Number
console.log(z, typeof z);  // 输出: NaN number

let inf = Infinity;
console.log(inf, typeof inf);  // 输出: Infinity number

// 字符串 (String)
let s = "Hello, JavaScript!";
console.log(s, typeof s);  // 输出: Hello, JavaScript! string

// 布尔 (Boolean)
let flag = true;
console.log(flag, typeof flag);  // 输出: true boolean

// undefined (未定义)
let a;
console.log(a, typeof a);  // 输出: undefined undefined

// null (空值)
let b = null;
console.log(b, typeof b);  // 输出: null object (历史遗留问题)

// BigInt (大整数)
let big = 123n;
console.log(big, typeof big);  // 输出: 123n bigint

// 对象 (Object) - 键值对
let person = { name: "Alice", age: 25 };
console.log(person, typeof person);  // 输出: { name: 'Alice', age: 25 } object

// 数组 (Array) - 特殊对象
let arr = [1, 2, 3];
console.log(arr, typeof arr);  // 输出: [1, 2, 3] object

// 函数 (Function) - 也是对象
function foo() {}
console.log(foo, typeof foo);  // 输出: [Function: foo] function
        
        
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
  "人参": {
      "技术分类": [  # 原"类别"
        "线程池大补丸",      # 专治ThreadPool萎靡
        "GC回春丹",          # 老年代FullGC急救
        "分布式强心针"       # 微服务心跳检测增强
      ],
      "系统特性": "甘微温",  # 原"性味"（注意带"温"字，防雪莲冻伤）
      "作用域": ["CPU", "JVM", "ServiceMesh"],  # 原"归经"
      "QPS暴击率": "+300%",  # 原"最大剂量"（瞬间爆发但别持久）
      "基础功能": "抢救OOM濒死系统，吊住宕机进程最后一口气",
      "高阶用法": "K8s节点自动回魂术（配合kubelet针灸疗法）",
      "架构建议": "如同给Redis打肾上腺素——缓存击穿时能硬扛，但小心线程爆炸",
      "人参禁忌": "💥 Hotfix Warning: 
- 阴虚火旺（单例滥用）系统禁用！
- 必须搭配熔断器使用（白虎汤降火）
# 经典翻车：某厂狂补人参导致线程数突破ULIMIT（2024.618大促）",
      "须根黑科技": {  # 隐藏属性
        "参须": "分布式Trace采样率倍增器",
        "参花": "APM监控的染色标记"
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
