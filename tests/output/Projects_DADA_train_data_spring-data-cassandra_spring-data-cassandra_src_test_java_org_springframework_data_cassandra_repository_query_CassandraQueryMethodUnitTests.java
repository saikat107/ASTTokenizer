<METHOD_START> @ Before public void void ( ) { org.springframework.data.cassandra.repository.query.CassandraMappingContext = new BasicCassandraMappingContext ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CassandraQueryMethod org.springframework.data.cassandra.repository.query.CassandraQueryMethod = org.springframework.data.cassandra.repository.query.CassandraQueryMethod ( org.springframework.data.cassandra.repository.query.CassandraQueryMethodUnitTests.SampleRepository .class , STRING ) ; CassandraEntityMetadata < ? > org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<?> = org.springframework.data.cassandra.repository.query.CassandraQueryMethod . getEntityInformation ( ) ; assertThat ( org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<> . getJavaType ( ) ) . isAssignableFrom ( Person .class ) ; assertThat ( org.springframework.data.cassandra.repository.query.CassandraEntityMetadata<> . getTableName ( ) . toCql ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.cassandra.repository.query.CassandraQueryMethodUnitTests.SampleRepository .class . java.lang.reflect.Method ( STRING ) ; new CassandraQueryMethod ( java.lang.reflect.Method , new DefaultRepositoryMetadata ( org.springframework.data.cassandra.repository.query.CassandraQueryMethodUnitTests.SampleRepository .class ) , new SpelAwareProxyProjectionFactory ( ) , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CassandraQueryMethod org.springframework.data.cassandra.repository.query.CassandraQueryMethod = org.springframework.data.cassandra.repository.query.CassandraQueryMethod ( org.springframework.data.cassandra.repository.query.CassandraQueryMethodUnitTests.SampleRepository .class , STRING ) ; assertThat ( org.springframework.data.cassandra.repository.query.CassandraQueryMethod . isCollectionQuery ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.cassandra.repository.query.CassandraQueryMethod org.springframework.data.cassandra.repository.query.CassandraQueryMethod ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; ProjectionFactory org.springframework.data.cassandra.repository.query.ProjectionFactory = new SpelAwareProxyProjectionFactory ( ) ; return new CassandraQueryMethod ( java.lang.reflect.Method , new DefaultRepositoryMetadata ( java.lang.Class<> ) , org.springframework.data.cassandra.repository.query.ProjectionFactory , org.springframework.data.cassandra.repository.query.CassandraMappingContext ) ; }  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.cassandra.repository.query.Person> < Person > java.util.List<org.springframework.data.cassandra.repository.query.Person> ( )  <METHOD_END>