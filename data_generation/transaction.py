import csv
from gen_random import get_random
from rand_date_time import rand_date_time
from random import gauss

transactions = []
acct_ids = []
timestamps = []

with open('./csv/depositor.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    acct_ids.append(row[1])
# INSERT INTO table_dt VALUES(3, TIMESTAMP '2003-01-01 00:00:00 US/Pacific');
for i in range( len(acct_ids) * 3):
  timestamps.append( rand_date_time() )



for i in range( len(acct_ids) * 3):

  amount = round(gauss(0, 125), 2)
  transactions.append( (i, int(get_random(1, 65, 1)), timestamps[i], amount) )

with open('./csv/transaction.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in transactions:
    writer.writerow(row)

