package jie;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HelloTest {
  @Test
  public void withParam() {
    given().when().get("/api/hello").then().log().all(true).statusCode(200).body(is("hello "));
    given().when().get("/api/option1/hello").then().log().all(true).statusCode(200).body(is("hello option1/"));
  }

  @Test
  public void withoutParam() {
    given().when().get("/api/world").then().log().all(true).statusCode(200).body(is("world"));
    given().when().get("/api/option1/world").then().log().all(true).statusCode(200).body(is("world"));
  }
}
