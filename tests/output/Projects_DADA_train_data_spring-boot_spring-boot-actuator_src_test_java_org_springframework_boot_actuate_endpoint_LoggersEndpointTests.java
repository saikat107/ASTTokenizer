<METHOD_START> public void ( ) { super( org.springframework.boot.actuate.endpoint.LoggersEndpointTests.Config .class , LoggersEndpoint .class , STRING , true , STRING ); }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { given ( org.springframework.boot.actuate.endpoint.LoggingSystem ( ) . getLoggerConfigurations ( ) ) . willReturn ( java.util.Collections . java.util.List<T> ( new LoggerConfiguration ( STRING , null , LogLevel . DEBUG ) ) ) ; given ( org.springframework.boot.actuate.endpoint.LoggingSystem ( ) . getSupportedLogLevels ( ) ) . willReturn ( java.util.EnumSet . java.util.EnumSet<E> ( LogLevel .class ) ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = getEndpointBean ( ) . invoke ( ) ; java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggerLevels> < java.lang.String , LoggerLevels > java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggerLevels> = ( java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggerLevels> < java.lang.String , LoggerLevels > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> < LogLevel > java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> = ( java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> < LogLevel > ) java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING ) ; LoggerLevels org.springframework.boot.actuate.endpoint.LoggerLevels = java.util.Map<java.lang.String,org.springframework.boot.actuate.endpoint.LoggerLevels> . get ( STRING ) ; assertThat ( org.springframework.boot.actuate.endpoint.LoggerLevels . getConfiguredLevel ( ) ) . isNull ( ) ; assertThat ( org.springframework.boot.actuate.endpoint.LoggerLevels . getEffectiveLevel ( ) ) . isEqualTo ( STRING ) ; assertThat ( java.util.Set<org.springframework.boot.actuate.endpoint.LogLevel> ) . containsExactly ( LogLevel . OFF , LogLevel . FATAL , LogLevel . ERROR , LogLevel . WARN , LogLevel . INFO , LogLevel . DEBUG , LogLevel . TRACE ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { given ( org.springframework.boot.actuate.endpoint.LoggingSystem ( ) . getLoggerConfiguration ( STRING ) ) . willReturn ( new LoggerConfiguration ( STRING , null , LogLevel . DEBUG ) ) ; LoggerLevels org.springframework.boot.actuate.endpoint.LoggerLevels = getEndpointBean ( ) . invoke ( STRING ) ; assertThat ( org.springframework.boot.actuate.endpoint.LoggerLevels . getConfiguredLevel ( ) ) . isNull ( ) ; assertThat ( org.springframework.boot.actuate.endpoint.LoggerLevels . getEffectiveLevel ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { getEndpointBean ( ) . setLogLevel ( STRING , LogLevel . DEBUG ) ; verify ( org.springframework.boot.actuate.endpoint.LoggingSystem ( ) ) . setLogLevel ( STRING , LogLevel . DEBUG ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.endpoint.LoggingSystem org.springframework.boot.actuate.endpoint.LoggingSystem ( ) { return this . context . getBean ( LoggingSystem .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.endpoint.LoggingSystem org.springframework.boot.actuate.endpoint.LoggingSystem ( ) { return mock ( LoggingSystem .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.actuate.endpoint.LoggersEndpoint org.springframework.boot.actuate.endpoint.LoggersEndpoint ( LoggingSystem org.springframework.boot.actuate.endpoint.LoggingSystem ) { return new LoggersEndpoint ( org.springframework.boot.actuate.endpoint.LoggingSystem ) ; }  <METHOD_END>