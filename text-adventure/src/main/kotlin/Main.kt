package com.udemy

import java.util.*

fun main() {
    val locations = readLocationsInfo()
    var loc = 64

    while (true) {
        val location = locations[loc] ?: Location(0, "Sorry, something went wrong...")
        println(location.description)

        if (location.locationId == 0) {
            break
        }

        println("Available exits are: ")
        location.exits.forEach {
            println("$it, ")
        }

        val direction = readlnOrNull()?.uppercase(Locale.getDefault()) ?: "Z"
        if (location.exits.containsKey(direction)) {
            loc = location.exits[direction]!!
        } else {
            println("Invalid direction")
        }
    }
}