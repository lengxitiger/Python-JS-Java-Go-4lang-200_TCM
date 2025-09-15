// ==================== 中药格式转换 ====================
// 药材名转大写  // 君药必须气势磅礴 🌋
// 煎法转小写  // 文火要低调温柔 🕯️
// 方剂首字母大写  // 仙丹配方尊贵抬头 👑
// 医嘱标题格式化  // 老君炼丹笔记 📜
// 大小写反转  // 阴阳调和之术 ☯️
// 全小写兼容处理  // 防止药方识别错误 💊
// ⚠️虎山老药师：格式不对影响药效

let language = "python JS GO Java";

console.log(language.toUpperCase(), "英文全部大写"); // 英文全部大写
console.log(language.toLowerCase(), "英文全部小写"); // 英文全部小写
console.log(language.charAt(0).toUpperCase() + language.slice(1).toLowerCase(), "单词首字母大写"); // 单词首字母大写（注意：JavaScript没有直接的capitalize方法）
console.log(language.split(' ').map(word => word.charAt(0).toUpperCase() + word.slice(1).toLowerCase()).join(' '), "句子首字母大写"); // 句子首字母大写（模拟title效果）
console.log(language.split('').map(c => c === c.toUpperCase() ? c.toLowerCase() : c.toUpperCase()).join(''), "大小写互转"); // 大小写互转
console.log(language.toLowerCase(), "全部小写"); // 全部小写（JavaScript没有casefold，但toLowerCase类似）
        
        
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
  "太子参": {
    "技术分类": [
      "线程池小儿补剂",  # 适合初创公司
      "低配ECS益气丹",   # 1核1G专属
      "IoT设备参片"     # 树莓派也能跑
    ],
    "系统特性": "甘微苦平",
    "vs西洋参": {
      "优势": "不会引发监控指标上火（CPU<50%适用）",
      "劣势": "618大促时不如西洋参给力"
    },
    "经典配伍": {
      "基础版": "太子参 + Prometheus轻量Exporter",
      "进阶版": "太子参 + 陈皮（防消息队列积食）"
    },
    "教主警告": "某厂误当西洋参用于双十一，补气不足反被流量踩踏"
  }
}
根据系统体质选药
if [[ $(kubectl get nodes -o json | jq '.items[].status.conditions[] | select(.type=="MemoryPressure") | .status' ) == "True" ]]; then
    echo "选用西洋参+麦冬（气阴双补）"
else
    echo "可尝试红景天+陈皮（平稳抗压）"
fi

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
