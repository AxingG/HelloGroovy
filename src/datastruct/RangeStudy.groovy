package datastruct

def range = 1..10
//println range.from
//println range.to
//println range.class

// 遍历
//range.each { print it}
//for (i in range) {
//    println i
//}

def getGrade(Number number) {
    def result
    switch (number) {
        case 0..<60:
            result = '不及格'
            break
        case 60..<70:
            result = '及格'
            break
        case 70..<80:
            result = '良好'
            break
        case 80..100:
            result = '优秀'
            break
    }
    result
}

def result = getGrade(75)
println result