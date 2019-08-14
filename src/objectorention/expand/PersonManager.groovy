package objectorention.expand

import objectorention.Person

/**
 * 模拟person的管理类
 */
class PersonManager {

    static Person createPerson(String name, int age) {
        return Person.createPerson(name, age)
    }
}
