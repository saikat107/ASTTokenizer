<METHOD_START> @ Before public void void ( ) { when ( org.springframework.data.cassandra.repository.support.CassandraTemplate . getConverter ( ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraConverter ) ; when ( org.springframework.data.cassandra.repository.support.CassandraConverter . getMappingContext ( ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraMappingContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.cassandra.repository.support.CassandraMappingContext . getRequiredPersistentEntity ( Person .class ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity ) ; when ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity . getType ( ) ) . thenReturn ( Person .class ) ; CassandraRepositoryFactory org.springframework.data.cassandra.repository.support.CassandraRepositoryFactory = new CassandraRepositoryFactory ( org.springframework.data.cassandra.repository.support.CassandraTemplate ) ; CassandraEntityInformation < Person , java.io.Serializable > org.springframework.data.cassandra.repository.support.CassandraEntityInformation<org.springframework.data.cassandra.repository.support.Person,java.io.Serializable> = org.springframework.data.cassandra.repository.support.CassandraRepositoryFactory . getEntityInformation ( Person .class ) ; assertThat ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<org.springframework.data.cassandra.repository.support.Person,java.io.Serializable> ) . isInstanceOf ( MappingCassandraEntityInformation .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.cassandra.repository.support.CassandraMappingContext . getRequiredPersistentEntity ( Person .class ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity ) ; when ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity . getType ( ) ) . thenReturn ( Person .class ) ; CassandraRepositoryFactory org.springframework.data.cassandra.repository.support.CassandraRepositoryFactory = new CassandraRepositoryFactory ( org.springframework.data.cassandra.repository.support.CassandraTemplate ) ; org.springframework.data.cassandra.repository.support.CassandraRepositoryFactoryUnitTests.MyPersonRepository org.springframework.data.cassandra.repository.support.CassandraRepositoryFactoryUnitTests.MyPersonRepository = org.springframework.data.cassandra.repository.support.CassandraRepositoryFactory . getRepository ( org.springframework.data.cassandra.repository.support.CassandraRepositoryFactoryUnitTests.MyPersonRepository .class ) ; assertThat ( org.springframework.data.cassandra.repository.support.CassandraRepositoryFactoryUnitTests.MyPersonRepository ) . isNotNull ( ) ; }  <METHOD_END>