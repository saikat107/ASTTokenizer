<METHOD_START> @ BeforeClass public static void void ( ) { assumeFalse ( isMongo3Driver ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MongoClientOptionsFactoryBean org.springframework.data.mongodb.core.MongoClientOptionsFactoryBean = new MongoClientOptionsFactoryBean ( ) ; org.springframework.data.mongodb.core.MongoClientOptionsFactoryBean . setSsl ( true ) ; org.springframework.data.mongodb.core.MongoClientOptionsFactoryBean . afterPropertiesSet ( ) ; MongoClientOptions org.springframework.data.mongodb.core.MongoClientOptions = org.springframework.data.mongodb.core.MongoClientOptionsFactoryBean . getObject ( ) ; assertNotNull ( org.springframework.data.mongodb.core.MongoClientOptions . getSocketFactory ( ) ) ; assertTrue ( org.springframework.data.mongodb.core.MongoClientOptions . getSocketFactory ( ) instanceof javax.net.ssl.SSLSocketFactory ) ; }  <METHOD_END>