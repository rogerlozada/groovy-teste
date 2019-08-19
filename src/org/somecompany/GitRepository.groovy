package org.somecompany

import com.cloudbees.groovy.cps.NonCPS

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
        this.name = _repository.tokenize('/')[-1]
    }

    String repository;
    String name;
}
