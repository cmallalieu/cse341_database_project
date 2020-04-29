import csv

num_cust = 0
card_holder = []

with open('./csv/customer.csv', 'r') as f:
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    num_cust += 1

card_id = 1

for cust_id in range(num_cust):
  if cust_id % 3 == 0 or cust_id % 3 == 2:
    card_holder.append((cust_id, card_id))
    card_id += 1

with open('./csv/card_holder.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in card_holder:
    writer.writerow(row)
