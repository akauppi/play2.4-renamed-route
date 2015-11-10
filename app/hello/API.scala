package hello

import play.api.mvc._
import play.api.libs.json._
//import play.api.libs.functional.syntax._    // this is for the 'and' combinator syntax

class API extends Controller {

  def aaa = Action {
    val json = Json.toJson( Json.obj( "hello" -> true ) )
    Ok( json )
  }
}
