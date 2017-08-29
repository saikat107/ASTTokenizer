<METHOD_START> @ Before public void void ( ) java.lang.Exception { T = T ( ) ; org.springframework.data.gemfire.test.support.Cache = org.springframework.data.gemfire.test.support.Cache ( T ) ; org.springframework.data.gemfire.test.support.Cache . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected < C extends org.springframework.data.gemfire.test.support.Cache > C C ( ) java.lang.Exception { return ( C ) org.springframework.data.gemfire.test.support.Cache ( T ( ) ) ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.gemfire.test.support.Cache org.springframework.data.gemfire.test.support.Cache ( T T );  <METHOD_END>
<METHOD_START> protected abstract T T ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.data.gemfire.test.support.Cache . getName ( ) ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.data.gemfire.test.support.Cache . getNativeCache ( ) ) . isSameAs ( T ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING ) ) . isNull ( ) ; org.springframework.data.gemfire.test.support.Cache . put ( STRING , STRING ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING ) . get ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.gemfire.test.support.Cache . put ( STRING , STRING ) ; org.springframework.data.gemfire.test.support.Cache . put ( STRING , STRING ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; org.springframework.data.gemfire.test.support.Cache . clear ( ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.test.support.Cache . put ( STRING , java.lang.Boolean . java.lang.Boolean ) ; org.springframework.data.gemfire.test.support.Cache . put ( STRING , 'X' ) ; org.springframework.data.gemfire.test.support.Cache . put ( STRING , NUMBER ) ; org.springframework.data.gemfire.test.support.Cache . put ( STRING , java.lang.Math . double ) ; org.springframework.data.gemfire.test.support.Cache . put ( STRING , STRING ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.Boolean .class ) ) . isTrue ( ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.Character .class ) ) . isEqualTo ( 'X' ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.Integer .class ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.Double .class ) ) . isEqualTo ( java.lang.Math . double ) ; assertThat ( org.springframework.data.gemfire.test.support.Cache . get ( STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>