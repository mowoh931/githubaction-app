package com.baar.githubaction;

import org.springframework.boot.SpringApplication;

public class TestGithubactionAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(GithubactionAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
