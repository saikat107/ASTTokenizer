<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = STRING + java.lang.String + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.file.tail.Statement org.springframework.integration.file.tail.Statement ( Statement org.springframework.integration.file.tail.Statement , Description org.springframework.integration.file.tail.Description ) { if ( org.springframework.integration.file.tail.Description . getAnnotation ( TailAvailable .class ) != null ) { if ( ! boolean ( ) ) { return new Statement ( ) { @ java.lang.Override public void void ( ) java.lang.Throwable { } } ; } } return super. apply ( org.springframework.integration.file.tail.Statement , org.springframework.integration.file.tail.Description ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { if ( java.lang.String . boolean ( STRING ) ) { return false ; } java.io.File java.io.File = new java.io.File ( java.lang.String , STRING ) ; java.io.File . boolean ( ) ; final java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; int int = - NUMBER ; try { java.io.OutputStream java.io.OutputStream = new java.io.FileOutputStream ( java.io.File ) ; java.io.OutputStream . void ( STRING . byte[] ( ) ) ; java.io.OutputStream . void ( ) ; final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> < java.lang.Integer > java.util.concurrent.atomic.AtomicReference<java.lang.Integer> = new java.util.concurrent.atomic.AtomicReference<java.lang.Integer> < java.lang.Integer > ( ) ; final java.util.concurrent.CountDownLatch java.util.concurrent.CountDownLatch = new java.util.concurrent.CountDownLatch ( NUMBER ) ; java.util.concurrent.Future<java.lang.Process> < java.lang.Process > java.util.concurrent.Future<java.lang.Process> = java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . java.util.concurrent.Future<java.lang.Process> ( ( ) { final java.lang.Process java.lang.Process = java.lang.Runtime . java.lang.Runtime ( ) . java.lang.Process ( java.lang.String + STRING + java.io.File . java.lang.String ( ) ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) { try { java.util.concurrent.atomic.AtomicReference<java.lang.Integer> . void ( java.lang.Process . java.io.InputStream ( ) . int ( ) ) ; java.util.concurrent.CountDownLatch . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { org.springframework.integration.file.tail.Log . error ( STRING , java.io.IOException ) ; } } ) ; return java.lang.Process ; } ) ; try { java.lang.Process java.lang.Process = java.util.concurrent.Future<java.lang.Process> . java.lang.Process ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ; if ( java.util.concurrent.CountDownLatch . boolean ( NUMBER , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) { java.lang.Integer java.lang.Integer = java.util.concurrent.atomic.AtomicReference<java.lang.Integer> . java.lang.Integer ( ) ; if ( java.lang.Integer != null && java.lang.Integer == 'f' ) { int = NUMBER ; } } java.lang.Process . void ( ) ; } catch ( java.util.concurrent.ExecutionException java.util.concurrent.ExecutionException ) { int = - NUMBER ; } java.io.File . boolean ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.integration.file.tail.Log . error ( STRING , java.lang.Exception ) ; } if ( int != NUMBER ) { org.springframework.integration.file.tail.Log . warn ( STRING + int ) ; } return int == NUMBER ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.integration.file.tail.TailRule org.springframework.integration.file.tail.TailRule = new org.springframework.integration.file.tail.TailRule ( STRING ) ; assertFalse ( org.springframework.integration.file.tail.TailRule . boolean ( ) ) ; }  <METHOD_END>