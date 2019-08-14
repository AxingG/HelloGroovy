package objectorention.expand

class Entry {

    static void main(def args) {
        println '应用程序正在启动...'
        // 初始化
        ApplicationManager.init()
        println '应用初始化完成...'
        def person = PersonManager.createPerson('zhaojiaxing',27)
        def content = "person name is $person.name age is $person.age"
        println String.myReverse(content)
    }
}
