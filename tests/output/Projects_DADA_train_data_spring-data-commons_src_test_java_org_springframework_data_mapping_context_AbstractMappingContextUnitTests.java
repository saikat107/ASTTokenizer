<METHOD_START> @ Before public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.mapping.context.SampleMappingContext . setSimpleTypeHolder ( org.springframework.data.mapping.context.SimpleTypeHolder ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentPropertyPath < SamplePersistentProperty > org.springframework.data.mapping.context.PersistentPropertyPath<org.springframework.data.mapping.context.SamplePersistentProperty> = org.springframework.data.mapping.context.SampleMappingContext . getPersistentPropertyPath ( PropertyPath . from ( STRING , org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Person .class ) ) ; assertThat ( org.springframework.data.mapping.context.PersistentPropertyPath<org.springframework.data.mapping.context.SamplePersistentProperty> ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MappingException .class ) public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) { @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected < S > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> ( TypeInformation < S > org.springframework.data.mapping.context.TypeInformation<S> ) { return new BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > ( ( TypeInformation < java.lang.Object > ) org.springframework.data.mapping.context.TypeInformation<S> ) { @ java.lang.Override public void void ( ) { if ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Unsupported .class . boolean ( getType ( ) ) ) { throw new MappingException ( STRING ) ; } } } ; } } ; try { org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Unsupported .class ) ; } catch ( MappingException org.springframework.data.mapping.context.MappingException ) { } org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Unsupported .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) protected < S > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> ( TypeInformation < S > org.springframework.data.mapping.context.TypeInformation<S> ) { return new BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > ( ( TypeInformation < java.lang.Object > ) org.springframework.data.mapping.context.TypeInformation<S> ) { @ java.lang.Override public void void ( ) { if ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Unsupported .class . boolean ( getType ( ) ) ) { throw new MappingException ( STRING ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Unsupported .class . boolean ( getType ( ) ) ) { throw new MappingException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ApplicationContext org.springframework.data.mapping.context.ApplicationContext = mock ( ApplicationContext .class ) ; SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.mapping.context.SampleMappingContext . setInitialEntitySet ( java.util.Collections . java.util.Set<java.lang.Class<org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Person>> ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Person .class ) ) ; org.springframework.data.mapping.context.SampleMappingContext . setApplicationEventPublisher ( org.springframework.data.mapping.context.ApplicationContext ) ; verify ( org.springframework.data.mapping.context.ApplicationContext , times ( NUMBER ) ) . publishEvent ( Mockito . any ( ApplicationEvent .class ) ) ; org.springframework.data.mapping.context.SampleMappingContext . afterPropertiesSet ( ) ; verify ( org.springframework.data.mapping.context.ApplicationContext , times ( NUMBER ) ) . publishEvent ( Mockito . any ( ApplicationEvent .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; assertThat ( org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( java.lang.String .class ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( ( java.lang.Class<?> < ? > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( ( TypeInformation < ? > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.mapping.context.SampleMappingContext . initialize ( ) ; PersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.PersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> = org.springframework.data.mapping.context.SampleMappingContext . getRequiredPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Sample .class ) ; assertThat ( org.springframework.data.mapping.context.PersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . isNotPresent ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; PersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.PersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> = org.springframework.data.mapping.context.SampleMappingContext . getRequiredPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Extension .class ) ; assertThat ( org.springframework.data.mapping.context.PersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . hasValueSatisfying ( it -> assertThat ( it . isIdProperty ( ) ) . isTrue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; PersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.PersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> = org.springframework.data.mapping.context.SampleMappingContext . getRequiredPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Sample .class ) ; assertThat ( org.springframework.data.mapping.context.PersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> . getPersistentProperty ( STRING ) ) . hasValueSatisfying ( it -> assertThat ( mappingContext . getPersistentEntity ( it ) ) . hasValueSatisfying ( inner -> assertThat ( inner . getType ( ) ) . isEqualTo ( Person .class ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { PersistentPropertyPath < SamplePersistentProperty > org.springframework.data.mapping.context.PersistentPropertyPath<org.springframework.data.mapping.context.SamplePersistentProperty> = org.springframework.data.mapping.context.SampleMappingContext . getPersistentPropertyPath ( STRING , org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Sample .class ) ; assertThat ( org.springframework.data.mapping.context.PersistentPropertyPath<org.springframework.data.mapping.context.SamplePersistentProperty> . getLength ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.mapping.context.PersistentPropertyPath<org.springframework.data.mapping.context.SamplePersistentProperty> . getBaseProperty ( ) . getName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.mapping.context.PersistentPropertyPath<org.springframework.data.mapping.context.SamplePersistentProperty> . getLeafProperty ( ) . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MappingException .class ) public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext . getPersistentPropertyPath ( STRING , org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Sample .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext = new SampleMappingContext ( ) ; org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( ClassTypeInformation . MAP ) ; java.util.Iterator<org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty>> < BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > > java.util.Iterator<org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty>> = org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntities ( ) . iterator ( ) ; while ( java.util.Iterator<org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty>> . hasNext ( ) ) { org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( ClassTypeInformation . SET ) ; java.util.Iterator<org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty>> . next ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext . setStrict ( true ) ; assertThat ( org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( java.lang.Integer .class ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Sample .class ) ; void ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Person .class , org.springframework.data.mapping.context.SampleMappingContext , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntity ( org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Sample .class ) ; void ( java.util.TreeMap .class , org.springframework.data.mapping.context.SampleMappingContext , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mapping.context.SampleMappingContext . getPersistentPropertyPath ( STRING , org.springframework.data.mapping.context.AbstractMappingContextUnitTests.Outer .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThatExceptionOfType ( InvalidPersistentPropertyPath .class ) . isThrownBy ( ( ) context . getPersistentPropertyPath ( STRING , Sample .class ) ) . matches ( e -> StringUtils . hasText ( e . getMessage ( ) ) ) . matches ( e -> e . getResolvedPath ( ) . equals ( STRING ) ) . matches ( e -> e . getUnresolvableSegment ( ) . equals ( STRING ) ) . matches ( e -> context . getPersistentPropertyPath ( e ) != null ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.Class<?> < ? > java.lang.Class<?> , SampleMappingContext org.springframework.data.mapping.context.SampleMappingContext , boolean boolean ) { boolean boolean = false ; for ( BasicPersistentEntity < java.lang.Object , SamplePersistentProperty > org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> : org.springframework.data.mapping.context.SampleMappingContext . getPersistentEntities ( ) ) { if ( org.springframework.data.mapping.context.BasicPersistentEntity<java.lang.Object,org.springframework.data.mapping.context.SamplePersistentProperty> . getType ( ) . equals ( java.lang.Class<> ) ) { boolean = true ; break; } } if ( boolean != boolean ) { fail ( java.lang.String . java.lang.String ( STRING , boolean ? STRING : STRING , java.lang.Class<> ) ) ; } }  <METHOD_END>