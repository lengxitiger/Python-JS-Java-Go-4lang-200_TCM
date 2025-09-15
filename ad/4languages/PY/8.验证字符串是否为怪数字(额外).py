test_str = "²³⁴①②③Ⅷ½⅓⅕"

print(f"isdecimal(): {test_str.isdecimal()}")  # False
print(f"isdigit(): {test_str.isdigit()}")      # True（但实际可能 False，取决于 Python 版本）
print(f"isnumeric(): {test_str.isnumeric()}")  # True

# 更精确的测试
test_decimal = "²³⁴"
test_digit = "①②③"
test_numeric = "Ⅷ½⅓"

print(f"\nDecimal test: {test_decimal.isdecimal()}")  # False
print(f"Digit test: {test_digit.isdigit()}")          # True
print(f"Numeric test: {test_numeric.isnumeric()}")    # True

#单独新增