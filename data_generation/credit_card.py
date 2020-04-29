import csv
from math import floor
from gen_random import get_random

credit_cards = []
half_counter = 0
card_ids = []
acct_ids = []


with open('./csv/card_holder.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')
  half_counter = 1

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 1:
      card_ids.append(row[1])

with open('./csv/depositor.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')
  half_counter = 0

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 1:
      acct_ids.append(row[1])

card_counter = 0
for card_id in card_ids:
  if card_counter < len(acct_ids):
    limit = get_random(0, 100000, 0)
    balance = get_random(0, floor(limit), 0)
    balance_due = get_random(0, floor(balance), 0)
    credit_cards.append( (card_id, acct_ids[card_counter], get_random(0, 0, 0), limit, balance, balance_due) )
    card_counter += 1

with open('./csv/credit_card.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in credit_cards:
    writer.writerow(row)

