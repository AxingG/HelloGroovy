package objectorention

def person = new Person(name: 'zhaojiaxing', age: 27)
// .方法 调用和java实际不同, .调用 java会直接调用属性，而 groovy 是调用get / set方法
println person.age
person.increaseAge(10)