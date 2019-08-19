package org.somecompany

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
        setName(_repository);
    }

    String repository;
    String name;

    public void setName(String _repository){
        name = _repository.tokenize('/')[-1]
    }

    public String getName(){
        return name;
    }
}
