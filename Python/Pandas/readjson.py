import pandas as pd
df = pd.read_json('data.json', orient='records')
df.dropna(inplace=True)
print(df.to_string())