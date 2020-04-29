import csv

num_cust = 0
borrower = []

with open('./csv/customer.csv', 'r') as f:
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    num_cust += 1

loan_id = 1

for cust_id in range(num_cust):
  if cust_id % 3 == 0 or cust_id % 3 == 1:
    borrower.append((cust_id, loan_id))
    loan_id += 1

with open('./csv/borrower.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in borrower:
    writer.writerow(row)
