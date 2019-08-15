package objectorention

/**
 * 1.groovy默认都是public
 */
class Person implements DefaultAction, Serializable {

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    @Override
    void eat() {

    }

    /**
     * 一个方法找不到时，调用它代替
     * @param name
     * @param args
     * @return
     */
    def invokeMethod(String name, Object args) {
        return "the method is $name,the params is $args"
    }

    def methodMissing(String name, Object args) {
        return "the method $name is missing"
    }
}