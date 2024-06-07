package com.sksamuel.elastic4s.fields

object RniAddressField {
  val `type`: String = "rni_address"
}
case class RniAddressField (
    name : String,
    testEntityType : Option[Boolean] = None
                        ) extends RniField {
  override def `type`: String = RniAddressField.`type`
}
