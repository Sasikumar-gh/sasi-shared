def call () {
  pipeline {
    agent any 
    stages {
      stage ('checkout') {
      steps {
        git 'https://github.com/jsachdev07/DevOpsClassCodes.git'
      }
      }
      stage ('package') {
        steps {
          sh 'mvn clean package'
        }
      }
    }
  }
