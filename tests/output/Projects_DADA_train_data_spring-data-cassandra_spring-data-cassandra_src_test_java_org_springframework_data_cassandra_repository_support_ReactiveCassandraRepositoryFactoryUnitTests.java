<METHOD_START> @ Before public void void ( ) { when ( org.springframework.data.cassandra.repository.support.ReactiveCassandraTemplate . getConverter ( ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraConverter ) ; when ( org.springframework.data.cassandra.repository.support.CassandraConverter . getMappingContext ( ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraMappingContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.cassandra.repository.support.CassandraMappingContext . getRequiredPersistentEntity ( Person .class ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity ) ; when ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity . getType ( ) ) . thenReturn ( Person .class ) ; ReactiveCassandraRepositoryFactory org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactory = new ReactiveCassandraRepositoryFactory ( org.springframework.data.cassandra.repository.support.ReactiveCassandraTemplate ) ; CassandraEntityInformation < Person , java.io.Serializable > org.springframework.data.cassandra.repository.support.CassandraEntityInformation<org.springframework.data.cassandra.repository.support.Person,java.io.Serializable> = org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactory . getEntityInformation ( Person .class ) ; assertThat ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<org.springframework.data.cassandra.repository.support.Person,java.io.Serializable> ) . isInstanceOf ( MappingCassandraEntityInformation .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.cassandra.repository.support.CassandraMappingContext . getRequiredPersistentEntity ( Person .class ) ) . thenReturn ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity ) ; when ( org.springframework.data.cassandra.repository.support.CassandraPersistentEntity . getType ( ) ) . thenReturn ( Person .class ) ; ReactiveCassandraRepositoryFactory org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactory = new ReactiveCassandraRepositoryFactory ( org.springframework.data.cassandra.repository.support.ReactiveCassandraTemplate ) ; org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactoryUnitTests.MyPersonRepository org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactoryUnitTests.MyPersonRepository = org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactory . getRepository ( org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactoryUnitTests.MyPersonRepository .class ) ; assertThat ( org.springframework.data.cassandra.repository.support.ReactiveCassandraRepositoryFactoryUnitTests.MyPersonRepository ) . isNotNull ( ) ; }  <METHOD_END>