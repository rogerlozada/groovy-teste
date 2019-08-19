package org.somecompany.build;

import org.junit.Before;
import org.junit.Test;
import org.somecompany.GitRepository;

public class GitRepositoryTests {
    private GitRepository gitRepository;

    @Before
    public void setup() {
        this.gitRepository = new GitRepository("git@ssh.dev.azure.com:v3/dotzmkt/Dotz/accounts");
    }

    @Test
    public void testGitRepositoryNameMustBeEqualExpectedValue() {
        String expected = "git@ssh.dev.azure.com:v3/dotzmkt/Dotz/accounts";
        assert  expected == this.gitRepository.getRepository();
    }

    @Test
    public void testGitNameMustBeEqualExpectedValue() {
        String expected = "accounts";
        assert  expected.equals(this.gitRepository.getName());
    }
}
