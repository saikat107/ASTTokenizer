<METHOD_START> public void ( java.lang.String java.lang.String , int int ) { this( null , java.lang.String , int ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int ) { this( new NonBlockingStatsDClient ( java.lang.String ( java.lang.String ) , java.lang.String , int , new org.springframework.boot.actuate.metrics.statsd.StatsdMetricWriter.LoggingStatsdErrorHandler ( ) ) ); }  <METHOD_END>
<METHOD_START> public void ( StatsDClient org.springframework.boot.actuate.metrics.statsd.StatsDClient ) { Assert . notNull ( org.springframework.boot.actuate.metrics.statsd.StatsDClient , STRING ) ; this . org.springframework.boot.actuate.metrics.statsd.StatsDClient = org.springframework.boot.actuate.metrics.statsd.StatsDClient ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = StringUtils . hasText ( java.lang.String ) ? java.lang.String : null ; while ( java.lang.String != null && java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( ) - NUMBER ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Delta < ? > org.springframework.boot.actuate.metrics.statsd.Delta<?> ) { this . org.springframework.boot.actuate.metrics.statsd.StatsDClient . count ( org.springframework.boot.actuate.metrics.statsd.Delta<> . getName ( ) , org.springframework.boot.actuate.metrics.statsd.Delta<> . getValue ( ) . longValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Metric < ? > org.springframework.boot.actuate.metrics.statsd.Metric<?> ) { java.lang.String java.lang.String = org.springframework.boot.actuate.metrics.statsd.Metric<> . getName ( ) ; if ( java.lang.String . boolean ( STRING ) && ! java.lang.String . boolean ( STRING ) && ! java.lang.String . boolean ( STRING ) ) { this . org.springframework.boot.actuate.metrics.statsd.StatsDClient . recordExecutionTime ( java.lang.String , org.springframework.boot.actuate.metrics.statsd.Metric<> . getValue ( ) . longValue ( ) ) ; } else { if ( java.lang.String . boolean ( STRING ) ) { this . org.springframework.boot.actuate.metrics.statsd.StatsDClient . count ( java.lang.String , org.springframework.boot.actuate.metrics.statsd.Metric<> . getValue ( ) . longValue ( ) ) ; } else { this . org.springframework.boot.actuate.metrics.statsd.StatsDClient . gauge ( java.lang.String , org.springframework.boot.actuate.metrics.statsd.Metric<> . getValue ( ) . doubleValue ( ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.boot.actuate.metrics.statsd.StatsDClient . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.actuate.metrics.statsd.Log . debug ( STRING + java.lang.Exception . java.lang.Class<? extends java.lang.Exception> ( ) + STRING + java.lang.Exception . java.lang.String ( ) ) ; }  <METHOD_END>