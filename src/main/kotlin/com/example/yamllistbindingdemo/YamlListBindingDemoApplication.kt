package com.example.yamllistbindingdemo

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class YamlListBindingDemoApplication

fun main(args: Array<String>) {
    runApplication<YamlListBindingDemoApplication>(*args)
}

@Component
class Runner(val printerProperties: PrinterProperties) : ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        println(printerProperties.printers.size)
    }
}