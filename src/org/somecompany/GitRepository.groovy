package org.somecompany

class GitRepository {
    GitRepository(String _repository) {
        this.repository = _repository;
        this.SetName(_repository);
    }

    private String repository;
    private String name;

    private void SetName(_repository)
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
