<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( STRING , org.springframework.data.gemfire.config.xml.Index . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.Index . getIndexedExpression ( ) ) ; assertEquals ( Region . SEPARATOR + java.lang.String , org.springframework.data.gemfire.config.xml.Index . getFromClause ( ) ) ; assertEquals ( java.lang.String , org.springframework.data.gemfire.config.xml.Index . getRegion ( ) . getName ( ) ) ; assertEquals ( org . apache . geode . cache . query . IndexType . FUNCTIONAL , org.springframework.data.gemfire.config.xml.Index . getType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( STRING , org.springframework.data.gemfire.config.xml.Index . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.config.xml.Index . getIndexedExpression ( ) ) ; assertEquals ( Region . SEPARATOR + java.lang.String + STRING , org.springframework.data.gemfire.config.xml.Index . getFromClause ( ) ) ; assertEquals ( java.lang.String , org.springframework.data.gemfire.config.xml.Index . getRegion ( ) . getName ( ) ) ; assertEquals ( org . apache . geode . cache . query . IndexType . HASH , org.springframework.data.gemfire.config.xml.Index . getType ( ) ) ; }  <METHOD_END>