<METHOD_START> void ( CounterService org.springframework.boot.actuate.autoconfigure.CounterService , GaugeService org.springframework.boot.actuate.autoconfigure.GaugeService , MetricFilterProperties org.springframework.boot.actuate.autoconfigure.MetricFilterProperties ) { this . org.springframework.boot.actuate.autoconfigure.CounterService = org.springframework.boot.actuate.autoconfigure.CounterService ; this . org.springframework.boot.actuate.autoconfigure.GaugeService = org.springframework.boot.actuate.autoconfigure.GaugeService ; this . org.springframework.boot.actuate.autoconfigure.MetricFilterProperties = org.springframework.boot.actuate.autoconfigure.MetricFilterProperties ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.boot.actuate.autoconfigure.HttpServletRequest , HttpServletResponse org.springframework.boot.actuate.autoconfigure.HttpServletResponse , FilterChain org.springframework.boot.actuate.autoconfigure.FilterChain )					throws org.springframework.boot.actuate.autoconfigure.ServletException , java.io.IOException { StopWatch org.springframework.boot.actuate.autoconfigure.StopWatch = org.springframework.boot.actuate.autoconfigure.StopWatch ( org.springframework.boot.actuate.autoconfigure.HttpServletRequest ) ; java.lang.String java.lang.String = new UrlPathHelper ( ) . getPathWithinApplication ( org.springframework.boot.actuate.autoconfigure.HttpServletRequest ) ; int int = HttpStatus . INTERNAL_SERVER_ERROR . value ( ) ; try { org.springframework.boot.actuate.autoconfigure.FilterChain . doFilter ( org.springframework.boot.actuate.autoconfigure.HttpServletRequest , org.springframework.boot.actuate.autoconfigure.HttpServletResponse ) ; int = int ( org.springframework.boot.actuate.autoconfigure.HttpServletResponse ) ; } finally { if ( ! org.springframework.boot.actuate.autoconfigure.HttpServletRequest . isAsyncStarted ( ) ) { if ( org.springframework.boot.actuate.autoconfigure.HttpServletResponse . isCommitted ( ) ) { int = int ( org.springframework.boot.actuate.autoconfigure.HttpServletResponse ) ; } org.springframework.boot.actuate.autoconfigure.StopWatch . stop ( ) ; org.springframework.boot.actuate.autoconfigure.HttpServletRequest . removeAttribute ( java.lang.String ) ; void ( org.springframework.boot.actuate.autoconfigure.HttpServletRequest , java.lang.String , int , org.springframework.boot.actuate.autoconfigure.StopWatch . getTotalTimeMillis ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.autoconfigure.StopWatch org.springframework.boot.actuate.autoconfigure.StopWatch ( HttpServletRequest org.springframework.boot.actuate.autoconfigure.HttpServletRequest ) { StopWatch org.springframework.boot.actuate.autoconfigure.StopWatch = ( StopWatch ) org.springframework.boot.actuate.autoconfigure.HttpServletRequest . getAttribute ( java.lang.String ) ; if ( org.springframework.boot.actuate.autoconfigure.StopWatch == null ) { org.springframework.boot.actuate.autoconfigure.StopWatch = new StopWatch ( ) ; org.springframework.boot.actuate.autoconfigure.StopWatch . start ( ) ; org.springframework.boot.actuate.autoconfigure.HttpServletRequest . setAttribute ( java.lang.String , org.springframework.boot.actuate.autoconfigure.StopWatch ) ; } return org.springframework.boot.actuate.autoconfigure.StopWatch ; }  <METHOD_END>
<METHOD_START> private int int ( HttpServletResponse org.springframework.boot.actuate.autoconfigure.HttpServletResponse ) { try { return org.springframework.boot.actuate.autoconfigure.HttpServletResponse . getStatus ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { return int ; } }  <METHOD_END>
<METHOD_START> private void void ( HttpServletRequest org.springframework.boot.actuate.autoconfigure.HttpServletRequest , java.lang.String java.lang.String , int int , long long ) { java.lang.String java.lang.String = java.lang.String ( org.springframework.boot.actuate.autoconfigure.HttpServletRequest , java.lang.String , int ) ; void ( MetricsFilterSubmission . MERGED , org.springframework.boot.actuate.autoconfigure.HttpServletRequest , int , long , java.lang.String ) ; void ( MetricsFilterSubmission . PER_HTTP_METHOD , org.springframework.boot.actuate.autoconfigure.HttpServletRequest , int , long , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( HttpServletRequest org.springframework.boot.actuate.autoconfigure.HttpServletRequest , java.lang.String java.lang.String , int int ) { java.lang.Object java.lang.Object = org.springframework.boot.actuate.autoconfigure.HttpServletRequest . getAttribute ( HandlerMapping . BEST_MATCHING_PATTERN_ATTRIBUTE ) ; if ( java.lang.Object != null ) { return java.lang.String ( java.lang.Object . java.lang.String ( ) ) ; } Series org.springframework.boot.actuate.autoconfigure.Series = org.springframework.boot.actuate.autoconfigure.Series ( int ) ; if ( Series . CLIENT_ERROR . equals ( org.springframework.boot.actuate.autoconfigure.Series ) || Series . SERVER_ERROR . equals ( org.springframework.boot.actuate.autoconfigure.Series ) || Series . REDIRECTION . equals ( org.springframework.boot.actuate.autoconfigure.Series ) ) { return java.lang.String ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = java.lang.String ; for ( org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer : java.util.Set<org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer> ) { java.lang.String = org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer . java.lang.String ( java.lang.String ) ; } if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( ) - NUMBER ) ; } if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.actuate.autoconfigure.Series org.springframework.boot.actuate.autoconfigure.Series ( int int ) { try { return HttpStatus . valueOf ( int ) . series ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { return null ; } }  <METHOD_END>
<METHOD_START> private void void ( MetricsFilterSubmission org.springframework.boot.actuate.autoconfigure.MetricsFilterSubmission , HttpServletRequest org.springframework.boot.actuate.autoconfigure.HttpServletRequest , int int , long long , java.lang.String java.lang.String ) { java.lang.String java.lang.String = STRING ; if ( org.springframework.boot.actuate.autoconfigure.MetricsFilterSubmission == MetricsFilterSubmission . PER_HTTP_METHOD ) { java.lang.String = org.springframework.boot.actuate.autoconfigure.HttpServletRequest . getMethod ( ) + STRING ; } if ( this . org.springframework.boot.actuate.autoconfigure.MetricFilterProperties . shouldSubmitToGauge ( org.springframework.boot.actuate.autoconfigure.MetricsFilterSubmission ) ) { void ( java.lang.String ( STRING + java.lang.String + java.lang.String ) , long ) ; } if ( this . org.springframework.boot.actuate.autoconfigure.MetricFilterProperties . shouldSubmitToCounter ( org.springframework.boot.actuate.autoconfigure.MetricsFilterSubmission ) ) { void ( java.lang.String ( STRING + java.lang.String + int + java.lang.String ) ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = java.lang.String ; for ( org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer : java.util.Set<org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer> ) { java.lang.String = org.springframework.boot.actuate.autoconfigure.MetricsFilter.PatternReplacer . java.lang.String ( java.lang.String ) ; } if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } if ( java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String . java.lang.String ( NUMBER ) ; } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , double double ) { try { this . org.springframework.boot.actuate.autoconfigure.GaugeService . submit ( java.lang.String , double ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.actuate.autoconfigure.Log . warn ( STRING + java.lang.String + STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { try { this . org.springframework.boot.actuate.autoconfigure.CounterService . increment ( java.lang.String ) ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.boot.actuate.autoconfigure.Log . warn ( STRING + java.lang.String + STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String , int int , java.lang.String java.lang.String ) { this . java.util.regex.Pattern = java.util.regex.Pattern . java.util.regex.Pattern ( java.lang.String , int ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return this . java.util.regex.Pattern . java.util.regex.Matcher ( java.lang.String ) . java.lang.String ( this . java.lang.String ) ; }  <METHOD_END>