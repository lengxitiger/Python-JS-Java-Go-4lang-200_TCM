// ==================== 中药切片操作 ====================
// 方剂名.slice(0,2) => 君药代号  // 🌿ERP老兵_君臣佐使
// 煎法描述.substring(3) => 火候控制  // 🍵冷溪虎山_文火时段
// 药材编码.match(/.{2}/g) => 批次分组  // 🏮虎山药房_拆包规则
// 服用周期.split('-') => 疗程阶段  // 📆冷溪养生_周期划分

let str = "红花 redflower";

// 全部
console.log(str.slice()); // str[:]
console.log(str.slice(0)); // str[0::]

// 空字符串，因为起始和结束相同
console.log(str.slice(2, 2)); // str[2:2]

// 第一个字符
console.log(str.charAt(0)); // str[0]

// 从第二个字符开始到末尾
console.log(str.slice(1)); // str[1:]

// 从第三个字符开始到第七个字符
console.log(str.slice(2, 6)); // str[2:6]

console.log("\n","🔰🔰🔰🔰🔰🔰以下是负切片")
// 反转字符串
console.log(str.split('').reverse().join('')); // str[::-1]

// 从第三个字符到倒数第二个字符
console.log(str.slice(2, str.length - 1)); // str[2:-1]

// 最后三个字符
console.log(str.slice(str.length - 3)); // str[-3:]

// 最后一个字符
console.log(str.charAt(str.length - 1)); // str[-1]

// 从最后一个字符到末尾
console.log(str.slice(str.length - 1)); // str[-1::]

// 反转字符串
console.log(str.split('').reverse().join('')); // str[-1::-1] 倒序输出

console.log("\n","-".repeat(20) + "以下是步长切片");

// 步长为3
for (let i = 0; i < str.length; i += 3) {
    process.stdout.write(str.charAt(i));
}
console.log(); // str[0::3]

// 从第二个字符开始，步长为2
for (let i = 2; i < str.length; i += 2) {
    process.stdout.write(str.charAt(i));
}
console.log(); // str[2::2]

// 从第三个字符到第九个字符，步长为2
for (let i = 3; i < 9 && i < str.length; i += 2) {
    process.stdout.write(str.charAt(i));
}
console.log(); // str[3:9:2]
        
        
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
  "首乌": {
      "技术分类": [
        "内存泄漏乌发膏",     # 根治MemoryLeak脱发
        "TCP连接固本丹",      # 长连接保活专家
        "数据结构黑科技"      # 让红黑树长出黑头发
      ],
      "系统特性": "苦涩温",  # 带"涩"字，专治各种不服
      "作用域": ["Heap", "Socket", "Database"],
      "持久化阈值": "9000转",  # 原"最大剂量"（机械硬盘转速梗）
      "基础功能": "防治Elasticsearch集群谢顶，Kafka消息白发转黑",
      "高阶用法": "根治MySQL中年秃顶（JOIN查询生发水）",
      "架构建议": "如同用何首乌染发——表面看是分库分表，本质是数据结构年轻化",
      "首乌警告": "⚠️ 秃然Alert: 
- 严禁在SCRUM冲刺期间使用（会延长迭代周期）
- 必须CI/CD渐进式染黑
# 历史教训：某司强行全量染发导致数据库锁死（2023双十一零点）",
      "九蒸九晒": [  # 首乌特有炼制过程
        "第一次蒸晒：重构烂代码",
        "第九次蒸晒：通过TÜV认证"
      ]
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
