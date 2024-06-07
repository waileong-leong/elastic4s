package com.sksamuel.elastic4s.fields

trait RniField extends ElasticField{
  def testEntityType : Option[Boolean]
}
