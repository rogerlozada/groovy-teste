package org.somecompany

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
        this.name = _repository.tokenize('/')[-1]
    }

    String repository;
    String name;

    public void setName(String _name){
        name = _name;
    }

    public String getName(){
        return name;
    }
}
