<METHOD_START> public void ( long long , WebRequest org.springframework.test.web.servlet.htmlunit.WebRequest , MockHttpServletResponse org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse ) { Assert . notNull ( org.springframework.test.web.servlet.htmlunit.WebRequest , STRING ) ; Assert . notNull ( org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse , STRING ) ; this . long = long ; this . org.springframework.test.web.servlet.htmlunit.WebRequest = org.springframework.test.web.servlet.htmlunit.WebRequest ; this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse = org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.htmlunit.WebResponse org.springframework.test.web.servlet.htmlunit.WebResponse ( ) java.io.IOException { WebResponseData org.springframework.test.web.servlet.htmlunit.WebResponseData = org.springframework.test.web.servlet.htmlunit.WebResponseData ( ) ; long long = java.lang.System . long ( ) ; return new WebResponse ( org.springframework.test.web.servlet.htmlunit.WebResponseData , org.springframework.test.web.servlet.htmlunit.WebRequest , long - long ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.htmlunit.WebResponseData org.springframework.test.web.servlet.htmlunit.WebResponseData ( ) java.io.IOException { java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> < NameValuePair > java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> = java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> ( ) ; int int = ( this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getRedirectedUrl ( ) != null ? HttpStatus . MOVED_PERMANENTLY . value ( ) : this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getStatus ( ) ) ; java.lang.String java.lang.String = java.lang.String ( int ) ; return new WebResponseData ( this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getContentAsByteArray ( ) , int , java.lang.String , java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( int int ) { java.lang.String java.lang.String = this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getErrorMessage ( ) ; if ( StringUtils . hasText ( java.lang.String ) ) { return java.lang.String ; } try { return HttpStatus . valueOf ( int ) . getReasonPhrase ( ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> < NameValuePair > java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> ( ) { java.util.Collection<java.lang.String> < java.lang.String > java.util.Collection<java.lang.String> = this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getHeaderNames ( ) ; java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> < NameValuePair > java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> = new java.util.ArrayList<org.springframework.test.web.servlet.htmlunit.NameValuePair> <> ( java.util.Collection<java.lang.String> . int ( ) ) ; for ( java.lang.String java.lang.String : java.util.Collection<java.lang.String> ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getHeaderValues ( java.lang.String ) ; for ( java.lang.Object java.lang.Object : java.util.List<java.lang.Object> ) { java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> . add ( new NameValuePair ( java.lang.String , java.lang.String . java.lang.String ( java.lang.Object ) ) ) ; } } java.lang.String java.lang.String = this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getRedirectedUrl ( ) ; if ( java.lang.String != null ) { java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> . add ( new NameValuePair ( STRING , java.lang.String ) ) ; } for ( Cookie org.springframework.test.web.servlet.htmlunit.Cookie : this . org.springframework.test.web.servlet.htmlunit.MockHttpServletResponse . getCookies ( ) ) { java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> . add ( new NameValuePair ( STRING , java.lang.String ( org.springframework.test.web.servlet.htmlunit.Cookie ) ) ) ; } return java.util.List<org.springframework.test.web.servlet.htmlunit.NameValuePair> ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( Cookie org.springframework.test.web.servlet.htmlunit.Cookie ) { return com.gargoylesoftware.htmlunit.util.Cookie ( org.springframework.test.web.servlet.htmlunit.Cookie ) . toString ( ) ; }  <METHOD_END>
<METHOD_START> static com . com.gargoylesoftware . com.gargoylesoftware . com.gargoylesoftware . com.gargoylesoftware.htmlunit.util.Cookie com.gargoylesoftware.htmlunit.util.Cookie ( Cookie org.springframework.test.web.servlet.htmlunit.Cookie ) { java.util.Date java.util.Date = null ; if ( org.springframework.test.web.servlet.htmlunit.Cookie . getMaxAge ( ) > - NUMBER ) { java.util.Date = new java.util.Date ( java.lang.System . long ( ) + org.springframework.test.web.servlet.htmlunit.Cookie . getMaxAge ( ) * NUMBER ) ; } BasicClientCookie org.springframework.test.web.servlet.htmlunit.BasicClientCookie = new BasicClientCookie ( org.springframework.test.web.servlet.htmlunit.Cookie . getName ( ) , org.springframework.test.web.servlet.htmlunit.Cookie . getValue ( ) ) ; org.springframework.test.web.servlet.htmlunit.BasicClientCookie . setDomain ( org.springframework.test.web.servlet.htmlunit.Cookie . getDomain ( ) ) ; org.springframework.test.web.servlet.htmlunit.BasicClientCookie . setComment ( org.springframework.test.web.servlet.htmlunit.Cookie . getComment ( ) ) ; org.springframework.test.web.servlet.htmlunit.BasicClientCookie . setExpiryDate ( java.util.Date ) ; org.springframework.test.web.servlet.htmlunit.BasicClientCookie . setPath ( org.springframework.test.web.servlet.htmlunit.Cookie . getPath ( ) ) ; org.springframework.test.web.servlet.htmlunit.BasicClientCookie . setSecure ( org.springframework.test.web.servlet.htmlunit.Cookie . getSecure ( ) ) ; if ( org.springframework.test.web.servlet.htmlunit.Cookie . isHttpOnly ( ) ) { org.springframework.test.web.servlet.htmlunit.BasicClientCookie . setAttribute ( STRING , STRING ) ; } return new com . com.gargoylesoftware . com.gargoylesoftware . com.gargoylesoftware . com.gargoylesoftware ( org.springframework.test.web.servlet.htmlunit.BasicClientCookie ) ; }  <METHOD_END>