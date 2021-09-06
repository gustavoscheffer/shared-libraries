package com.mycorp.somelib

class Utilities implements Serializable {
    
    def steps

    Utilities(steps) {
        this.steps = steps
    }
    
    def mvn(args){
        steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    }

    def checkOutFrom(repo, branch) {
        steps.sh "git init"
        steps.sh "git remote add origin https://github.com/jenkinsci/${repo}"
        steps.sh "git pull origin ${branch}"
    }
}