<METHOD_START> @ After public void void ( ) { org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . setCustomConversions ( new CustomConversions ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; java.util.List<java.lang.Object> . boolean ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.DateToStringConverter . org.springframework.data.couchbase.core.mapping.CustomConvertersTests.DateToStringConverter ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . setCustomConversions ( new CustomConversions ( java.util.List<java.lang.Object> ) ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . afterPropertiesSet ( ) ; java.util.Date java.util.Date = new java.util.Date ( ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost = new org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost ( ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.util.Date = java.util.Date ; CouchbaseDocument org.springframework.data.couchbase.core.mapping.CouchbaseDocument = new CouchbaseDocument ( ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . write ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost , org.springframework.data.couchbase.core.mapping.CouchbaseDocument ) ; assertEquals ( java.util.Date . java.lang.String ( ) , org.springframework.data.couchbase.core.mapping.CouchbaseDocument . getPayload ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; java.util.List<java.lang.Object> . boolean ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.IntegerToStringConverter . org.springframework.data.couchbase.core.mapping.CustomConvertersTests.IntegerToStringConverter ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . setCustomConversions ( new CustomConversions ( java.util.List<java.lang.Object> ) ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . afterPropertiesSet ( ) ; CouchbaseDocument org.springframework.data.couchbase.core.mapping.CouchbaseDocument = new CouchbaseDocument ( ) ; org.springframework.data.couchbase.core.mapping.CouchbaseDocument . getPayload ( ) . put ( STRING , NUMBER ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.Counter org.springframework.data.couchbase.core.mapping.CustomConvertersTests.Counter = org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . read ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.Counter .class , org.springframework.data.couchbase.core.mapping.CouchbaseDocument ) ; assertEquals ( STRING , org.springframework.data.couchbase.core.mapping.CustomConvertersTests.Counter . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; java.util.List<java.lang.Object> . boolean ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPostToCouchbaseDocumentConverter . org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPostToCouchbaseDocumentConverter ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . setCustomConversions ( new CustomConversions ( java.util.List<java.lang.Object> ) ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . afterPropertiesSet ( ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost = new org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost ( ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String = STRING ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String = STRING ; CouchbaseDocument org.springframework.data.couchbase.core.mapping.CouchbaseDocument = new CouchbaseDocument ( ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . write ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost , org.springframework.data.couchbase.core.mapping.CouchbaseDocument ) ; assertEquals ( STRING , org.springframework.data.couchbase.core.mapping.CouchbaseDocument . getPayload ( ) . get ( STRING ) ) ; assertEquals ( STRING , org.springframework.data.couchbase.core.mapping.CouchbaseDocument . getPayload ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; java.util.List<java.lang.Object> . boolean ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.CouchbaseDocumentToBlogPostConverter . org.springframework.data.couchbase.core.mapping.CustomConvertersTests.CouchbaseDocumentToBlogPostConverter ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . setCustomConversions ( new CustomConversions ( java.util.List<java.lang.Object> ) ) ; org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . afterPropertiesSet ( ) ; CouchbaseDocument org.springframework.data.couchbase.core.mapping.CouchbaseDocument = new CouchbaseDocument ( ) ; org.springframework.data.couchbase.core.mapping.CouchbaseDocument . getPayload ( ) . put ( STRING , STRING ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost = org.springframework.data.couchbase.core.mapping.MappingCouchbaseConverter . read ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost .class , org.springframework.data.couchbase.core.mapping.CouchbaseDocument ) ; assertEquals ( STRING , org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String ) ; assertEquals ( STRING , org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.Integer java.lang.Integer ) { return java.lang.Integer % NUMBER == NUMBER ? STRING : STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.util.Date java.util.Date ) { return java.util.Date . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.core.mapping.CouchbaseDocument org.springframework.data.couchbase.core.mapping.CouchbaseDocument ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost ) { return new CouchbaseDocument ( ) . setId ( org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String ) . put ( STRING , org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String ) . put ( STRING , org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String . java.lang.String ( ) . java.lang.String ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost ( CouchbaseDocument org.springframework.data.couchbase.core.mapping.CouchbaseDocument ) { org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost = new org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost ( ) ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String = STRING ; org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost . java.lang.String = org.springframework.data.couchbase.core.mapping.CouchbaseDocument . getPayload ( ) . get ( STRING ) + STRING ; return org.springframework.data.couchbase.core.mapping.CustomConvertersTests.BlogPost ; }  <METHOD_END>