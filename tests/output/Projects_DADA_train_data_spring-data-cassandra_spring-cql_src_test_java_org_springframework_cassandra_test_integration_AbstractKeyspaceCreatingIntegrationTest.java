<METHOD_START> public void ( ) { this( org.springframework.cassandra.test.integration.KeyspaceRule . getKeyspaceName ( ) ); }  <METHOD_END>
<METHOD_START> private void ( final java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.cassandra.test.integration.Session = org.springframework.cassandra.test.integration.KeyspaceRule . getSession ( ) ; cassandraRule . before ( session -> { if ( ! keyspace . equals ( session . getLoggedKeyspace ( ) ) ) { session . execute ( String . format ( STRING , keyspace ) ) ; } return null ; } ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.cassandra.test.integration.Session org.springframework.cassandra.test.integration.Session ( ) { return org.springframework.cassandra.test.integration.Session ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { org.springframework.cassandra.test.integration.Session . execute ( STRING + java.lang.String ) ; }  <METHOD_END>