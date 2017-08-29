<METHOD_START> public void ( ) { setRowsExpected ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource , java.lang.String java.lang.String ) { setRowsExpected ( NUMBER ) ; setDataSource ( javax.sql.DataSource ) ; setSql ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource , java.lang.String java.lang.String , int [] int[] ) { setRowsExpected ( NUMBER ) ; setDataSource ( javax.sql.DataSource ) ; setSql ( java.lang.String ) ; setTypes ( int[] ) ; }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource , java.lang.String java.lang.String , int [] int[] , java.lang.Class<T> < T > java.lang.Class<T> ) { setRowsExpected ( NUMBER ) ; setDataSource ( javax.sql.DataSource ) ; setSql ( java.lang.String ) ; setTypes ( int[] ) ; void ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<T> < T > java.lang.Class<T> ) { this . org.springframework.jdbc.object.SingleColumnRowMapper<T> . setRequiredType ( java.lang.Class<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected T T ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { return this . org.springframework.jdbc.object.SingleColumnRowMapper<T> . mapRow ( java.sql.ResultSet , int ) ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ( new java.lang.Object [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> public int int ( int int ) { return int ( new java.lang.Object [] { int } ) ; }  <METHOD_END>
<METHOD_START> public int int ( java.lang.Object ... java.lang.Object[] ) { java.lang.Object java.lang.Object = super. findObject ( java.lang.Object[] ) ; if ( ! ( java.lang.Object instanceof java.lang.Number ) ) { throw new TypeMismatchDataAccessException ( STRING + java.lang.Object + STRING ) ; } return ( ( java.lang.Number ) java.lang.Object ) . int ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return findObject ( ( java.lang.Object [] ) null ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( int int ) { return findObject ( int ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { return findObject ( java.lang.Object[] ) ; }  <METHOD_END>
