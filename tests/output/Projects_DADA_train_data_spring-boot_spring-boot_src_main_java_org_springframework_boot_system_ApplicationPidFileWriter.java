<METHOD_START> public void ( ) { this( new java.io.File ( java.lang.String ) ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this( new java.io.File ( java.lang.String ) ); }  <METHOD_END>
<METHOD_START> public void ( java.io.File java.io.File ) { Assert . notNull ( java.io.File , STRING ) ; this . java.io.File = java.io.File ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<? extends org.springframework.boot.system.SpringApplicationEvent> < ? extends SpringApplicationEvent > java.lang.Class<? extends org.springframework.boot.system.SpringApplicationEvent> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<? extends org.springframework.boot.system.SpringApplicationEvent> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent ) { if ( this . java.lang.Class<> . boolean ( org.springframework.boot.system.SpringApplicationEvent ) ) { if ( java.util.concurrent.atomic.AtomicBoolean . boolean ( false , true ) ) { try { void ( org.springframework.boot.system.SpringApplicationEvent ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( STRING , this . java.io.File ) ; if ( boolean ( org.springframework.boot.system.SpringApplicationEvent ) ) { throw new java.lang.IllegalStateException ( java.lang.String , java.lang.Exception ) ; } org.springframework.boot.system.Log . warn ( java.lang.String , java.lang.Exception ) ; } } } }  <METHOD_END>
<METHOD_START> private void void ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent ) throws java.io.IOException { java.io.File java.io.File = this . java.io.File ; java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.system.SpringApplicationEvent , java.util.List<org.springframework.boot.system.ApplicationPidFileWriter.Property> ) ; if ( java.lang.String != null ) { java.io.File = new java.io.File ( java.lang.String ) ; } new ApplicationPid ( ) . write ( java.io.File ) ; java.io.File . void ( ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.system.SpringApplicationEvent , java.util.List<org.springframework.boot.system.ApplicationPidFileWriter.Property> ) ; return ( java.lang.String == null ? false : java.lang.Boolean . boolean ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent , java.util.List<org.springframework.boot.system.ApplicationPidFileWriter.Property> < org.springframework.boot.system.ApplicationPidFileWriter.Property > java.util.List<org.springframework.boot.system.ApplicationPidFileWriter.Property> ) { for ( org.springframework.boot.system.ApplicationPidFileWriter.Property org.springframework.boot.system.ApplicationPidFileWriter.Property : java.util.List<org.springframework.boot.system.ApplicationPidFileWriter.Property> ) { java.lang.String java.lang.String = org.springframework.boot.system.ApplicationPidFileWriter.Property . java.lang.String ( org.springframework.boot.system.SpringApplicationEvent ) ; if ( java.lang.String != null ) { return java.lang.String ; } } return null ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> protected static void void ( ) { java.util.concurrent.atomic.AtomicBoolean . void ( false ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent );  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent ) { Environment org.springframework.boot.system.Environment = org.springframework.boot.system.Environment ( org.springframework.boot.system.SpringApplicationEvent ) ; if ( org.springframework.boot.system.Environment == null ) { return null ; } return new RelaxedPropertyResolver ( org.springframework.boot.system.Environment , this . java.lang.String ) . getProperty ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.system.Environment org.springframework.boot.system.Environment ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent ) { if ( org.springframework.boot.system.SpringApplicationEvent instanceof ApplicationEnvironmentPreparedEvent ) { return ( ( ApplicationEnvironmentPreparedEvent ) org.springframework.boot.system.SpringApplicationEvent ) . getEnvironment ( ) ; } if ( org.springframework.boot.system.SpringApplicationEvent instanceof ApplicationPreparedEvent ) { return ( ( ApplicationPreparedEvent ) org.springframework.boot.system.SpringApplicationEvent ) . getApplicationContext ( ) . getEnvironment ( ) ; } if ( org.springframework.boot.system.SpringApplicationEvent instanceof ApplicationReadyEvent ) { return ( ( ApplicationReadyEvent ) org.springframework.boot.system.SpringApplicationEvent ) . getApplicationContext ( ) . getEnvironment ( ) ; } return null ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String[] = new java.lang.String [] { java.lang.String . java.lang.String ( ) , java.lang.String . java.lang.String ( ) } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( SpringApplicationEvent org.springframework.boot.system.SpringApplicationEvent ) { return SystemProperties . get ( this . java.lang.String[] ) ; }  <METHOD_END>