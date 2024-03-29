package objectorention.expand

import objectorention.Person

/**
 * 模拟一个应用的管理类
 */
class ApplicationManager {
    static void init() {
        ExpandoMetaClass.enableGlobally()
        // 为第三方类添加方法
        Person.metaClass.static.createPerson = { String name, int age ->
            return new Person(name: name, age: age)
        }

        String.metaClass.static.myReverse = { String str ->
            return str.reverse()
        }
    }
}
