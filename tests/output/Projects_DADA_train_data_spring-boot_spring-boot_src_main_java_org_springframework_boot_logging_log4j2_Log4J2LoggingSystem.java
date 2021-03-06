<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.log4j2.Result org.springframework.boot.logging.log4j2.Result ( LogEvent org.springframework.boot.logging.log4j2.LogEvent ) { return Result . DENY ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.log4j2.Result org.springframework.boot.logging.log4j2.Result ( Logger org.springframework.boot.logging.log4j2.Logger , Level org.springframework.boot.logging.log4j2.Level , Marker org.springframework.boot.logging.log4j2.Marker , Message org.springframework.boot.logging.log4j2.Message , java.lang.Throwable java.lang.Throwable ) { return Result . DENY ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.log4j2.Result org.springframework.boot.logging.log4j2.Result ( Logger org.springframework.boot.logging.log4j2.Logger , Level org.springframework.boot.logging.log4j2.Level , Marker org.springframework.boot.logging.log4j2.Marker , java.lang.Object java.lang.Object , java.lang.Throwable java.lang.Throwable ) { return Result . DENY ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.log4j2.Result org.springframework.boot.logging.log4j2.Result ( Logger org.springframework.boot.logging.log4j2.Logger , Level org.springframework.boot.logging.log4j2.Level , Marker org.springframework.boot.logging.log4j2.Marker , java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { return Result . DENY ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader ) { super( java.lang.ClassLoader ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String [] java.lang.String[] ( ) { return java.lang.String[] ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; if ( boolean ( STRING ) ) { java.util.Collections . boolean ( java.util.List<java.lang.String> , STRING , STRING ) ; } if ( boolean ( STRING ) ) { java.util.Collections . boolean ( java.util.List<java.lang.String> , STRING , STRING ) ; } java.util.List<java.lang.String> . boolean ( STRING ) ; return java.util.List<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.List<java.lang.String> . int ( ) ] ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.String java.lang.String ) { return ClassUtils . isPresent ( java.lang.String , getClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { LoggerContext org.springframework.boot.logging.log4j2.LoggerContext = org.springframework.boot.logging.log4j2.LoggerContext ( ) ; if ( boolean ( org.springframework.boot.logging.log4j2.LoggerContext ) ) { return; } super. beforeInitialize ( ) ; org.springframework.boot.logging.log4j2.LoggerContext . getConfiguration ( ) . addFilter ( org.springframework.boot.logging.log4j2.Filter ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( LoggingInitializationContext org.springframework.boot.logging.log4j2.LoggingInitializationContext , java.lang.String java.lang.String , LogFile org.springframework.boot.logging.log4j2.LogFile ) { LoggerContext org.springframework.boot.logging.log4j2.LoggerContext = org.springframework.boot.logging.log4j2.LoggerContext ( ) ; if ( boolean ( org.springframework.boot.logging.log4j2.LoggerContext ) ) { return; } org.springframework.boot.logging.log4j2.LoggerContext . getConfiguration ( ) . removeFilter ( org.springframework.boot.logging.log4j2.Filter ) ; super. initialize ( org.springframework.boot.logging.log4j2.LoggingInitializationContext , java.lang.String , org.springframework.boot.logging.log4j2.LogFile ) ; void ( org.springframework.boot.logging.log4j2.LoggerContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( LoggingInitializationContext org.springframework.boot.logging.log4j2.LoggingInitializationContext , LogFile org.springframework.boot.logging.log4j2.LogFile ) { if ( org.springframework.boot.logging.log4j2.LogFile != null ) { void ( getPackagedConfigFile ( STRING ) , org.springframework.boot.logging.log4j2.LogFile ) ; } else { void ( getPackagedConfigFile ( STRING ) , org.springframework.boot.logging.log4j2.LogFile ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( LoggingInitializationContext org.springframework.boot.logging.log4j2.LoggingInitializationContext , java.lang.String java.lang.String , LogFile org.springframework.boot.logging.log4j2.LogFile ) { super. loadConfiguration ( org.springframework.boot.logging.log4j2.LoggingInitializationContext , java.lang.String , org.springframework.boot.logging.log4j2.LogFile ) ; void ( java.lang.String , org.springframework.boot.logging.log4j2.LogFile ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , LogFile org.springframework.boot.logging.log4j2.LogFile ) { Assert . notNull ( java.lang.String , STRING ) ; try { LoggerContext org.springframework.boot.logging.log4j2.LoggerContext = org.springframework.boot.logging.log4j2.LoggerContext ( ) ; java.net.URL java.net.URL = ResourceUtils . getURL ( java.lang.String ) ; ConfigurationSource org.springframework.boot.logging.log4j2.ConfigurationSource = org.springframework.boot.logging.log4j2.ConfigurationSource ( java.net.URL ) ; org.springframework.boot.logging.log4j2.LoggerContext . start ( ConfigurationFactory . getInstance ( ) . getConfiguration ( org.springframework.boot.logging.log4j2.LoggerContext , org.springframework.boot.logging.log4j2.ConfigurationSource ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.logging.log4j2.ConfigurationSource org.springframework.boot.logging.log4j2.ConfigurationSource ( java.net.URL java.net.URL ) throws java.io.IOException { java.io.InputStream java.io.InputStream = java.net.URL . java.io.InputStream ( ) ; if ( java.lang.String . boolean ( java.net.URL . java.lang.String ( ) ) ) { return new ConfigurationSource ( java.io.InputStream , ResourceUtils . getFile ( java.net.URL ) ) ; } return new ConfigurationSource ( java.io.InputStream , java.net.URL ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( LoggingInitializationContext org.springframework.boot.logging.log4j2.LoggingInitializationContext ) { org.springframework.boot.logging.log4j2.LoggerContext ( ) . reconfigure ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<org.springframework.boot.logging.log4j2.LogLevel> < LogLevel > java.util.Set<org.springframework.boot.logging.log4j2.LogLevel> ( ) { return org.springframework.boot.logging.log4j2.LogLevels<org.springframework.boot.logging.log4j2.Level> . getSupported ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , LogLevel org.springframework.boot.logging.log4j2.LogLevel ) { Level org.springframework.boot.logging.log4j2.Level = org.springframework.boot.logging.log4j2.LogLevels<org.springframework.boot.logging.log4j2.Level> . convertSystemToNative ( org.springframework.boot.logging.log4j2.LogLevel ) ; LoggerConfig org.springframework.boot.logging.log4j2.LoggerConfig = org.springframework.boot.logging.log4j2.LoggerConfig ( java.lang.String ) ; if ( org.springframework.boot.logging.log4j2.LoggerConfig == null ) { org.springframework.boot.logging.log4j2.LoggerConfig = new LoggerConfig ( java.lang.String , org.springframework.boot.logging.log4j2.Level , true ) ; org.springframework.boot.logging.log4j2.LoggerContext ( ) . getConfiguration ( ) . addLogger ( java.lang.String , org.springframework.boot.logging.log4j2.LoggerConfig ) ; } else { org.springframework.boot.logging.log4j2.LoggerConfig . setLevel ( org.springframework.boot.logging.log4j2.Level ) ; } org.springframework.boot.logging.log4j2.LoggerContext ( ) . updateLoggers ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> < LoggerConfiguration > java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> ( ) { java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> < LoggerConfiguration > java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> = new java.util.ArrayList<org.springframework.boot.logging.log4j2.LoggerConfiguration> <> ( ) ; Configuration org.springframework.boot.logging.log4j2.Configuration = org.springframework.boot.logging.log4j2.LoggerContext ( ) . getConfiguration ( ) ; for ( LoggerConfig org.springframework.boot.logging.log4j2.LoggerConfig : org.springframework.boot.logging.log4j2.Configuration . getLoggers ( ) . values ( ) ) { java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> . add ( org.springframework.boot.logging.log4j2.LoggerConfiguration ( org.springframework.boot.logging.log4j2.LoggerConfig ) ) ; } java.util.Collections . void ( java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> , CONFIGURATION_COMPARATOR ) ; return java.util.List<org.springframework.boot.logging.log4j2.LoggerConfiguration> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.logging.log4j2.LoggerConfiguration org.springframework.boot.logging.log4j2.LoggerConfiguration ( java.lang.String java.lang.String ) { return org.springframework.boot.logging.log4j2.LoggerConfiguration ( org.springframework.boot.logging.log4j2.LoggerConfig ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.logging.log4j2.LoggerConfiguration org.springframework.boot.logging.log4j2.LoggerConfiguration ( LoggerConfig org.springframework.boot.logging.log4j2.LoggerConfig ) { if ( org.springframework.boot.logging.log4j2.LoggerConfig == null ) { return null ; } LogLevel org.springframework.boot.logging.log4j2.LogLevel = org.springframework.boot.logging.log4j2.LogLevels<org.springframework.boot.logging.log4j2.Level> . convertNativeToSystem ( org.springframework.boot.logging.log4j2.LoggerConfig . getLevel ( ) ) ; java.lang.String java.lang.String = org.springframework.boot.logging.log4j2.LoggerConfig . getName ( ) ; if ( ! StringUtils . hasLength ( java.lang.String ) || LogManager . ROOT_LOGGER_NAME . equals ( java.lang.String ) ) { java.lang.String = ROOT_LOGGER_NAME ; } return new LoggerConfiguration ( java.lang.String , org.springframework.boot.logging.log4j2.LogLevel , org.springframework.boot.logging.log4j2.LogLevel ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Runnable java.lang.Runnable ( ) { return new org.springframework.boot.logging.log4j2.Log4J2LoggingSystem.ShutdownHandler ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { super. cleanUp ( ) ; LoggerContext org.springframework.boot.logging.log4j2.LoggerContext = org.springframework.boot.logging.log4j2.LoggerContext ( ) ; void ( org.springframework.boot.logging.log4j2.LoggerContext ) ; org.springframework.boot.logging.log4j2.LoggerContext . getConfiguration ( ) . removeFilter ( org.springframework.boot.logging.log4j2.Filter ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.logging.log4j2.LoggerConfig org.springframework.boot.logging.log4j2.LoggerConfig ( java.lang.String java.lang.String ) { if ( ! StringUtils . hasLength ( java.lang.String ) || ROOT_LOGGER_NAME . equals ( java.lang.String ) ) { java.lang.String = LogManager . ROOT_LOGGER_NAME ; } return org.springframework.boot.logging.log4j2.LoggerContext ( ) . getConfiguration ( ) . getLoggers ( ) . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.logging.log4j2.LoggerContext org.springframework.boot.logging.log4j2.LoggerContext ( ) { return ( LoggerContext ) LogManager . getContext ( false ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( LoggerContext org.springframework.boot.logging.log4j2.LoggerContext ) { return LoggingSystem .class . java.lang.String ( ) . boolean ( org.springframework.boot.logging.log4j2.LoggerContext . getExternalContext ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( LoggerContext org.springframework.boot.logging.log4j2.LoggerContext ) { org.springframework.boot.logging.log4j2.LoggerContext . setExternalContext ( LoggingSystem .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( LoggerContext org.springframework.boot.logging.log4j2.LoggerContext ) { org.springframework.boot.logging.log4j2.LoggerContext . setExternalContext ( null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { org.springframework.boot.logging.log4j2.LoggerContext ( ) . stop ( ) ; }  <METHOD_END>
