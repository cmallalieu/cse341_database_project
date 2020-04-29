import csv
from gen_random import get_random

debit_cards = []
half_counter = 0

with open('./csv/card_holder.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 1:
      checking_accounts.append((row[1], get_random(0, 100000, 0), get_random(0, 0, 0)))

with open('./csv/checking_accounts.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in checking_accounts:
    writer.writerow(row)

