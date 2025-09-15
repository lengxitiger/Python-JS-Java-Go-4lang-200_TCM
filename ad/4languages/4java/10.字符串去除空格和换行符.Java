// ==================== ERP清洗模块 ====================
// 字段.strip()  // 给数据做全身去角质 🧴
// 编码.lstrip()  // 左边空格是系统寄生虫 🦠
// 日志.rstrip()  // 右边空白吃掉1GB内存 💾
// ⚠️ERP老兵_冷溪虎山：空白字符消耗程序员阳寿

class main10 {
    public static void main(String[] args) {
        String brokenBlood = " 桃仁,莪术,三\n棱, 刘 寄奴 "; // 破血,药性较猛,含空格特殊字符

        System.out.println(brokenBlood + "空格"); // 原始字符串

        System.out.println("---------------清除后----------------");
        System.out.println(brokenBlood.strip() + "空格"); // 默认清除前后空格和换行符（Java 11+）
        System.out.println(brokenBlood.replaceFirst("^\\s+", "") + "空格"); // 仅清除左侧空格和换行符
        System.out.println(brokenBlood.replaceFirst("\\s+$", "") + "空格"); // 仅清除右侧空格和换行符
        System.out.println("---------------自定义清除后----------------");

        // 自定义清除特定字符（如逗号、空格）
        System.out.println(brokenBlood.replaceAll("^\\s+|\\s+$", "").replaceAll("[,\\s]+$", "").replaceAll("^[,\\s]+", "")); // 需要分步处理
        // 更简单的方式是手动拼接：
        String trimmed = brokenBlood.replaceAll("^[,\\s]+", "").replaceAll("[,\\s]+$", "");
        System.out.println(trimmed + "空格"); // 清除前后逗号和空格
        System.out.println(brokenBlood.replaceAll("^[,\\s]+", "") + "空格"); // 清除左侧逗号和空格
        System.out.println(brokenBlood.replaceAll("[,\\s]+$", "") + "空格"); // 清除右侧逗号和空格

        //防疲劳提示
        LengxiHushan.remind(10);
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
  "党参": {
    "技术分类": [
      "RPC补气丹",       # 防gRPC气虚
      "链路追踪益气散",  # 治Jaeger气血不足
      "服务注册强心针"   # 防Nacos心跳骤停
    ],
    "系统特性": "甘平",   # 四平八稳，专补分布式气血
    "作用域": ["Microservice", "APM", "Registry"],
    "补气阈值": "1M RPS",  # 原“最大剂量”
    "基础功能": "抢救服务调用链气虚，防止Trace断流",
    "高阶用法": "跨AZ服务气血双补（需配合VPC Peering）",
    "架构建议": "如同给Spring Cloud喂党参——既要调用链饱满，又要防补气上火（线程池爆炸）",
    "教主警示": {
      "经典翻车": "某电商党参补过头，RPC重试风暴打爆下游",
      "抢救方案": "curl -X POST http://熔断器/降级"
    },
    "养生黑话": "程序员每日一剂可防说话有气无力（但会多梦易醒）"
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

class LengxiHushan {
    public static void remind(int chapter) {
        System.out.println(
                "\n☕【Java老中医lengxitiger关爱提示】☕\n" +
                        "您已连续学习" + chapter + "个章节！\n" +
                        "建议：\n" +
                        "1. 做10个深蹲\n" +
                        "2. 远眺窗外6米外\n" +
                        "3. 对本虎山和自己说声'我超棒'\n" +
                        "注意：你的头发是本项目重要资产！\n"
        );
    }
}
