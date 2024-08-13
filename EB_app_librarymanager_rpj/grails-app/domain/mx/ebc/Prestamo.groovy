package mx.ebc

class Prestamo {
    static hasMany = [book: Book]
    def index() {
        redirect(action: "list")
    }

    static mapping = {
        table 'prestamorpj'
    }
}
