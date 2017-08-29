<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( DatabaseLookup . getDatabase ( null ) ) . isEqualTo ( Database . DEFAULT ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . DEFAULT ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . DERBY ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . H2 ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . HSQL ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . MYSQL ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . ORACLE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . POSTGRESQL ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . SQL_SERVER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . DB2 ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , Database . INFORMIX ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , Database org.springframework.boot.autoconfigure.orm.jpa.Database ) throws java.lang.Exception { javax.sql.DataSource javax.sql.DataSource = mock ( javax.sql.DataSource .class ) ; java.sql.Connection java.sql.Connection = mock ( java.sql.Connection .class ) ; java.sql.DatabaseMetaData java.sql.DatabaseMetaData = mock ( java.sql.DatabaseMetaData .class ) ; given ( javax.sql.DataSource . java.sql.Connection ( ) ) . willReturn ( java.sql.Connection ) ; given ( java.sql.Connection . java.sql.DatabaseMetaData ( ) ) . willReturn ( java.sql.DatabaseMetaData ) ; given ( java.sql.DatabaseMetaData . java.lang.String ( ) ) . willReturn ( java.lang.String ) ; Database org.springframework.boot.autoconfigure.orm.jpa.Database = DatabaseLookup . getDatabase ( javax.sql.DataSource ) ; assertThat ( org.springframework.boot.autoconfigure.orm.jpa.Database ) . isEqualTo ( org.springframework.boot.autoconfigure.orm.jpa.Database ) ; }  <METHOD_END>
