package com.sksamuel.elastic4s.fields

object RniDateField {
  val `type`: String = "rni_date"
}
case class RniDateField (
    name : String,
    testEntityType: Option[Boolean] = None
                        ) extends RniField {
  override def `type`: String = RniDateField.`type`
}
