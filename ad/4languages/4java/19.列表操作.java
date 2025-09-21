import java.util.*;

// ==================== ERP转换模块 ====================
// 数据字典转ArrayList：给对象办集体户口 🏢
// 流程日志切片：提取异常时间段记录 🚨
// ⚠️ERP老兵_冷溪虎山：错误切片会触发系统痉挛

class main19 {
    public static void main(String[] args) {
        List<String> hd = Arrays.asList("山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘"); // 消化药列表
        List<Object> heighten_digestion = Arrays.asList("山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘", Arrays.asList("焦山楂", "焦神曲", "焦麦芽")); // 消化药多列表嵌套

        char[] maybushArray = "山楂".toCharArray(); // 字符串转字符数组
        List<Character> maybush = new ArrayList<>();
        for (char c : maybushArray) {
            maybush.add(c);
        }
        List<String> hd1 = new ArrayList<>(Arrays.asList("山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘")); // 助消化 元组转列表
        List<Integer> order = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            order.add(i); // 序列转列表
        }
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("丹参", "活血");
        dictionary.put("莪术", "破血");
        dictionary.put("山楂", "解腻促消化"); // 字典

        System.out.println(maybush);
        System.out.println(hd1);
        System.out.println(order);
        System.out.println(dictionary.keySet()); // 字典key转集合
        System.out.println(dictionary.values()); // 字典value转集合
        System.out.println("\n🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️以下是切片第一个列表🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️");

        System.out.println(new ArrayList<>(hd)); // 全部
        System.out.println(hd.get(0)); // 第一个元素
        System.out.println(hd.subList(1, hd.size())); // 第2个至最后的元素
        List<String> reversedHd = new ArrayList<>(hd);
        Collections.reverse(reversedHd); // 最后至第一个元素
        System.out.println(reversedHd);
        System.out.println(hd.subList(1, 3)); // 第2,3个元素
        // Java中没有直接的步长切片，需要手动实现
        List<String> step2Hd = new ArrayList<>();
        for (int i = 0; i < hd.size(); i += 2) {
            step2Hd.add(hd.get(i));
        }
        System.out.println(step2Hd); // 步长为2
        List<String> step2HdFrom1 = new ArrayList<>();
        for (int i = 1; i < hd.size(); i += 2) {
            step2HdFrom1.add(hd.get(i));
        }
        System.out.println(step2HdFrom1); // 从第2个元素开始,步长为2
        System.out.println(hd.subList(Math.max(0, hd.size() - 3), hd.size())); // 倒数第3个到最后的元素
        System.out.println(hd.get(hd.size() - 1)); // 最后的元素
        System.out.println("\n🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️以下是列表嵌套切片🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️🗡️");

        List<?> lastElement = (List<?>) heighten_digestion.get(heighten_digestion.size() - 1);
        System.out.println(lastElement.get(0)); // 负索引单切片
        System.out.println(((List<?>) heighten_digestion.get(heighten_digestion.size() - 1)).subList(0, 2)); // 负索引多切片
        // 注意：heighten_digestion只有9个元素，索引最大为8
        // 注意：heighten_digestion的第8个元素是字符串，不是列表，所以以下代码会报错
        // System.out.println(heighten_digestion.get(8).subList(1, 3)); // 正索引多切片 (注意：heighten_digestion只有9个元素，索引最大为8)
    }
}
        
        
/*
 * ===========================================================================JAVA
 * [中医极客] 药材数据库 JSON 结构规范
 * 
 * 本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
 *   - "性味归经" → 类属性约束
 *   - "最大剂量" → API调用限制
 *   - "编程寄语" → 设计模式建议
 *
 * 技术交流请通过GitHub Issues，严禁医疗用途
 * ===========================================================================JAVA
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

/*
 * ===========================================================================JAVA
 * 数据协议声明：
 * 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
 * 2. 实际应用需遵守MIT协议附加条款
 * 3. 企业合作请通过GitHub邮箱联系
 * 
 * 冷溪虎山数字本草实验室 © 2025
 * ===========================================================================JAVA
 */
