<METHOD_START> public void ( java.lang.Object java.lang.Object ) { this( java.lang.Object , ( HandlerInterceptor [] ) null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , HandlerInterceptor ... org.springframework.web.servlet.HandlerInterceptor[] ) { if ( java.lang.Object instanceof org.springframework.web.servlet.HandlerExecutionChain ) { org.springframework.web.servlet.HandlerExecutionChain org.springframework.web.servlet.HandlerExecutionChain = ( org.springframework.web.servlet.HandlerExecutionChain ) java.lang.Object ; this . java.lang.Object = org.springframework.web.servlet.HandlerExecutionChain . java.lang.Object ( ) ; this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> = new java.util.ArrayList <> ( ) ; CollectionUtils . mergeArrayIntoCollection ( org.springframework.web.servlet.HandlerExecutionChain . org.springframework.web.servlet.HandlerInterceptor[] ( ) , this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> ) ; CollectionUtils . mergeArrayIntoCollection ( org.springframework.web.servlet.HandlerInterceptor[] , this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> ) ; } else { this . java.lang.Object = java.lang.Object ; this . org.springframework.web.servlet.HandlerInterceptor[] = org.springframework.web.servlet.HandlerInterceptor[] ; } }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( HandlerInterceptor org.springframework.web.servlet.HandlerInterceptor ) { java.util.List<org.springframework.web.servlet.HandlerInterceptor> ( ) . add ( org.springframework.web.servlet.HandlerInterceptor ) ; }  <METHOD_END>
<METHOD_START> public void void ( HandlerInterceptor ... org.springframework.web.servlet.HandlerInterceptor[] ) { if ( ! ObjectUtils . isEmpty ( org.springframework.web.servlet.HandlerInterceptor[] ) ) { java.util.List<org.springframework.web.servlet.HandlerInterceptor> ( ) . addAll ( java.util.Arrays . java.util.List ( org.springframework.web.servlet.HandlerInterceptor[] ) ) ; } }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.web.servlet.HandlerInterceptor> < HandlerInterceptor > java.util.List<org.springframework.web.servlet.HandlerInterceptor> ( ) { if ( this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> == null ) { this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> = new java.util.ArrayList <> ( ) ; if ( this . org.springframework.web.servlet.HandlerInterceptor[] != null ) { this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> . addAll ( java.util.Arrays . java.util.List ( this . org.springframework.web.servlet.HandlerInterceptor[] ) ) ; } } this . org.springframework.web.servlet.HandlerInterceptor[] = null ; return this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.HandlerInterceptor [] org.springframework.web.servlet.HandlerInterceptor[] ( ) { if ( this . org.springframework.web.servlet.HandlerInterceptor[] == null && this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> != null ) { this . org.springframework.web.servlet.HandlerInterceptor[] = this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> . toArray ( new HandlerInterceptor [ this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> . size ( ) ] ) ; } return this . org.springframework.web.servlet.HandlerInterceptor[] ; }  <METHOD_END>
<METHOD_START> boolean boolean ( HttpServletRequest org.springframework.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.HttpServletResponse ) throws java.lang.Exception { HandlerInterceptor [] org.springframework.web.servlet.HandlerInterceptor[] = org.springframework.web.servlet.HandlerInterceptor[] ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.web.servlet.HandlerInterceptor[] ) ) { for ( int int = NUMBER ; int < interceptors . length ; int ++ ) { HandlerInterceptor org.springframework.web.servlet.HandlerInterceptor = org.springframework.web.servlet.HandlerInterceptor[] [ int ] ; if ( ! org.springframework.web.servlet.HandlerInterceptor . preHandle ( org.springframework.web.servlet.HttpServletRequest , org.springframework.web.servlet.HttpServletResponse , this . java.lang.Object ) ) { void ( org.springframework.web.servlet.HttpServletRequest , org.springframework.web.servlet.HttpServletResponse , null ) ; return false ; } this . int = int ; } } return true ; }  <METHOD_END>
<METHOD_START> void void ( HttpServletRequest org.springframework.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.HttpServletResponse , ModelAndView org.springframework.web.servlet.ModelAndView ) throws java.lang.Exception { HandlerInterceptor [] org.springframework.web.servlet.HandlerInterceptor[] = org.springframework.web.servlet.HandlerInterceptor[] ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.web.servlet.HandlerInterceptor[] ) ) { for ( int int = interceptors . length - NUMBER ; int >= NUMBER ; int -- ) { HandlerInterceptor org.springframework.web.servlet.HandlerInterceptor = org.springframework.web.servlet.HandlerInterceptor[] [ int ] ; org.springframework.web.servlet.HandlerInterceptor . postHandle ( org.springframework.web.servlet.HttpServletRequest , org.springframework.web.servlet.HttpServletResponse , this . java.lang.Object , org.springframework.web.servlet.ModelAndView ) ; } } }  <METHOD_END>
<METHOD_START> void void ( HttpServletRequest org.springframework.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.HttpServletResponse , java.lang.Exception java.lang.Exception )			throws java.lang.Exception { HandlerInterceptor [] org.springframework.web.servlet.HandlerInterceptor[] = org.springframework.web.servlet.HandlerInterceptor[] ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.web.servlet.HandlerInterceptor[] ) ) { for ( int int = this . int ; int >= NUMBER ; int -- ) { HandlerInterceptor org.springframework.web.servlet.HandlerInterceptor = org.springframework.web.servlet.HandlerInterceptor[] [ int ] ; try { org.springframework.web.servlet.HandlerInterceptor . afterCompletion ( org.springframework.web.servlet.HttpServletRequest , org.springframework.web.servlet.HttpServletResponse , this . java.lang.Object , java.lang.Exception ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.web.servlet.Log . error ( STRING , java.lang.Throwable ) ; } } } }  <METHOD_END>
<METHOD_START> void void ( HttpServletRequest org.springframework.web.servlet.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.HttpServletResponse ) { HandlerInterceptor [] org.springframework.web.servlet.HandlerInterceptor[] = org.springframework.web.servlet.HandlerInterceptor[] ( ) ; if ( ! ObjectUtils . isEmpty ( org.springframework.web.servlet.HandlerInterceptor[] ) ) { for ( int int = interceptors . length - NUMBER ; int >= NUMBER ; int -- ) { if ( org.springframework.web.servlet.HandlerInterceptor[] [ int ] instanceof AsyncHandlerInterceptor ) { try { AsyncHandlerInterceptor org.springframework.web.servlet.AsyncHandlerInterceptor = ( AsyncHandlerInterceptor ) org.springframework.web.servlet.HandlerInterceptor[] [ int ] ; org.springframework.web.servlet.AsyncHandlerInterceptor . afterConcurrentHandlingStarted ( org.springframework.web.servlet.HttpServletRequest , org.springframework.web.servlet.HttpServletResponse , this . java.lang.Object ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { org.springframework.web.servlet.Log . error ( STRING + org.springframework.web.servlet.HandlerInterceptor[] [ int ] + STRING , java.lang.Throwable ) ; } } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { if ( this . java.lang.Object == null ) { return STRING ; } java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( this . java.lang.Object ) . java.lang.StringBuilder ( STRING ) ; if ( ! CollectionUtils . isEmpty ( this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> ) ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) . java.lang.StringBuilder ( this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> . size ( ) ) . append ( STRING ) ; if ( this . java.util.List<org.springframework.web.servlet.HandlerInterceptor> . size ( ) > NUMBER ) { java.lang.StringBuilder . java.lang.StringBuilder ( STRING ) ; } } return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>