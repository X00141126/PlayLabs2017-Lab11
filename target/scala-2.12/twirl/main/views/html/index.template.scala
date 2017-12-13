
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
      <th>Category</th>
      <th>Description</th>
      <th>Stock</th>
      <th>Price</th>
      <th colspan="2"></th>      
    </tr>
  </thead>

  <tbody>
    """),_display_(/*26.6*/for(p<-products) yield /*26.22*/ {_display_(Seq[Any](format.raw/*26.24*/("""
      """),format.raw/*27.7*/("""<tr>
        <td class="numeric">"""),_display_(/*28.30*/p/*28.31*/.getId),format.raw/*28.37*/("""</td>
        <td>"""),_display_(/*29.14*/p/*29.15*/.getName),format.raw/*29.23*/("""</td>
        <td>"""),_display_(/*30.14*/p/*30.15*/.getCategory.getName),format.raw/*30.35*/("""</td>        
        <td>"""),_display_(/*31.14*/p/*31.15*/.getDescription),format.raw/*31.30*/("""</td>
        <td  class="numeric">"""),_display_(/*32.31*/p/*32.32*/.getStock),format.raw/*32.41*/("""</td>
        <td  class="numeric">€ """),_display_(/*33.33*/("%.2f".format(p.getPrice))),format.raw/*33.60*/("""</td>
        <td>
          <a href=""""),_display_(/*35.21*/routes/*35.27*/.HomeController.updateProduct(p.getId)),format.raw/*35.65*/("""" class="button xs btn-danger">
            <span class="glyphicon glyphicon-pencil"></span>
          </a>
        </td>        <td>
          <a href=""""),_display_(/*39.21*/routes/*39.27*/.HomeController.deleteProduct(p.getId)),format.raw/*39.65*/("""" class="button xs btn-danger" onclick="return confirmDel();">
            <span class="glyphicon glyphicon-trash"></span>
          </a>
        </td>
      </tr>
    """)))}),format.raw/*44.6*/("""
  """),format.raw/*45.3*/("""</tbody>

</table>
<p>
  <a href=""""),_display_(/*49.13*/routes/*49.19*/.HomeController.addProduct()),format.raw/*49.47*/("""">
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
                  DATE: Wed Dec 13 15:41:22 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-Lab9-Lab10/app/views/index.scala.html
                  HASH: 195434de70971b61d417d22f63643ad0e986a9f9
                  MATRIX: 962->1|1089->33|1117->36|1141->52|1180->54|1208->56|1340->163|1380->195|1419->197|1450->202|1517->243|1531->248|1567->263|1599->268|1639->278|1669->281|1914->500|1946->516|1986->518|2020->525|2081->559|2091->560|2118->566|2164->585|2174->586|2203->594|2249->613|2259->614|2300->634|2354->661|2364->662|2400->677|2463->713|2473->714|2503->723|2568->761|2616->788|2682->827|2697->833|2756->871|2937->1025|2952->1031|3011->1069|3210->1238|3240->1241|3302->1276|3317->1282|3366->1310
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|58->26|58->26|58->26|59->27|60->28|60->28|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|65->33|65->33|67->35|67->35|67->35|71->39|71->39|71->39|76->44|77->45|81->49|81->49|81->49
                  -- GENERATED --
              */
          