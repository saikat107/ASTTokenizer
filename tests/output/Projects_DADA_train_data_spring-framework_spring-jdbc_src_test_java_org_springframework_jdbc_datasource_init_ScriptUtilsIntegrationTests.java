<METHOD_START> protected org.springframework.jdbc.datasource.init.EmbeddedDatabaseType org.springframework.jdbc.datasource.init.EmbeddedDatabaseType ( ) { return EmbeddedDatabaseType . HSQL ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) java.sql.SQLException { executeSqlScript ( db . getConnection ( ) , usersSchema ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { executeSqlScript ( db . getConnection ( ) , resource ( STRING ) ) ; assertUsersDatabaseCreated ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.sql.SQLException { executeSqlScript ( db . getConnection ( ) , resource ( STRING ) ) ; assertUsersDatabaseCreated ( STRING , STRING ) ; }  <METHOD_END>
