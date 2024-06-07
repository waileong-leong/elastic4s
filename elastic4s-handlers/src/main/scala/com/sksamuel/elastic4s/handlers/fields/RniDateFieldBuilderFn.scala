package com.sksamuel.elastic4s.handlers.fields

import com.sksamuel.elastic4s.fields.RniDateField
import com.sksamuel.elastic4s.json.{XContentBuilder, XContentFactory}

object RniDateFieldBuilderFn {
  def toField(name: String, values: Map[String, Any]): RniDateField = RniDateField(
    name,
    values.get("testEntityType").map(_.asInstanceOf[Boolean])
  )


  def build(field: RniDateField): XContentBuilder = {

    val builder = XContentFactory.jsonBuilder()
    builder.field("type", field.`type`)
    field.testEntityType.foreach(builder.field("testEntityType", _))
    builder.endObject()
  }
}
