<METHOD_START> @ Before public void void ( ) java.lang.Exception { VersionResourceResolver org.springframework.web.servlet.resource.VersionResourceResolver = new VersionResourceResolver ( ) ; org.springframework.web.servlet.resource.VersionResourceResolver . setStrategyMap ( java.util.Collections . java.util.Map ( STRING , new ContentVersionStrategy ( ) ) ) ; PathResourceResolver org.springframework.web.servlet.resource.PathResourceResolver = new PathResourceResolver ( ) ; org.springframework.web.servlet.resource.PathResourceResolver . setAllowedLocations ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.ResourceUrlEncodingFilterTests> ( ) ) ) ; java.util.List<org.springframework.web.servlet.resource.ResourceResolver> < ResourceResolver > java.util.List<org.springframework.web.servlet.resource.ResourceResolver> = java.util.Arrays . java.util.List ( org.springframework.web.servlet.resource.VersionResourceResolver , org.springframework.web.servlet.resource.PathResourceResolver ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter = new ResourceUrlEncodingFilter ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlProvider = org.springframework.web.servlet.resource.ResourceUrlProvider ( java.util.List<org.springframework.web.servlet.resource.ResourceResolver> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockHttpServletRequest org.springframework.web.servlet.resource.MockHttpServletRequest = new MockHttpServletRequest ( STRING , STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setContextPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setServletPath ( STRING ) ; org.springframework.web.servlet.resource.MockHttpServletRequest . setAttribute ( ResourceUrlProviderExposingInterceptor . RESOURCE_URL_PROVIDER_ATTR , this . org.springframework.web.servlet.resource.ResourceUrlProvider ) ; MockHttpServletResponse org.springframework.web.servlet.resource.MockHttpServletResponse = new MockHttpServletResponse ( ) ; this . org.springframework.web.servlet.resource.ResourceUrlEncodingFilter . doFilter ( org.springframework.web.servlet.resource.MockHttpServletRequest , org.springframework.web.servlet.resource.MockHttpServletResponse , ( req , res ) -> { String result = ( ( HttpServletResponse ) res ) . encodeURL ( STRING ) ; assertEquals ( STRING , result ) ; } ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.resource.ResourceUrlProvider org.springframework.web.servlet.resource.ResourceUrlProvider ( java.util.List<org.springframework.web.servlet.resource.ResourceResolver> < ResourceResolver > java.util.List<org.springframework.web.servlet.resource.ResourceResolver> ) { ResourceHttpRequestHandler org.springframework.web.servlet.resource.ResourceHttpRequestHandler = new ResourceHttpRequestHandler ( ) ; org.springframework.web.servlet.resource.ResourceHttpRequestHandler . setLocations ( java.util.Arrays . java.util.List ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.web.servlet.resource.ResourceUrlEncodingFilterTests> ( ) ) ) ) ; org.springframework.web.servlet.resource.ResourceHttpRequestHandler . setResourceResolvers ( java.util.List<org.springframework.web.servlet.resource.ResourceResolver> ) ; ResourceUrlProvider org.springframework.web.servlet.resource.ResourceUrlProvider = new ResourceUrlProvider ( ) ; org.springframework.web.servlet.resource.ResourceUrlProvider . setHandlerMap ( java.util.Collections . java.util.Map ( STRING , org.springframework.web.servlet.resource.ResourceHttpRequestHandler ) ) ; return org.springframework.web.servlet.resource.ResourceUrlProvider ; }  <METHOD_END>