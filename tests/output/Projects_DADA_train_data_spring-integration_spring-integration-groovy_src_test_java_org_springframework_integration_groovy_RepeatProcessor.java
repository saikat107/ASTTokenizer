<METHOD_START> public void ( int int ) { this . int = int < NUMBER ? NUMBER : int ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.groovy.Statement org.springframework.integration.groovy.Statement ( final Statement org.springframework.integration.groovy.Statement , FrameworkMethod org.springframework.integration.groovy.FrameworkMethod , java.lang.Object java.lang.Object ) { Repeat org.springframework.integration.groovy.Repeat = AnnotationUtils . findAnnotation ( org.springframework.integration.groovy.FrameworkMethod . getMethod ( ) , Repeat .class ) ; if ( org.springframework.integration.groovy.Repeat == null ) { return org.springframework.integration.groovy.Statement ; } final int int = org.springframework.integration.groovy.Repeat . value ( ) ; if ( int <= NUMBER ) { return new Statement ( ) { @ java.lang.Override public void void ( ) java.lang.Throwable { for ( int int = NUMBER ; int < int ; int ++ ) { try { org.springframework.integration.groovy.Statement . evaluate ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + int , java.lang.Throwable ) ; } } } } ; } return new Statement ( ) { @ java.lang.Override public void void ( ) java.lang.Throwable { java.util.List<java.util.concurrent.Future<java.lang.Boolean>> < java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > > java.util.List<java.util.concurrent.Future<java.lang.Boolean>> = new java.util.ArrayList<java.util.concurrent.Future<java.lang.Boolean>> < java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > > ( ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( int ) ; try { for ( int int = NUMBER ; int < int ; int ++ ) { final int int = int ; java.util.List<java.util.concurrent.Future<java.lang.Boolean>> . boolean ( java.util.concurrent.ExecutorService . java.util.concurrent.Future<java.lang.Boolean> ( new java.util.concurrent.Callable<java.lang.Boolean> < java.lang.Boolean > ( ) { public java.lang.Boolean java.lang.Boolean ( ) { try { org.springframework.integration.groovy.Statement . evaluate ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + int , java.lang.Throwable ) ; } return true ; } } ) ) ; } for ( java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > java.util.concurrent.Future<java.lang.Boolean> : java.util.List<java.util.concurrent.Future<java.lang.Boolean>> ) { assertTrue ( STRING , java.util.concurrent.Future<java.lang.Boolean> . java.lang.Boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; } } finally { java.util.concurrent.ExecutorService . java.util.List<java.lang.Runnable> ( ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { for ( int int = NUMBER ; int < int ; int ++ ) { try { org.springframework.integration.groovy.Statement . evaluate ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + int , java.lang.Throwable ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { java.util.List<java.util.concurrent.Future<java.lang.Boolean>> < java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > > java.util.List<java.util.concurrent.Future<java.lang.Boolean>> = new java.util.ArrayList<java.util.concurrent.Future<java.lang.Boolean>> < java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > > ( ) ; java.util.concurrent.ExecutorService java.util.concurrent.ExecutorService = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( int ) ; try { for ( int int = NUMBER ; int < int ; int ++ ) { final int int = int ; java.util.List<java.util.concurrent.Future<java.lang.Boolean>> . boolean ( java.util.concurrent.ExecutorService . java.util.concurrent.Future<java.lang.Boolean> ( new java.util.concurrent.Callable<java.lang.Boolean> < java.lang.Boolean > ( ) { public java.lang.Boolean java.lang.Boolean ( ) { try { org.springframework.integration.groovy.Statement . evaluate ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + int , java.lang.Throwable ) ; } return true ; } } ) ) ; } for ( java.util.concurrent.Future<java.lang.Boolean> < java.lang.Boolean > java.util.concurrent.Future<java.lang.Boolean> : java.util.List<java.util.concurrent.Future<java.lang.Boolean>> ) { assertTrue ( STRING , java.util.concurrent.Future<java.lang.Boolean> . java.lang.Boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; } } finally { java.util.concurrent.ExecutorService . java.util.List<java.lang.Runnable> ( ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.Boolean java.lang.Boolean ( ) { try { org.springframework.integration.groovy.Statement . evaluate ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + int , java.lang.Throwable ) ; } return true ; }  <METHOD_END>