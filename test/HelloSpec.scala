import play.api.libs.json.{Json}

import play.api.test._
import play.api.test.Helpers._

import org.scalatestplus.play._

/*
 */
class HelloSpec extends PlaySpec {

  "Hello" must {

    "give {hello: true}" in {
      val Some(res) = route( FakeRequest(GET, "/hello") )

      status(res) mustBe OK
      contentType(res) mustBe Some("application/json")

      val jsv = Json.parse( contentAsString(res) )
      (jsv \ "hello").as[Boolean] mustBe true
    }
  }
}
