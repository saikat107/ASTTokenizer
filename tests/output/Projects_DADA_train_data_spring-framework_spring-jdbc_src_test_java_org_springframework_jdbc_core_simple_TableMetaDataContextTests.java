<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.sql.Connection = mock ( java.sql.Connection .class ) ; javax.sql.DataSource = mock ( javax.sql.DataSource .class ) ; java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final java.lang.String java.lang.String = STRING ; java.sql.ResultSet java.sql.ResultSet = mock ( java.sql.ResultSet .class ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true , false ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( java.lang.String ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( java.lang.String ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( STRING ) ; java.sql.ResultSet java.sql.ResultSet = mock ( java.sql.ResultSet .class ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true , true , true , true , false ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( STRING , STRING , STRING , STRING ) ; given ( java.sql.ResultSet . int ( STRING ) ) . willReturn ( java.sql.Types . int , java.sql.Types . int , java.sql.Types . int , java.sql.Types . int ) ; given ( java.sql.ResultSet . boolean ( STRING ) ) . willReturn ( false , true , true , false ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( java.lang.String ) ; given ( java.sql.DatabaseMetaData . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.DatabaseMetaData . java.sql.ResultSet ( null , null , java.lang.String , null ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.DatabaseMetaData . java.sql.ResultSet ( null , java.lang.String , java.lang.String , null ) ) . willReturn ( java.sql.ResultSet ) ; MapSqlParameterSource org.springframework.jdbc.core.simple.MapSqlParameterSource = new MapSqlParameterSource ( ) ; org.springframework.jdbc.core.simple.MapSqlParameterSource . addValue ( STRING , NUMBER ) ; org.springframework.jdbc.core.simple.MapSqlParameterSource . addValue ( STRING , STRING ) ; org.springframework.jdbc.core.simple.MapSqlParameterSource . addValue ( STRING , new java.util.Date ( ) ) ; org.springframework.jdbc.core.simple.MapSqlParameterSource . addValue ( STRING , NUMBER ) ; org.springframework.jdbc.core.simple.MapSqlParameterSource . registerSqlType ( STRING , java.sql.Types . int ) ; org.springframework.jdbc.core.simple.MapSqlParameterSource . registerSqlType ( STRING , java.sql.Types . int ) ; org.springframework.jdbc.core.simple.TableMetaDataContext . setTableName ( java.lang.String ) ; org.springframework.jdbc.core.simple.TableMetaDataContext . processMetaData ( javax.sql.DataSource , new java.util.ArrayList <> ( ) , new java.lang.String [] {} ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = org.springframework.jdbc.core.simple.TableMetaDataContext . matchInParameterValuesWithInsertColumns ( org.springframework.jdbc.core.simple.MapSqlParameterSource ) ; assertEquals ( STRING , NUMBER , java.util.List<java.lang.Object> . int ( ) ) ; assertTrue ( STRING , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) instanceof java.lang.Number ) ; assertTrue ( STRING , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) instanceof java.lang.String ) ; assertTrue ( STRING , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) instanceof SqlParameterValue ) ; assertTrue ( STRING , java.util.List<java.lang.Object> . java.lang.Object ( NUMBER ) instanceof SqlParameterValue ) ; verify ( java.sql.ResultSet , atLeastOnce ( ) ) . next ( ) ; verify ( java.sql.ResultSet , atLeastOnce ( ) ) . next ( ) ; verify ( java.sql.ResultSet ) . close ( ) ; verify ( java.sql.ResultSet ) . close ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { final java.lang.String java.lang.String = STRING ; final java.lang.String java.lang.String = STRING ; java.sql.ResultSet java.sql.ResultSet = mock ( java.sql.ResultSet .class ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true , false ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( java.lang.String ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( java.lang.String ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( STRING ) ; java.sql.ResultSet java.sql.ResultSet = mock ( java.sql.ResultSet .class ) ; given ( java.sql.ResultSet . boolean ( ) ) . willReturn ( true , false ) ; given ( java.sql.ResultSet . java.lang.String ( STRING ) ) . willReturn ( STRING ) ; given ( java.sql.ResultSet . int ( STRING ) ) . willReturn ( java.sql.Types . int ) ; given ( java.sql.ResultSet . boolean ( STRING ) ) . willReturn ( false ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( STRING ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( java.lang.String ) ; given ( java.sql.DatabaseMetaData . boolean ( ) ) . willReturn ( true ) ; given ( java.sql.DatabaseMetaData . java.sql.ResultSet ( null , null , java.lang.String , null ) ) . willReturn ( java.sql.ResultSet ) ; given ( java.sql.DatabaseMetaData . java.sql.ResultSet ( null , java.lang.String , java.lang.String , null ) ) . willReturn ( java.sql.ResultSet ) ; MapSqlParameterSource org.springframework.jdbc.core.simple.MapSqlParameterSource = new MapSqlParameterSource ( ) ; java.lang.String [] java.lang.String[] = new java.lang.String [] { STRING } ; org.springframework.jdbc.core.simple.TableMetaDataContext . setTableName ( java.lang.String ) ; org.springframework.jdbc.core.simple.TableMetaDataContext . processMetaData ( javax.sql.DataSource , new java.util.ArrayList <> ( ) , java.lang.String[] ) ; java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = org.springframework.jdbc.core.simple.TableMetaDataContext . matchInParameterValuesWithInsertColumns ( org.springframework.jdbc.core.simple.MapSqlParameterSource ) ; java.lang.String java.lang.String = org.springframework.jdbc.core.simple.TableMetaDataContext . createInsertString ( java.lang.String[] ) ; assertEquals ( STRING , NUMBER , java.util.List<java.lang.Object> . int ( ) ) ; assertEquals ( STRING , STRING , java.lang.String ) ; verify ( java.sql.ResultSet , atLeastOnce ( ) ) . next ( ) ; verify ( java.sql.ResultSet , atLeastOnce ( ) ) . next ( ) ; verify ( java.sql.ResultSet ) . close ( ) ; verify ( java.sql.ResultSet ) . close ( ) ; }  <METHOD_END>
