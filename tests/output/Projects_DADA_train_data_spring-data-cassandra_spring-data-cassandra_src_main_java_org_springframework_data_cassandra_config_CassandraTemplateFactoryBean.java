<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( org.springframework.data.cassandra.config.CqlOperations == null && org.springframework.data.cassandra.config.SessionFactory == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } Assert . notNull ( org.springframework.data.cassandra.config.CassandraConverter , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.config.CassandraTemplate org.springframework.data.cassandra.config.CassandraTemplate ( ) java.lang.Exception { if ( org.springframework.data.cassandra.config.CqlOperations != null ) { return new CassandraTemplate ( org.springframework.data.cassandra.config.CqlOperations , org.springframework.data.cassandra.config.CassandraConverter ) ; } return new CassandraTemplate ( org.springframework.data.cassandra.config.SessionFactory , org.springframework.data.cassandra.config.CassandraConverter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<org.springframework.data.cassandra.config.CassandraTemplate> < CassandraTemplate > java.lang.Class<org.springframework.data.cassandra.config.CassandraTemplate> ( ) { return CassandraTemplate .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> public void void ( Session org.springframework.data.cassandra.config.Session ) { Assert . notNull ( org.springframework.data.cassandra.config.Session , STRING ) ; void ( new DefaultSessionFactory ( org.springframework.data.cassandra.config.Session ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( SessionFactory org.springframework.data.cassandra.config.SessionFactory ) { Assert . notNull ( org.springframework.data.cassandra.config.SessionFactory , STRING ) ; this . org.springframework.data.cassandra.config.SessionFactory = org.springframework.data.cassandra.config.SessionFactory ; }  <METHOD_END>
<METHOD_START> public void void ( CqlOperations org.springframework.data.cassandra.config.CqlOperations ) { Assert . notNull ( org.springframework.data.cassandra.config.CqlOperations , STRING ) ; this . org.springframework.data.cassandra.config.CqlOperations = org.springframework.data.cassandra.config.CqlOperations ; }  <METHOD_END>
<METHOD_START> public void void ( CassandraConverter org.springframework.data.cassandra.config.CassandraConverter ) { Assert . notNull ( org.springframework.data.cassandra.config.CassandraConverter , STRING ) ; this . org.springframework.data.cassandra.config.CassandraConverter = org.springframework.data.cassandra.config.CassandraConverter ; }  <METHOD_END>