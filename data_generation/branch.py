import csv

branches_remaining = 20
cities = []
states = []
branches = []
branch_ids = [i for i in range(branches_remaining)]

with open('./csv/cities.csv', 'r') as f:

  reader = csv.reader(f, delimiter=',')

  for row in reader:
    if branches_remaining > 0:
      cities.append(row[1])
      states.append(row[2])
      branches_remaining -= 1

for id in range(len(branch_ids)):
  if id % 3 == 0 or id % 3 == 1:
    branches.append( (id, states[id], cities[id], 1) )
  else:
    branches.append( (id, states[id], cities[id], 0) )

with open('./csv/branch.csv', 'w', newline='\n') as f:
  writer = csv.writer(f, delimiter=',')
  for row in branches:
    writer.writerow(row)

