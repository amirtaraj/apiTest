import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class sample {

    @Test()
    public void getMethod () {
        given().get("https://jsonplaceholder.typicode.com/posts").
                then().log().body().log().status();
    }
}
