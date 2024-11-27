package de.gvl.gh.issues;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTestGvl
class ApplicationIT {

  @Autowired
  private WebTestClient webTestClient;

  @Test
  void contextLoads() {
    assertThat(webTestClient, notNullValue());
  }
}
