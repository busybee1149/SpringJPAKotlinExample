package com.spring.example

import com.spring.example.repository.TreadmillRepository
import com.spring.example.repository.model.Treadmill
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class App {

    @Component
    inner class Runner(private val repository: TreadmillRepository) : ApplicationRunner {

        private fun doWeHaveSomethingInDb() {
            val count: Long = repository.count()
            if (count > 0) {
                System.out.printf("Db has %d treadmill(s)%n", count)
            } else {
                println("Db is empty")
            }
        }

        override fun run(args: ApplicationArguments?) {
            println("Before save:")
            doWeHaveSomethingInDb()

            println("Saving...")
            repository.save(Treadmill("aaa", "Yamaguchi runway"))

            println("After save:")
            doWeHaveSomethingInDb()

        }
    }
}

fun main() {
    println("Hello!!!")
    runApplication<App>()
}