package org.somecompany

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
    }

    String repository;
    String name;

    public String getName(){
        return repository.tokenize('/')[-1];
    }
}
