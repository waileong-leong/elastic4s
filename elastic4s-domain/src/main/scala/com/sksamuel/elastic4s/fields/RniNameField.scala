package com.sksamuel.elastic4s.fields

object RniNameField {
  val `type`: String = "rni_name"
}
case class RniNameField (
    name : String,
    testEntityType : Option[Boolean] = None
                        ) extends RniField {
  override def `type`: String = RniNameField.`type`
}
