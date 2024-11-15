void call(){
    stage("Astronomer: Build"){
        sh '''
               curl -sSL install.astronomer.io | sudo bash -s -- v1.30.0
               astro version
        '''
    }
}
