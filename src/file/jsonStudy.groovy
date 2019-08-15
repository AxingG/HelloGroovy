package file

import groovy.json.JsonSlurper

def response = getNetworkData('http://yuexibo.top/yxbApp/course_detail.json')

println response.data.head.name

def getNetworkData(String url) {
    // 发送http请求
    def connection = new URL(url).openConnection()
    connection.setRequestMethod('GET')
    connection.connect()
    def response = connection.content.text

    // 将json转化为实体对象
    def jsonSlurper = new JsonSlurper();
    return jsonSlurper.parseText(response)

}