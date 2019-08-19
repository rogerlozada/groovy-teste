package org.somecompany.build;

import org.junit.Test;
import org.somecompany.GitRepository;

public class GitRepositoryTests {

    @Test
    public void testGitRepositoryNameMustBeEqualExpectedValue() {
        GitRepository gitRepository = new GitRepository("git@ssh.dev.azure.com:v3/dotzmkt/Dotz/accounts");
        String expected = "git@ssh.dev.azure.com:v3/dotzmkt/Dotz/accounts";
        assert  expected == gitRepository.getRepository();
    }
}
