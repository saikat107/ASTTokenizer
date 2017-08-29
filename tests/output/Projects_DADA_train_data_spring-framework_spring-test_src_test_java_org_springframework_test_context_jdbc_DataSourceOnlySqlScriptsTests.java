<METHOD_START> @ Autowired public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . org.springframework.test.context.jdbc.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertInTransaction ( false ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Sql ( { STRING , STRING , STRING , STRING } ) public void void ( ) { assertInTransaction ( false ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> protected void void ( int int ) { assertEquals ( STRING , int , JdbcTestUtils . countRowsInTable ( org.springframework.test.context.jdbc.JdbcTemplate , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public javax.sql.DataSource javax.sql.DataSource ( ) { return new EmbeddedDatabaseBuilder ( ) . setName ( STRING ) . build ( ) ; }  <METHOD_END>
