// ==================== 中药统计模块 ====================
// 统计药材种类  // 看看有几味药在造反 🌿
// 批量处理药性  // 给每味药发修炼手册 📖
// 配对君臣佐使  // 药材们的集体婚礼 💐
// ⚠️虎山老药师：乱配会炼出黑暗料理

const red_flower = "红花";
const str_blood = "blood";
const blood = ["当归", "丹参", "桃仁"];
const number = [44, 55, 77, 88, 66];
const three = { "山楂": "焦山楂", "神曲": "焦神曲", "麦芽": "焦麦芽" };

console.log("⏩⏩⏩⏩⏩⏩ 以下是迭代对象的长度len");
console.log(red_flower.length); // 2
console.log(str_blood.length);  // 5
console.log(blood.length);      // 3
console.log(number.length);     // 5
console.log(Object.keys(three).length); // 3

console.log("\n", "⏬⏬⏬⏬⏬⏬ 以下是迭代对象map的操作");
// 模拟 map
const new_blood = blood.map(a => a + "活血"); // 每个元素拼接
const dictmap_blood = Object.fromEntries(
    blood.map((k, i) => [k, ["补血", "活血", "破血"][i]]) // 合成字典
);
console.log(new_blood); // 每个元素拼接
console.log(dictmap_blood); // 字典拼接

console.log("\n", "🆕🆕🆕🆕🆕🆕 以下是迭代对象zip的操作");
// 模拟 zip
function zip(arr1, arr2) {
    return arr1.map((k, i) => [k, arr2[i]]);
}
const dictzip_blood = Object.fromEntries(zip(blood, ["补血", "活血", "破血"])); // 合成字典
const zip_three = zip(Object.values(three), Object.keys(three)); // 字典转化列表
const dictzip_three = Object.fromEntries(zip_three); // 字典颠倒

console.log(dictzip_blood); // 合成字典
console.log(zip_three); // 字典转化列表
console.log(dictzip_three); // 字典颠倒
        
        
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
  "紫苏": {
    "技术定位": ["K8s海产解毒剂", "CI/CD生鱼片刺身伴侣"],
    "核心功效": {
      "解表发汗": "如同`kubectl rollout restart`级轻量发汗",
      "鱼蟹解毒": "专治`docker pull`到带毒镜像（秒杀404 Not Found之毒）",
      "行气和胃": "调和`gRPC`与`RESTful`的寒热不和"
    },
    "轻浮特性": {
      "煎煮时间": "≤3分钟（相当于`timeout 3s curl API`）",
      "药力曲线": "陡峭如`AWS Lambda`冷启动曲线"
    },
    "禁忌风暴": {
      "过量警告": "日服超过30克会导致`kubectl get pods`返回全量海鲜菜谱",
      "特殊体质": "对`yaml`缩进过敏者慎用（可能诱发`IndentationError`）"
    },
    "老中医暴论": {
      "海鲜市场实战": "曾用紫苏煮水冲洗服务器，治愈某厂`docker-compose.yml`的螃蟹依赖症",
      "教主亲测": "生吞紫苏叶后，`helm install`自动跳过所有`imagePullPolicy: Always`"
    },
    "玄学扩展": {
      "气味驱邪": "放在机房可驱散`Java 8`的陈旧气息",
      "药渣利用": "晒干后塞进机械键盘，预防`sudo rm -rf`手滑"
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
function lengxiTiger(chapter) {
    console.log(`%c
  🥤【JS小可爱注意】🥤
  你已经征服了 ${chapter} 个章节！
  快站起来扭扭腰，眨眨眼~
  本座_lengxi心疼你的肝啊！(っ◕‿◕)っ
  `, "color: #FF69B4; font-size: 14px");

}

// 每10章调用
lengxiTiger(10);