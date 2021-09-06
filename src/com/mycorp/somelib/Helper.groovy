package com.mycorp.somelib

class Helper {
    String name
    Integer age

    Helper(name, age) {

        this.name = name
        this.age = age
    }
    def createBuild( int buildNumber ){
        if (buildNumber % 2 == 0) {
            pipeline {
                agent any
                stages {
                    stage('Even Stage') {
                        steps {
                            echo "The build number is even"
                        }
                    }
                }
            }
        } else {
            pipeline {
                agent any
                stages {
                    stage('Odd Stage') {
                        steps {
                            echo "The build number is odd"
                        }
                    }
                }
            }
        }
    }

}