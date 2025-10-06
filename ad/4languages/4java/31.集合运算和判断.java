import java.util.*;

// ==================== ERP集合模块 ====================
// 子集校验：权限是否在安全范围 🔐
// 相等判断：生产与测试环境一致性 ⚖️
// 超集验证：总部权限覆盖分公司 🌐
// 交集分析：用户角色冲突检测 💥
// 并集计算：全系统功能点集合 📋
// 差集处理：禁用危险操作 🚫
// ⚠️ERP老兵_冷溪虎山：集合混乱会引发系统精神分裂

class main31 {
    public static void main(String[] args) {
        System.out.println("🥯🥯🥯🥯🥯🥯🥯以下是集合判断");
        // Java使用HashSet
        Set<String> hd = new HashSet<>(Arrays.asList("山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘")); // 消化药
        Set<String> hd3 = new HashSet<>(Arrays.asList("山楂", "神曲", "麦芽")); // 三仙单形态
        Set<String> hd6 = new HashSet<>(Arrays.asList("山楂", "神曲", "麦芽", "焦山楂", "焦神曲", "焦麦芽")); // 三仙两种形态

        // 判断子集
        boolean isSubset = hd3.stream().allMatch(hd::contains);
        System.out.printf("<=判断当前集合是否为另一个集合子集,消化药<=单三仙:%s\n", isSubset);

        // 判断相等
        boolean isEqual = hd.size() == hd3.size() && hd.containsAll(hd3) && hd3.containsAll(hd);
        System.out.printf("==判断两个集合是否相等消化药==单三仙:%s\n", isEqual);

        // 判断超集
        boolean isSuperset = hd.containsAll(hd3);
        System.out.printf(">=判断当前集合是否为另一个集合超集,消化药>=单三仙:%s\n", isSuperset);

        System.out.println("\n🧊🧊🧊🧊🧊🧊以下是交并集运算");
        // 交集
        Set<String> intersection = new HashSet<>(hd);
        intersection.retainAll(hd6);
        System.out.printf("消化药和三仙两种形态的交集:%s\n", intersection);

        // 并集
        Set<String> union = new HashSet<>(hd);
        union.addAll(hd6);
        System.out.printf("消化药和三仙两种形态的并集:%s\n", union);

        System.out.println("\n🥂🥂🥂🥂🥂🥂以下是差集互减运算");
        // 差集 (hd - hd6)
        Set<String> difference1 = new HashSet<>(hd);
        difference1.removeAll(hd6);
        System.out.printf("消化药和三仙两种形态的差集:%s\n", difference1);

        // 差集 (hd6 - hd)
        Set<String> difference2 = new HashSet<>(hd6);
        difference2.removeAll(hd);
        System.out.printf("三仙两种形态和消化药的差集:%s\n", difference2);
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
  "谷芽": {
    "技术分类": [
      "日志膨松剂（轻量版）",  # 防ELK日志板结但力度＜麦芽
      "API调用酵母粉",        # 优化低并发接口消化
      "数据库健胃颗粒"       # 防SQLite积食
    ],
    "系统特性": "甘平",
    "适用场景": "日常维护型积食（如每日定时任务堆积）",
    "教主点评": "如同`kubectl logs --tail=100`——温和但不够劲爆"
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
