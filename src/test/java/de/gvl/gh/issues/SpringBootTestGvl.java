package de.gvl.gh.issues;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
// the WebTestClient is available in IT class
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
// the WebTestClient is *not* available in IT class
@SpringBootTest
public @interface SpringBootTestGvl {

}
