<METHOD_START> public void ( java.sql.DatabaseMetaData java.sql.DatabaseMetaData ) throws java.sql.SQLException { this( java.sql.DatabaseMetaData , false ); }  <METHOD_END>
<METHOD_START> public void ( java.sql.DatabaseMetaData java.sql.DatabaseMetaData , boolean boolean )			throws java.sql.SQLException { super( java.sql.DatabaseMetaData ); this . boolean = boolean ; void ( java.sql.DatabaseMetaData ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.sql.DatabaseMetaData java.sql.DatabaseMetaData ) { try { java.sql.CallableStatement java.sql.CallableStatement = null ; try { java.sql.CallableStatement = java.sql.DatabaseMetaData . java.sql.Connection ( ) . java.sql.CallableStatement ( STRING ) ; java.sql.CallableStatement . void ( NUMBER , java.sql.Types . int ) ; java.sql.CallableStatement . boolean ( ) ; this . java.lang.String = java.sql.CallableStatement . java.lang.String ( NUMBER ) ; } finally { if ( java.sql.CallableStatement != null ) { java.sql.CallableStatement . void ( ) ; } } } catch ( java.sql.SQLException java.sql.SQLException ) { logger . debug ( STRING , java.sql.SQLException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { if ( this . java.lang.String != null ) { return java.lang.String ; } return super. getDefaultSchema ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.sql.DatabaseMetaData java.sql.DatabaseMetaData , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.sql.SQLException { if ( ! this . boolean ) { logger . debug ( STRING ) ; super. initializeWithTableColumnMetaData ( java.sql.DatabaseMetaData , java.lang.String , java.lang.String , java.lang.String ) ; return; } java.sql.Connection java.sql.Connection = java.sql.DatabaseMetaData . java.sql.Connection ( ) ; try { java.lang.Class<?> < ? > java.lang.Class<?> = java.sql.Connection . java.lang.Class<? extends java.sql.Connection> ( ) . java.lang.ClassLoader ( ) . java.lang.Class<?> ( STRING ) ; java.sql.Connection = ( java.sql.Connection ) java.sql.Connection . unwrap ( java.lang.Class<> ) ; } catch ( java.lang.ClassNotFoundException | java.sql.SQLException java.lang.Exception ) { if ( logger . isWarnEnabled ( ) ) { logger . warn ( STRING + java.lang.Exception ) ; } super. initializeWithTableColumnMetaData ( java.sql.DatabaseMetaData , java.lang.String , java.lang.String , java.lang.String ) ; return; } logger . debug ( STRING ) ; java.lang.reflect.Method java.lang.reflect.Method ; java.lang.Boolean java.lang.Boolean ; try { java.lang.reflect.Method java.lang.reflect.Method = java.sql.Connection . java.lang.Class<? extends java.sql.Connection> ( ) . java.lang.reflect.Method ( STRING , ( java.lang.Class [] ) null ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; java.lang.Boolean = ( java.lang.Boolean ) java.lang.reflect.Method . java.lang.Object ( java.sql.Connection ) ; java.lang.reflect.Method = java.sql.Connection . java.lang.Class<? extends java.sql.Connection> ( ) . java.lang.reflect.Method ( STRING , boolean .class ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Method ) ; java.lang.reflect.Method . java.lang.Object ( java.sql.Connection , java.lang.Boolean . java.lang.Boolean ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new InvalidDataAccessApiUsageException ( STRING , java.lang.Throwable ) ; } super. initializeWithTableColumnMetaData ( java.sql.DatabaseMetaData , java.lang.String , java.lang.String , java.lang.String ) ; try { java.lang.reflect.Method . java.lang.Object ( java.sql.Connection , java.lang.Boolean ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new InvalidDataAccessApiUsageException ( STRING , java.lang.Throwable ) ; } }  <METHOD_END>