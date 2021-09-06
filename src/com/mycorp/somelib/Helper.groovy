package com.mycorp.somelib

class Helper {
    String name
    Integer age

    Helper(name, age) {

        this.name = name
        this.age = age
    }
    def prepare(){
        return sh "echo this is my function in Shared Library"
    }
    def count(){
        return sh "echo this is my function in Shared Library"
    }
}