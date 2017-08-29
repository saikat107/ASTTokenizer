<METHOD_START> @ Before public void void ( ) { org.springframework.data.gemfire.repository.query.GemfireMappingContext = new GemfireMappingContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T extends org.springframework.data.gemfire.repository.query.Algorithm > T T ( java.lang.String java.lang.String ) { return ( T ) ( Algorithm ) ( ) name ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.repository.query.Animal org.springframework.data.gemfire.repository.query.Animal ( java.lang.Long java.lang.Long , java.lang.String java.lang.String ) { Animal org.springframework.data.gemfire.repository.query.Animal = new Animal ( ) ; org.springframework.data.gemfire.repository.query.Animal . setId ( java.lang.Long ) ; org.springframework.data.gemfire.repository.query.Animal . setName ( java.lang.String ) ; return org.springframework.data.gemfire.repository.query.Animal ; }  <METHOD_END>
<METHOD_START> protected < T , ID extends java.io.Serializable > org.springframework.data.gemfire.repository.query.GemfireEntityInformation<T,ID> < T , ID > org.springframework.data.gemfire.repository.query.GemfireEntityInformation<T,ID> ( GemfirePersistentEntity < T > org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<T> ) { return new DefaultGemfireEntityInformation <> ( org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<T> < T > org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return ( GemfirePersistentEntity < T > ) org.springframework.data.gemfire.repository.query.GemfireMappingContext . getPersistentEntity ( java.lang.Class<T> ) . orElseThrow ( ( ) newIllegalStateException ( STRING , entityType ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireEntityInformation < Algorithm , java.lang.String > org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> = org.springframework.data.gemfire.repository.query.GemfireEntityInformation<T,ID> ( org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<org.springframework.data.gemfire.repository.query.Algorithm> ( Algorithm .class ) ) ; assertNotNull ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> ) ; assertEquals ( STRING , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> . getRegionName ( ) ) ; assertTrue ( Algorithm .class . boolean ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> . getJavaType ( ) ) ) ; assertEquals ( java.lang.String .class , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> . getIdType ( ) ) ; assertThat ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> . getId ( new org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.QuickSort ( ) ) . orElse ( null ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Algorithm,java.lang.String> . getId ( org.springframework.data.gemfire.repository.query.Algorithm ( STRING ) ) . orElse ( null ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireEntityInformation < Animal , java.lang.Long > org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Animal,java.lang.Long> = org.springframework.data.gemfire.repository.query.GemfireEntityInformation<T,ID> ( org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<org.springframework.data.gemfire.repository.query.Animal> ( Animal .class ) ) ; assertNotNull ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Animal,java.lang.Long> ) ; assertEquals ( STRING , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Animal,java.lang.Long> . getRegionName ( ) ) ; assertEquals ( Animal .class , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Animal,java.lang.Long> . getJavaType ( ) ) ; assertEquals ( java.lang.Long .class , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Animal,java.lang.Long> . getIdType ( ) ) ; assertThat ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.Animal,java.lang.Long> . getId ( org.springframework.data.gemfire.repository.query.Animal ( NUMBER , STRING ) ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireEntityInformation < org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity , java.lang.Long > org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,java.lang.Long> = org.springframework.data.gemfire.repository.query.GemfireEntityInformation<T,ID> ( org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity> ( org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity .class ) ) ; assertNotNull ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,java.lang.Long> ) ; assertEquals ( STRING , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,java.lang.Long> . getRegionName ( ) ) ; assertEquals ( org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity .class , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,java.lang.Long> . getJavaType ( ) ) ; assertEquals ( java.lang.Long .class , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,java.lang.Long> . getIdType ( ) ) ; assertThat ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,java.lang.Long> . getId ( new org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity ( NUMBER ) ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { GemfireEntityInformation < org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity , ? > org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,?> = org.springframework.data.gemfire.repository.query.GemfireEntityInformation<T,ID> ( org.springframework.data.gemfire.repository.query.GemfirePersistentEntity<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity> ( org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity .class ) ) ; assertNotNull ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,> ) ; assertEquals ( STRING , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,> . getRegionName ( ) ) ; assertEquals ( org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity .class , org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,> . getJavaType ( ) ) ; assertTrue ( java.lang.Long .class . boolean ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,> . getIdType ( ) ) ) ; assertThat ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,> . getId ( new org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity ( NUMBER ) ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.repository.query.GemfireEntityInformation<org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity,> . getId ( new org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.ConfusedDomainEntity ( STRING ) ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected void ( ) { this( ( java.lang.Long ) null ); }  <METHOD_END>
<METHOD_START> protected void ( java.lang.Long java.lang.Long ) { this . java.lang.Long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> protected void ( java.lang.String java.lang.String ) { void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Id protected java.lang.String java.lang.String ( ) { return java.lang.String . java.lang.String ( java.lang.Long ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.lang.String java.lang.String ) { try { this . java.lang.Long = java.lang.Long . java.lang.Long ( java.lang.String ) ; } catch ( java.lang.NumberFormatException java.lang.NumberFormatException ) { this . java.lang.Long = null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.Class<? extends org.springframework.data.gemfire.repository.query.DefaultGemfireEntityInformationTest.QuickSort> ( ) . java.lang.String ( ) ; }  <METHOD_END>