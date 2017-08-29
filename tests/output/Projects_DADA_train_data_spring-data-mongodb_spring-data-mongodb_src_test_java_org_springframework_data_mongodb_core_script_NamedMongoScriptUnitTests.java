<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new NamedMongoScript ( null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new NamedMongoScript ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new NamedMongoScript ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = STRING ; assertThat ( new NamedMongoScript ( STRING , java.lang.String ) . getCode ( ) , is ( java.lang.String ) ) ; }  <METHOD_END>
