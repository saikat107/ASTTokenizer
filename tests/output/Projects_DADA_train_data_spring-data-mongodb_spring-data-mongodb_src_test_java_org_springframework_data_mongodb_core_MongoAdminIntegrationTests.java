<METHOD_START> @ Before public void void ( ) { org.springframework.data.mongodb.core.MongoAdmin = new MongoAdmin ( org.springframework.data.mongodb.core.MongoClient ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.Log . info ( STRING + org.springframework.data.mongodb.core.MongoAdmin . getServerStatus ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.core.Log . info ( org.springframework.data.mongodb.core.MongoAdmin . getDatabaseStats ( STRING ) ) ; }  <METHOD_END>
