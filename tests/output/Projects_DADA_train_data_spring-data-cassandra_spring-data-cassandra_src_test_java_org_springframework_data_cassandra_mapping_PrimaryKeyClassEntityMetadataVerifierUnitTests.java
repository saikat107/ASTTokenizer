<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . setVerifier ( new org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.NoOpVerifier ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.NonPersistentClass .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.MyInterface .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.Person .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.AnimalPK .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.TooManyAnnotations .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.NoPartitionKey .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.NoPrimaryKey .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.TypeCycle .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.PKClassWithNestedCompositeKey .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.PrimaryKeyAndPrimaryKeyColumn .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifier . verify ( org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( org.springframework.data.cassandra.mapping.PrimaryKeyClassEntityMetadataVerifierUnitTests.SubclassPK .class ) ) ; fail ( STRING ) ; } catch ( MappingException org.springframework.data.cassandra.mapping.MappingException ) { assertThat ( org.springframework.data.cassandra.mapping.MappingException ) . hasMessageContaining ( STRING ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> < ? > org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return org.springframework.data.cassandra.mapping.BasicCassandraMappingContext . getRequiredPersistentEntity ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( CassandraPersistentEntity < ? > org.springframework.data.cassandra.mapping.CassandraPersistentEntity<?> ) throws org.springframework.data.cassandra.mapping.MappingException {}  <METHOD_END>