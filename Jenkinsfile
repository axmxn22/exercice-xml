pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/axmxn22/exercice-xml.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}

