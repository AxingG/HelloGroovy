package variable

def colors = [red  : 'ff0000',
              green: '00ff00',
              blue : '0000ff']
// 索引方式
//println colors['red']
//println colors.red
// 添加元素
colors.yello = 'fff000'
colors.complex = [a: 1, b: 2]
//
//println colors.toMapString()
//println colors.getClass()

def students = [
        1: [number: '0001', name: 'Bob', score: 55, sex: 'male'],
        2: [number: '0002', name: 'Johnny', score: 62, sex: 'female'],
        3: [number: '0003', name: 'Claire', score: 73, sex: 'female'],
        4: [number: '0004', name: 'Amy', score: 66, sex: 'male']
]

// 遍历map
//students.each {
//    def student ->
//        println "the key is $student.key" + " the value is $student.value"
//}

//students.eachWithIndex { def student, int index ->
//    println "index is $index , the key is $student.key, the value is $student.value"
//}


//def index = students.eachWithIndex { Map.Entry<Integer, LinkedHashMap<String, Serializable>> entry, int i ->
//    println "the key is $entry.key" + " the value is $entry.value"
//}

def jiGe = students.findAll {
    return it.value.score != null && it.value.score > 60
}.collect {
    return it.value.name
}

//println jiGe.toListString()
def group = students.groupBy {
    return it.value.score >= 60 ? '及格' : '不及格'
}

//println group.toMapString()

def sort = students.sort {
    def student1, def student2 ->
        Number score1 = student1.value.score
        Number score2 = student2.value.score
        return score1 == score2 ? 0 : score1 > score2 ? 1 : -1
}

println sort.toMapString()