// ==================== 中药转换模块 ====================
// 药典转方剂：把药材字典拆成配伍清单 🌿
// 煎法切片：提取关键火候时间段 ⏳
// ⚠️虎山老药师：乱切药方会引发药性相冲

const hd = ['山楂', '神曲', '麦芽', '谷芽', '鸡矢藤', '鸡内金', '蜘蛛香', '沙棘']; // 消化药列表
const heighten_digestion = ['山楂', '神曲', '麦芽', '谷芽', '鸡矢藤', '鸡内金', '蜘蛛香', '沙棘', ["焦山楂", "焦神曲", "焦麦芽"]]; // 消化药多列表嵌套

const maybush = Array.from("山楂"); // 字符串转数组
const hd1 = Array.from(['山楂', '神曲', '麦芽', '谷芽', '鸡矢藤', '鸡内金', '蜘蛛香', '沙棘']); // 助消化 元组转数组
const order = Array.from({length: 10}, (_, i) => i + 1); // 序列转数组
const dictionary = {"丹参": "活血", "莪术": "破血", "山楂": "解腻促消化"}; // 字典

console.log(maybush);
console.log(hd1);
console.log(order);
console.log(Object.keys(dictionary)); // 字典key转数组
console.log(Object.values(dictionary)); // 字典value转数组
console.log("\n🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️以下是切片第一个列表🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️");

console.log(hd.slice()); // 全部
console.log(hd[0]); // 第一个元素
console.log(hd.slice(1)); // 第2个至最后的元素
console.log(hd.slice().reverse()); // 最后至第一个元素
console.log(hd.slice(1, 3)); // 第2,3个元素
console.log(hd.filter((_, index) => index % 2 === 0)); // 步长为2 (需要手动实现)
console.log(hd.filter((_, index) => index % 2 === 1)); // 从第2个元素开始,步长为2 (需要手动实现)
console.log(hd.slice(-3)); // 倒数第3个到最后的元素
console.log(hd[hd.length - 1]); // 最后的元素
console.log("\n🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️以下是列表嵌套切片🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️");

console.log(heighten_digestion[heighten_digestion.length - 1][0]); // 负索引单切片
console.log(heighten_digestion[heighten_digestion.length - 1].slice(0, 2)); // 负索引多切片
console.log(heighten_digestion[8][2]); // 正索引切片 (注意：heighten_digestion只有9个元素，索引最大为8)
console.log(heighten_digestion[8].slice(1, 3)); // 正索引多切片 (注意：heighten_digestion只有9个元素，索引最大为8)
        
        
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
  "苍术": {
    "技术分类": ["日志脱水机", "内存除湿器"],
    "系统特性": "辛温燥烈",
    "危险警告": {
      "阴虚火旺系统禁用": "症状：CPU高热+日志干枯",
      "强制配伍": {
        "沙参": "日志滋阴插件",
        "麦冬": "缓存清凉剂"
      }
    },
    "经典案例": "2023年某厂单用苍术导致ES集群干裂"
  }
}
# 祛湿安全检测脚本
if [[ $(df -h | grep "/var/log" | awk '{print $5}') -gt 80% ]]; then
    echo "湿气过重！推荐方案："
    echo "helm install 祛湿套餐 --set 苍术.enabled=true --set 沙参.enabled=true"
else
    echo "日常维护建议："
    echo "kubectl apply -f 白扁豆.yaml"
fi

*/
// ===========================================================================JS
// 数据协议声明：
// 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
// 2. 实际应用需遵守MIT协议附加条款
// 3. 企业合作请通过GitHub邮箱联系
// 
// 冷溪虎山数字本草实验室 © 2025
// ===========================================================================JS
