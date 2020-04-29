import csv
from gen_random import get_random
from math import floor

savings_accounts = []
half_counter = 0
rand_branch_ids = []
branch_ids = []
acct_ids = []

with open('./csv/branch.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    branch_ids.append(row[0])


with open('./csv/depositor.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 0:
      acct_ids.append(row[1])

branch_counter = 0

for i in range(len(acct_ids)):
  rand_index = get_random(0, abs(len(branch_ids) - 1), 1)
  rand_branch_ids.append(rand_index)

for id in acct_ids:
  balance = get_random(0, 100000, 0)
  savings_accounts.append( (id, branch_ids[rand_branch_ids[branch_counter]], balance, get_random(0, 0, 0)) )
  branch_counter += 1

with open('./csv/savings_accounts.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in savings_accounts:
    writer.writerow(row)