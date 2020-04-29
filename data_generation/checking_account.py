import csv
from gen_random import get_random
from math import floor

checking_accounts = []
branch_ids = []
acct_ids = []
rand_branch_ids = []
half_counter = 0

with open('./csv/branch.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    branch_ids.append(row[0])
      

with open('./csv/depositor.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 1:
      acct_ids.append(row[1])

for i in range(len(acct_ids)):
  rand_index = get_random(0, abs(len(branch_ids) - 1), 1)
  rand_branch_ids.append(rand_index)


branch_counter = 0
for id in acct_ids:
  min_balance = get_random(0, 100, 0)
  balance = get_random(floor(min_balance), 100000, 0)
  checking_accounts.append( (int(id), int(branch_ids[rand_branch_ids[branch_counter]]), balance, get_random(0, 0, 0), min_balance) )
  branch_counter += 1

with open('./csv/checking_account.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in checking_accounts:
    writer.writerow(row)
