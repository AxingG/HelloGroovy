package datastruct.test

class Gradle {
    Set<String> api = new HashSet<>()

    void api(String txt) {
        api.add(txt)
    }

    void exc() {
        println api.toListString()
    }

    static void dependencies(Closure closure) {
        Gradle gradle = new Gradle();
        closure.delegate = gradle
        closure.call()
        gradle.exc()
    }

    static void main(String[] args) {
        dependencies {
            api 'cn.jiguang.sdk.plugin:xiaomi:3.1.0'
            api 'cn.jiguang.sdk.plugin:huawei:3.1.0'
            api 'cn.jiguang.sdk.plugin:meizu:3.1.0'
        }
    }
}
