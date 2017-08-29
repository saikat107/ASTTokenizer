<METHOD_START> @ AfterTransaction public void void ( ) { if ( STRING . boolean ( org.springframework.test.context.jdbc.TestName . getMethodName ( ) ) ) { try { void ( NUMBER ) ; fail ( STRING ) ; } catch ( BadSqlGrammarException org.springframework.test.context.jdbc.BadSqlGrammarException ) { } } }  <METHOD_END>
<METHOD_START> @ Test @ SqlGroup ( { @ Sql ( { STRING , STRING } ) , @ Sql ( scripts = STRING , executionPhase = AFTER_TEST_METHOD ) } ) public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Sql ( { STRING , STRING , STRING } ) public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected void void ( int int ) { assertEquals ( STRING , int , countRowsInTable ( STRING ) ) ; }  <METHOD_END>
