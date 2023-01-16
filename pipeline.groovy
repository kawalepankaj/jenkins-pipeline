pipeline {
    agent any
    stages {
        stage('code-pull') {
            steps {
                git credentialsId: 'pankaj', url: 'git@github.com:kawalepankaj/jenkins-pipeline.git'
            }
        }
    }
}
