<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext != null ) { this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( EmbeddedMongoProperties .class ) . getFeatures ( ) ) . contains ( Feature . TEXT_SEARCH , Feature . SYNC_DELAY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; assertThat ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBeansOfType ( MongoClient .class ) ) . hasSize ( NUMBER ) ; MongoClient org.springframework.boot.autoconfigure.mongo.embedded.MongoClient = this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( MongoClient .class ) ; java.lang.Integer java.lang.Integer = java.lang.Integer . java.lang.Integer ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getEnvironment ( ) . getProperty ( STRING ) ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.MongoClient . getAddress ( ) . getPort ( ) ) . isEqualTo ( java.lang.Integer ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBeansOfType ( MongoClient .class ) ) . hasSize ( NUMBER ) ; MongoClient org.springframework.boot.autoconfigure.mongo.embedded.MongoClient = this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( MongoClient .class ) ; java.lang.Integer java.lang.Integer = java.lang.Integer . java.lang.Integer ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getEnvironment ( ) . getProperty ( STRING ) ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.MongoClient . getAddress ( ) . getPort ( ) ) . isEqualTo ( java.lang.Integer ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfigurationTests.MongoClientConfiguration .class ) ; MongoClient org.springframework.boot.autoconfigure.mongo.embedded.MongoClient = this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( MongoClient .class ) ; java.lang.Integer java.lang.Integer = java.lang.Integer . java.lang.Integer ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getEnvironment ( ) . getProperty ( STRING ) ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.MongoClient . getAddress ( ) . getPort ( ) ) . isEqualTo ( java.lang.Integer ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.boot.autoconfigure.mongo.embedded.ConfigurableApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.boot.autoconfigure.mongo.embedded.ConfigurableApplicationContext . refresh ( ) ; try { this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . setParent ( org.springframework.boot.autoconfigure.mongo.embedded.ConfigurableApplicationContext ) ; this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . register ( EmbeddedMongoAutoConfiguration .class , org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfigurationTests.MongoClientConfiguration .class ) ; this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . refresh ( ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.ConfigurableApplicationContext . getEnvironment ( ) . getProperty ( STRING ) ) . isNotNull ( ) ; } finally { org.springframework.boot.autoconfigure.mongo.embedded.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfigurationTests.MongoClientConfiguration .class ) ; Storage org.springframework.boot.autoconfigure.mongo.embedded.Storage = this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( IMongodConfig .class ) . replication ( ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.Storage . getOplogSize ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.Storage . getDatabaseDir ( ) ) . isNull ( ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.Storage . getReplSetName ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.io.File java.io.File = new java.io.File ( STRING ) ; FileSystemUtils . deleteRecursively ( java.io.File ) ; void ( STRING + java.io.File . java.lang.String ( ) ) ; assertThat ( java.io.File ) . isDirectory ( ) ; assertThat ( java.io.File . java.io.File[] ( ) ) . isNotEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( IMongodConfig .class ) . replication ( ) . getOplogSize ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; assertThat ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( IMongodConfig .class ) . replication ( ) . getReplSetName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; int int = SocketUtils . findAvailableTcpPort ( ) ; EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext , STRING + int ) ; if ( java.lang.String != null ) { EnvironmentTestUtils . addEnvironment ( this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext , STRING + java.lang.String ) ; } this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . register ( MongoAutoConfiguration .class , MongoDataAutoConfiguration .class , EmbeddedMongoAutoConfiguration .class ) ; this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . refresh ( ) ; MongoTemplate org.springframework.boot.autoconfigure.mongo.embedded.MongoTemplate = this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . getBean ( MongoTemplate .class ) ; Document org.springframework.boot.autoconfigure.mongo.embedded.Document = org.springframework.boot.autoconfigure.mongo.embedded.MongoTemplate . executeCommand ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.mongo.embedded.Document . getString ( STRING ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { void ( null , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String ... java.lang.String[] ) { AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; if ( java.lang.Class<> != null ) { org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . register ( java.lang.Class<> ) ; } EnvironmentTestUtils . addEnvironment ( org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext , java.lang.String[] ) ; org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . register ( EmbeddedMongoAutoConfiguration .class , MongoAutoConfiguration .class , PropertyPlaceholderAutoConfiguration .class ) ; org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext = org.springframework.boot.autoconfigure.mongo.embedded.AnnotationConfigApplicationContext ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.mongo.embedded.MongoClient org.springframework.boot.autoconfigure.mongo.embedded.MongoClient ( @ Value ( STRING ) int int )				throws java.net.UnknownHostException { return new MongoClient ( STRING , int ) ; }  <METHOD_END>