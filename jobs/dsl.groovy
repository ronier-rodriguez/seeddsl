def githuburl = 'ronier-rodriguez/test'
job('DSL-generated-job') {
  scm {
    git {
      remote {
        github(githuburl)
      }
    }
  }
  
  steps {
    virtualenv {
      name('venv')
      command('pip install -Uqr requirements.txt')
    }
    virtualenv {
      name('venv')
      command('python main.py')
    }
  }
}
