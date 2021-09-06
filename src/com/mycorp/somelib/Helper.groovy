package com.mycorp.somelib

class Helper {
    String name
    Integer points

    Helper(name, points) {

        this.name = name
        this.points = points
    }
    def prepare(){
        println "Method PREPARE!"
    }
    def count(){
        println "Method COUNT!"
    }
}