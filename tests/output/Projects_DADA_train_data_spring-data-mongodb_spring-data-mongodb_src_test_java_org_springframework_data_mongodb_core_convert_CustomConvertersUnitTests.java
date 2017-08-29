<METHOD_START> @ Before @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { when ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.BarToDocumentConverter . convert ( any ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar .class ) ) ) . thenReturn ( new Document ( ) ) ; when ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.DocumentToBarConverter . convert ( any ( Document .class ) ) ) . thenReturn ( new org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar ( ) ) ; CustomConversions org.springframework.data.mongodb.core.convert.CustomConversions = new CustomConversions ( java.util.Arrays . java.util.List<java.lang.Object> ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.BarToDocumentConverter , org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.DocumentToBarConverter ) ) ; org.springframework.data.mongodb.core.convert.MongoMappingContext = new MongoMappingContext ( ) ; org.springframework.data.mongodb.core.convert.MongoMappingContext . setInitialEntitySet ( new java.util.HashSet<java.lang.Class<?>> < java.lang.Class<?> < ? > > ( java.util.Arrays . java.util.List<java.lang.Class<? extends java.lang.Object>> ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo .class , org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar .class ) ) ) ; org.springframework.data.mongodb.core.convert.MongoMappingContext . setSimpleTypeHolder ( org.springframework.data.mongodb.core.convert.CustomConversions . getSimpleTypeHolder ( ) ) ; org.springframework.data.mongodb.core.convert.MongoMappingContext . initialize ( ) ; org.springframework.data.mongodb.core.convert.MappingMongoConverter = new MappingMongoConverter ( new DefaultDbRefResolver ( org.springframework.data.mongodb.core.convert.MongoDbFactory ) , org.springframework.data.mongodb.core.convert.MongoMappingContext ) ; org.springframework.data.mongodb.core.convert.MappingMongoConverter . setCustomConversions ( org.springframework.data.mongodb.core.convert.CustomConversions ) ; org.springframework.data.mongodb.core.convert.MappingMongoConverter . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo = new org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo ( ) ; org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo . org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar = new org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar ( ) ; org.springframework.data.mongodb.core.convert.MappingMongoConverter . write ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo , new Document ( ) ) ; verify ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.BarToDocumentConverter ) . convert ( any ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.convert.Document = new Document ( ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , new Document ( ) ) ; org.springframework.data.mongodb.core.convert.MappingMongoConverter . read ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Foo .class , org.springframework.data.mongodb.core.convert.Document ) ; verify ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.DocumentToBarConverter ) . convert ( any ( Document .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.convert.MappingMongoConverter . write ( new org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar ( ) , new Document ( ) ) ; verify ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.BarToDocumentConverter ) . convert ( any ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.convert.MappingMongoConverter . read ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.Bar .class , new Document ( ) ) ; verify ( org.springframework.data.mongodb.core.convert.CustomConvertersUnitTests.DocumentToBarConverter ) . convert ( any ( Document .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.convert.Document = new Document ( ) ; org.springframework.data.mongodb.core.convert.Document . put ( STRING , null ) ; Assert . assertThat ( org.springframework.data.mongodb.core.convert.Document . containsKey ( STRING ) , CoreMatchers . is ( true ) ) ; }  <METHOD_END>