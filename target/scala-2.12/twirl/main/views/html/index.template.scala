
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

  <thead>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Description</th>
      <th>Stock</th>
      <th>Price</th>
    </tr>
  </thead>

  <tbody>
    """),_display_(/*20.6*/for(p<-products) yield /*20.22*/ {_display_(Seq[Any](format.raw/*20.24*/("""
      """),format.raw/*21.7*/("""<tr>
        <td class="numeric">"""),_display_(/*22.30*/p/*22.31*/.getId),format.raw/*22.37*/("""</td>
        <td>"""),_display_(/*23.14*/p/*23.15*/.getName),format.raw/*23.23*/("""</td>
        <td>"""),_display_(/*24.14*/p/*24.15*/.getDescription),format.raw/*24.30*/("""</td>
        <td  class="numeric">"""),_display_(/*25.31*/p/*25.32*/.getStock),format.raw/*25.41*/("""</td>
        <td  class="numeric">€ """),_display_(/*26.33*/("%.2f".format(p.getPrice))),format.raw/*26.60*/("""</td>
      </tr>
    """)))}),format.raw/*28.6*/("""
  """),format.raw/*29.3*/("""</tbody>

</table>

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
                  DATE: Thu Nov 30 13:53:40 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-CRUD1-2-3/app/views/index.scala.html
                  HASH: 07bfa0a97c642d15a6ab1ad7b421ec5dca127893
                  MATRIX: 962->1|1089->33|1117->36|1141->52|1180->54|1208->56|1502->324|1534->340|1574->342|1608->349|1669->383|1679->384|1706->390|1752->409|1762->410|1791->418|1837->437|1847->438|1883->453|1946->489|1956->490|1986->499|2051->537|2099->564|2152->587|2182->590
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|52->20|52->20|52->20|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|60->28|61->29
                  -- GENERATED --
              */
          