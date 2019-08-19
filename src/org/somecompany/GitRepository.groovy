package org.somecompany

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
    }

    private String repository;
    private String name;

    public  String getRepository(){
        return repository;
    }

    public String getName(){
        return repository.tokenize('/')[-1];
    }
}
