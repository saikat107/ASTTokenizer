<METHOD_START> public void ( ) { org.springframework.data.solr.core.schema.ObjectMapper = new ObjectMapper ( ) ; org.springframework.data.solr.core.schema.ObjectMapper . configure ( DeserializationFeature . FAIL_ON_UNKNOWN_PROPERTIES , false ) ; org.springframework.data.solr.core.schema.ObjectMapper . configure ( Feature . ALLOW_UNQUOTED_FIELD_NAMES , true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( NamedList < java.lang.Object > org.springframework.data.solr.core.schema.NamedList<java.lang.Object> ) { super. setResponse ( org.springframework.data.solr.core.schema.NamedList<java.lang.Object> ) ; try { java.lang.String java.lang.String = java.lang.String ( ) ; if ( java.lang.String == null ) { if ( org.springframework.data.solr.core.schema.NamedList<java.lang.Object> . get ( STRING ) != null ) { org.springframework.data.solr.core.schema.JsonNode = org.springframework.data.solr.core.schema.ObjectMapper . readTree ( org.springframework.data.solr.core.schema.NamedList<java.lang.Object> . toString ( ) . replace ( '=' , ':' ) ) ; } else { org.springframework.data.solr.core.schema.JsonNode = org.springframework.data.solr.core.schema.ObjectMapper . createObjectNode ( ) ; } return; } org.springframework.data.solr.core.schema.JsonNode = org.springframework.data.solr.core.schema.ObjectMapper . readTree ( java.lang.String ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new InvalidDataAccessResourceUsageException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return ( java.lang.String ) getResponse ( ) . get ( STRING ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.solr.core.schema.JsonNode org.springframework.data.solr.core.schema.JsonNode ( java.lang.String java.lang.String ) { return org.springframework.data.solr.core.schema.JsonNode . findValue ( java.lang.String ) ; }  <METHOD_END>