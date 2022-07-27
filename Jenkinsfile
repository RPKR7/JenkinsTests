pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/RPKR7/JenkinsTests.git'
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
