// ==================== ERP审计模块 ====================
// 凭证列表.indexOf("作废")  # 捉拿问题凭证逃犯 🦹
// 操作日志.count("修改")  # 深夜改数据可疑次数 🌃
// ⚠️ERP老兵_冷溪虎山：生产环境需多重校验

class main5 {
    public static void main(String[] args) {
        String heighten_digestion = "山楂,神曲,麦芽,谷芽,鸡矢藤,鸡内金,蜘蛛香,沙棘,💥炒山楂,💥六神曲,💥麦芽,❌山炒楂,❌神六曲"; //助消化,字符串,消化药类+焦三仙+错误药名

        // 统计次数
//        long countMaize = heighten_digestion.chars().filter(ch -> "麦芽".indexOf(ch) >= 0).count(); // 错误！Java没有直接统计子串的方法
        // 正确做法：用循环或正则（较复杂，这里简化）
        int countMaize = countSubstring(heighten_digestion, "麦芽");
        int countShanzha = countSubstring(heighten_digestion, "山楂");
        int countQu = countSubstring(heighten_digestion, "曲");
        System.out.println(countMaize); // 2
        System.out.println(countShanzha); // 2
        System.out.println(countQu);    // 3

        // Python字符串长度50 java和js长度结果一样53,以下原Python结果差别也是3
        System.out.println(heighten_digestion.length());


        // 范围搜索
        String subStr = heighten_digestion.substring(20, 50);
        int countQuInRange = countSubstring(subStr, "曲");
        System.out.println(countQuInRange); // 2

        System.out.println("-".repeat(50) + "以下是index用法");
        System.out.println(heighten_digestion.indexOf("麦芽")); // 6
        System.out.println(heighten_digestion.indexOf("麦芽", 7)); // 38
        // Java的indexOf不支持end参数，范围搜索需手动处理
        int index = heighten_digestion.indexOf("神曲", 30);
        if (index == -1 || index >= 40) {
            System.out.println(-1);
        } else if (index + 2 < 40) { // 检查是否完整匹配"神曲"
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
        System.out.println(heighten_digestion.lastIndexOf("麦芽")); // 38

        // Java的indexOf找不到返回-1，不会报错
        // System.out.println(heighten_digestion.indexOf("红花")); // 已注释

        System.out.println("-".repeat(50) + "以下是find用法");
        // Java没有find方法，直接用indexOf
        System.out.println(heighten_digestion.indexOf("麦芽")); // 6
        System.out.println(heighten_digestion.indexOf("麦芽", 7)); // 38
        index = heighten_digestion.indexOf("神曲", 30);
        if (index == -1 || index >= 40) {
            System.out.println(-1);
        } else if (index + 2 < 40) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
        System.out.println(heighten_digestion.lastIndexOf("麦芽")); // 38
        System.out.println(heighten_digestion.indexOf("红花")); // -1
    }

    // 辅助方法：统计子串出现次数
    private static int countSubstring(String str, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
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
  "灵芝": {
    "技术分类": [
      "AI炼丹炉稳定剂",      # 防GPT模型走火入魔
      "区块链雷劫缓冲层",    # 抗51%算力攻击
      "微服务心魔净化器"    # 防分布式事务入魔
    ],
    "系统特性": "甘平",      # 四平八稳，调和阴阳
    "作用域": ["AI/ML", "Blockchain", "DistributedTxn"],
    "抗劫强度": "渡劫期大圆满",  # 原"最大剂量"
    "基础功能": "防止智能合约产生心魔（Bug），降低炼丹炉（训练集群）炸炉风险",
    "高阶用法": "大模型幻视（Hallucination）抑制术（需配合玉清雷法）",
    "架构建议": "如同给ETH2.0加灵芝——既要抗MEV攻击，又要防Validator摆烂",
    "渡劫告警": "⚡️ 天劫Warning: 
- 未结金丹（未通过安全审计）者慎用！
- 雷劫（DDOS）期间需开启灵芝护盾
# 历史天劫：某DeFi协议遭心魔入侵，一夜归零（2023）",
    "仙道扩展": {
      "灵芝孢子": "比零知识证明更隐密的通信协议",
      "仙芝液": "替代PoW的环保共识算法"
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
