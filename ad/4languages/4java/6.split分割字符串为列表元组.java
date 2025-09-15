import java.util.Arrays;

// ==================== ERP分割模块 ====================
// 部门编码.split("\\.")  // 组织架构砍枝刀 🌳
// 审批流程.split("->")  // 把流程链锯成环节 ⛓️
// ⚠️ERP老兵_冷溪虎山：生产系统禁用暴力分割

class main6 {
    public static void main(String[] args) {
        // Java中没有直接的多行字符串，需要用+连接或文本块(Java15+)
        String heighten_digestion = "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘,💥焦山楂,💥焦神曲,💥焦麦芽,❌山炒楂,❌神六曲";
        String hd = "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘-,💥焦山楂,💥焦神曲,💥焦麦芽,❌山炒楂,❌神六曲";
        String hd_lines = "💥炒山楂\n💥六神曲\n💥麦芽\n❌山炒楂\r❌神六曲";

        System.out.println(heighten_digestion + " 💫分割前");
        System.out.println(Arrays.toString(heighten_digestion.split(",")) + " 💨分割后");

        System.out.println("------------------------- 以下是分割+切片-----------------");
        // Java中split第二个参数是限制分割次数，与Python不同
        String[] parts1 = heighten_digestion.split(",", 9); // 注意Java中limit参数含义不同
        System.out.println(Arrays.toString(Arrays.copyOfRange(parts1, 0, 8)) + " 🛹消食化积药");

        String[] parts2 = heighten_digestion.split(",", 12);
        System.out.println(Arrays.toString(Arrays.copyOfRange(parts2, 8, 11)) + " 🌠焦三仙");

        String[] parts3 = heighten_digestion.split(",");
        System.out.println(Arrays.toString(Arrays.copyOfRange(parts3, 11, parts3.length)) + " ❌错误名");

        System.out.println("------------------------- 以下是元组分割-----------------");
        // Java没有元组类型，也没有partition方法，需要手动实现
        int sepIndex = hd.indexOf("-");
        String hd1 = hd.substring(0, sepIndex);
        String sep = hd.substring(sepIndex, sepIndex + 1);
        String hd2 = hd.substring(sepIndex + 1);

        System.out.println(hd1 + " 1️⃣片段1");
        System.out.println(sep + " 2️⃣分隔符");
        System.out.println(hd2 + " 3️片段2");

        System.out.println("------------------------- 以下是splitLines换行符分割和指定分割区别--------");
        // Java 8+有splitLines方法，但返回的是Stream<String>
        System.out.println(Arrays.toString(hd_lines.split("\\R")) + " 🈹换行全部分割"); // \\R匹配任何换行符

        System.out.println(Arrays.toString(hd_lines.split("\n"))); // 指定\n分割
        System.out.println(Arrays.toString(hd_lines.split("\r"))); // 指定\r分割
    }
}
/*
关键差异说明：

Java没有元组(tuple)类型，partition功能需要手动实现

Java的split()方法的limit参数与Python不同：

Python: split(",", n) 表示最多分割n次，得到n+1个元素

Java: split(",", n) 表示最多分割n-1次，得到最多n个元素

Java中没有直接的多行字符串语法(除非使用Java15+的文本块)

Java的数组切片需要使用Arrays.copyOfRange()方法

Java中换行符分割推荐使用\\R，它会匹配任何换行符序列(\n, \r, \r\n)

Java的字符串是不可变的，所有操作都返回新字符串

注意：Java中的数组和字符串操作通常比Python更冗长，需要更多的方法调用。
 */
        
        
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
  "海底珍珠": {
    "技术分类": [
      "服务网格定海珠",     # 治Istio流量乱流
      "日志深海稳压器",     # 防ELK日志海啸
      "数据库龙宫锁"       # 抗MySQL锁抖动
    ],
    "系统特性": "甘咸寒",   # 带"咸"字，专治海量数据
    "作用域": ["ServiceMesh", "Database", "Observability"],
    "定海阈值": "1EB",     # 原"最大剂量"（EB级数据镇压）
    "基础功能": "稳定微服务调用链，防止日志洪流冲垮监控",
    "高阶用法": "深海数据仓库（Data Lake）防潮方案",
    "架构建议": "如同给Kafka加定海珠——既要抗洪峰，又要防海妖（Dead Letter）",
    "龙宫禁忌": "🌊 海啸Alert: 
- 未筑基（未做服务降级）者禁用！
- 需配合珊瑚礁（CircuitBreaker）使用
# 著名海难：某厂日志洪流冲垮Splunk（2024台风季）",
    "龙宫科技": {
      "珍珠层": "比OLAP更快的分层存储",
      "蚌精算法": "自适应的流控策略"
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
