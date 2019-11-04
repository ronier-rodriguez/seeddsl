node {
    checkout scm
    stage('Build'){
        jobDsl( targets: 'jobs/dsl.groovy', lookupStrategy: 'SEED_JOB')
    }
}
