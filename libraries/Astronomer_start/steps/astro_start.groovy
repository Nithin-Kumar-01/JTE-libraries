void call(){
    node
    {
            stage("Astronomer: Start"){
                 sh '''
                cd dbt-airflow-poc
                pwd
                 ls
                 cd dbt-airflow-poc
                 astro dev start
                 '''
            }
    }
}
