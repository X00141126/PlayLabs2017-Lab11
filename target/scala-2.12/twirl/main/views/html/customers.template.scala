
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

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Customers")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*5.1*/("""<p class="lead">Our Customers</p>

<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>First Name</th>
      <th>Last Name</th>
      <th>Phone</th>
      <th>Email</th>
    </tr>
  </thead>

  <tbody>
    """),_display_(/*20.6*/for(c<-customers) yield /*20.23*/ {_display_(Seq[Any](format.raw/*20.25*/("""
      """),format.raw/*21.7*/("""<tr>
        <td class="numeric">"""),_display_(/*22.30*/c/*22.31*/.getID),format.raw/*22.37*/("""</td>
        <td>"""),_display_(/*23.14*/c/*23.15*/.getFirstName),format.raw/*23.28*/("""</td>
        <td>"""),_display_(/*24.14*/c/*24.15*/.getLastName),format.raw/*24.27*/("""</td>
        <td>"""),_display_(/*25.14*/c/*25.15*/.getPhone),format.raw/*25.24*/("""</td>
        <td>"""),_display_(/*26.14*/c/*26.15*/.getEmail),format.raw/*26.24*/("""</td>
      </tr>
    """)))}),format.raw/*28.6*/("""
  """),format.raw/*29.3*/("""</tbody>

</table>

""")))}))
      }
    }
  }

  def render(customers:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 12:54:07 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-CRUD1-2-3/app/views/customers.scala.html
                  HASH: 70c95cf550707092aa5df45c085e6df052db13ca
                  MATRIX: 967->1|1096->35|1124->38|1149->55|1188->57|1216->59|1510->327|1543->344|1583->346|1617->353|1678->387|1688->388|1715->394|1761->413|1771->414|1805->427|1851->446|1861->447|1894->459|1940->478|1950->479|1980->488|2026->507|2036->508|2066->517|2119->540|2149->543
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|58->26|60->28|61->29
                  -- GENERATED --
              */
          