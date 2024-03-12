package sk.fiit.vdv.be

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class VdvApp

fun main(args: Array<String>) {
    runApplication<VdvApp>(*args)
}
