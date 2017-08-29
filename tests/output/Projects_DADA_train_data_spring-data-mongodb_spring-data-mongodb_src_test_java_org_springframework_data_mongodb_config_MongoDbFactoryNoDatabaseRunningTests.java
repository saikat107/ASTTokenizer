<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.mongodb.config.MongoTemplate . getClass ( ) . getName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = DataAccessResourceFailureException .class ) public void void ( ) { org.springframework.data.mongodb.config.MongoTemplate . getCollectionNames ( ) ; }  <METHOD_END>
