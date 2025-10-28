pipeline {
    agent any

    tools {
        maven 'Maven_3_9'   // Jenkins'te Maven tool ismini buna göre ayarla
        jdk 'JDK21'         // Jenkins'te JDK tool adın
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/raksidelic/karate-api-tests.git'            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test -Dkarate.env=dev'
            }
        }

        stage('Publish Reports') {
    steps {
        publishHTML(target: [
            reportDir: 'target/karate-reports', 
            reportFiles: 'karate-summary.html', 
            reportName: 'Karate Cucumber Report', 
            alwaysLinkToLastBuild: true, 
            keepAll: true, 
            allowMissing: false
        ])
    }
}

    }

    post {
        always {
            echo 'Build completed.'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
