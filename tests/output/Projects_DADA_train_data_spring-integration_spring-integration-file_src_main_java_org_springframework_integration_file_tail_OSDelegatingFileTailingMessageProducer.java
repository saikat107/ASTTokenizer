<METHOD_START> public void void ( java.lang.String java.lang.String ) { if ( java.lang.String == null ) { this . java.lang.String = STRING ; } else { this . java.lang.String = java.lang.String ; } }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return super. getComponentType ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { Assert . notNull ( getFile ( ) , STRING ) ; super. onInit ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStart ( ) ; void ( ) ; this . java.lang.String = STRING + this . java.lang.String + STRING + this . getFile ( ) . getAbsolutePath ( ) ; this . getTaskExecutor ( ) . execute ( this :: void ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. doStop ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { java.lang.Process java.lang.Process = this . java.lang.Process ; if ( java.lang.Process != null ) { java.lang.Process . void ( ) ; this . java.lang.Process = null ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { this . void ( ) ; if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING ) ; } try { java.lang.Process java.lang.Process = java.lang.Runtime . java.lang.Runtime ( ) . java.lang.Process ( this . java.lang.String ) ; java.io.BufferedReader java.io.BufferedReader = new java.io.BufferedReader ( new java.io.InputStreamReader ( java.lang.Process . java.io.InputStream ( ) ) ) ; this . java.lang.Process = java.lang.Process ; this . void ( ) ; if ( this . boolean ) { void ( ) ; } this . java.io.BufferedReader = java.io.BufferedReader ; this . getTaskExecutor ( ) . execute ( this ) ; } catch ( java.io.IOException java.io.IOException ) { throw new MessagingException ( STRING + this . java.lang.String + STRING , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { this . getTaskExecutor ( ) . execute ( ( ) { Process process = OSDelegatingFileTailingMessageProducer .this . process ; if ( process == null ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } return; } int result = Integer . MIN_VALUE ; try { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + process ) ; } result = process . waitFor ( ) ; if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + result ) ; } } catch ( InterruptedException e ) { Thread . currentThread ( ) . interrupt ( ) ; logger . error ( STRING , e ) ; stop ( ) ; } finally { destroyProcess ( ) ; } if ( isRunning ( ) ) { if ( logger . isInfoEnabled ( ) ) { logger . info ( STRING + getMissingFileDelay ( ) + STRING ) ; } getTaskScheduler ( ) . schedule ( this :: runExec , new Date ( System . currentTimeMillis ( ) + getMissingFileDelay ( ) ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { java.lang.Process java.lang.Process = this . java.lang.Process ; if ( java.lang.Process == null ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } return; } this . getTaskExecutor ( ) . execute ( ( ) { BufferedReader errorReader = new BufferedReader ( new InputStreamReader ( process . getErrorStream ( ) ) ) ; String statusMessage ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } try { while ( ( statusMessage = errorReader . readLine ( ) ) != null ) { publish ( statusMessage ) ; if ( logger . isTraceEnabled ( ) ) { logger . trace ( statusMessage ) ; } } } catch ( IOException e1 ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , e1 ) ; } } finally { try { errorReader . close ( ) ; } catch ( IOException e2 ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , e2 ) ; } } } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { java.lang.String java.lang.String ; try { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING ) ; } while ( ( java.lang.String = this . java.io.BufferedReader . java.lang.String ( ) ) != null ) { this . send ( java.lang.String ) ; } } catch ( java.io.IOException java.io.IOException ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , java.io.IOException ) ; } try { this . java.io.BufferedReader . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING , java.io.IOException ) ; } } this . void ( ) ; } }  <METHOD_END>