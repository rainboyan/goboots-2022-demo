package org.rainboyan.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration

import grails.boot.Grails

import groovy.transform.CompileStatic

@CompileStatic
@SpringBootApplication(exclude = [DataSourceAutoConfiguration, LiquibaseAutoConfiguration])
class Application {
    static void main(String[] args) {
        Grails.run(Application, args)
    }
}
