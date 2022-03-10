pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                sh "./mvnw clean -e"
            }
        }

        stage('Compile') {
            steps {
                sh "./mvnw compile -e"
            }
        }

        stage('Test') {
            steps {
                sh "./mvnw test"
            }
        }
    }
}
