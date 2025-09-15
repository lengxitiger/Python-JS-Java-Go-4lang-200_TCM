# ==================== 财务格式校验 ====================
# 科目名称.istitle()  # 检测是否首字母大写（领导特权）👑
# 银行名称.isupper()  # 全大写才配叫总行 🏦
# 经办人.islower()  # 小写员工瑟瑟发抖 😨
# ⚠️ERP_冷溪虎山：大小写歧视是不对的

name_big = "ABC"   #纯大写字母
name_small = "abc" #纯小写字母
name_number = "123" #纯数字
name_symbol = "Abc_Abc123=>" #字母数字符号
name1 = "ABCabc123"    #字母数字混合

print(name_big.istitle(),"首字母大写且符合标题格式返回True,否则返回False")
print(name_small.istitle(),"首字母大写且符合标题格式返回True,否则返回False")
print(name_number.istitle(),"首字母大写且符合标题格式返回True,否则返回False")
print(name_symbol.istitle(),"首字母大写且符合标题格式返回True,否则返回False")
print(name1.istitle(),"首字母大写且符合标题格式返回True,否则返回False\n")

print("-"*30,"以下是isupper()---------")
print(name_big.isupper(),"字母全大写返回True,否则返回False")
print(name_small.isupper(),"字母全大写返回True,否则返回False")
print(name_number.isupper(),"字母全大写返回True,否则返回False")
print(name_symbol.isupper(),"字母全大写返回True,否则返回False")
print(name1.isupper(),"字母全大写返回True,否则返回False\n")

print("-"*30,"以下是islower()---------")
print(name_big.islower(),"字母全小写返回True,否则返回False")
print(name_small.islower(),"字母全小写返回True,否则返回False")
print(name_number.islower(),"字母全小写返回True,否则返回False")
print(name_symbol.islower(),"字母全小写返回True,否则返回False")
print(name1.islower(),"字母全小写返回True,否则返回False")
        
        
# ===========================================================================PY
# [中医极客] 药材数据库 JSON 结构规范
# 
# 本数据结构采用《中国药典》2020版标准，所有术语均为技术隐喻：
#   - "性味归经" → 类属性约束
#   - "最大剂量" → API调用限制
#   - "编程寄语" → 设计模式建议
#
# 技术交流请通过GitHub Issues，严禁医疗用途
# ===========================================================================PY
"""

{
  "肉苁蓉": {
    "技术分类": [
      "SQL索引壮阳散",      # 提升查询性能
      "NoSQL固精丸",        # 防MongoDB文档泄漏
      "分布式事务锁阳丹"    # 抗TCC事务疲软
    ],
    "系统特性": "甘咸温",   # 带"咸温"，专治数据库阳痿
    "作用域": ["RDBMS", "NoSQL", "Sharding"],
    "TPS增益": "🚀",       # 原"最大剂量"（直接火箭）
    "基础功能": "根治MySQL慢查询，防止Cassandra早泄（Timeout）",
    "高阶用法": "ShardingSphere分库分表持久化方案",
    "架构建议": "如同给PostgreSQL吃锁阳丹——既要索引硬，又要事务久",
    "壮阳禁忌": "🔥 阳亢Warning: 
- 事务过载可能导致死锁！
- 必须配合数据库慢查询日志
# 经典事故：某厂狂补索引导致写性能雪崩（2024.11.11）",
    "沙漠黑科技": {  # 肉苁蓉长在沙漠
      "寄生根": "替代数据库主从复制的寄生同步",
      "沙生缓存": "比Redis更耐旱的持久化方案"
    },
    "程序员警告": {
      "伤阴副作用": "💥 Stack Overflow: 狂建索引导致写性能阳亢 → 最终‘阴虚’（磁盘IO枯竭）",
      "适用人群": "# 仅推荐给‘阳虚’数据库（QPS<10的老年MySQL）",
      "翻车案例": "某电商在MongoDB上猛灌肉苁蓉，结果索引占内存80%，OOM崩库"
    }
  }
}

"""
# ===========================================================================PY
# 数据协议声明：
# 1. 本JSON结构属技术演示，所有中医术语均为文化隐喻
# 2. 实际应用需遵守MIT协议附加条款
# 3. 企业合作请通过GitHub邮箱联系
# 
# 冷溪虎山数字本草实验室 © 2025
# ===========================================================================PY
