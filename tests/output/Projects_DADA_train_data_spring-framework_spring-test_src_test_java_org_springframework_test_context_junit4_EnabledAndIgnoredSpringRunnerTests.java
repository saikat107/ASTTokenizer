<METHOD_START> @ BeforeClass public static void void ( ) { int = NUMBER ; java.lang.System . java.lang.String ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { assertEquals ( STRING , NUMBER , int ) ; }  <METHOD_END>
<METHOD_START> @ Test @ IfProfileValue ( name = java.lang.String , value = java.lang.String + STRING ) public void void ( ) { int ++ ; fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ IfProfileValue ( name = java.lang.String , value = java.lang.String ) public void void ( ) { int ++ ; }  <METHOD_END>
<METHOD_START> @ Test @ IfProfileValue ( name = java.lang.String , values = { STRING , java.lang.String , STRING } ) public void void ( ) { int ++ ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { int ++ ; }  <METHOD_END>
<METHOD_START> @ Test @ Ignore public void void ( ) { int ++ ; fail ( STRING ) ; }  <METHOD_END>
