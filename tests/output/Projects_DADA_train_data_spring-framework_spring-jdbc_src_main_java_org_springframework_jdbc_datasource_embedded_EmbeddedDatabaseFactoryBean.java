<METHOD_START> public void void ( DatabasePopulator org.springframework.jdbc.datasource.embedded.DatabasePopulator ) { this . org.springframework.jdbc.datasource.embedded.DatabasePopulator = org.springframework.jdbc.datasource.embedded.DatabasePopulator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { initDatabase ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public javax.sql.DataSource javax.sql.DataSource ( ) { return getDataSource ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends javax.sql.DataSource> < ? extends javax.sql.DataSource > java.lang.Class<? extends javax.sql.DataSource> ( ) { return javax.sql.DataSource .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.jdbc.datasource.embedded.DatabasePopulator != null ) { DatabasePopulatorUtils . execute ( this . org.springframework.jdbc.datasource.embedded.DatabasePopulator , getDataSource ( ) ) ; } shutdownDatabase ( ) ; }  <METHOD_END>
