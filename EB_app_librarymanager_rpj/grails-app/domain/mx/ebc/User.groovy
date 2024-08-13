package mx.ebc

class User {

    String name
    String email


    static constraints = {
       // name()
    }

    static mapping = {
        table 'userrpj'
    }
}
