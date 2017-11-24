
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="/">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li class="active">
                    <a href="#">About</a>
                </li>

                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>

                <li>
                    <a href=""""),_display_(/*39.31*/routes/*39.37*/.HomeController.customers()),format.raw/*39.64*/("""">Customers</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>

        <row>

            <div class="col-md-12">

                """),_display_(/*53.18*/content),format.raw/*53.25*/("""

            """),format.raw/*55.13*/("""</div>

        </row>

    </container>

    <container>

        <row>

            <div class="col-md-12">

                Copyright
                <strong>Online Shop</strong>

            </div>

        </row>

    </container>

</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Nov 24 17:02:01 GMT 2017
                  SOURCE: /home/wdd/webapps/WMDD1Lab8CRUD/app/views/main.scala.html
                  HASH: ea79044f34e6df7ea3782718eba0903788cf439f
                  MATRIX: 952->1|1077->31|1105->33|1226->128|1251->133|1463->318|1478->324|1540->365|2179->977|2194->983|2242->1010|2440->1181|2468->1188|2510->1202
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|71->39|71->39|71->39|85->53|85->53|87->55
                  -- GENERATED --
              */
          