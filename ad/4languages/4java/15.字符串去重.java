import java.util.*;
import java.util.stream.Collectors;

// ==================== ERP去重模块 ====================
// 流程追踪：保留业务原始轨迹 ⚙️
// 时间圣旨：严格按操作时间排序 🕒
// 实习生版：临时去重逻辑（慎用）🗑️
// DBA禁咒：数据库级去重魔法 🧙
// ⚠️ERP老兵_冷溪虎山：数据重复召唤死锁恶魔

class main15 {
    public static void main(String[] args) {
        String s = "炒山楂,焦山楂,山楂";

        // 字典法
        Map<Character, Character> uniqueCharsMap = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            uniqueCharsMap.putIfAbsent(c, c);
        }
        String uniqueCharsDict = uniqueCharsMap.keySet().stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(uniqueCharsDict); // 输出: 炒山楂,焦 (去重乱序)

        // 集合排序法
        Set<Character> uniqueCharsSet = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            uniqueCharsSet.add(c);
        }
        List<Character> uniqueCharsList = new ArrayList<>(uniqueCharsSet);
        uniqueCharsList.sort(Comparator.comparingInt(s::indexOf));
        String uniqueCharsSorted = uniqueCharsList.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(uniqueCharsSorted); // 输出: 炒山楂,焦

        // 集合法
        Set<Character> uniqueCharsSetOnly = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueCharsSetOnly.add(c);
        }
        String uniqueCharsSetOnlyStr = uniqueCharsSetOnly.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(uniqueCharsSetOnlyStr); // 输出: 炒山楂,焦 (去重乱序)

        // 列表推导式
        Set<Character> seen = new HashSet<>();
        String uniqueCharsListJava = s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> seen.add(c))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(uniqueCharsListJava); // 输出: 炒山楂,焦
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
  "西洋参": {
    "技术分类": [
      "多云架构清凉散",  # AWS+GCP双补
      "AI训练降火丹",    # 防GPU过热
      "微服务西洋参片"   # 适合DDD架构
    ],
    "系统特性": "甘微苦凉",
    "核心优势": "补气同时防上火（CPU温和上升）",
    "适用体质": {
      "阴虚火旺架构": "现象：日志量巨大但QPS低",
      "气阴两虚系统": "表现：自动伸缩频繁但服务不稳定"
    },
    "配伍禁忌": [
      "🚫严禁与Redis同服（火性相冲）",
      "✅最佳搭档：麦冬（缓存滋阴药）"
    ],
    "运维口诀": "西洋参，慢慢跟，监控曲线要平稳"
  }
}
根据系统体质选药
if [[ $(kubectl get nodes -o json | jq '.items[].status.conditions[] | select(.type=="MemoryPressure") | .status' ) == "True" ]]; then
    echo "选用西洋参+麦冬（气阴双补）"
else
    echo "可尝试红景天+陈皮（平稳抗压）"
fi

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
