<METHOD_START> public void void ( UrlPathHelper org.springframework.web.servlet.resource.UrlPathHelper ) { this . org.springframework.web.servlet.resource.UrlPathHelper = org.springframework.web.servlet.resource.UrlPathHelper ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.resource.UrlPathHelper org.springframework.web.servlet.resource.UrlPathHelper ( ) { return this . org.springframework.web.servlet.resource.UrlPathHelper ; }  <METHOD_END>
<METHOD_START> public void void ( PathMatcher org.springframework.web.servlet.resource.PathMatcher ) { this . org.springframework.web.servlet.resource.PathMatcher = org.springframework.web.servlet.resource.PathMatcher ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.resource.PathMatcher org.springframework.web.servlet.resource.PathMatcher ( ) { return this . org.springframework.web.servlet.resource.PathMatcher ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> < java.lang.String , ResourceHttpRequestHandler > java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> ) { if ( java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> != null ) { this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . clear ( ) ; this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . putAll ( java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> ) ; this . boolean = false ; } }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> < java.lang.String , ResourceHttpRequestHandler > java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> ( ) { return this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ContextRefreshedEvent org.springframework.web.servlet.resource.ContextRefreshedEvent ) { if ( boolean ( ) ) { this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . clear ( ) ; void ( org.springframework.web.servlet.resource.ContextRefreshedEvent . getApplicationContext ( ) ) ; if ( this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . isEmpty ( ) && org.springframework.web.servlet.resource.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.resource.Log . debug ( STRING ) ; } if ( ! this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . isEmpty ( ) ) { this . boolean = false ; } } }  <METHOD_END>
<METHOD_START> protected void void ( ApplicationContext org.springframework.web.servlet.resource.ApplicationContext ) { org.springframework.web.servlet.resource.Log . debug ( STRING ) ; java.util.Map<java.lang.String,org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> < java.lang.String , SimpleUrlHandlerMapping > java.util.Map<java.lang.String,org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> = org.springframework.web.servlet.resource.ApplicationContext . getBeansOfType ( SimpleUrlHandlerMapping .class ) ; java.util.List<org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> < SimpleUrlHandlerMapping > java.util.List<org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> = new java.util.ArrayList <> ( java.util.Map<java.lang.String,org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> . values ( ) ) ; AnnotationAwareOrderComparator . sort ( java.util.List<org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> ) ; for ( SimpleUrlHandlerMapping org.springframework.web.servlet.resource.SimpleUrlHandlerMapping : java.util.List<org.springframework.web.servlet.resource.SimpleUrlHandlerMapping> ) { for ( java.lang.String java.lang.String : org.springframework.web.servlet.resource.SimpleUrlHandlerMapping . getHandlerMap ( ) . keySet ( ) ) { java.lang.Object java.lang.Object = org.springframework.web.servlet.resource.SimpleUrlHandlerMapping . getHandlerMap ( ) . get ( java.lang.String ) ; if ( java.lang.Object instanceof ResourceHttpRequestHandler ) { ResourceHttpRequestHandler org.springframework.web.servlet.resource.ResourceHttpRequestHandler = ( ResourceHttpRequestHandler ) java.lang.Object ; if ( org.springframework.web.servlet.resource.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.resource.Log . debug ( STRING + java.lang.String + STRING + STRING + org.springframework.web.servlet.resource.ResourceHttpRequestHandler . getLocations ( ) + STRING + STRING + org.springframework.web.servlet.resource.ResourceHttpRequestHandler . getResourceResolvers ( ) ) ; } this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . put ( java.lang.String , org.springframework.web.servlet.resource.ResourceHttpRequestHandler ) ; } } } }  <METHOD_END>
<METHOD_START> public final java.lang.String java.lang.String ( HttpServletRequest org.springframework.web.servlet.resource.HttpServletRequest , java.lang.String java.lang.String ) { if ( org.springframework.web.servlet.resource.Log . isTraceEnabled ( ) ) { org.springframework.web.servlet.resource.Log . trace ( STRING + java.lang.String + STRING ) ; } int int = int ( org.springframework.web.servlet.resource.HttpServletRequest ) ; int int = int ( java.lang.String ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( int , int ) ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; return ( java.lang.String != null ? java.lang.String + java.lang.String + java.lang.String : null ) ; }  <METHOD_END>
<METHOD_START> private int int ( HttpServletRequest org.springframework.web.servlet.resource.HttpServletRequest ) { UrlPathHelper org.springframework.web.servlet.resource.UrlPathHelper = org.springframework.web.servlet.resource.UrlPathHelper ( ) ; java.lang.String java.lang.String = org.springframework.web.servlet.resource.UrlPathHelper . getRequestUri ( org.springframework.web.servlet.resource.HttpServletRequest ) ; java.lang.String java.lang.String = org.springframework.web.servlet.resource.UrlPathHelper . getLookupPathForRequest ( org.springframework.web.servlet.resource.HttpServletRequest ) ; return java.lang.String . int ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private int int ( java.lang.String java.lang.String ) { int int = java.lang.String . int ( ) ; int int = java.lang.String . int ( STRING ) ; if( int > NUMBER ) { int = int ; } int int = java.lang.String . int ( STRING ) ; if( int > NUMBER ) { int = java.lang.Math . int ( int , int ) ; } return int ; }  <METHOD_END>
<METHOD_START> public final java.lang.String java.lang.String ( java.lang.String java.lang.String ) { if ( org.springframework.web.servlet.resource.Log . isTraceEnabled ( ) ) { org.springframework.web.servlet.resource.Log . trace ( STRING + java.lang.String + STRING ) ; } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . keySet ( ) ) { if ( org.springframework.web.servlet.resource.PathMatcher ( ) . match ( java.lang.String , java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } if ( ! java.util.List<java.lang.String> . boolean ( ) ) { java.util.Comparator<java.lang.String> < java.lang.String > java.util.Comparator<java.lang.String> = org.springframework.web.servlet.resource.PathMatcher ( ) . getPatternComparator ( java.lang.String ) ; java.util.Collections . void ( java.util.List<java.lang.String> , java.util.Comparator<java.lang.String> ) ; for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { java.lang.String java.lang.String = org.springframework.web.servlet.resource.PathMatcher ( ) . extractPathWithinPattern ( java.lang.String , java.lang.String ) ; java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , java.lang.String . int ( java.lang.String ) ) ; if ( org.springframework.web.servlet.resource.Log . isTraceEnabled ( ) ) { org.springframework.web.servlet.resource.Log . trace ( STRING + java.lang.String + STRING ) ; } ResourceHttpRequestHandler org.springframework.web.servlet.resource.ResourceHttpRequestHandler = this . java.util.Map<java.lang.String,org.springframework.web.servlet.resource.ResourceHttpRequestHandler> . get ( java.lang.String ) ; ResourceResolverChain org.springframework.web.servlet.resource.ResourceResolverChain = new DefaultResourceResolverChain ( org.springframework.web.servlet.resource.ResourceHttpRequestHandler . getResourceResolvers ( ) ) ; java.lang.String java.lang.String = org.springframework.web.servlet.resource.ResourceResolverChain . resolveUrlPath ( java.lang.String , org.springframework.web.servlet.resource.ResourceHttpRequestHandler . getLocations ( ) ) ; if ( java.lang.String == null ) { continue; } if ( org.springframework.web.servlet.resource.Log . isTraceEnabled ( ) ) { org.springframework.web.servlet.resource.Log . trace ( STRING + java.lang.String + STRING ) ; } return java.lang.String + java.lang.String ; } } if ( org.springframework.web.servlet.resource.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.resource.Log . debug ( STRING + java.lang.String + STRING ) ; } return null ; }  <METHOD_END>