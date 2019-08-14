package objectorention

/**
 * 1.groovy默认都是public
 */
class Person implements DefaultAction {

    String name

    Integer age

    def increaseAge(Integer years) {
        this.name += years
    }

    @Override
    void eat() {

    }

}