void call(){
    node
    {
            stage("Astronomer: Start"){
                 sh 'cd dbt-airflow-poc' 
                sh 'pwd'
                sh ' ls'
        sh ' astro dev start'
            }
    }
}
