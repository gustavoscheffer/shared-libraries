package com.mycorp.somelib

class Utilities implements Serializable {
    
    def steps

    Utilities(steps) {
        this.steps = steps
    }
    
    def mvn(args){
        steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    }

    def checkOutFrom(repo) {
        steps.sh "git clone https://github.com/jenkinsci/${repo}"
    }
}