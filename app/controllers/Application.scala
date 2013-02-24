package controllers
import scala.util.Random

import play.api._
import play.api.mvc._

object Application extends Controller {

  private def randomnumber(limit: Int) = (new Random).nextInt(limit)
  
  def index = Action {
    Ok(views.html.index("今日のおかず", randomnumber(10)))
  }

  def print = Action {
    req => {
      Ok(views.html.print(req.body.asFormUrlEncoded.get("aaa")(0)))
    }
  }
}