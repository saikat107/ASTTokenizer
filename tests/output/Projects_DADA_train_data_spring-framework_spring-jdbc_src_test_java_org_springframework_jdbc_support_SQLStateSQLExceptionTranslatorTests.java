<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new SQLStateSQLExceptionTranslator ( ) . translate ( STRING , STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , BadSqlGrammarException .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , DataIntegrityViolationException .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , DataAccessResourceFailureException .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , TransientDataAccessResourceException .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , ConcurrencyFailureException .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , UncategorizedSQLException .class ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.sql.SQLException java.sql.SQLException = new java.sql.SQLException ( java.lang.String , java.lang.String ) ; SQLExceptionTranslator org.springframework.jdbc.support.SQLExceptionTranslator = new SQLStateSQLExceptionTranslator ( ) ; DataAccessException org.springframework.jdbc.support.DataAccessException = org.springframework.jdbc.support.SQLExceptionTranslator . translate ( java.lang.String , java.lang.String , java.sql.SQLException ) ; assertNotNull ( STRING , org.springframework.jdbc.support.DataAccessException ) ; assertEquals ( STRING , java.lang.Class<> , org.springframework.jdbc.support.DataAccessException . getClass ( ) ) ; assertNotNull ( STRING , org.springframework.jdbc.support.DataAccessException . getCause ( ) ) ; assertSame ( STRING , java.sql.SQLException , org.springframework.jdbc.support.DataAccessException . getCause ( ) ) ; }  <METHOD_END>