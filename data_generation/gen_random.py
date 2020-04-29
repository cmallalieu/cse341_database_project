from random import random, randint

def get_random(min, max, is_int):

  if is_int == 1:
    return randint(min, max)
  else:
    val = round(randint(min, max) + random(), 2)
    return val