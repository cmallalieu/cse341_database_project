import csv

data = []
statements = []
table_name = 'transaction'

with open('../data_generation/csv/transaction.csv', 'r') as f:
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    data.append( (row[0], row[1], row[2], row[3]) )

for row in data:
  statements.append(F"INSERT INTO {table_name} (transaction_id, acct_id, timestamp, amount) VALUES ({row[0]}, {row[1]}, '{row[2][:-3]}', {row[3]});")

for statement in statements:
  print(statement)

# INSERT INTO table_dt VALUES(3, TIMESTAMP '2003-01-01 00:00:00 US/Pacific');