package mx.ebc
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

class Author {
    String name
    String lastname
    static hasMany = [book: Book]
    Date dateCreated
    Date lastUpdated

    static constraints = {
        name(blanck: false,unique: true, minSize:4)
        lastname(blanck: false, minSize:4)
        //name maxSize: 30, blank: false, nullable: false
        //lastname maxSize: 50, blank: false, nullable: false
    }

    static mapping = {
        table 'authorrpj'
    }
}
