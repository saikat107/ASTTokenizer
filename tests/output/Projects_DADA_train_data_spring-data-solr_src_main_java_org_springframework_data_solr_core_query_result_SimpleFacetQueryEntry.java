<METHOD_START> public void ( java.lang.String java.lang.String , long long ) { super( java.lang.String , long ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return getValue ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.solr.core.query.result.FilterQuery org.springframework.data.solr.core.query.result.FilterQuery ( ) { return new SimpleQuery ( new SimpleStringCriteria ( getValue ( ) ) ) ; }  <METHOD_END>
