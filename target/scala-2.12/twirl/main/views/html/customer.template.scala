
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

object customer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

"""),_display_(/*3.2*/main("Customers")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""

"""),format.raw/*5.1*/("""<p class="lead">Our Customers</p>

"""),_display_(/*7.2*/if(flash.containsKey("success"))/*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
  """),format.raw/*8.3*/("""<div class="alert alert-success">
    """),_display_(/*9.6*/flash/*9.11*/.get("success")),format.raw/*9.26*/("""
  """),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*25.6*/for(c<-customers) yield /*25.23*/ {_display_(Seq[Any](format.raw/*25.25*/("""
      """),format.raw/*26.7*/("""<tr>
        <td class="numeric">"""),_display_(/*27.30*/c/*27.31*/.getId),format.raw/*27.37*/("""</td>
        <td>"""),_display_(/*28.14*/c/*28.15*/.getName),format.raw/*28.23*/("""</td>
        <td>"""),_display_(/*29.14*/c/*29.15*/.getEmail),format.raw/*29.24*/("""</td>
        <td>
          <a href=""""),_display_(/*31.21*/routes/*31.27*/.HomeController.updateCustomer(c.getId)),format.raw/*31.66*/("""" class="button-xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>        
        <td>
          <a href=""""),_display_(/*36.21*/routes/*36.27*/.HomeController.deleteCustomer(c.getId)),format.raw/*36.66*/("""" class="button-xs btn-danger"  onclick="return confirmDel()">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*41.6*/("""
  """),format.raw/*42.3*/("""</tbody>

</table>

<p>
  <a href=""""),_display_(/*47.13*/routes/*47.19*/.HomeController.addCustomer()),format.raw/*47.48*/("""">
    <button class="btn btn-primary">Add a Customer</button>
  </a>
</p>

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
                  DATE: Wed Dec 13 15:41:22 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-Lab9-Lab10/app/views/customer.scala.html
                  HASH: 3d9408bc3f8517abc9504e3a6457e6d77755d1d7
                  MATRIX: 966->1|1095->35|1123->38|1148->55|1187->57|1215->59|1276->95|1316->127|1355->129|1384->132|1448->171|1461->176|1496->191|1526->194|1564->202|1593->204|1834->419|1867->436|1907->438|1941->445|2002->479|2012->480|2039->486|2085->505|2095->506|2124->514|2170->533|2180->534|2210->543|2276->582|2291->588|2351->627|2541->790|2556->796|2616->835|2815->1004|2845->1007|2908->1043|2923->1049|2973->1078
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|45->13|57->25|57->25|57->25|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|63->31|63->31|63->31|68->36|68->36|68->36|73->41|74->42|79->47|79->47|79->47
                  -- GENERATED --
              */
          