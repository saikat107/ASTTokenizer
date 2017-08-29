<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; AnnotationConfigApplicationContext org.springframework.boot.autoconfigure.web.servlet.error.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.boot.autoconfigure.web.servlet.error.AnnotationConfigApplicationContext . refresh ( ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.ResourceProperties = new ResourceProperties ( ) ; TemplateAvailabilityProviders org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProviders = new org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolverTests.TestTemplateAvailabilityProviders ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver = new DefaultErrorViewResolver ( org.springframework.boot.autoconfigure.web.servlet.error.AnnotationConfigApplicationContext , this . org.springframework.boot.autoconfigure.web.servlet.error.ResourceProperties , org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProviders ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.ExpectedException . expectMessage ( STRING ) ; new DefaultErrorViewResolver ( null , new ResourceProperties ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.ExpectedException . expectMessage ( STRING ) ; new DefaultErrorViewResolver ( mock ( ApplicationContext .class ) , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider . isTemplateAvailable ( eq ( STRING ) , any ( Environment .class ) , any ( java.lang.ClassLoader .class ) , any ( ResourceLoader .class ) ) ) . willReturn ( true ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) . isNotNull ( ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView . getViewName ( ) ) . isEqualTo ( STRING ) ; verify ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider ) . isTemplateAvailable ( eq ( STRING ) , any ( Environment .class ) , any ( java.lang.ClassLoader .class ) , any ( ResourceLoader .class ) ) ; verifyNoMoreInteractions ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider . isTemplateAvailable ( eq ( STRING ) , any ( Environment .class ) , any ( java.lang.ClassLoader .class ) , any ( ResourceLoader .class ) ) ) . willReturn ( true ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . SERVICE_UNAVAILABLE , this . java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView . getViewName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider . isTemplateAvailable ( eq ( STRING ) , any ( Environment .class ) , any ( java.lang.ClassLoader .class ) , any ( ResourceLoader .class ) ) ) . willReturn ( true ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView . getViewName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; MockHttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse = org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentAsString ( ) . trim ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentType ( ) ) . isEqualTo ( MediaType . TEXT_HTML_VALUE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; MockHttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse = org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentAsString ( ) . trim ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentType ( ) ) . isEqualTo ( MediaType . TEXT_HTML_VALUE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . INTERNAL_SERVER_ERROR , this . java.util.Map<java.lang.String,java.lang.Object> ) ; MockHttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse = org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentAsString ( ) . trim ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentType ( ) ) . isEqualTo ( MediaType . TEXT_HTML_VALUE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; given ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider . isTemplateAvailable ( eq ( STRING ) , any ( Environment .class ) , any ( java.lang.ClassLoader .class ) , any ( ResourceLoader .class ) ) ) . willReturn ( true ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView . getViewName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING ) ; given ( this . org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider . isTemplateAvailable ( eq ( STRING ) , any ( Environment .class ) , any ( java.lang.ClassLoader .class ) , any ( ResourceLoader .class ) ) ) . willReturn ( true ) ; ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView = this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . resolveErrorView ( this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpStatus . NOT_FOUND , this . java.util.Map<java.lang.String,java.lang.Object> ) ; MockHttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse = org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ( org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentAsString ( ) . trim ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse . getContentType ( ) ) . isEqualTo ( MediaType . TEXT_HTML_VALUE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . getOrder ( ) ) . isEqualTo ( Ordered . LOWEST_PRECEDENCE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . setOrder ( NUMBER ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver . getOrder ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = java.lang.Class<? extends org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolverTests> ( ) . java.lang.Package ( ) . java.lang.String ( ) ; this . org.springframework.boot.autoconfigure.web.servlet.error.ResourceProperties . setStaticLocations ( new java.lang.String [] { STRING + java.lang.String . java.lang.String ( '.' , '/' ) + java.lang.String + STRING } ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ( ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView ) throws java.lang.Exception { MockHttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse = new MockHttpServletResponse ( ) ; org.springframework.boot.autoconfigure.web.servlet.error.ModelAndView . getView ( ) . render ( this . java.util.Map<java.lang.String,java.lang.Object> , this . org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ) ; return org.springframework.boot.autoconfigure.web.servlet.error.MockHttpServletResponse ; }  <METHOD_END>
<METHOD_START> void ( TemplateAvailabilityProvider org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider ) { super( java.util.Collections . java.util.List ( org.springframework.boot.autoconfigure.web.servlet.error.TemplateAvailabilityProvider ) ); }  <METHOD_END>