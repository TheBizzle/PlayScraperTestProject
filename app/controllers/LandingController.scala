package controllers
import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, Controller}

@Singleton
class LandingController @Inject() extends Controller {

  def index = Action {
    Ok(views.html.landing("Your new Landing Page is ready"))
  }

}
