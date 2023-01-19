pipeline {
    agent{
        label ('ECS-agent')
    }
    stages {
        stage('code-pull') {
            steps {
                git branch: 'main', credentialsId: 'Admin', url: 'git@github.com:kawalepankaj/jenkins-pipeline.git'
            }
        }
    }
}
