import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._
import play.api.libs.json.{Json}

import play.api.test._
import play.api.test.Helpers._

/*
 */
@RunWith( classOf[JUnitRunner] )
class HelloSpec extends Specification {

  "Hello" should {

    "give {hello: true}" in new WithApplication {
      val Some(res) = route( FakeRequest(GET, "/hello") )

      status(res) must equalTo(OK)
      contentType(res) mustEqual Some("application/json")

      val jsv = Json.parse( contentAsString(res) )
      (jsv \ "hello").as[Boolean] must equalTo(true)
    }
  }
}
