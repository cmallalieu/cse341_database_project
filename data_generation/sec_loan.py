import csv
from gen_random import get_random

sec_loans = []
half_counter = 1

with open('./csv/borrower.csv', 'r') as f:
  
  reader = csv.reader(f, delimiter=',')

  for row in reader:
    half_counter += 1
    if half_counter % 2 == 0:
      sec_loans.append((row[1], get_random(0, 0, 0), get_random(0, 100000, 0), get_random(0, 500, 0)))

with open('./csv/sec_loan.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in sec_loans:
    writer.writerow(row)
