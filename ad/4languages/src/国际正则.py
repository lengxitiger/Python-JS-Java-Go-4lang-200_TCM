import regex

text = "患者体温38.5°C，血压120/80mmHg，主诉：头疼、恶心😵。"

# 捕获中文
# 1.\p{Script=Han}匹配中文
# 2.{2,}至少俩字
# 3.(分组捕捉)
pattern_perfect = r'(\p{Script=Han}{2,})'
symptoms = regex.findall(pattern_perfect, text)
print(symptoms)  # Output: ['患者体温', '主诉', '头疼', '恶心']

print("\n💎💎💎💎💎💎以下是货币提取")
# 示例2：货币提取（处理千位分隔符）
text = "费用合计: $125.00, ¥1,000.50, €99.99, £75.00 (含税)"
# 允许数字中包含逗号（千位分隔符）
pattern_fixed = r'[\p{Sc}]\s*\d{1,3}(?:,\d{3})*(?:\.\d+)?'  # 匹配$1,000.50格式
currencies = regex.findall(pattern_fixed, text)
print(currencies)  # Output: ['$125.00', '¥1,000.50', '€99.99', '£75.00']

