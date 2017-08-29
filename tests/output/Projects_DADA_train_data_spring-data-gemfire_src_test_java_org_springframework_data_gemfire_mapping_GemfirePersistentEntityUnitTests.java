<METHOD_START> protected org.springframework.data.gemfire.mapping.IdentifierAccessor org.springframework.data.gemfire.mapping.IdentifierAccessor ( java.lang.Object java.lang.Object ) { return org.springframework.data.gemfire.mapping.GemfirePersistentEntity<java.lang.Object> ( java.lang.Object ) . getIdentifierAccessor ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> < T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> ( java.lang.Object java.lang.Object ) { return this .< T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> ( ( java.lang.Class<T> < T > ) java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> < T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return ( GemfirePersistentEntity < T > ) this . org.springframework.data.gemfire.mapping.GemfireMappingContext . getPersistentEntity ( java.lang.Class<T> ) . orElseThrow ( ( ) newIllegalStateException ( STRING , type ) ) ; }  <METHOD_END>
<METHOD_START> protected < T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> < T > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return new GemfirePersistentEntity <> ( ClassTypeInformation . from ( java.lang.Class<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NonRegionAnnotatedEntity> ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NonRegionAnnotatedEntity .class ) . getRegionName ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NonRegionAnnotatedEntity .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.UnnamedRegionAnnotatedEntity> ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.UnnamedRegionAnnotatedEntity .class ) . getRegionName ( ) ) . isEqualTo ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.UnnamedRegionAnnotatedEntity .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NamedRegionAnnotatedEntity> ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NamedRegionAnnotatedEntity .class ) . getRegionName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { GemfirePersistentEntity < org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> = org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject .class ) ; assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> . getRegionName ( ) ) . isEqualTo ( STRING ) ; java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> < GemfirePersistentProperty > java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> = org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> . getPersistentProperty ( STRING ) ; assertThat ( java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> . isPresent ( ) ) . isTrue ( ) ; assertThat ( java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> . get ( ) . isEntity ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { GemfirePersistentEntity < org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject > org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> = org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> ( org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject .class ) ; assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> . getRegionName ( ) ) . isEqualTo ( STRING ) ; java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> < GemfirePersistentProperty > java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> = org.springframework.data.gemfire.mapping.GemfirePersistentEntity<org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.ExampleDomainObject> . getPersistentProperty ( STRING ) ; assertThat ( java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> . isPresent ( ) ) . isTrue ( ) ; assertThat ( java.util.Optional<org.springframework.data.gemfire.mapping.GemfirePersistentProperty> . get ( ) . isEntity ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { IdentifierAccessor org.springframework.data.gemfire.mapping.IdentifierAccessor = org.springframework.data.gemfire.mapping.IdentifierAccessor ( new org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NonRegionAnnotatedEntity ( ) ) ; assertThat ( org.springframework.data.gemfire.mapping.IdentifierAccessor . getIdentifier ( ) . orElse ( null ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { IdentifierAccessor org.springframework.data.gemfire.mapping.IdentifierAccessor = org.springframework.data.gemfire.mapping.IdentifierAccessor ( new org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NonIdAnnotatedIdFieldEntity ( ) ) ; assertThat ( org.springframework.data.gemfire.mapping.IdentifierAccessor . getIdentifier ( ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { IdentifierAccessor org.springframework.data.gemfire.mapping.IdentifierAccessor = org.springframework.data.gemfire.mapping.IdentifierAccessor ( new org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.NonIdAnnotatedIdGetterEntity ( ) ) ; assertThat ( org.springframework.data.gemfire.mapping.IdentifierAccessor . getIdentifier ( ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { IdentifierAccessor org.springframework.data.gemfire.mapping.IdentifierAccessor = org.springframework.data.gemfire.mapping.IdentifierAccessor ( new org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.IdAnnotatedFieldAndPropertyEntity ( ) ) ; assertThat ( org.springframework.data.gemfire.mapping.IdentifierAccessor . getIdentifier ( ) . orElse ( null ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.AmbiguousIdAnnotatedFieldAndIdAnnotatedPropertyEntity org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.AmbiguousIdAnnotatedFieldAndIdAnnotatedPropertyEntity = new org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.AmbiguousIdAnnotatedFieldAndIdAnnotatedPropertyEntity ( ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING + STRING , org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.AmbiguousIdAnnotatedFieldAndIdAnnotatedPropertyEntity . java.lang.Class<? extends org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.AmbiguousIdAnnotatedFieldAndIdAnnotatedPropertyEntity> ( ) . java.lang.String ( ) ) ; org.springframework.data.gemfire.mapping.ExpectedException . expect ( MappingException .class ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.mapping.ExpectedException . expectMessage ( java.lang.String ) ; org.springframework.data.gemfire.mapping.IdentifierAccessor ( new org.springframework.data.gemfire.mapping.GemfirePersistentEntityUnitTests.AmbiguousIdAnnotatedFieldAndIdAnnotatedPropertyEntity ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Id public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Id public java.lang.Long java.lang.Long ( ) { return this . java.lang.Long ; }  <METHOD_END>
<METHOD_START> public java.lang.Long java.lang.Long ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> public java.math.BigDecimal java.math.BigDecimal ( ) { return java.math.BigDecimal ; }  <METHOD_END>
<METHOD_START> public java.math.BigInteger java.math.BigInteger ( ) { return java.math.BigInteger ; }  <METHOD_END>