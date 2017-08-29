<METHOD_START> @ Test public void void ( ) { parseAndCheckError ( STRING , SpelMessage . NOT_AN_INTEGER ) ; evaluate ( STRING , NUMBER , java.lang.Long .class ) ; parseAndCheckError ( STRING , SpelMessage . NOT_A_LONG ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { parseAndCheckError ( STRING , SpelMessage . MORE_INPUT , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { parseAndCheckError ( STRING , SpelMessage . RIGHT_OPERAND_PROBLEM , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { parseAndCheckError ( STRING , SpelMessage . RIGHT_OPERAND_PROBLEM , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { parseAndCheckError ( STRING , SpelMessage . NOT_EXPECTED_TOKEN , NUMBER , STRING , STRING ) ; }  <METHOD_END>
