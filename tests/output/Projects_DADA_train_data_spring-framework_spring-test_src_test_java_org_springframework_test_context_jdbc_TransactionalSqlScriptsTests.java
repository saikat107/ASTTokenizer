<METHOD_START> @ Autowired public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . org.springframework.test.context.jdbc.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Sql ( { STRING , STRING , STRING , STRING } ) public void void ( ) { void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected int int ( java.lang.String java.lang.String ) { return JdbcTestUtils . countRowsInTable ( this . org.springframework.test.context.jdbc.JdbcTemplate , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected void void ( int int ) { assertEquals ( STRING , int , int ( STRING ) ) ; }  <METHOD_END>
