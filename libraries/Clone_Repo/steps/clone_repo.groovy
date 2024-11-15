void call(){
        node {
                stage("Project: clone"){
                
        sh 'git clone https://github.com/Nithin-Kumar-01/dbt-airflow-poc.git'
        sh 'cd dbt-airflow-poc' 
        }
        }   
}
