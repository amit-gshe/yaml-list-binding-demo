package com.example.yamllistbindingdemo

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class YamlListBindingDemoApplication

fun main(args: Array<String>) {
    runApplication<YamlListBindingDemoApplication>(*args)
}

class Printer {
    var deviceNo: String? = null
    var key: String? = null
}

@Component
@ConfigurationProperties
class PrinterProperties {
    var printers: List<Printer> = listOf()
}

@Component
class Runner(val printerProperties: PrinterProperties) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println(printerProperties.printers.size)
    }
}