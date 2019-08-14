package variable

def sum = 0
for (i in 0..9) {
    sum += i
}

for (i in [1, 2, 3, 4, 5, 6, 7, 8, 9]) {
    sum += i
}

for (i in ['lili': 1, 'xiaoming': 2, "xiaohong": 3]) {
    sum += i.value
}

println sum