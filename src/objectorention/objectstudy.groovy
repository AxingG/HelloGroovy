package objectorention

//def person = new Person(name: 'zhaojiaxing', age: 27)
// .方法 调用和java实际不同, .调用 java会直接调用属性，而 groovy 是调用get / set方法
//println person.age
//person.increaseAge(10)

//println person.cry()

// 为类动态添加属性 sex
Person.metaClass.sex = "male"
//def person = new Person(name: 'zhaojiaxing', age: 27)
//println person.sex
//person.sex = "female"
//println "the new sex is $person.sex"

// 为类动态的添加方法
Person.metaClass.sexUpperCase = { -> sex.toUpperCase() }
def person = new Person(name: 'zhaojiaxing', age: 27)
//println person.sexUpperCase()

// 为类动态的添加静态方法
Person.metaClass.static.createPerson = { String name, int age ->
    new Person(name: name, age: age)
}
def person3 = Person.createPerson('zhaojiaxing', 27)
println "$person3.name $person3.age"