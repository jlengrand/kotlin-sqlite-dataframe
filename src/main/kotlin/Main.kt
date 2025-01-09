package nl.lengrand

import org.jetbrains.kotlinx.dataframe.DataFrame
import org.jetbrains.kotlinx.dataframe.io.*
import java.sql.DriverManager

fun main() {

    val connection = DriverManager.getConnection("jdbc:sqlite:example.db")

    val people =  DataFrame.readSqlTable(connection, "people")
    println(people.columnNames())
    println(people.columnTypes())


//    println(people[2].is_active) -> Compilation error "Unresolved reference: is_active"
    println(people[2]["is_active"])
    println(people[2]["has_subscription"])
}