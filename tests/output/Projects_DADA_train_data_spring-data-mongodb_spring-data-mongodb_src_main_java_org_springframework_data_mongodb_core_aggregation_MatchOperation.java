<METHOD_START> public void ( CriteriaDefinition org.springframework.data.mongodb.core.aggregation.CriteriaDefinition ) { Assert . notNull ( org.springframework.data.mongodb.core.aggregation.CriteriaDefinition , STRING ) ; this . org.springframework.data.mongodb.core.aggregation.CriteriaDefinition = org.springframework.data.mongodb.core.aggregation.CriteriaDefinition ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( AggregationOperationContext org.springframework.data.mongodb.core.aggregation.AggregationOperationContext ) { return new Document ( STRING , org.springframework.data.mongodb.core.aggregation.AggregationOperationContext . getMappedObject ( org.springframework.data.mongodb.core.aggregation.CriteriaDefinition . getCriteriaObject ( ) ) ) ; }  <METHOD_END>