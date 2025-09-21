import java.util.*;

// ==================== ERP列表模块 ====================
// 流程追加新节点  // 给审批流续命 🌱
// 紧急事项插队  // 系统特权通道 ⚡
// 合并部门列表  // 组织架构大重组 🏢
// ⚠️ERP老兵_冷溪虎山：顺序错乱会触发系统癫痫

class main21 {
    public static void main(String[] args) {
        // 消化药列表（字符串）
        List<String> hd = new ArrayList<>(Arrays.asList(
                "山楂", "神曲", "麦芽", "谷芽", "鸡矢藤", "鸡内金", "蜘蛛香", "沙棘"));

        // 焦三仙列表
        List<String> hdj = new ArrayList<>(Arrays.asList(
                "焦山楂", "焦神曲", "焦麦芽"));

        // 一仙列表
        List<String> hd1 = new ArrayList<>(Arrays.asList(
                "山楂", "焦山楂"));

        // 子列表和元组（用List<Object>存储）
        List<Object> complexList = new ArrayList<>(); //封神
        complexList.addAll(hd); // 原始列表
        complexList.add(Arrays.asList("焦山楂", "焦神曲", "焦麦芽")); // 子列表
        complexList.add(List.of("焦山楂", "焦神曲", "焦麦芽")); // 元组（不可变）
        complexList.add(10); // 整数
        System.out.println(complexList);
        System.out.println("\"\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52以下是焦三仙改造\"");

        // 焦三仙改造
        hdj.add(1, "1,山楂");
        hdj.add(3, Arrays.asList(2, "神曲", 3, "麦芽").toString()); // 转为字符串
        System.out.println(hdj);
        System.out.println("\"\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52\uD83C\uDF52以下是焦三仙添加\"");
        // 焦三仙添加
        hd1.addAll(Arrays.asList("神曲", "焦神曲"));
        // 添加字典键（用List模拟）
        List<String> dictKeys = new ArrayList<>(new HashMap<String, String>() {{
            put("麦芽", "焦麦芽");
        }}.keySet());
        hd1.addAll(dictKeys);
        System.out.println(hd1);
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
  "白扁豆": {
    "技术分类": ["服务网格健脾丸", "微服务祛湿膏"],
    "系统特性": "甘微温",
    "安全优势": "唯一可长期服用的祛湿药",
    "最佳拍档": {
      "茯苓": "增强利尿效果",
      "陈皮": "防消息积食"
    }
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
