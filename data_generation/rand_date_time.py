from gen_random import get_random

def rand_date_time():
  date_time = ''
  date_time += '2019'
  date_time += '-'
  month = get_random(1, 12, 1)
  if month < 10:
    date_time += '0'
    date_time += str(month)
  else:
    date_time += str(month)
  date_time += '-'
  day = get_random(0, 29, 1)
  if day < 10:
    date_time += '0'
    date_time += str(day)
  else:
    date_time += str(day)
  date_time += ' '
  hour = get_random(0, 23, 1)
  if hour < 10:
    date_time += '0'
    date_time += str(hour)
  else:
    date_time += str(day)
  date_time += ':'
  min = get_random(0, 59, 1)
  if min < 10:
    date_time += '0'
    date_time += str(min)
  else:
    date_time += str(min)
  date_time += ':'
  sec = get_random(0, 59, 1)
  if sec < 10:
    date_time += '0'
    date_time += str(sec)
  else:
    date_time += str(sec)
  date_time += ':'
  ff = get_random(0, 59, 1)
  if ff < 10:
    date_time += '0'
    date_time += str(ff)
  else:
    date_time += str(ff)
  
  return date_time