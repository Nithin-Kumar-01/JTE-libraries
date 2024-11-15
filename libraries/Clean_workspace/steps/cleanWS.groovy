void call(){
    stage("Clean: workspace"){
        steps {
                script {
                    
                    cleanWs()
                }
            }
    }
}
