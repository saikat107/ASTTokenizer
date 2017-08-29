<METHOD_START> @ BeforeClass public static void void ( ) { AnsiOutput . setEnabled ( Enabled . ALWAYS ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) { AnsiOutput . setEnabled ( Enabled . DETECT ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = AnsiOutput . toString ( STRING , AnsiColor . RED , AnsiStyle . BOLD , STRING , AnsiStyle . NORMAL , STRING , AnsiColor . GREEN , STRING , AnsiStyle . FAINT , STRING ) ; assertThat ( java.lang.String ) . isEqualTo ( STRING ) ; }  <METHOD_END>
