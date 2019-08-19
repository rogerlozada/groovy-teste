package org.somecompany

import com.cloudbees.groovy.cps.NonCPS

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
    }


    String repository;
    String name;

}
