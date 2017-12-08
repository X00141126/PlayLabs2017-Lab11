
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""

"""),format.raw/*5.1*/("""<p class="lead">Product Catalogue</p>

<table class="table table-bordered table-hover table-condensed">
  """),_display_(/*8.4*/if(flash.containsKey("success"))/*8.36*/ {_display_(Seq[Any](format.raw/*8.38*/("""
    """),format.raw/*9.5*/("""<div class="alert alert-success">
      """),_display_(/*10.8*/flash/*10.13*/.get("success")),format.raw/*10.28*/("""
    """),format.raw/*11.5*/("""</div>
  """)))}),format.raw/*12.4*/("""
  """),format.raw/*13.3*/("""<thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Description</th>
      <th>Stock</th>
      <th>Price</th>
    </tr>
  </thead>

  <tbody>
    """),_display_(/*24.6*/for(p<-products) yield /*24.22*/ {_display_(Seq[Any](format.raw/*24.24*/("""
      """),format.raw/*25.7*/("""<tr>
        <td class="numeric">"""),_display_(/*26.30*/p/*26.31*/.getId),format.raw/*26.37*/("""</td>
        <td>"""),_display_(/*27.14*/p/*27.15*/.getName),format.raw/*27.23*/("""</td>
        <td>"""),_display_(/*28.14*/p/*28.15*/.getDescription),format.raw/*28.30*/("""</td>
        <td  class="numeric">"""),_display_(/*29.31*/p/*29.32*/.getStock),format.raw/*29.41*/("""</td>
        <td  class="numeric">€ """),_display_(/*30.33*/("%.2f".format(p.getPrice))),format.raw/*30.60*/("""</td>
      </tr>
    """)))}),format.raw/*32.6*/("""
  """),format.raw/*33.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*37.13*/routes/*37.19*/.HomeController.addProduct()),format.raw/*37.47*/("""">
    <button class="btn btn-primary">Add a product</button>
  </a>
</p>

""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 12:54:07 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-CRUD1-2-3/app/views/index.scala.html
                  HASH: 5b4c726e92475223b53b211c3c7c22cb95ba09b0
                  MATRIX: 962->1|1089->33|1117->36|1141->52|1180->54|1208->56|1340->163|1380->195|1419->197|1450->202|1517->243|1531->248|1567->263|1599->268|1639->278|1669->281|1856->442|1888->458|1928->460|1962->467|2023->501|2033->502|2060->508|2106->527|2116->528|2145->536|2191->555|2201->556|2237->571|2300->607|2310->608|2340->617|2405->655|2453->682|2506->705|2536->708|2598->743|2613->749|2662->777
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|64->32|65->33|69->37|69->37|69->37
                  -- GENERATED --
              */
          