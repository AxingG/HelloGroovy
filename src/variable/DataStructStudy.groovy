package variable

class Students {
    String name
    int age
}

def stuA = new Students(name: "A", age: 18)
def stuB = new Students(name: "B", age: 12)
def stuC = new Students(name: "C", age: 14)
def stuD = new Students(name: "D", age: 20)
def stuE = new Students(name: "E", age: 19)
def stuF = new Students(name: "F", age: 11)

def sortList = [stuA, stuB, stuC, stuD, stuE, stuF]

//println sortList.toListString()

sortList.sort {
    a, b -> a.age == b.age ? 0 : a.age > b.age ? 1 : -1
}
//println sortList.toListString()

def findList = [-3, 9, 6, 2, -7, 1, 5]
int result = findList.find {
    return it % 2 == 0
}
//println result
def resultAll = findList.findAll {
    return it % 2 != 0
}

def resultAny = findList.any {
    return it % 2 != 0
}

def resultEvery = findList.every {
    return it % 2 == 0
}
//println findList.min()
//println findList.max()

def resultMax = findList.max {
    return Math.abs(it)
}

def resultMin = findList.min {
    return  Math.abs(it)
}

//println resultMin
//println resultMax

def resultCount = findList.count {
    return it >= 1
}

println resultCount