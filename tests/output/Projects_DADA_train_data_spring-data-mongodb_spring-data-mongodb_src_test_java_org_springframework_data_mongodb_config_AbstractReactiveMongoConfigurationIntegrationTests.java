<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mongodb.config.ApplicationContext . getBean ( SimpleReactiveMongoDatabaseFactory .class ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.mongodb.config.ApplicationContext . getBean ( ReactiveMongoOperations .class ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.mongodb.config.ApplicationContext . getBean ( ReactiveMongoTemplate .class ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.config.MongoClient org.springframework.data.mongodb.config.MongoClient ( ) { return MongoClients . create ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>