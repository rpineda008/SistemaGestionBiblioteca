databaseChangeLog = {

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-1") {
        createSequence(incrementBy: "1", sequenceName: "hibernate_sequence", startValue: "1")
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-2") {
        createTable(tableName: "authorrpj") {
            column(autoIncrement: "true", name: "id", type: "NUMBER(19, 0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "authorrpjPK")
            }

            column(name: "version", type: "NUMBER(19, 0)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "name", type: "VARCHAR(255 CHAR)") {
                constraints(nullable: "false")
            }

            column(name: "lastname", type: "VARCHAR(255 CHAR)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-3") {
        createTable(tableName: "bookrpj") {
            column(autoIncrement: "true", name: "id", type: "NUMBER(19, 0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "bookrpjPK")
            }

            column(name: "version", type: "NUMBER(19, 0)") {
                constraints(nullable: "false")
            }

            column(name: "title", type: "VARCHAR(255 CHAR)") {
                constraints(nullable: "false")
            }

            column(name: "date_created", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "last_updated", type: "timestamp") {
                constraints(nullable: "false")
            }

            column(name: "estado", type: "VARCHAR(255 CHAR)") {
                constraints(nullable: "false")
            }

            column(name: "isbn", type: "VARCHAR(255 CHAR)") {
                constraints(nullable: "false")
            }

            column(name: "author_id", type: "NUMBER(19, 0)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-4") {
        createTable(tableName: "prestamorpj") {
            column(autoIncrement: "true", name: "id", type: "NUMBER(19, 0)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "prestamorpjPK")
            }

            column(name: "version", type: "NUMBER(19, 0)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-5") {
        createTable(tableName: "prestamorpj_bookrpj") {
            column(name: "prestamo_book_id", type: "NUMBER(19, 0)") {
                constraints(nullable: "false")
            }

            column(name: "book_id", type: "NUMBER(19, 0)")
        }
    }


    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-7") {
        addUniqueConstraint(columnNames: "name", constraintName: "UC_AUTHORRPJNAME_COL", tableName: "authorrpj")
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-8") {
        addUniqueConstraint(columnNames: "isbn", constraintName: "UC_BOOKRPJISBN_COL", tableName: "bookrpj")
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-9") {
        addForeignKeyConstraint(baseColumnNames: "prestamo_book_id", baseTableName: "prestamorpj_bookrpj", constraintName: "FKibcnxxoy033nacq2t2wosqp2e", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "prestamorpj", validate: "true")
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-10") {
        addForeignKeyConstraint(baseColumnNames: "book_id", baseTableName: "prestamorpj_bookrpj", constraintName: "FKj45oxngdj5fktutp2m8iesmd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "bookrpj", validate: "true")
    }

    changeSet(author: "r.pineda008 (generated)", id: "1723538986396-11") {
        addForeignKeyConstraint(baseColumnNames: "author_id", baseTableName: "bookrpj", constraintName: "FKmrjoq25963flfxdc1mwso1tdt", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "authorrpj", validate: "true")
    }
}
