<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.boot.autoconfigure.jdbc.Environment ) { this . org.springframework.boot.autoconfigure.jdbc.Environment = org.springframework.boot.autoconfigure.jdbc.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection = EmbeddedDatabaseConnection . get ( this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder ( ) { return DataSourceBuilder . create ( java.lang.ClassLoader ( ) ) . type ( java.lang.Class<? extends javax.sql.DataSource> ( ) ) . driverClassName ( java.lang.String ( ) ) . url ( java.lang.String ( ) ) . username ( java.lang.String ( ) ) . password ( java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<? extends javax.sql.DataSource> < ? extends javax.sql.DataSource > java.lang.Class<? extends javax.sql.DataSource> ( ) { return this . java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<? extends javax.sql.DataSource> < ? extends javax.sql.DataSource > java.lang.Class<? extends javax.sql.DataSource> ) { this . java.lang.Class<? extends javax.sql.DataSource> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( StringUtils . hasText ( this . java.lang.String ) ) { Assert . state ( boolean ( ) , STRING + this . java.lang.String ) ; return this . java.lang.String ; } java.lang.String java.lang.String = null ; if ( StringUtils . hasText ( this . java.lang.String ) ) { java.lang.String = DatabaseDriver . fromJdbcUrl ( this . java.lang.String ) . getDriverClassName ( ) ; } if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = this . org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection . getDriverClassName ( ) ; } if ( ! StringUtils . hasText ( java.lang.String ) ) { throw new org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.DataSourceBeanCreationException ( this . org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection , this . org.springframework.boot.autoconfigure.jdbc.Environment , STRING ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { try { ClassUtils . forName ( this . java.lang.String , null ) ; return true ; } catch ( java.lang.UnsupportedClassVersionError java.lang.UnsupportedClassVersionError ) { throw java.lang.UnsupportedClassVersionError ; } catch ( java.lang.Throwable java.lang.Throwable ) { return false ; } }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( StringUtils . hasText ( this . java.lang.String ) ) { return this . java.lang.String ; } java.lang.String java.lang.String = this . org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection . getUrl ( java.lang.String ( ) ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { throw new org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.DataSourceBeanCreationException ( this . org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection , this . org.springframework.boot.autoconfigure.jdbc.Environment , STRING ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { if ( this . boolean ) { if ( this . java.lang.String == null ) { this . java.lang.String = java.util.UUID . java.util.UUID ( ) . java.lang.String ( ) ; } return this . java.lang.String ; } return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( StringUtils . hasText ( this . java.lang.String ) ) { return this . java.lang.String ; } if ( EmbeddedDatabaseConnection . isEmbedded ( java.lang.String ( ) ) ) { return STRING ; } return null ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { if ( StringUtils . hasText ( this . java.lang.String ) ) { return this . java.lang.String ; } if ( EmbeddedDatabaseConnection . isEmbedded ( java.lang.String ( ) ) ) { return STRING ; } return null ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return this . java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.nio.charset.Charset java.nio.charset.Charset ( ) { return this . java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public void void ( java.nio.charset.Charset java.nio.charset.Charset ) { this . java.nio.charset.Charset = java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public java.lang.ClassLoader java.lang.ClassLoader ( ) { return this . java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa ( ) { return this . org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa ; }  <METHOD_END>
<METHOD_START> public void void ( org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa ) { this . org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa = org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.Xa ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return this . java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { this . java.util.Map<java.lang.String,java.lang.String> = java.util.Map<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> void ( EmbeddedDatabaseConnection org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection , Environment org.springframework.boot.autoconfigure.jdbc.Environment , java.lang.String java.lang.String ) { super( java.lang.String ( org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection , org.springframework.boot.autoconfigure.jdbc.Environment , java.lang.String ) ); }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( EmbeddedDatabaseConnection org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection , Environment org.springframework.boot.autoconfigure.jdbc.Environment , java.lang.String java.lang.String ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + java.lang.String + STRING + org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection + STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + STRING ) ; if ( org.springframework.boot.autoconfigure.jdbc.Environment != null ) { java.lang.String [] java.lang.String[] = org.springframework.boot.autoconfigure.jdbc.Environment . getActiveProfiles ( ) ; if ( ObjectUtils . isEmpty ( java.lang.String[] ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } else { java.lang.StringBuilder . java.lang.StringBuilder ( STRING + StringUtils . arrayToCommaDelimitedString ( org.springframework.boot.autoconfigure.jdbc.Environment . getActiveProfiles ( ) ) + STRING ) ; } } java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>