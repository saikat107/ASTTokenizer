<METHOD_START> public void ( ) {}  <METHOD_END>
<METHOD_START> public void ( Session org.springframework.cassandra.core.Session ) { Assert . notNull ( org.springframework.cassandra.core.Session , STRING ) ; setSession ( org.springframework.cassandra.core.Session ) ; }  <METHOD_END>
<METHOD_START> public void ( SessionFactory org.springframework.cassandra.core.SessionFactory ) { Assert . notNull ( org.springframework.cassandra.core.SessionFactory , STRING ) ; setSessionFactory ( org.springframework.cassandra.core.SessionFactory ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( SessionCallback < T > org.springframework.cassandra.core.SessionCallback<T> ) throws org.springframework.cassandra.core.DataAccessException { Assert . notNull ( org.springframework.cassandra.core.SessionCallback<T> , STRING ) ; try { return org.springframework.cassandra.core.SessionCallback<T> . doInSession ( org.springframework.cassandra.core.Session ( ) ) ; } catch ( DriverException org.springframework.cassandra.core.DriverException ) { throw org.springframework.cassandra.core.DataAccessException ( STRING , toCql ( org.springframework.cassandra.core.SessionCallback<T> ) , org.springframework.cassandra.core.DriverException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) throws org.springframework.cassandra.core.DataAccessException { Assert . hasText ( java.lang.String , STRING ) ; return org.springframework.cassandra.core.ResultSet ( java.lang.String ) . wasApplied ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , ResultSetExtractor < T > org.springframework.cassandra.core.ResultSetExtractor<T> ) throws org.springframework.cassandra.core.DataAccessException { Assert . hasText ( java.lang.String , STRING ) ; Assert . notNull ( org.springframework.cassandra.core.ResultSetExtractor<T> , STRING ) ; try { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , java.lang.String ) ; } SimpleStatement org.springframework.cassandra.core.SimpleStatement = applyStatementSettings ( new SimpleStatement ( java.lang.String ) ) ; ResultSet org.springframework.cassandra.core.ResultSet = org.springframework.cassandra.core.Session ( ) . execute ( org.springframework.cassandra.core.SimpleStatement ) ; return org.springframework.cassandra.core.ResultSetExtractor<T> . extractData ( org.springframework.cassandra.core.ResultSet ) ; } catch ( DriverException org.springframework.cassandra.core.DriverException ) { throw org.springframework.cassandra.core.DataAccessException ( STRING , java.lang.String , org.springframework.cassandra.core.DriverException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , RowCallbackHandler org.springframework.cassandra.core.RowCallbackHandler ) throws org.springframework.cassandra.core.DataAccessException { void ( java.lang.String , newResultSetExtractor ( org.springframework.cassandra.core.RowCallbackHandler ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( java.lang.String java.lang.String , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> ) throws org.springframework.cassandra.core.DataAccessException { return void ( java.lang.String , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( java.lang.String java.lang.String ) throws org.springframework.cassandra.core.DataAccessException { return void ( java.lang.String , newResultSetExtractor ( newColumnMapRowMapper ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.cassandra.core.DataAccessException { return void ( java.lang.String , newResultSetExtractor ( newSingleColumnRowMapper ( java.lang.Class<T> ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( java.lang.String , newColumnMapRowMapper ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( java.lang.String , newSingleColumnRowMapper ( java.lang.Class<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> ) throws org.springframework.cassandra.core.DataAccessException { return DataAccessUtils . requiredSingleResult ( void ( java.lang.String , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.core.ResultSet org.springframework.cassandra.core.ResultSet ( java.lang.String java.lang.String ) throws org.springframework.cassandra.core.DataAccessException { return T ( java.lang.String , rs -> rs ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<org.springframework.cassandra.core.Row> < Row > java.lang.Iterable<org.springframework.cassandra.core.Row> ( java.lang.String java.lang.String ) throws org.springframework.cassandra.core.DataAccessException { return ( ) org.springframework.cassandra.core.ResultSet ( java.lang.String ) . iterator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( Statement org.springframework.cassandra.core.Statement ) throws org.springframework.cassandra.core.DataAccessException { Assert . notNull ( org.springframework.cassandra.core.Statement , STRING ) ; return org.springframework.cassandra.core.ResultSet ( org.springframework.cassandra.core.Statement ) . wasApplied ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( Statement org.springframework.cassandra.core.Statement , ResultSetExtractor < T > org.springframework.cassandra.core.ResultSetExtractor<T> ) throws org.springframework.cassandra.core.DataAccessException { Assert . notNull ( org.springframework.cassandra.core.Statement , STRING ) ; Assert . notNull ( org.springframework.cassandra.core.ResultSetExtractor<T> , STRING ) ; try { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , org.springframework.cassandra.core.Statement ) ; } return org.springframework.cassandra.core.ResultSetExtractor<T> . extractData ( org.springframework.cassandra.core.Session ( ) . execute ( applyStatementSettings ( org.springframework.cassandra.core.Statement ) ) ) ; } catch ( DriverException org.springframework.cassandra.core.DriverException ) { throw org.springframework.cassandra.core.DataAccessException ( STRING , org.springframework.cassandra.core.Statement . toString ( ) , org.springframework.cassandra.core.DriverException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Statement org.springframework.cassandra.core.Statement , RowCallbackHandler org.springframework.cassandra.core.RowCallbackHandler ) throws org.springframework.cassandra.core.DataAccessException { void ( org.springframework.cassandra.core.Statement , newResultSetExtractor ( org.springframework.cassandra.core.RowCallbackHandler ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( Statement org.springframework.cassandra.core.Statement , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.Statement , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( Statement org.springframework.cassandra.core.Statement ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.Statement , newResultSetExtractor ( newColumnMapRowMapper ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( Statement org.springframework.cassandra.core.Statement , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.Statement , newResultSetExtractor ( newSingleColumnRowMapper ( java.lang.Class<T> ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( Statement org.springframework.cassandra.core.Statement ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( org.springframework.cassandra.core.Statement , newColumnMapRowMapper ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( Statement org.springframework.cassandra.core.Statement , java.lang.Class<T> < T > java.lang.Class<T> ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( org.springframework.cassandra.core.Statement , newSingleColumnRowMapper ( java.lang.Class<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( Statement org.springframework.cassandra.core.Statement , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> ) throws org.springframework.cassandra.core.DataAccessException { return DataAccessUtils . requiredSingleResult ( void ( org.springframework.cassandra.core.Statement , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.core.ResultSet org.springframework.cassandra.core.ResultSet ( Statement org.springframework.cassandra.core.Statement ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( org.springframework.cassandra.core.Statement , rs -> rs ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<org.springframework.cassandra.core.Row> < Row > java.lang.Iterable<org.springframework.cassandra.core.Row> ( Statement org.springframework.cassandra.core.Statement ) throws org.springframework.cassandra.core.DataAccessException { return ( ) org.springframework.cassandra.core.ResultSet ( org.springframework.cassandra.core.Statement ) . iterator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return boolean ( java.lang.String , newPreparedStatementBinder ( java.lang.Object[] ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( new org.springframework.cassandra.core.CqlTemplate.SimplePreparedStatementCreator ( java.lang.String ) , org.springframework.cassandra.core.PreparedStatementBinder , ResultSet :: wasApplied ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , PreparedStatementCallback < T > org.springframework.cassandra.core.PreparedStatementCallback<T> ) throws org.springframework.cassandra.core.DataAccessException { return boolean ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , org.springframework.cassandra.core.PreparedStatementCallback<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator , ResultSet :: wasApplied ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , PreparedStatementCallback < T > org.springframework.cassandra.core.PreparedStatementCallback<T> )			throws org.springframework.cassandra.core.DataAccessException { Assert . notNull ( org.springframework.cassandra.core.PreparedStatementCreator , STRING ) ; Assert . notNull ( org.springframework.cassandra.core.PreparedStatementCallback<T> , STRING ) ; try { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , toCql ( org.springframework.cassandra.core.PreparedStatementCreator ) , org.springframework.cassandra.core.PreparedStatementCreator ) ; } Session org.springframework.cassandra.core.Session = org.springframework.cassandra.core.Session ( ) ; return org.springframework.cassandra.core.PreparedStatementCallback<T> . doInPreparedStatement ( org.springframework.cassandra.core.Session , applyStatementSettings ( org.springframework.cassandra.core.PreparedStatementCreator . createPreparedStatement ( org.springframework.cassandra.core.Session ) ) ) ; } catch ( DriverException org.springframework.cassandra.core.DriverException ) { throw org.springframework.cassandra.core.DataAccessException ( STRING , toCql ( org.springframework.cassandra.core.PreparedStatementCreator ) , org.springframework.cassandra.core.DriverException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , ResultSetExtractor < T > org.springframework.cassandra.core.ResultSetExtractor<T> )			throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator , null , org.springframework.cassandra.core.ResultSetExtractor<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , RowCallbackHandler org.springframework.cassandra.core.RowCallbackHandler )			throws org.springframework.cassandra.core.DataAccessException { void ( org.springframework.cassandra.core.PreparedStatementCreator , null , newResultSetExtractor ( org.springframework.cassandra.core.RowCallbackHandler ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> )			throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator , null , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder , ResultSetExtractor < T > org.springframework.cassandra.core.ResultSetExtractor<T> ) throws org.springframework.cassandra.core.DataAccessException { Assert . notNull ( org.springframework.cassandra.core.PreparedStatementCreator , STRING ) ; Assert . notNull ( org.springframework.cassandra.core.ResultSetExtractor<T> , STRING ) ; try { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , toCql ( org.springframework.cassandra.core.PreparedStatementCreator ) , org.springframework.cassandra.core.PreparedStatementCreator ) ; } Session org.springframework.cassandra.core.Session = org.springframework.cassandra.core.Session ( ) ; PreparedStatement org.springframework.cassandra.core.PreparedStatement = org.springframework.cassandra.core.PreparedStatementCreator . createPreparedStatement ( org.springframework.cassandra.core.Session ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , org.springframework.cassandra.core.PreparedStatement ) ; } BoundStatement org.springframework.cassandra.core.BoundStatement = applyStatementSettings ( org.springframework.cassandra.core.PreparedStatementBinder != null ? org.springframework.cassandra.core.PreparedStatementBinder . bindValues ( org.springframework.cassandra.core.PreparedStatement ) : org.springframework.cassandra.core.PreparedStatement . bind ( ) ) ; ResultSet org.springframework.cassandra.core.ResultSet = org.springframework.cassandra.core.Session . execute ( org.springframework.cassandra.core.BoundStatement ) ; return org.springframework.cassandra.core.ResultSetExtractor<T> . extractData ( org.springframework.cassandra.core.ResultSet ) ; } catch ( DriverException org.springframework.cassandra.core.DriverException ) { throw org.springframework.cassandra.core.DataAccessException ( STRING , toCql ( org.springframework.cassandra.core.PreparedStatementCreator ) , org.springframework.cassandra.core.DriverException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder , RowCallbackHandler org.springframework.cassandra.core.RowCallbackHandler ) throws org.springframework.cassandra.core.DataAccessException { void ( org.springframework.cassandra.core.PreparedStatementCreator , org.springframework.cassandra.core.PreparedStatementBinder , newResultSetExtractor ( org.springframework.cassandra.core.RowCallbackHandler ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator , org.springframework.cassandra.core.PreparedStatementBinder , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , ResultSetExtractor < T > org.springframework.cassandra.core.ResultSetExtractor<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , org.springframework.cassandra.core.ResultSetExtractor<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , RowCallbackHandler org.springframework.cassandra.core.RowCallbackHandler , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , newResultSetExtractor ( org.springframework.cassandra.core.RowCallbackHandler ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( java.lang.String java.lang.String , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder , ResultSetExtractor < T > org.springframework.cassandra.core.ResultSetExtractor<T> ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , org.springframework.cassandra.core.PreparedStatementBinder , org.springframework.cassandra.core.ResultSetExtractor<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder , RowCallbackHandler org.springframework.cassandra.core.RowCallbackHandler )			throws org.springframework.cassandra.core.DataAccessException { void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , org.springframework.cassandra.core.PreparedStatementBinder , newResultSetExtractor ( org.springframework.cassandra.core.RowCallbackHandler ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( java.lang.String java.lang.String , PreparedStatementBinder org.springframework.cassandra.core.PreparedStatementBinder , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> )			throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , org.springframework.cassandra.core.PreparedStatementBinder , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > java.util.List<java.util.Map<java.lang.String,java.lang.Object>> ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , newResultSetExtractor ( newColumnMapRowMapper ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.List<T> < T > java.util.List<T> ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , newResultSetExtractor ( newSingleColumnRowMapper ( java.lang.Class<T> ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( java.lang.String , newColumnMapRowMapper ( ) , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( java.lang.String , newSingleColumnRowMapper ( java.lang.Class<T> ) , java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.String java.lang.String , RowMapper < T > org.springframework.cassandra.core.RowMapper<T> , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return DataAccessUtils . requiredSingleResult ( void ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , newResultSetExtractor ( org.springframework.cassandra.core.RowMapper<T> , NUMBER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.core.ResultSet org.springframework.cassandra.core.ResultSet ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return java.lang.Object ( org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String ) , newPreparedStatementBinder ( java.lang.Object[] ) , rs -> rs ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<org.springframework.cassandra.core.Row> < Row > java.lang.Iterable<org.springframework.cassandra.core.Row> ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) throws org.springframework.cassandra.core.DataAccessException { return ( ) org.springframework.cassandra.core.ResultSet ( java.lang.String , java.lang.Object[] ) . iterator ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.cassandra.core.RingMember> < RingMember > java.util.List<org.springframework.cassandra.core.RingMember> ( ) org.springframework.cassandra.core.DataAccessException { return ( java.util.List<org.springframework.cassandra.core.RingMember> < RingMember > ) java.util.Collection ( RingMemberHostMapper . INSTANCE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.Collection<T> < T > java.util.Collection<T> ( HostMapper < T > org.springframework.cassandra.core.HostMapper<T> ) throws org.springframework.cassandra.core.DataAccessException { Assert . notNull ( org.springframework.cassandra.core.HostMapper<T> , STRING ) ; return org.springframework.cassandra.core.HostMapper<T> . mapHosts ( java.util.Set<org.springframework.cassandra.core.Host> ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<org.springframework.cassandra.core.Host> < Host > java.util.Set<org.springframework.cassandra.core.Host> ( ) { return org.springframework.cassandra.core.Session ( ) . getCluster ( ) . getMetadata ( ) . getAllHosts ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.cassandra.core.PreparedStatementCreator org.springframework.cassandra.core.PreparedStatementCreator ( java.lang.String java.lang.String ) { return new org.springframework.cassandra.core.CqlTemplate.SimplePreparedStatementCreator ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.cassandra.core.DataAccessException org.springframework.cassandra.core.DataAccessException ( java.lang.String java.lang.String , java.lang.String java.lang.String , DriverException org.springframework.cassandra.core.DriverException ) { return translate ( java.lang.String , java.lang.String , org.springframework.cassandra.core.DriverException ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.cassandra.core.Session org.springframework.cassandra.core.Session ( ) { return getSessionFactory ( ) . getSession ( ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.cassandra.core.PreparedStatement org.springframework.cassandra.core.PreparedStatement ( Session org.springframework.cassandra.core.Session ) throws org.springframework.cassandra.core.DriverException { return org.springframework.cassandra.core.Session . prepare ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>