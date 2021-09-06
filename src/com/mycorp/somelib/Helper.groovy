package com.mycorp.somelib

class Helper {
    String message

    Helper(message) {
        this.message = message
    }
    def showMessage(){
        return this.message
    }

}