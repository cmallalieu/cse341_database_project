import csv

names = []

with open('./csv/names.csv', newline='\n') as f:
  reader = csv.reader(f, delimiter=',')
  
  i = 1
  for row in reader:
    names.append((i, row[0], row[1]))
    i += 1

with open('./csv/customer.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in names:
    writer.writerow(row)

