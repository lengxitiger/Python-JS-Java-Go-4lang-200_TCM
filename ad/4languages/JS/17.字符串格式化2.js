// ==================== 中药格式化模块 ====================
// 药方剂量标准化  // 君臣佐使排排坐 🧘
// 煎法时间格式化  // 文武火候计时器 ⏳
// 药材编号补位  // 仙草也要身份证 🪪
// ⚠️虎山老药师：格式不对影响成丹率

// 生成数据编号
console.log("以下是生成数据编号💰💰💰💰💰💰💰💰💰");
console.log(String(1).padStart(2, '0'));
console.log(String(6).padStart(3, '0'));
console.log(`NO.${String(9).padStart(3, '0')}`);

// 科学计数法
console.log("\n以下是科学计数法📘📘📘📘📘📘📘📘");
// 使用科学计数法表示大数字
const bigNum = 3.141592653589e12;
console.log(bigNum.toExponential());
console.log(bigNum.toExponential(2));
console.log(bigNum.toExponential(2).toUpperCase());
console.log(parseFloat(bigNum.toString()).toString());
console.log(parseFloat(bigNum.toString()).toString().toUpperCase());
console.log("inf"); // JS 会自动显示 Infinity

// 千位符
console.log("\n以下是货币格式化千位符💸💸💸💸💸💸💸💸💸");
console.log(new Intl.NumberFormat('en-US', {style: 'currency', currency: 'USD'}).format(88888.6666));
console.log(new Intl.NumberFormat('zh-CN', {style: 'currency', currency: 'CNY'}).format(88888.6666));
console.log(new Intl.NumberFormat('en-GB', {style: 'currency', currency: 'GBP'}).format(88888.6666));
console.log(new Intl.NumberFormat('de-DE', {style: 'currency', currency: 'EUR'}).format(88888.6666));


// 进制转换
console.log("\n以下是进制转换🤑🤑🤑🤑🤑🤑🤑🤑🤑");
console.log(`${(12).toString(2)},${(12).toString(16)},${(12).toString(16).toUpperCase()}`);
console.log(parseInt("5A", 16).toString(10));
console.log(parseInt("011101", 2).toString(16));
console.log(parseInt("34", 8).toString(2));
        
        
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
  "五指毛桃": {
    "技术分类": [
      "华南架构师特饮",   # 治湿热地区IDC问题
      "隐形式补气素",     # 无感性能提升
      "技术债祛湿汤"      # 专治祖传代码
    ],
    "系统特性": "甘微温",
    "神奇特性": {
      "补气不上火": "CPU曲线平滑如椰子鸡",
      "自带香气": "日志会自动带上[五指毛桃]标记"
    },
    "配伍方案": {
      "标准版": "五指毛桃 + 云苓（日志利尿）",
      "豪华版": "五指毛桃 + 陈皮 + 薏米（全栈祛湿）"
    },
    "运维仪式感": "部署前需执行：
echo '岭南秘法启动' >> /etc/profile"
  }
}

# 永远记住
echo "气有余便是火 → QPS突增必熔断！"

*/
// ===========================================================================JS
// 数据协议声明：
// 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
// 2. 实际应用需遵守MIT协议附加条款
// 3. 企业合作请通过GitHub邮箱联系
// 
// 冷溪虎山数字本草实验室 © 2025
// ===========================================================================JS
