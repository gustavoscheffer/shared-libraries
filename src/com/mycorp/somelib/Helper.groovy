package com.mycorp.somelib

class Helper {
    String name
    Integer points

    Helper(name, points) {

        this.name = name
        this.points = points
    }
    def prepare(){
        sh "echo this is my function in Shared Library"
    }
    def count(){
        sh "echo this is my function in Shared Library"
    }
}