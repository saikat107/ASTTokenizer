<METHOD_START> @ Test public void void ( ) { assertThat ( EmbeddedDatabaseConnection . H2 . getUrl ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( EmbeddedDatabaseConnection . DERBY . getUrl ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( EmbeddedDatabaseConnection . HSQL . getUrl ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.jdbc.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; EmbeddedDatabaseConnection . H2 . getUrl ( STRING ) ; }  <METHOD_END>
