package file

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import objectorention.Person

def person = new Person(name: 'zhaojiaxing', age: 11)

def json =  JsonOutput.toJson(person)

println JsonOutput.prettyPrint(json)

def jsonPl = new JsonSlurper()
def the_person = jsonPl.parseText(json)
println "$the_person.name $the_person.age"