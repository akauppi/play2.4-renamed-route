package controllers.hello

import play.api.mvc._
import play.api.libs.json._

class API extends Controller {

  def aaa = Action {
    val json = Json.toJson( Json.obj( "hello" -> true ) )
    Ok( json )
  }
}
