# import pandas as pd
# df = pd.DataFrame({
#     'study_hours': [1, 2, 3, 4, 5, 6],
#     'marks':      [35, 40, 50, 60, 65, 75],
#     'sleep':      [8, 7, 7, 6, 6, 5]
# })

# print(df)
# corr_value = df['study_hours'].corr(df['marks'])   # Pearson by default
# print('Correlation (study_hours vs marks):', corr_value)



import pandas as pd

# Create Sample Data
df = pd.DataFrame({
    'study_hours': [1, 2, 3, 4, 5, 6, 7],
    'marks': [35, 40, 50, 60, 65, 75, 80],
    'sleep_hours': [8, 7, 7, 6, 6, 5, 5]
})

print("Original Data:\n")
print(df)

print("\nPearson Correlation:\n")
print(df.corr(method='pearson'))

print("\nSpearman Correlation:\n")
print(df.corr(method='spearman'))

print("\nKendall Correlation:\n")
print(df.corr(method='kendall'))