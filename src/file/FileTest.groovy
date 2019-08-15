package file

import com.sun.xml.internal.bind.v2.runtime.output.XmlOutput
import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import groovy.xml.MarkupBuilder
import objectorention.Person

class FileTest {

    static def jsonToXml(String json, String path) {
        JsonSlurper jsonSlurper = new JsonSlurper()
        def obj = jsonSlurper.parseText(json)

        def sw = new StringWriter()
        def xmlBuilder = new MarkupBuilder(sw)
        xmlBuilder.person(name: obj.name, age: obj.age)
        // 把xml写入文件
        File file = new File(path)
        if (!file.exists()) {
            file.createNewFile()
        }
        new File(path).withWriter { writer ->
            writer.append(sw.toString())
        }
    }

    static def copy(String path1, String path2) {
        try {
            File file = new File(path2)
            if (!file.exists()) {
                file.createNewFile()
            }
            new File(path1).withReader { reader ->
                def lines = reader.readLines()
                file.withWriter { writer ->
                    lines.each { line ->
                        writer.append(line)
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace()
        }
        println 'copy'
    }

    public static void main(String[] args) {
        jsonToXml(JsonOutput.toJson(new Person(name: 'zhaojiaxing', age: 17)), 'F:\\Groovy\\HelloGroovy\\Groovy2.iml')
//        def path1 = 'F:\\Groovy\\HelloGroovy\\Groovy.iml'
//        def path2 = 'F:\\Groovy\\HelloGroovy\\Groovy2.iml'
//        copy(path1,path2)

//        saveObj(new Person(name: 'zhaojiaxing', age: 12), 'F:\\Groovy\\HelloGroovy\\Groovy2.iml')
//        getObj('F:\\Groovy\\HelloGroovy\\Groovy2.iml')
    }

    static def saveObj(Object o, String path) {
        try {
            File file = new File(path)
            if (!file.exists()) {
                file.createNewFile()
            }
            new File(path).withObjectOutputStream { out ->
                out.writeObject(o)
            }
        } catch (Exception e) {
            e.printStackTrace()
        }
        println 'save'
    }

    static def getObj(String path) {
        Object obj
        try {
            File file = new File(path)
            if (!file.exists()) {
                return
            }
            new File(path).withObjectInputStream { inputStream ->
                obj = inputStream.readObject()
            }
        } catch (Exception e) {
            e.printStackTrace()
        }
        println "get $obj.name $obj.age"
    }
}
