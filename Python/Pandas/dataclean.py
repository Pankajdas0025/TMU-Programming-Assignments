import pandas as pd
df = pd.read_json('data.json', orient='records')
df = df.drop_duplicates(keep=False)

print(df.to_string())