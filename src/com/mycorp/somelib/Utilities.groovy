package com.mycorp.somelib

class Utilities implements Serializable {
    
    def steps

    Utilities(steps) {
        this.steps = message
    }
    def mvn(args){
        steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    }
}