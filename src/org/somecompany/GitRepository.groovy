package org.somecompany

import com.cloudbees.groovy.cps.NonCPS

class GitRepository {
    //GitRepository(String _repository) {
     //   this.repository = _repository;
   // }


    private String repository;
    private String name;

    //@NonCPS
    def setName(_repository)
    {
        this.name = _repository.tokenize('/')[-1]
    }

    def getRepository() {
        return this.repository;
    }

    def getName() {
        return this.name;
    }
}
