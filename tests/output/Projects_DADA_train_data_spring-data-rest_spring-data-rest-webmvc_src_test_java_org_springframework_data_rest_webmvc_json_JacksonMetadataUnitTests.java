<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.rest.webmvc.json.MappingContext<?,?> = new KeyValueMappingContext <> ( ) ; this . org.springframework.data.rest.webmvc.json.ObjectMapper = new ObjectMapper ( ) ; this . org.springframework.data.rest.webmvc.json.ObjectMapper . disable ( MapperFeature . INFER_PROPERTY_MUTATORS ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { JacksonMetadata org.springframework.data.rest.webmvc.json.JacksonMetadata = new JacksonMetadata ( org.springframework.data.rest.webmvc.json.ObjectMapper , org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.User .class ) ; PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.MappingContext<,> . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.User .class ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ; assertThat ( org.springframework.data.rest.webmvc.json.JacksonMetadata . isExported ( org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ) . isTrue ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.JacksonMetadata . isReadOnly ( org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { JacksonMetadata org.springframework.data.rest.webmvc.json.JacksonMetadata = new JacksonMetadata ( org.springframework.data.rest.webmvc.json.ObjectMapper , org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.Value .class ) ; PersistentEntity < ? , ? > org.springframework.data.rest.webmvc.json.PersistentEntity<?,?> = org.springframework.data.rest.webmvc.json.MappingContext<,> . getRequiredPersistentEntity ( org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.Value .class ) ; PersistentProperty < ? > org.springframework.data.rest.webmvc.json.PersistentProperty<?> = org.springframework.data.rest.webmvc.json.PersistentEntity<,> . getRequiredPersistentProperty ( STRING ) ; assertThat ( org.springframework.data.rest.webmvc.json.JacksonMetadata . isReadOnly ( org.springframework.data.rest.webmvc.json.PersistentProperty<> ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { JsonSerializer < ? > org.springframework.data.rest.webmvc.json.JsonSerializer<?> = new JacksonMetadata ( new ObjectMapper ( ) , org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.SomeBean .class ) . getTypeSerializer ( org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.SomeBean .class ) ; assertThat ( org.springframework.data.rest.webmvc.json.JsonSerializer<> ) . isInstanceOf ( org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.SomeBeanSerializer .class ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ JsonCreator public void ( @ JsonProperty ( STRING ) java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { super( org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.SomeBean .class ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.SomeBean org.springframework.data.rest.webmvc.json.JacksonMetadataUnitTests.SomeBean , JsonGenerator org.springframework.data.rest.webmvc.json.JsonGenerator , SerializerProvider org.springframework.data.rest.webmvc.json.SerializerProvider ) throws java.io.IOException {}  <METHOD_END>