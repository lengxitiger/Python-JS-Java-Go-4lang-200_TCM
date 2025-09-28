import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// ==================== ERP排序模块 ====================
// 流程节点排序  // 给审批链做正骨按摩 💆
// 生成报表副本  // CEO特供美化版 📑
// 反转操作日志  // 黑客入侵检测模式 🕵️♂️
// ⚠️ERP老兵_冷溪虎山：倒序查询会触发系统记忆紊乱

class main23 {
    public static void main(String[] args) {
        // 列表
        List<String> hd = new ArrayList<>(Arrays.asList("山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘", "麦冬"));
        // 复制 hd
        List<String> hd_copy = new ArrayList<>(hd);
        // 数字列表
        List<Integer> number = new ArrayList<>(Arrays.asList(15, 18, 26, 40, 21, 33, 37, 45));

        // 中文排序（按 Unicode 码点升序）
        hd.sort(null); // 升序（按首字母排序）
        System.out.println("🍒🍒🍒🍒🍒🍒🍒🍒以下中文排序（升序）");
        System.out.println(hd);
        Collections.reverse(hd_copy); // 反转序列
        System.out.println("🍒🍒🍒🍒🍒🍒🍒🍒反转后的 hd_copy");
        System.out.println(hd_copy);

        // 数字排序
        System.out.println("\n🍒🍒🍒🍒🍒🍒🍒🍒以下数字排序");
        number.sort(Integer::compareTo); // 升序排列
        System.out.println("升序: " + number);
        number.sort((a, b) -> b - a); // 降序排列（注意：Integer 不能直接减，需改用 Integer.compare(b, a)）
        // 修正降序排序方式
        number.sort(Collections.reverseOrder());
        System.out.println("降序: " + number);

        // 生成新的排序对象
        System.out.println("\n🍒🍒🍒🍒🍒🍒🍒🍒以下生成新的对象");
        List<Integer> new_number = new ArrayList<>(number);
        new_number.sort(Integer::compareTo); // 新对象正向序列
        List<Integer> new_number1 = new ArrayList<>(number);
        new_number1.sort(Collections.reverseOrder()); // 新对象反向序列
        System.out.println("正向: " + new_number + "\n反向: " + new_number1);

        // 查找和统计
        List<String> hdj = new ArrayList<>(Arrays.asList("焦山楂", "焦神曲", "焦麦芽", "山楂"));
        System.out.println("\n🍒🍒🍒🍒🍒🍒🍒🍒以下查找和统计");
        System.out.println("焦麦芽的索引: " + hdj.indexOf("焦麦芽")); // 返回索引 2
        long count = hdj.stream().filter(item -> item.equals("山楂")).count(); // 出现次数 1
        System.out.println("山楂的出现次数: " + count);
        int sum = number.stream().mapToInt(Integer::intValue).sum(); // 求和
        System.out.println("数字总和: " + sum);
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
  "藿香": {
    "技术分类": [
      "容器防暑丹",       # 治Docker湿热
      "日志解暑汤",       # 消ELK暑湿
      "服务网格正气水"    # 抗Istio瘴气
    ],
    "系统特性": "辛微温",  # 仍需清热药牵制
    "黄金组合": {
      "基础版": "藿香 + 佩兰（增强化湿）",
      "安全版": "藿香 + 荷叶 + 黄连（防上火）"
    },
    "适用场景": [
      "夏季IDC高温报警",
      "微服务调用黏腻不爽"
    ],
    "养生黑话": "运维团队夏季必备，但阴虚火旺者慎服"
  }
}

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
