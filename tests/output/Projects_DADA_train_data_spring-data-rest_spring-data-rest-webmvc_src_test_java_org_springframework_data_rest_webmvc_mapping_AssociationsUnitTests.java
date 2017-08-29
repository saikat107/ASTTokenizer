<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.rest.webmvc.mapping.KeyValueMappingContext<?,?> = new KeyValueMappingContext <> ( ) ; this . org.springframework.data.rest.webmvc.mapping.KeyValueMappingContext<,> . getPersistentEntity ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class ) ; this . org.springframework.data.rest.webmvc.mapping.ResourceMappings = new PersistentEntitiesResourceMappings ( new PersistentEntities ( java.util.Arrays . java.util.List ( org.springframework.data.rest.webmvc.mapping.KeyValueMappingContext<,> ) ) ) ; this . org.springframework.data.rest.webmvc.mapping.Associations = new Associations ( org.springframework.data.rest.webmvc.mapping.ResourceMappings , org.springframework.data.rest.webmvc.mapping.RepositoryRestConfiguration ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Associations ( null , org.springframework.data.rest.webmvc.mapping.RepositoryRestConfiguration ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Associations ( org.springframework.data.rest.webmvc.mapping.ResourceMappings , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThatExceptionOfType ( java.lang.IllegalArgumentException .class ) . isThrownBy ( ( ) associations . isLookupType ( null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { doReturn ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class ) . when ( org.springframework.data.rest.webmvc.mapping.PersistentProperty<> ) . getActualType ( ) ; assertThat ( org.springframework.data.rest.webmvc.mapping.Associations . isLookupType ( org.springframework.data.rest.webmvc.mapping.PersistentProperty<> ) ) . isFalse ( ) ; doReturn ( true ) . when ( org.springframework.data.rest.webmvc.mapping.RepositoryRestConfiguration ) . isLookupType ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class ) ; assertThat ( org.springframework.data.rest.webmvc.mapping.Associations . isLookupType ( org.springframework.data.rest.webmvc.mapping.PersistentProperty<> ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { doReturn ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class ) . when ( org.springframework.data.rest.webmvc.mapping.PersistentEntity<,> ) . getType ( ) ; assertThat ( org.springframework.data.rest.webmvc.mapping.Associations . isIdExposed ( org.springframework.data.rest.webmvc.mapping.PersistentEntity<,> ) ) . isFalse ( ) ; doReturn ( true ) . when ( org.springframework.data.rest.webmvc.mapping.RepositoryRestConfiguration ) . isIdExposedFor ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class ) ; assertThat ( org.springframework.data.rest.webmvc.mapping.Associations . isIdExposed ( org.springframework.data.rest.webmvc.mapping.PersistentEntity<,> ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.mapping.Associations . getMappings ( ) ) . isEqualTo ( org.springframework.data.rest.webmvc.mapping.ResourceMappings ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.mapping.Associations . getMetadataFor ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.rest.webmvc.mapping.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.mapping.Link> = org.springframework.data.rest.webmvc.mapping.Associations . getLinksFor ( org.springframework.data.rest.webmvc.mapping.Association<? extends org.springframework.data.rest.webmvc.mapping.PersistentProperty<?>> ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class , STRING ) , new Path ( STRING ) ) ; assertThat ( java.util.List<org.springframework.data.rest.webmvc.mapping.Link> ) . hasSize ( NUMBER ) ; assertThat ( java.util.List<org.springframework.data.rest.webmvc.mapping.Link> ) . contains ( new Link ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.rest.webmvc.mapping.Link> < Link > java.util.List<org.springframework.data.rest.webmvc.mapping.Link> = org.springframework.data.rest.webmvc.mapping.Associations . getLinksFor ( org.springframework.data.rest.webmvc.mapping.Association<? extends org.springframework.data.rest.webmvc.mapping.PersistentProperty<?>> ( org.springframework.data.rest.webmvc.mapping.AssociationsUnitTests.Root .class , STRING ) , new Path ( STRING ) ) ; assertThat ( java.util.List<org.springframework.data.rest.webmvc.mapping.Link> ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.rest.webmvc.mapping.Association<? extends org.springframework.data.rest.webmvc.mapping.PersistentProperty<?>> < ? extends PersistentProperty < ? > > org.springframework.data.rest.webmvc.mapping.Association<? extends org.springframework.data.rest.webmvc.mapping.PersistentProperty<?>> ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { KeyValuePersistentEntity < ? , ? extends KeyValuePersistentProperty < ? > > org.springframework.data.rest.webmvc.mapping.KeyValuePersistentEntity<?,? extends org.springframework.data.rest.webmvc.mapping.KeyValuePersistentProperty<?>> = org.springframework.data.rest.webmvc.mapping.KeyValueMappingContext<,> . getRequiredPersistentEntity ( java.lang.Class<> ) ; KeyValuePersistentProperty < ? > org.springframework.data.rest.webmvc.mapping.KeyValuePersistentProperty<?> = org.springframework.data.rest.webmvc.mapping.KeyValuePersistentEntity<,> . getRequiredPersistentProperty ( java.lang.String ) ; return new Association ( org.springframework.data.rest.webmvc.mapping.KeyValuePersistentProperty<> , null ) ; }  <METHOD_END>