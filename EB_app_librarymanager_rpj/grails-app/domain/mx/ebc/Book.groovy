package mx.ebc
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

class Book {

    String title
    String isbn
    Author author
    Date dateCreated
    Date lastUpdated

    static belongsTo = [author: Author]

    // Enumeración para el estado
    static enum Estado {
        DISPONIBLE, PRESTADO
    }

    Estado estado = Estado.DISPONIBLE // Valor por defecto

    static constraints = {
        title blank: false
        isbn blank: false, unique: true
    }

    static mapping = {
        table 'bookrpj'
    }
}
