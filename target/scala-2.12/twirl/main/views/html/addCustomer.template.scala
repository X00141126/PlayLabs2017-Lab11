
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.39*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Customer")/*4.22*/ {_display_(Seq[Any](format.raw/*4.24*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new customer</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addCustomerSubmit(), 'class-> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),_display_(/*7.10*/CSRF/*7.14*/.formField),format.raw/*7.24*/("""

        """),_display_(/*9.10*/inputText(customerForm("name"), '_label -> "Name", 'class -> "form_control")),format.raw/*9.86*/("""
        """),_display_(/*10.10*/inputText(customerForm("email"), '_label -> "E-mail", 'class -> "form_control")),format.raw/*10.89*/("""

        """),_display_(/*12.10*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*12.75*/("""

        """),format.raw/*14.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Customer" class="btn btn-primary">
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.HomeController.customer),format.raw/*16.53*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        """)))}),format.raw/*20.10*/("""
""")))}))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 13 15:41:22 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-Lab9-Lab10/app/views/addCustomer.scala.html
                  HASH: 45cc7775b60616c3e01dd2ca1dbc77aa116ae18d
                  MATRIX: 969->1|1079->40|1124->38|1151->56|1178->58|1206->78|1245->80|1276->85|1345->129|1453->228|1493->230|1529->240|1541->244|1571->254|1608->265|1704->341|1741->351|1841->430|1879->441|1965->506|2002->516|2159->646|2174->652|2219->676|2372->798
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|42->10|42->10|44->12|44->12|46->14|48->16|48->16|48->16|52->20
                  -- GENERATED --
              */
          