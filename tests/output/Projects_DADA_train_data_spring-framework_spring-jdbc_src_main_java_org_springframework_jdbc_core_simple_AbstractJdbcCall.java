<METHOD_START> protected void ( javax.sql.DataSource javax.sql.DataSource ) { this . org.springframework.jdbc.core.simple.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> protected void ( JdbcTemplate org.springframework.jdbc.core.simple.JdbcTemplate ) { Assert . notNull ( org.springframework.jdbc.core.simple.JdbcTemplate , STRING ) ; this . org.springframework.jdbc.core.simple.JdbcTemplate = org.springframework.jdbc.core.simple.JdbcTemplate ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.core.simple.JdbcTemplate org.springframework.jdbc.core.simple.JdbcTemplate ( ) { return this . org.springframework.jdbc.core.simple.JdbcTemplate ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setProcedureName ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . getProcedureName ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setLimitedInParameterNames ( java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . getLimitedInParameterNames ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setCatalogName ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . getCatalogName ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setSchemaName ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . getSchemaName ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setFunction ( boolean ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . isFunction ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setReturnValueRequired ( boolean ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . isReturnValueRequired ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setNamedBinding ( boolean ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . isNamedBinding ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . setAccessCallParameterMetaData ( boolean ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> protected org.springframework.jdbc.core.simple.CallableStatementCreatorFactory org.springframework.jdbc.core.simple.CallableStatementCreatorFactory ( ) { return this . org.springframework.jdbc.core.simple.CallableStatementCreatorFactory ; }  <METHOD_END>
<METHOD_START> public void void ( SqlParameter org.springframework.jdbc.core.simple.SqlParameter ) { Assert . notNull ( org.springframework.jdbc.core.simple.SqlParameter , STRING ) ; if ( ! StringUtils . hasText ( org.springframework.jdbc.core.simple.SqlParameter . getName ( ) ) ) { throw new InvalidDataAccessApiUsageException ( STRING + java.lang.String ( ) + STRING ) ; } this . java.util.List<org.springframework.jdbc.core.simple.SqlParameter> . add ( org.springframework.jdbc.core.simple.SqlParameter ) ; if ( org.springframework.jdbc.core.simple.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( STRING + java.lang.String ( ) + STRING + org.springframework.jdbc.core.simple.SqlParameter . getName ( ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , RowMapper < ? > org.springframework.jdbc.core.simple.RowMapper<?> ) { this . java.util.Map<java.lang.String,org.springframework.jdbc.core.simple.RowMapper<?>> . put ( java.lang.String , org.springframework.jdbc.core.simple.RowMapper<> ) ; if ( org.springframework.jdbc.core.simple.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( STRING + java.lang.String ( ) + STRING + java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public synchronized final void void ( ) org.springframework.jdbc.core.simple.InvalidDataAccessApiUsageException { if ( ! boolean ( ) ) { if ( java.lang.String ( ) == null ) { throw new InvalidDataAccessApiUsageException ( STRING ) ; } try { this . org.springframework.jdbc.core.simple.JdbcTemplate . afterPropertiesSet ( ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { throw new InvalidDataAccessApiUsageException ( java.lang.IllegalArgumentException . java.lang.String ( ) ) ; } void ( ) ; this . boolean = true ; if ( org.springframework.jdbc.core.simple.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( STRING + ( boolean ( ) ? STRING : STRING ) + STRING + java.lang.String ( ) + STRING ) ; } } }  <METHOD_END>
<METHOD_START> protected void void ( ) { this . org.springframework.jdbc.core.simple.CallMetaDataContext . initializeMetaData ( org.springframework.jdbc.core.simple.JdbcTemplate ( ) . getDataSource ( ) ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,org.springframework.jdbc.core.simple.RowMapper<?>> < java.lang.String , RowMapper < ? > > java.util.Map.Entry<java.lang.String,org.springframework.jdbc.core.simple.RowMapper<?>> : this . java.util.Map<java.lang.String,org.springframework.jdbc.core.simple.RowMapper<?>> . entrySet ( ) ) { SqlParameter org.springframework.jdbc.core.simple.SqlParameter = this . org.springframework.jdbc.core.simple.CallMetaDataContext . createReturnResultSetParameter ( java.util.Map.Entry<java.lang.String,org.springframework.jdbc.core.simple.RowMapper<?>> . getKey ( ) , java.util.Map.Entry<java.lang.String,org.springframework.jdbc.core.simple.RowMapper<?>> . getValue ( ) ) ; this . java.util.List<org.springframework.jdbc.core.simple.SqlParameter> . add ( org.springframework.jdbc.core.simple.SqlParameter ) ; } this . org.springframework.jdbc.core.simple.CallMetaDataContext . processParameters ( this . java.util.List<org.springframework.jdbc.core.simple.SqlParameter> ) ; this . java.lang.String = this . org.springframework.jdbc.core.simple.CallMetaDataContext . createCallString ( ) ; if ( org.springframework.jdbc.core.simple.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( STRING + this . java.lang.String + STRING ) ; } this . org.springframework.jdbc.core.simple.CallableStatementCreatorFactory = new CallableStatementCreatorFactory ( java.lang.String ( ) , this . org.springframework.jdbc.core.simple.CallMetaDataContext . getCallParameters ( ) ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) {	}  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { if ( ! boolean ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( STRING ) ; void ( ) ; } }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( SqlParameterSource org.springframework.jdbc.core.simple.SqlParameterSource ) { void ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = java.util.Map<java.lang.String,java.lang.Object> ( org.springframework.jdbc.core.simple.SqlParameterSource ) ; return java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.Object ... java.lang.Object[] ) { void ( ) ; java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,?> ( java.lang.Object[] ) ; return java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { void ( ) ; java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,?> ( java.util.Map<java.lang.String,> ) ; return java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { CallableStatementCreator org.springframework.jdbc.core.simple.CallableStatementCreator = org.springframework.jdbc.core.simple.CallableStatementCreatorFactory ( ) . newCallableStatementCreator ( java.util.Map<java.lang.String,> ) ; if ( org.springframework.jdbc.core.simple.Log . isDebugEnabled ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( STRING + java.lang.String ( ) + STRING + java.util.Map<java.lang.String,> ) ; int int = NUMBER ; for ( SqlParameter org.springframework.jdbc.core.simple.SqlParameter : java.util.List<org.springframework.jdbc.core.simple.SqlParameter> ( ) ) { org.springframework.jdbc.core.simple.Log . debug ( int + STRING + org.springframework.jdbc.core.simple.SqlParameter . getName ( ) + STRING + org.springframework.jdbc.core.simple.SqlParameter . getSqlType ( ) + STRING + org.springframework.jdbc.core.simple.SqlParameter . getTypeName ( ) + STRING + org.springframework.jdbc.core.simple.SqlParameter . getClass ( ) . getName ( ) + STRING ) ; int ++ ; } } return org.springframework.jdbc.core.simple.JdbcTemplate ( ) . call ( org.springframework.jdbc.core.simple.CallableStatementCreator , java.util.List<org.springframework.jdbc.core.simple.SqlParameter> ( ) ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . getScalarOutParameterName ( ) ; }  <METHOD_END>
<METHOD_START> protected java.util.List<org.springframework.jdbc.core.simple.SqlParameter> < SqlParameter > java.util.List<org.springframework.jdbc.core.simple.SqlParameter> ( ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . getCallParameters ( ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( SqlParameterSource org.springframework.jdbc.core.simple.SqlParameterSource ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . matchInParameterValuesWithCallParameters ( org.springframework.jdbc.core.simple.SqlParameterSource ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( java.lang.Object [] java.lang.Object[] ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . matchInParameterValuesWithCallParameters ( java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> protected java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { return this . org.springframework.jdbc.core.simple.CallMetaDataContext . matchInParameterValuesWithCallParameters ( java.util.Map<java.lang.String,> ) ; }  <METHOD_END>