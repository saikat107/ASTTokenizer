<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { org.springframework.jdbc.core.namedparam.MapSqlParameterSource ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { org.springframework.jdbc.core.namedparam.MapSqlParameterSource ( java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.core.namedparam.MapSqlParameterSource org.springframework.jdbc.core.namedparam.MapSqlParameterSource ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.String , STRING ) ; this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; if ( java.lang.Object instanceof SqlParameterValue ) { registerSqlType ( java.lang.String , ( ( SqlParameterValue ) java.lang.Object ) . getSqlType ( ) ) ; } return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.core.namedparam.MapSqlParameterSource org.springframework.jdbc.core.namedparam.MapSqlParameterSource ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , int int ) { Assert . notNull ( java.lang.String , STRING ) ; this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; registerSqlType ( java.lang.String , int ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.core.namedparam.MapSqlParameterSource org.springframework.jdbc.core.namedparam.MapSqlParameterSource ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , int int , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; registerSqlType ( java.lang.String , int ) ; registerTypeName ( java.lang.String , java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.jdbc.core.namedparam.MapSqlParameterSource org.springframework.jdbc.core.namedparam.MapSqlParameterSource ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { if ( java.util.Map<java.lang.String,> != null ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,?> < java.lang.String , ? > java.util.Map.Entry<java.lang.String,?> : java.util.Map<java.lang.String,> . java.util.Set<java.util.Map.Entry<java.lang.String,>> ( ) ) { this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.util.Map.Entry<java.lang.String,> . java.lang.String ( ) , java.util.Map.Entry<java.lang.String,> . getValue ( ) ) ; if ( java.util.Map.Entry<java.lang.String,> . getValue ( ) instanceof SqlParameterValue ) { SqlParameterValue org.springframework.jdbc.core.namedparam.SqlParameterValue = ( SqlParameterValue ) java.util.Map.Entry<java.lang.String,> . getValue ( ) ; registerSqlType ( java.util.Map.Entry<java.lang.String,> . java.lang.String ( ) , org.springframework.jdbc.core.namedparam.SqlParameterValue . getSqlType ( ) ) ; } } } return this ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( this . java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.String java.lang.String ) { return this . java.util.Map<java.lang.String,java.lang.Object> . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { if ( ! boolean ( java.lang.String ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING ) ; } return this . java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>