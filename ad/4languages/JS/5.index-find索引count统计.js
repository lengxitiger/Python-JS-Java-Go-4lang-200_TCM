// ==================== 中药配伍模块 ====================
// 药方.indexOf("黄连")  // 找到最苦的担当 😖
// 禁忌列表.count("孕妇")  // 危险警告计数器 ☠️
// ⚠️虎山老药师：实际用药需遵医嘱

const heighten_digestion = "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘,💥炒山楂,💥六神曲,💥麦芽,❌山炒楂,❌神六曲"; //助消化,字符串,消化药类+焦三仙+错误药名

console.log((heighten_digestion.match(/麦芽/g) || []).length); //统计麦芽在全部字符串出现的次数 2
console.log((heighten_digestion.match(/山楂/g) || []).length); //统计山楂在全部字符串出现的次数 2
console.log((heighten_digestion.match(/曲/g) || []).length);    //统计曲在全部字符串出现的次数 3
console.log(heighten_digestion.length);    //统计字符串长度总计53 比Python多3,以下结果都要加3
console.log("统计字符串长度总计53 比Python多3,以下结果都要加3,注释保持原样方便对比");
const str = heighten_digestion.slice(20, 53);
console.log((str.match(/曲/g) || []).length);    //统计曲在定义长度20-53搜索范围字符串曲出现的次数 2

console.log("-".repeat(50) + "以下是index用法");
console.log(heighten_digestion.indexOf('麦芽'));  //统计麦芽在全部字符串首次出现索引位置 6
console.log(heighten_digestion.indexOf('麦芽', 7));  //统计麦芽在位置7开始首次出现索引位置 38 结束end不定义默认为开始7到全部 从左往右搜索
console.log(heighten_digestion.indexOf('神曲', 30, 40));  //注意：JS的indexOf不支持end参数，这里会忽略40
console.log(heighten_digestion.lastIndexOf('麦芽'));  //统计麦芽在右边开始首次出现索引位置 38 从右往左搜索
// console.log(heighten_digestion.indexOf('红花'));  //index找不到字段时,这行会返回-1，不会报错，已注释

console.log("-".repeat(50) + "以下是find用法");
// JS没有内置的find方法，使用indexOf模拟
console.log(heighten_digestion.indexOf('麦芽'));  //统计麦芽在全部字符串首次出现索引位置 6
console.log(heighten_digestion.indexOf('麦芽', 7));  //统计麦芽在位置7开始首次出现索引位置 38 结束end不定义默认为开始7到全部 从左往右搜索
console.log(heighten_digestion.indexOf('神曲', 30, 40));  //注意：JS的indexOf不支持end参数，这里会忽略40
console.log(heighten_digestion.lastIndexOf('麦芽'));  //统计麦芽在右边开始首次出现索引位置 38 从右往左搜索
console.log(heighten_digestion.indexOf('红花'));  //find找不到返回-1
        
        
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
  "灵芝": {
    "技术分类": [
      "AI炼丹炉稳定剂",      # 防GPT模型走火入魔
      "区块链雷劫缓冲层",    # 抗51%算力攻击
      "微服务心魔净化器"    # 防分布式事务入魔
    ],
    "系统特性": "甘平",      # 四平八稳，调和阴阳
    "作用域": ["AI/ML", "Blockchain", "DistributedTxn"],
    "抗劫强度": "渡劫期大圆满",  # 原"最大剂量"
    "基础功能": "防止智能合约产生心魔（Bug），降低炼丹炉（训练集群）炸炉风险",
    "高阶用法": "大模型幻视（Hallucination）抑制术（需配合玉清雷法）",
    "架构建议": "如同给ETH2.0加灵芝——既要抗MEV攻击，又要防Validator摆烂",
    "渡劫告警": "⚡️ 天劫Warning: 
- 未结金丹（未通过安全审计）者慎用！
- 雷劫（DDOS）期间需开启灵芝护盾
# 历史天劫：某DeFi协议遭心魔入侵，一夜归零（2023）",
    "仙道扩展": {
      "灵芝孢子": "比零知识证明更隐密的通信协议",
      "仙芝液": "替代PoW的环保共识算法"
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
