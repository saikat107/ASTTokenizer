<METHOD_START> public void ( MongoTemplate org.springframework.integration.mongodb.store.MongoTemplate , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.integration.mongodb.store.MongoTemplate , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.integration.mongodb.store.MongoTemplate = org.springframework.integration.mongodb.store.MongoTemplate ; this . org.springframework.integration.mongodb.store.MongoDbFactory = null ; }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.store.MongoDbFactory , java.lang.String java.lang.String ) { this( org.springframework.integration.mongodb.store.MongoDbFactory , null , java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( MongoDbFactory org.springframework.integration.mongodb.store.MongoDbFactory , MappingMongoConverter org.springframework.integration.mongodb.store.MappingMongoConverter , java.lang.String java.lang.String ) { Assert . notNull ( org.springframework.integration.mongodb.store.MongoDbFactory , STRING ) ; Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.integration.mongodb.store.MongoDbFactory = org.springframework.integration.mongodb.store.MongoDbFactory ; this . org.springframework.integration.mongodb.store.MappingMongoConverter = org.springframework.integration.mongodb.store.MappingMongoConverter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.integration.mongodb.store.ApplicationContext ) throws org.springframework.integration.mongodb.store.BeansException { this . org.springframework.integration.mongodb.store.ApplicationContext = org.springframework.integration.mongodb.store.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( this . org.springframework.integration.mongodb.store.MongoTemplate == null ) { if ( this . org.springframework.integration.mongodb.store.MappingMongoConverter == null ) { this . org.springframework.integration.mongodb.store.MappingMongoConverter = new MappingMongoConverter ( new DefaultDbRefResolver ( this . org.springframework.integration.mongodb.store.MongoDbFactory ) , new MongoMappingContext ( ) ) ; this . org.springframework.integration.mongodb.store.MappingMongoConverter . setApplicationContext ( this . org.springframework.integration.mongodb.store.ApplicationContext ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ) ; java.util.List<java.lang.Object> . boolean ( new MessageToBinaryConverter ( ) ) ; java.util.List<java.lang.Object> . boolean ( new BinaryToMessageConverter ( ) ) ; this . org.springframework.integration.mongodb.store.MappingMongoConverter . setCustomConversions ( new CustomConversions ( java.util.List<java.lang.Object> ) ) ; this . org.springframework.integration.mongodb.store.MappingMongoConverter . afterPropertiesSet ( ) ; } this . org.springframework.integration.mongodb.store.MongoTemplate = new MongoTemplate ( this . org.springframework.integration.mongodb.store.MongoDbFactory , this . org.springframework.integration.mongodb.store.MappingMongoConverter ) ; } this . org.springframework.integration.mongodb.store.MessageBuilderFactory = IntegrationUtils . getMessageBuilderFactory ( this . org.springframework.integration.mongodb.store.ApplicationContext ) ; IndexOperations org.springframework.integration.mongodb.store.IndexOperations = this . org.springframework.integration.mongodb.store.MongoTemplate . indexOps ( this . java.lang.String ) ; org.springframework.integration.mongodb.store.IndexOperations . ensureIndex ( new Index ( MessageDocumentFields . MESSAGE_ID , Sort . Direction . ASC ) ) ; org.springframework.integration.mongodb.store.IndexOperations . ensureIndex ( new Index ( MessageDocumentFields . GROUP_ID , Sort . Direction . ASC ) . on ( MessageDocumentFields . MESSAGE_ID , Sort . Direction . ASC ) . unique ( ) ) ; org.springframework.integration.mongodb.store.IndexOperations . ensureIndex ( new Index ( MessageDocumentFields . GROUP_ID , Sort . Direction . ASC ) . on ( MessageDocumentFields . LAST_MODIFIED_TIME , Sort . Direction . DESC ) . on ( MessageDocumentFields . SEQUENCE , Sort . Direction . DESC ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.mongodb.store.Message<?> < ? > org.springframework.integration.mongodb.store.Message<?> ( java.util.UUID java.util.UUID ) { Assert . notNull ( java.util.UUID , STRING ) ; Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . MESSAGE_ID ) . is ( java.util.UUID ) ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = this . org.springframework.integration.mongodb.store.MongoTemplate . findOne ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . java.lang.String ) ; return org.springframework.integration.mongodb.store.MessageDocument != null ? org.springframework.integration.mongodb.store.MessageDocument . getMessage ( ) : null ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.mongodb.store.MessageMetadata org.springframework.integration.mongodb.store.MessageMetadata ( java.util.UUID java.util.UUID ) { Assert . notNull ( java.util.UUID , STRING ) ; Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( MessageDocumentFields . MESSAGE_ID ) . is ( java.util.UUID ) ) ; MessageDocument org.springframework.integration.mongodb.store.MessageDocument = this . org.springframework.integration.mongodb.store.MongoTemplate . findOne ( org.springframework.integration.mongodb.store.Query , MessageDocument .class , this . java.lang.String ) ; if ( org.springframework.integration.mongodb.store.MessageDocument != null ) { MessageMetadata org.springframework.integration.mongodb.store.MessageMetadata = new MessageMetadata ( java.util.UUID ) ; org.springframework.integration.mongodb.store.MessageMetadata . setTimestamp ( org.springframework.integration.mongodb.store.MessageDocument . getCreatedTime ( ) ) ; return org.springframework.integration.mongodb.store.MessageMetadata ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { this . org.springframework.integration.mongodb.store.MongoTemplate . remove ( org.springframework.integration.mongodb.store.Query ( java.lang.Object ) , this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( java.lang.Object java.lang.Object ) { long long = this . org.springframework.integration.mongodb.store.MongoTemplate . count ( org.springframework.integration.mongodb.store.Query ( java.lang.Object ) , this . java.lang.String ) ; Assert . isTrue ( long <= java.lang.Integer . int , STRING ) ; return ( int ) long ; }  <METHOD_END>
<METHOD_START> protected int int ( ) { Query org.springframework.integration.mongodb.store.Query = Query . query ( Criteria . where ( STRING ) . is ( java.lang.String ) ) ; org.springframework.integration.mongodb.store.Query . fields ( ) . include ( MessageDocumentFields . SEQUENCE ) ; return ( java.lang.Integer ) this . org.springframework.integration.mongodb.store.MongoTemplate . findAndModify ( org.springframework.integration.mongodb.store.Query , new Update ( ) . inc ( MessageDocumentFields . SEQUENCE , NUMBER ) , FindAndModifyOptions . options ( ) . returnNew ( true ) . upsert ( true ) , java.util.Map .class , this . java.lang.String ) . get ( MessageDocumentFields . SEQUENCE ) ; }  <METHOD_END>
<METHOD_START> protected void void ( final MessageDocument org.springframework.integration.mongodb.store.MessageDocument ) { if ( org.springframework.integration.mongodb.store.MessageDocument . getGroupCreatedTime ( ) == NUMBER ) { org.springframework.integration.mongodb.store.MessageDocument . setGroupCreatedTime ( java.lang.System . long ( ) ) ; } org.springframework.integration.mongodb.store.MessageDocument . setCreatedTime ( java.lang.System . long ( ) ) ; try { this . org.springframework.integration.mongodb.store.MongoTemplate . insert ( org.springframework.integration.mongodb.store.MessageDocument , this . java.lang.String ) ; } catch ( DuplicateKeyException org.springframework.integration.mongodb.store.DuplicateKeyException ) { if ( this . org.springframework.integration.mongodb.store.Log . isDebugEnabled ( ) ) { this . org.springframework.integration.mongodb.store.Log . debug ( STRING + org.springframework.integration.mongodb.store.MessageDocument . getMessageId ( ) + STRING + STRING ) ; } } }  <METHOD_END>
<METHOD_START> protected static org.springframework.integration.mongodb.store.Query org.springframework.integration.mongodb.store.Query ( java.lang.Object java.lang.Object ) { return Query . query ( Criteria . where ( MessageDocumentFields . GROUP_ID ) . is ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , int int ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.integration.mongodb.store.MessageGroup> < MessageGroup > java.util.Iterator<org.springframework.integration.mongodb.store.MessageGroup> ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.mongodb.store.Message<?> < ? > org.springframework.integration.mongodb.store.Message<?> ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , org.springframework.integration.mongodb.store.Message<?> < ? > ... org.springframework.integration.mongodb.store.Message<?>[] ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.mongodb.store.Message<?>> ( java.lang.Object java.lang.Object ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>