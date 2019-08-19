package org.somecompany

import com.cloudbees.groovy.cps.NonCPS

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
    }


    private String repository;
    private String name;

    //@NonCPS
    public void setName(_repository)
    {
        this.name = _repository.tokenize('/')[-1]
    }

    String getRepository() {
        return this.repository;
    }

    String getName() {
        return this.name;
    }
}
