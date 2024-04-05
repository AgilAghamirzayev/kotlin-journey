package com.udemy

import java.io.File

fun readLocationsInfo() : Map<Int, Location> {
    val locations = mutableMapOf<Int, Location>()

    File("locations_big.txt").reader().forEachLine {
        val (locationId, description) = it.split("`")
        locations[locationId.toInt()] = Location(locationId.toInt(), description)
    }

    File("directions_big.txt").reader().forEachLine {
        val (locationId, direction, destinationId) = it.split(",")
        locations[locationId.toInt()]?.addExit(direction, destinationId.toInt())
    }

    return locations
}