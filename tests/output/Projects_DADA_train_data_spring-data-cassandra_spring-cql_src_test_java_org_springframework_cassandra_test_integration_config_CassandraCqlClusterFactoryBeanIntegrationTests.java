<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean = new CassandraCqlClusterFactoryBean ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean . destroy ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean . setNettyOptions ( IntegrationTestNettyOptions . INSTANCE ) ; org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean . setProtocolVersion ( ProtocolVersion . V2 ) ; org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean . afterPropertiesSet ( ) ; assertThat ( org.springframework.cassandra.test.integration.config.ProtocolVersion ( org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean ) ) . isEqualTo ( ProtocolVersion . V2 ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean . afterPropertiesSet ( ) ; assertThat ( org.springframework.cassandra.test.integration.config.ProtocolVersion ( org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.cassandra.test.integration.config.ProtocolVersion org.springframework.cassandra.test.integration.config.ProtocolVersion ( CassandraCqlClusterFactoryBean org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean )			throws java.lang.Exception { return ( ProtocolVersion ) ReflectionTestUtils . getField ( org.springframework.cassandra.test.integration.config.CassandraCqlClusterFactoryBean . getObject ( ) . getConfiguration ( ) . getProtocolOptions ( ) , STRING ) ; }  <METHOD_END>