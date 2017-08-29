<METHOD_START> public abstract T T ( )  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { T = T ( ) ; T . prepare ( ) ; session . execute ( T . cql ) ; assertIndex ( T . specification , keyspace , session ) ; }  <METHOD_END>
<METHOD_START> public void ( ) { cassandraRule . before ( CqlDataSet . fromClassPath ( STRING ) . executeIn ( this . keyspace ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.test.integration.core.cql.generator.BasicTest org.springframework.cassandra.test.integration.core.cql.generator.BasicTest ( ) { return new BasicTest ( ) ; }  <METHOD_END>
