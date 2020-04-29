import csv

debit_cards = []
half_counter = 0
card_ids = []
acct_ids = []


with open('./csv/card_holder.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')
  half_counter = 0

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 1:
      card_ids.append(row[1])

with open('./csv/depositor.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')
  half_counter = 1

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 1:
      acct_ids.append(row[1])

card_counter = 0
for card_id in card_ids:
  if card_counter < len(acct_ids):
    debit_cards.append( (card_id, acct_ids[card_counter]) )
    card_counter += 1

with open('./csv/debit_card.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in debit_cards:
    writer.writerow(row)

