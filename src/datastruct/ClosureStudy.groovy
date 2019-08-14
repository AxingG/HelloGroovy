package datastruct

//def close = { def name ->
//    println "Hello $name"
//}
//
//def result = close.call("groovy")
//println result

//int x = 5
// 用来求制定number的阶乘
//int fab(int number) {
//    int result = 1
//    1.upto(number, { num -> result *= num }) // 从低到高
//    return result
//}
//
//int fab2(int number) {
//    int result = 1
//    number.downto(1) { num -> result *= num } // 从高到低 闭包为方法的最后一个参数，一般写在外侧
//    return result
//}
//
//int fab3(int number) {
//    int result = 0
//    number.times { num -> result += num } // times 从0开始 加到number前一位
//    return result
//}

/**
 * 字符串与闭包
 */
//str.each {temp ->
////    print temp
//}

//println str.find {
//    String s -> s.isNumber()
//}

//def result = str.findAll {
//    String s -> s.isNumber()
//}

/*闭包委托策略*/

class Student {
    String name
    def welcome = {
        String str -> println "Hello ${name}"
    }

    String sayHello() {
        welcome.call()
    }
}

class Teacher {
    String name
}

def stu = new Student(name: "老师")
def tea = new Teacher(name: "美女")
stu.welcome.delegate = tea
stu.welcome.resolveStrategy = Closure.DELEGATE_FIRST
println stu.sayHello()