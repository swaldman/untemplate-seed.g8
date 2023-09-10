import \$meta._

import mill._
import mill.scalalib._

import \$ivy.`com.mchange::untemplate-mill:$untemplate_version$`
import untemplate.mill._

object $module;format="camel"$ extends UntemplateModule {
  override def scalaVersion = "3.2.2

  // we'll build an index!
  override def untemplateIndexNameFullyQualified : Option[String] = Some("$package;format="package"$.IndexedUntemplates")

  override def untemplateSelectCustomizer: untemplate.Customizer.Selector = { key =>
    var out = untemplate.Customizer.empty

    // to customize, examine key and modify the customer
    // with out = out.copy=...
    //
    // e.g. out = out.copy(extraImports=Seq("$package;format="camel"$.*"))

    out
  }
}


