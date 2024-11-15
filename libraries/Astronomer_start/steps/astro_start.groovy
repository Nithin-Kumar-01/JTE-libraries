void call(){
    node
    {
            stage("Astronomer: Start"){
                 sh '''
                cd dbt-airflow-poc
                pwd
                 ls
                 astro dev start
                 '''
            }
    }
}
