@Library('shared-libraries') _
evenOrOdd(currentBuild.getNumber())


// pipeline {
//     agent any
//     stages {
//         stage('Build') {
//             steps {
//                 helper = new Helper('Jason Bourne', 34)
//                 helper.prepare()
//                 echo 'Build'

//             }
//         }
//         stage('Unit Test') {
//             steps {
//                 echo 'Unit Test'
//             }
//         }
//         stage('Deploy Stage') {
//             steps {
//                 echo 'Deploy Stage'
//             }
//         }
//         stage('UAT') {
//             steps {
//                 echo 'User Acceptance Test'
//             }
//         }
//         stage('Deploy Production') {
//             steps {
//                 echo 'Deploy Production'
//             }
//         }
//     }
// }
