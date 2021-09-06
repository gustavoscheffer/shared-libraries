package com.mycorp.somelib

class Helper {
    String message

    Helper(message) {
        this.message = message
    }
    def showMessage(){
        echo "This is my PIPE!"
    }

}