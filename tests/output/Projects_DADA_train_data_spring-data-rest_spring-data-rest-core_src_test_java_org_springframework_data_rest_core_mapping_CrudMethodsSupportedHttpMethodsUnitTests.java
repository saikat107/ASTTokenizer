<METHOD_START> @ Test public void void ( ) { SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods = org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.RawRepository .class ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , COLLECTION , true , OPTIONS ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , COLLECTION , false , GET , PUT , POST , PATCH , DELETE , HEAD ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , ITEM , true , OPTIONS ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , ITEM , false , GET , PUT , POST , PATCH , DELETE , HEAD ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods = org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.SampleRepository .class ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , ITEM , true , GET , PUT , PATCH , DELETE , OPTIONS , HEAD ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , ITEM , false , POST ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods = org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.SampleRepository .class ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , COLLECTION , true , GET , POST , OPTIONS , HEAD ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , COLLECTION , false , PUT , PATCH , DELETE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods = org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.HidesDelete .class ) ; void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods , ITEM , false , DELETE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { KeyValueMappingContext < ? , ? > org.springframework.data.rest.core.mapping.KeyValueMappingContext<?,?> = new KeyValueMappingContext <> ( ) ; KeyValuePersistentEntity < ? , ? > org.springframework.data.rest.core.mapping.KeyValuePersistentEntity<?,?> = org.springframework.data.rest.core.mapping.KeyValueMappingContext<,> . getRequiredPersistentEntity ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.Entity .class ) ; SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods = org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.EntityRepository .class ) ; assertThat ( org.springframework.data.rest.core.mapping.SupportedHttpMethods . getMethodsFor ( org.springframework.data.rest.core.mapping.KeyValuePersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.rest.core.mapping.SupportedHttpMethods . getMethodsFor ( org.springframework.data.rest.core.mapping.KeyValuePersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.rest.core.mapping.SupportedHttpMethods . getMethodsFor ( org.springframework.data.rest.core.mapping.KeyValuePersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ) ) . contains ( GET , DELETE , PATCH , PUT ) . doesNotContain ( POST ) ; assertThat ( org.springframework.data.rest.core.mapping.SupportedHttpMethods . getMethodsFor ( org.springframework.data.rest.core.mapping.KeyValuePersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ) ) . contains ( GET , DELETE , PATCH , PUT , POST ) ; assertThat ( org.springframework.data.rest.core.mapping.SupportedHttpMethods . getMethodsFor ( org.springframework.data.rest.core.mapping.KeyValuePersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ) ) . contains ( GET ) . doesNotContain ( DELETE , PATCH , PUT , POST ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.HidesFindOne .class ) , ITEM , true , DELETE , PATCH , PUT , OPTIONS ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.data.rest.core.mapping.SupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethodsSupportedHttpMethodsUnitTests.NoFindOne .class ) , ITEM , false , DELETE ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.rest.core.mapping.SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods ( java.lang.Class<?> < ? > java.lang.Class<?> ) { RepositoryMetadata org.springframework.data.rest.core.mapping.RepositoryMetadata = new DefaultRepositoryMetadata ( java.lang.Class<> ) ; CrudMethods org.springframework.data.rest.core.mapping.CrudMethods = new DefaultCrudMethods ( org.springframework.data.rest.core.mapping.RepositoryMetadata ) ; return new CrudMethodsSupportedHttpMethods ( org.springframework.data.rest.core.mapping.CrudMethods ) ; }  <METHOD_END>
<METHOD_START> private static void void ( SupportedHttpMethods org.springframework.data.rest.core.mapping.SupportedHttpMethods , ResourceType org.springframework.data.rest.core.mapping.ResourceType , boolean boolean , HttpMethod ... org.springframework.data.rest.core.mapping.HttpMethod[] ) { java.util.Set<org.springframework.data.rest.core.mapping.HttpMethod> < HttpMethod > java.util.Set<org.springframework.data.rest.core.mapping.HttpMethod> = org.springframework.data.rest.core.mapping.SupportedHttpMethods . getMethodsFor ( org.springframework.data.rest.core.mapping.ResourceType ) ; if ( boolean ) { assertThat ( java.util.Set<org.springframework.data.rest.core.mapping.HttpMethod> ) . containsExactlyInAnyOrder ( org.springframework.data.rest.core.mapping.HttpMethod[] ) ; } else { assertThat ( java.util.Set<org.springframework.data.rest.core.mapping.HttpMethod> ) . doesNotContain ( org.springframework.data.rest.core.mapping.HttpMethod[] ) ; } }  <METHOD_END>
<METHOD_START> @ RestResource ( exported = false ) void void ( java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> @ java.lang.Override @ RestResource ( exported = false ) java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( java.lang.Long java.lang.Long );  <METHOD_END>
<METHOD_START> void void ( java.lang.Object java.lang.Object );  <METHOD_END>