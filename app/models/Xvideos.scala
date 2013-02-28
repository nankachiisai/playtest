package models

import scala.util.Random
import play.api.libs.json._

class Xvideos {
  val id: Int = (new Random).nextInt(3900000)
  val baseurl: String = "http://www.xvideos.com/video" + id.toString

  private def fetchPage(url: String) = {
  }

  def getJson = {
  }
}
