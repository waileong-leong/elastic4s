package com.sksamuel.elastic4s.handlers.fields

import com.sksamuel.elastic4s.fields.RniNameField
import com.sksamuel.elastic4s.json.{XContentBuilder, XContentFactory}

object RniNameFieldBuilderFn {
  def toField(name: String, values: Map[String, Any]): RniNameField = RniNameField(
    name,
    values.get("testEntityType").map(_.asInstanceOf[Boolean])
  )


  def build(field: RniNameField): XContentBuilder = {

    val builder = XContentFactory.jsonBuilder()
    builder.field("type", field.`type`)
    field.testEntityType.foreach(builder.field("testEntityType", _))
    builder.endObject()
  }
}
