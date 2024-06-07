package com.sksamuel.elastic4s.handlers.fields

import com.sksamuel.elastic4s.fields.RniAddressField
import com.sksamuel.elastic4s.json.{XContentBuilder, XContentFactory}

object RniAddressFieldBuilderFn {
  def toField(name: String, values: Map[String, Any]): RniAddressField = RniAddressField(
    name,
    values.get("testEntityType").map(_.asInstanceOf[Boolean])
  )


  def build(field: RniAddressField): XContentBuilder = {

    val builder = XContentFactory.jsonBuilder()
    builder.field("type", field.`type`)
    field.testEntityType.foreach(builder.field("testEntityType", _))
    builder.endObject()
  }
}
