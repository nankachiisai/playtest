package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  private def randomnumber(limit: Int) = (new Random).nextInt(limit)
  
  def index = Action {
    Ok(views.html.index("今日のおかず", randomnumber(10)))
  }

  def print = Action {
    req => {
      def postproc(inputstr: String) =
	if (!inputstr.isEmpty)
	  "input string is \"" + inputstr +"\"."
	else
	  "input string is empty."

      val textdata = req.body.asFormUrlEncoded.get("aaa")(0)
      Ok(views.html.print(postproc(textdata)))
    }

  }
  
  def random = Action {
    val json = List("hello", "world")
    Ok(Json.toJson(json))
  }
}
