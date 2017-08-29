<METHOD_START> @ Autowired public void void ( DataSourceTransactionManager org.springframework.test.context.junit4.spr9051.DataSourceTransactionManager ) { this . javax.sql.DataSource = org.springframework.test.context.junit4.spr9051.DataSourceTransactionManager . getDataSource ( ) ; }  <METHOD_END>
<METHOD_START> @ Autowired public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . javax.sql.DataSource = javax.sql.DataSource ; this . org.springframework.test.context.junit4.spr9051.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.String java.lang.String ) { return org.springframework.test.context.junit4.spr9051.JdbcTemplate . queryForObject ( STRING + java.lang.String , java.lang.Integer .class ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.String java.lang.String ) { return org.springframework.test.context.junit4.spr9051.JdbcTemplate . update ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected int int ( java.lang.String java.lang.String ) { return org.springframework.test.context.junit4.spr9051.JdbcTemplate . update ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected void void ( int int , java.lang.String java.lang.String ) { assertEquals ( STRING + java.lang.String + STRING , int , int ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( final java.lang.String java.lang.String ) { assertEquals ( STRING + java.lang.String + STRING , NUMBER , int ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNotNull ( STRING , org.springframework.test.context.junit4.spr9051.Employee ) ; assertEquals ( STRING , org.springframework.test.context.junit4.spr9051.Employee . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ BeforeTransaction public void void ( ) { void ( NUMBER , STRING ) ; void ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) java.lang.Exception { void ( ( inTransaction ( ) ? NUMBER : NUMBER ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { assertInTransaction ( true ) ; void ( java.lang.String ) ; void ( java.lang.String ) ; void ( NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) java.lang.Exception { void ( ( inTransaction ( ) ? NUMBER : NUMBER ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ AfterTransaction public void void ( ) { assertEquals ( STRING , NUMBER , int ( java.lang.String ) ) ; void ( NUMBER , STRING ) ; }  <METHOD_END>
