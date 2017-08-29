<METHOD_START> public void ( MongoOperations org.springframework.data.mongodb.core.MongoOperations ) { Assert . notNull ( org.springframework.data.mongodb.core.MongoOperations , STRING ) ; this . org.springframework.data.mongodb.core.MongoOperations = org.springframework.data.mongodb.core.MongoOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.NamedMongoScript org.springframework.data.mongodb.core.NamedMongoScript ( ExecutableMongoScript org.springframework.data.mongodb.core.ExecutableMongoScript ) { return org.springframework.data.mongodb.core.NamedMongoScript ( new NamedMongoScript ( java.lang.String ( ) , org.springframework.data.mongodb.core.ExecutableMongoScript ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.mongodb.core.NamedMongoScript org.springframework.data.mongodb.core.NamedMongoScript ( NamedMongoScript org.springframework.data.mongodb.core.NamedMongoScript ) { Assert . notNull ( org.springframework.data.mongodb.core.NamedMongoScript , STRING ) ; org.springframework.data.mongodb.core.MongoOperations . save ( org.springframework.data.mongodb.core.NamedMongoScript , java.lang.String ) ; return org.springframework.data.mongodb.core.NamedMongoScript ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( final ExecutableMongoScript org.springframework.data.mongodb.core.ExecutableMongoScript , final java.lang.Object ... java.lang.Object[] ) { Assert . notNull ( org.springframework.data.mongodb.core.ExecutableMongoScript , STRING ) ; return org.springframework.data.mongodb.core.MongoOperations . execute ( new DbCallback < java.lang.Object > ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( MongoDatabase org.springframework.data.mongodb.core.MongoDatabase ) throws org.springframework.data.mongodb.core.MongoException , org.springframework.data.mongodb.core.DataAccessException { Document org.springframework.data.mongodb.core.Document = new Document ( STRING , org.springframework.data.mongodb.core.ExecutableMongoScript . getCode ( ) ) ; BasicDBList org.springframework.data.mongodb.core.BasicDBList = new BasicDBList ( ) ; org.springframework.data.mongodb.core.BasicDBList . addAll ( java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ( false , java.lang.Object[] ) ) ) ; org.springframework.data.mongodb.core.Document . append ( STRING , org.springframework.data.mongodb.core.BasicDBList ) ; return org.springframework.data.mongodb.core.MongoDatabase . runCommand ( org.springframework.data.mongodb.core.Document ) . get ( STRING ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MongoDatabase org.springframework.data.mongodb.core.MongoDatabase ) throws org.springframework.data.mongodb.core.MongoException , org.springframework.data.mongodb.core.DataAccessException { Document org.springframework.data.mongodb.core.Document = new Document ( STRING , org.springframework.data.mongodb.core.ExecutableMongoScript . getCode ( ) ) ; BasicDBList org.springframework.data.mongodb.core.BasicDBList = new BasicDBList ( ) ; org.springframework.data.mongodb.core.BasicDBList . addAll ( java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ( false , java.lang.Object[] ) ) ) ; org.springframework.data.mongodb.core.Document . append ( STRING , org.springframework.data.mongodb.core.BasicDBList ) ; return org.springframework.data.mongodb.core.MongoDatabase . runCommand ( org.springframework.data.mongodb.core.Document ) . get ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( final java.lang.String java.lang.String , final java.lang.Object ... java.lang.Object[] ) { Assert . hasText ( java.lang.String , STRING ) ; return org.springframework.data.mongodb.core.MongoOperations . execute ( new DbCallback < java.lang.Object > ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( MongoDatabase org.springframework.data.mongodb.core.MongoDatabase ) throws org.springframework.data.mongodb.core.MongoException , org.springframework.data.mongodb.core.DataAccessException { return org.springframework.data.mongodb.core.MongoDatabase . runCommand ( new Document ( STRING , java.lang.String . java.lang.String ( STRING , java.lang.String , java.lang.String ( java.lang.Object[] ) ) ) ) . get ( STRING ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MongoDatabase org.springframework.data.mongodb.core.MongoDatabase ) throws org.springframework.data.mongodb.core.MongoException , org.springframework.data.mongodb.core.DataAccessException { return org.springframework.data.mongodb.core.MongoDatabase . runCommand ( new Document ( STRING , java.lang.String . java.lang.String ( STRING , java.lang.String , java.lang.String ( java.lang.Object[] ) ) ) ) . get ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; return org.springframework.data.mongodb.core.MongoOperations . exists ( query ( where ( STRING ) . is ( java.lang.String ) ) , NamedMongoScript .class , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { java.util.List<org.springframework.data.mongodb.core.NamedMongoScript> < NamedMongoScript > java.util.List<org.springframework.data.mongodb.core.NamedMongoScript> = org.springframework.data.mongodb.core.MongoOperations . findAll ( NamedMongoScript .class , java.lang.String ) ; if ( CollectionUtils . isEmpty ( java.util.List<org.springframework.data.mongodb.core.NamedMongoScript> ) ) { return java.util.Collections . java.util.Set<java.lang.String> ( ) ; } java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> < java.lang.String > ( ) ; for ( NamedMongoScript org.springframework.data.mongodb.core.NamedMongoScript : java.util.List<org.springframework.data.mongodb.core.NamedMongoScript> ) { java.util.Set<java.lang.String> . boolean ( org.springframework.data.mongodb.core.NamedMongoScript . getName ( ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> private java.lang.Object [] java.lang.Object[] ( boolean boolean , java.lang.Object ... java.lang.Object[] ) { if ( ObjectUtils . isEmpty ( java.lang.Object[] ) ) { return java.lang.Object[] ; } java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( java.lang.Object[] . int ) ; for ( java.lang.Object java.lang.Object : java.lang.Object[] ) { java.util.List<java.lang.Object> . boolean ( java.lang.Object instanceof java.lang.String && boolean ? java.lang.String . java.lang.String ( STRING , java.lang.Object ) : this . org.springframework.data.mongodb.core.MongoOperations . getConverter ( ) . convertToMongoType ( java.lang.Object ) ) ; } return java.util.List<java.lang.Object> . java.lang.Object[] ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.Object ... java.lang.Object[] ) { return ObjectUtils . isEmpty ( java.lang.Object[] ) ? STRING : StringUtils . arrayToCommaDelimitedString ( java.lang.Object[] ( true , java.lang.Object[] ) ) ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( ) { return java.lang.String + java.util.UUID ( ) . java.lang.String ( ) . java.lang.String ( STRING , STRING ) ; }  <METHOD_END>