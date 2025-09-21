import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// ==================== ERP时间模块 ====================
// 标准业务日期格式  // 数字世界的格林威治 ⏰
// 年月日中文分隔  // 领导专属阅读版 👔
// 时分秒精确切割  // 高并发事务计时器 💻
// 特殊符号分隔款  // 系统间加密时间锁 🔗
// 精简版时间戳  // 日志文件瘦身款 📄
// 星期简写模式  // 运维值班日历 📅
// 月份英文缩写  // 跨国分公司同步器 🌍
// ⚠️ERP老兵_冷溪虎山：时间不同步会引发数据虫洞

class main18 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // 1. 直接打印（类似 Python 的 now）
        System.out.println(now);

        // 2. 格式化：YYYY-MM-DD HH:MM:SS Day
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss E", Locale.CHINESE);
        System.out.println(now.format(formatter1));

        // 3. 格式化：YYYY 年 MM 月 DD 日
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日");
        System.out.println(now.format(formatter2));

        // 4. 格式化：HH 时 MM 分 SS 秒
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH 时 mm 分 ss 秒");
        System.out.println(now.format(formatter3));

        // 5. 格式化：YYYY<MM>DD
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy<MM>dd");
        System.out.println(now.format(formatter4));

        // 6. 格式化：HH:MM:SS
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(now.format(formatter5));

        // 7. 格式化：Day (缩写)
        DateTimeFormatter formatter6 = DateTimeFormatter.ofPattern("E", Locale.CHINESE);
        System.out.println(now.format(formatter6));

        // 8. 格式化：Month (缩写)
        DateTimeFormatter formatter7 = DateTimeFormatter.ofPattern("MMM", Locale.CHINESE);
        System.out.println(now.format(formatter7).replace(".", "")); // 去掉点

        System.out.println("\n🍒🍒🍒🍒🍒🍒🍒🍒🍒以下是week");
        String[] week = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        System.out.println(week[now.getDayOfWeek().getValue() - 1]); // 1=Monday, 7=Sunday

        // 9. 格式化：locale date & time (类似 %c)
        DateTimeFormatter formatter9 = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy", Locale.CHINESE);
        System.out.println(now.format(formatter9));
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
  "蕨麻": {
    "技术分类": ["轻量级线程补剂", "容器营养膏"],
    "系统特性": "甘平",
    "核心优势": "补而不燥（适合长期运行的守护进程）",
    "适用场景": ["低配服务器", "IoT设备"],
    "教主提示": "和Kafka同服易消化不良（消息积压）"
  }
}

# 永远记住
echo "气有余便是火 → QPS突增必熔断！"

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
