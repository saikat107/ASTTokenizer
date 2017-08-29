<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.config.MongoClient org.springframework.data.mongodb.config.MongoClient ( ) { return new MongoClient ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.mongodb.config.AuditorAware<org.springframework.data.mongodb.config.AuditablePerson> < AuditablePerson > org.springframework.data.mongodb.config.AuditorAware<org.springframework.data.mongodb.config.AuditablePerson> ( ) { return mock ( AuditorAware .class ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { org.springframework.data.mongodb.config.AuditingViaJavaConfigRepositoriesTests.AuditablePersonRepository . deleteAll ( ) ; this . org.springframework.data.mongodb.config.AuditablePerson = org.springframework.data.mongodb.config.AuditingViaJavaConfigRepositoriesTests.AuditablePersonRepository . save ( new AuditablePerson ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { doReturn ( java.util.Optional . java.util.Optional ( this . org.springframework.data.mongodb.config.AuditablePerson ) ) . when ( this . org.springframework.data.mongodb.config.AuditorAware<org.springframework.data.mongodb.config.AuditablePerson> ) . getCurrentAuditor ( ) ; AuditablePerson org.springframework.data.mongodb.config.AuditablePerson = org.springframework.data.mongodb.config.AuditingViaJavaConfigRepositoriesTests.AuditablePersonRepository . save ( new AuditablePerson ( STRING ) ) ; AuditablePerson org.springframework.data.mongodb.config.AuditablePerson = org.springframework.data.mongodb.config.AuditablePerson . getCreatedBy ( ) ; assertThat ( org.springframework.data.mongodb.config.AuditablePerson , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.mongodb.config.AuditablePerson . getFirstname ( ) , is ( this . org.springframework.data.mongodb.config.AuditablePerson . getFirstname ( ) ) ) ; assertThat ( org.springframework.data.mongodb.config.AuditablePerson . getCreatedAt ( ) , is ( notNullValue ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { new AnnotationConfigApplicationContext ( org.springframework.data.mongodb.config.AuditingViaJavaConfigRepositoriesTests.SimpleConfigWithRepositories .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { new AnnotationConfigApplicationContext ( org.springframework.data.mongodb.config.AuditingViaJavaConfigRepositoriesTests.SimpleConfig .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.config.MongoClient org.springframework.data.mongodb.config.MongoClient ( ) { return new MongoClient ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>