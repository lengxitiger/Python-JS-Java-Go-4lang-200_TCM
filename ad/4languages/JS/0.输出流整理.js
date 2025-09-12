// ==================== 中药养生模块 ====================
// 处方名称：ERP老兵养生方🌿
// 配伍禁忌：冷溪地区慎用
// 煎法要诀：虎山泉水三沸
// 服用说明：🪻老兵特调剂量
// 贮藏条件：溪畔阴凉处
// 功效标签：⛰️虎山认证

console.log("普通日志");          // 普通日志（自动换行）
console.info("信息日志");         // 类似 log，但通常显示图标不同
console.warn("警告日志");         // 黄色警告
console.error("错误日志");        // 红色错误
console.debug("调试日志");        // 调试信息（需开启详细日志）
console.trace("调用栈跟踪");      // 打印调用栈

// 表格输出（适用于数组或对象）
console.table([{ name: "Alice", age: 25 }, { name: "Bob", age: 30 }]);

// 分组输出
console.group("用户信息");
console.log("Name: Alice");
console.log("Age: 25");
console.groupEnd();

// 计时器（测量代码执行时间）
console.time("计时器");
// ... 执行代码 ...
console.timeEnd("计时器"); // 输出耗时

process.stderr.write("This is an error message\n"); // 输出到 stderr（标准错误流）
process.stdout.write("精细化输出流")
console.log("Hello");          // 输出：Hello\n
console.log("Hello", "World"); // 输出：Hello World\n
console.log("Number:", 42);    // 输出：Number: 42\n
console.log("JSON:", { a: 1 }); // 输出：JSON: { a: 1 }\n
console.log("Formatted: %s %d", "Hi", 123); // 输出：Formatted: Hi 123\n

//以下是前端网页输出
// document.write("Hello, World!"); // 直接写入 HTML 文档
// // 修改元素内容
// document.getElementById("output").innerHTML = "Hello, <b>World</b>!";
//
// // 安全文本输出（避免 XSS）
// document.getElementById("output").textContent = "Hello, World!";
// alert("这是一个警告框！");       // 弹出警告框
// prompt("请输入你的名字：");      // 弹出输入框
// const result = confirm("确定删除吗？"); // 弹出确认框，返回 true/false



        




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
  "石斛": {
    "技术分类": [  // 原"类别"
      "系统生津模块",  // 益胃生津
      "降频清热方案",  // 滋阴清热
      "核心算法组件"   // 九大仙草之首
    ],
    "系统特性": "甘微寒",  // 原"性味"
    "作用域": ["IO", "Cache"],  // 原"归经"
    "QPS上限": "15",  // 原"最大剂量"
    "基础功能": "缓解日志过载，优化线程火旺",  // 原"简单功效"
    "高阶用法": "高并发场景下的GC调优（配合麦冬中间件效果更佳）",  // 原"隐藏功效"
    "架构建议": "如同V8引擎的垃圾回收——生津若清理内存碎片，滋阴似控制CPU功耗",  // 原"编程寄语"
    "虎山告警": "🚨 Runtime Warning: 需权限校验！\n- 火灵根（高并发架构）: kubectl apply -f 铁皮石斛.yaml\n- 水灵根（微服务架构）: docker-compose up 茯苓\n// 历史事故：K8s集群过载导致API熔断（2023 Q3）"  // 原"虎山警示"
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
