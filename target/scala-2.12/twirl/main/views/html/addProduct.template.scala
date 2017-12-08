
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add Product")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*6.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*6.105*/ {_display_(Seq[Any](format.raw/*6.107*/("""
        """),format.raw/*7.37*/("""
        """),_display_(/*8.10*/CSRF/*8.14*/.formField),format.raw/*8.24*/("""

        """),_display_(/*10.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*10.85*/("""
        """),_display_(/*11.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*11.99*/("""
        """),_display_(/*12.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*12.87*/("""
        """),_display_(/*13.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*13.87*/("""

        """),_display_(/*15.10*/inputText(productForm("id"), 'label -> "", 'hidden -> "hidden")),format.raw/*15.73*/("""

        """),format.raw/*17.9*/("""<div class="actions">
            <input type="submit" value="Add/Update Product" class="btn btn-primary">
            <a href=""""),_display_(/*19.23*/routes/*19.29*/.HomeController.index),format.raw/*19.50*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*23.6*/("""
""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 08 12:54:07 GMT 2017
                  SOURCE: /home/wdd/webapps/PlayLabs2017-CRUD1-2-3/app/views/addProduct.scala.html
                  HASH: ac59c15bf513ffcfb338acb75bc79144a31679c3
                  MATRIX: 967->1|1075->38|1120->36|1147->54|1174->56|1201->75|1240->77|1271->82|1339->125|1447->224|1487->226|1523->263|1559->273|1571->277|1601->287|1639->298|1735->373|1772->383|1882->472|1919->482|2017->559|2054->569|2152->646|2190->657|2274->720|2311->730|2467->859|2482->865|2524->886|2672->1004|2704->1006
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|42->10|42->10|43->11|43->11|44->12|44->12|45->13|45->13|47->15|47->15|49->17|51->19|51->19|51->19|55->23|56->24
                  -- GENERATED --
              */
          