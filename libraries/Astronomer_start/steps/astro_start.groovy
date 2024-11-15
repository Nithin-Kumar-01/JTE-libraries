void call(){
    node
    {
            stage("Astronomer: Start"){
                 sh 'cd dbt-airflow-poc' 
                sh 'pwd'
        sh ' astro dev start'
            }
    }
}
