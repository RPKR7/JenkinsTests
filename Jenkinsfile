pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
    }
    post{
        always{
            emailext body: 'Summarry', subject: 'Pipeline status', to: 'ramireddypavan7@gmail.com'
        }
    }
}
