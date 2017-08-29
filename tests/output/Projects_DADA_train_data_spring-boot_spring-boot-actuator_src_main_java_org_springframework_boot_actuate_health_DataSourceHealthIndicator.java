<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource ) { this( javax.sql.DataSource , null ); }  <METHOD_END>
<METHOD_START> public void ( javax.sql.DataSource javax.sql.DataSource , java.lang.String java.lang.String ) { this . javax.sql.DataSource = javax.sql.DataSource ; this . java.lang.String = java.lang.String ; this . org.springframework.boot.actuate.health.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { Assert . state ( this . javax.sql.DataSource != null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Health . Health Health.Builder ) throws java.lang.Exception { if ( this . javax.sql.DataSource == null ) { Health.Builder . up ( ) . withDetail ( STRING , STRING ) ; } else { void ( Health.Builder ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Health . Health Health.Builder ) throws java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( ) ; Health.Builder . up ( ) . withDetail ( STRING , java.lang.String ) ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; if ( StringUtils . hasText ( java.lang.String ) ) { try { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = this . org.springframework.boot.actuate.health.JdbcTemplate . query ( java.lang.String , new org.springframework.boot.actuate.health.DataSourceHealthIndicator.SingleColumnRowMapper ( ) ) ; java.lang.Object java.lang.Object = DataAccessUtils . requiredSingleResult ( java.util.List<java.lang.Object> ) ; Health.Builder . withDetail ( STRING , java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { Health.Builder . down ( java.lang.Exception ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return this . org.springframework.boot.actuate.health.JdbcTemplate . execute ( new ConnectionCallback < java.lang.String > ( ) { @ java.lang.Override public java.lang.String java.lang.String ( java.sql.Connection java.sql.Connection )					throws java.sql.SQLException , org.springframework.boot.actuate.health.DataAccessException { return java.sql.Connection . java.sql.DatabaseMetaData ( ) . java.lang.String ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.sql.Connection java.sql.Connection )					throws java.sql.SQLException , org.springframework.boot.actuate.health.DataAccessException { return java.sql.Connection . java.sql.DatabaseMetaData ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = this . java.lang.String ; if ( ! StringUtils . hasText ( java.lang.String ) ) { DatabaseDriver org.springframework.boot.actuate.health.DatabaseDriver = DatabaseDriver . fromProductName ( java.lang.String ) ; java.lang.String = org.springframework.boot.actuate.health.DatabaseDriver . getValidationQuery ( ) ; } if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = java.lang.String ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( javax.sql.DataSource javax.sql.DataSource ) { this . javax.sql.DataSource = javax.sql.DataSource ; this . org.springframework.boot.actuate.health.JdbcTemplate = new JdbcTemplate ( javax.sql.DataSource ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.sql.ResultSet java.sql.ResultSet , int int ) throws java.sql.SQLException { java.sql.ResultSetMetaData java.sql.ResultSetMetaData = java.sql.ResultSet . java.sql.ResultSetMetaData ( ) ; int int = java.sql.ResultSetMetaData . int ( ) ; if ( int != NUMBER ) { throw new IncorrectResultSetColumnCountException ( NUMBER , int ) ; } return JdbcUtils . getResultSetValue ( java.sql.ResultSet , NUMBER ) ; }  <METHOD_END>