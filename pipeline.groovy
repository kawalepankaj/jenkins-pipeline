pipeline {
    agent any
    stages {
        stage('code-pull') {
            steps {
                git branch: 'main', credentialsId: 'pankaj', url: 'git@github.com:kawalepankaj/jenkins-pipeline.git'
            }
        }
    }
}
