<METHOD_START> @ Before public void void ( ) { org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person> = new BasicMongoPersistentEntity < org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person > ( ClassTypeInformation . from ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( java.lang.reflect.Field ) . getFieldName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ; MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( java.lang.reflect.Field ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isIdProperty ( ) , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . getFieldName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( java.lang.reflect.Field ) . getFieldName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BasicMongoPersistentEntity < java.lang.Throwable > org.springframework.data.mongodb.core.mapping.BasicMongoPersistentEntity<java.lang.Throwable> = new BasicMongoPersistentEntity <> ( ClassTypeInformation . from ( java.lang.Throwable .class ) ) ; MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentEntity<java.lang.Throwable> , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . usePropertyAccess ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ; MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = new BasicMongoPersistentProperty ( Property . of ( java.lang.reflect.Field ) , org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person> , new SimpleTypeHolder ( ) , org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.UppercaseFieldNamingStrategy . org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.UppercaseFieldNamingStrategy ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . getFieldName ( ) , is ( STRING ) ) ; java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ; org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = new BasicMongoPersistentProperty ( Property . of ( java.lang.reflect.Field ) , org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person> , new SimpleTypeHolder ( ) , org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.UppercaseFieldNamingStrategy . org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.UppercaseFieldNamingStrategy ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . getFieldName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person .class , STRING ) ; MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = new BasicMongoPersistentProperty ( Property . of ( java.lang.reflect.Field ) , org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person> , new SimpleTypeHolder ( ) , org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.InvalidFieldNamingStrategy . org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.InvalidFieldNamingStrategy ) ; org.springframework.data.mongodb.core.mapping.ExpectedException . expect ( MappingException .class ) ; org.springframework.data.mongodb.core.mapping.ExpectedException . expectMessage ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.InvalidFieldNamingStrategy .class . java.lang.String ( ) ) ; org.springframework.data.mongodb.core.mapping.ExpectedException . expectMessage ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . toString ( ) ) ; org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . getFieldName ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithLanguageProperty .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isLanguageProperty ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithImplicitLanguageProperty .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isLanguageProperty ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithTextScoreProperty .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isTextScoreProperty ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithTextScoreProperty .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isWritable ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithExplicitlyRenamedIdProperty .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isIdProperty ( ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithExplicitlyRenamedIdPropertyHavingIdAnnotation .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isIdProperty ( ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithComposedAnnotations .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . isIdProperty ( ) , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . getFieldName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty = org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.DocumentWithComposedAnnotations .class , STRING ) ; assertThat ( org.springframework.data.mongodb.core.mapping.MongoPersistentProperty . getFieldName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.core.mapping.MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( java.lang.reflect.Field java.lang.reflect.Field ) { return org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<org.springframework.data.mongodb.core.mapping.BasicMongoPersistentPropertyUnitTests.Person> , java.lang.reflect.Field ) ; }  <METHOD_END>
<METHOD_START> private < T > org.springframework.data.mongodb.core.mapping.MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( java.lang.Class<T> < T > java.lang.Class<T> , java.lang.String java.lang.String ) { return org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( new BasicMongoPersistentEntity < T > ( ClassTypeInformation . from ( java.lang.Class<T> ) ) , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.core.mapping.MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( MongoPersistentEntity < ? > org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<?> , java.lang.String java.lang.String ) { return org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<> , ReflectionUtils . findField ( org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<> . getType ( ) , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.mongodb.core.mapping.MongoPersistentProperty org.springframework.data.mongodb.core.mapping.MongoPersistentProperty ( MongoPersistentEntity < ? > org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<?> , java.lang.reflect.Field java.lang.reflect.Field ) { return new BasicMongoPersistentProperty ( Property . of ( java.lang.reflect.Field ) , org.springframework.data.mongodb.core.mapping.MongoPersistentEntity<> , new SimpleTypeHolder ( ) , PropertyNameFieldNamingStrategy . INSTANCE ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( PersistentProperty < ? > org.springframework.data.mongodb.core.mapping.PersistentProperty<?> ) { return org.springframework.data.mongodb.core.mapping.PersistentProperty<> . getName ( ) . toUpperCase ( java.util.Locale . java.util.Locale ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( PersistentProperty < ? > org.springframework.data.mongodb.core.mapping.PersistentProperty<?> ) { return null ; }  <METHOD_END>