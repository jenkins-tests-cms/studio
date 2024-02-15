pipeline {
  agent { 
    docker {
      image "maven:3.9-eclipse-temurin-21" 
      args '-u root'
    }
  }

  stages {
    
    stage('maven') {
      steps {
        sh "mvn -version"
        sh "java -version"
        sh "ls -alh;pwd"
        sh "printenv"
        sh "ls -alh /usr/share/maven"
        sh "mvn help:evaluate -Dexpression=settings.localRepository"
        sh "wget https://raw.githubusercontent.com/craftercms/craftercms/support/4.1.x/pom.xml -O pom-craftercms.xml"
        sh "wget https://raw.githubusercontent.com/craftercms/craftercms/support/4.1.x/pom-spring-boot.xml"
        sh "mvn -DskipTests -f pom-craftercms.xml clean install"
        sh "mvn -DskipTests -f pom-spring-boot.xml clean install"
      }
    }
    
    stage('build') {
      steps {
        sh "mvn clean install"
      }
    }
    
    stage("capture") {
      steps {
        junit '**/target/surefire-reports/TEST*.xml'    
      }  
    }
  }
}
