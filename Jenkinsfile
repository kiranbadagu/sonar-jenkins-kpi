pipeline {
    agent any

    environment {
        SONAR_SCANNER = tool 'SonarQubeScanner'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/kiranbadagu/sonar-jenkins-kpi.git'
            }
        }

        stage('Build') {
            steps {
                sh "echo $WORKSPACE && ls -la && mvn clean install"
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonar-server') {
                    sh """
                       mvn sonar:sonar \
                       -Dsonar.projectKey=sonar-jenkins-kpi \
                       -Dsonar.host.url=http://34.172.87.37:9000 \
                       -Dsonar.login=$SONAR_AUTH_TOKEN
                    """
                }
            }
        }

        stage('Quality Gate Check') {
            steps {
                script {
                    timeout(time: 2, unit: 'MINUTES') {
                        def qg = waitForQualityGate()
                        echo "Sonar Quality Gate Status: ${qg.status}"

                        if (qg.status != 'OK') {
                            echo "❌ Quality gate FAILED (below 80%)."
                        } else {
                            echo "✅ Quality gate PASSED (>= 80%)."
                        }
                    }
                }
            }
        }
    }
}
