import java.util.Arrays;
import java.util.List;

// ==================== ERP系统模块 ====================
// String.join("/", 部门编码)  // 武林各大门派族谱 🏯
// String.join("_", 单据类型, 年度)  // 给凭证号开光加持 ✨
// String.join("", 加密字段)  // 生成九阴真经残卷 📖
// String.join("->", 审批环节)  // 盖章仙人流水线作业 🧙
// ⚠️冷溪ERP声明：本注释经ISO皮一下认证

class main4 {
    public static void main(String[] args) {
        List<String> ninthImmortal = Arrays.asList("石斛", "天山雪莲", "人参", "首乌", "茯苓", "灵芝", "海底珍珠", "冬虫夏草", "肉苁蓉"); // 九大仙草

        String concat = String.join("->", ninthImmortal); // join合并字符串

        System.out.println("f-string输出=>九大仙草:\n" + concat + "\n" + "以上concat变量已用join合并成一个字符串"); // f-string格式化输出
        System.out.println("-".repeat(50)); // 50个横线

        System.out.println("format输出=>九大仙草:\n" + concat + "\n" + "以上concat变量已用join合并成一个字符串"); // {}占位,format格式化输出
        System.out.println("-".repeat(50)); // 50个横线

        for (int i = 0; i < ninthImmortal.size(); i++) { // i是索引,j是名称,for循环用于带索引循环
            String j = ninthImmortal.get(i);
            System.out.println("第" + (i + 1) + "名:" + j);
        }
    }
}
//\n是换行符,特别注意
        
        
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
  "茯苓": {
      "技术分类": [
        "消息队列祛湿散",     # 消Kafka消息水肿
        "服务网格排水丸",      # 治Istio流量浮肿
        "日志水肿克星"        # 专消ELK虚胖
      ],
      "系统特性": "甘淡平",  # 四平八稳
      "作用域": ["MessageQueue", "Log", "CloudNative"],
      "利尿阈值": "8TB/day",  # 原"最大剂量"（日志排水量）
      "基础功能": "消除RabbitMQ膀胱肿胀，压缩ES日志虚胖",
      "高阶用法": "云原生水肿疗法（配合K8s利尿剂Sidecar）",
      "架构建议": "如同给Docker吃利尿剂——既要削日志水肿，又要防电解质（元数据）流失",
      "茯苓禁忌": "💧 Diuretic Notice: 
- 必须同步补充电解质（日志索引）
- 禁止在未备份的NAS上使用
# 著名事故：某厂日志脱水过度导致审计追溯失效（2024GDPR罚单）",
      "菌核科技": {  # 茯苓是真菌菌核
        "菌丝网络": "替代ServiceMesh的天然网格",
        "孢子扩散": "比P2P更去中心化的同步协议"
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
