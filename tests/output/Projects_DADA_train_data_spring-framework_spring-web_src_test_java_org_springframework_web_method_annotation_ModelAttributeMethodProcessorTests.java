<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.web.method.annotation.NativeWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer = new ModelAndViewContainer ( ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor = new ModelAttributeMethodProcessor ( false ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.ModelAttributeHandler .class . java.lang.reflect.Method ( STRING , TestBean .class , Errors .class , int .class , TestBean .class , TestBean .class , TestBean .class ) ; this . org.springframework.web.method.annotation.MethodParameter = new SynthesizingMethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.method.annotation.MethodParameter = new SynthesizingMethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.method.annotation.MethodParameter = new SynthesizingMethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.method.annotation.MethodParameter = new SynthesizingMethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.method.annotation.MethodParameter = new SynthesizingMethodParameter ( java.lang.reflect.Method , NUMBER ) ; this . org.springframework.web.method.annotation.MethodParameter = new SynthesizingMethodParameter ( java.lang.reflect.Method , NUMBER ) ; java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests> ( ) . java.lang.reflect.Method ( STRING ) ; this . org.springframework.web.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , - NUMBER ) ; java.lang.reflect.Method = java.lang.Class<? extends org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests> ( ) . java.lang.reflect.Method ( STRING ) ; this . org.springframework.web.method.annotation.MethodParameter = new MethodParameter ( java.lang.reflect.Method , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.ModelAttributeMethodProcessor = new ModelAttributeMethodProcessor ( true ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsParameter ( this . org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.ModelAttributeMethodProcessor = new ModelAttributeMethodProcessor ( false ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsReturnType ( org.springframework.web.method.annotation.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsReturnType ( org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.ModelAttributeMethodProcessor = new ModelAttributeMethodProcessor ( true ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsReturnType ( org.springframework.web.method.annotation.MethodParameter ) ) ; assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . supportsReturnType ( org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . isBindExceptionRequired ( null , this . org.springframework.web.method.annotation.MethodParameter ) ) ; assertFalse ( this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . isBindExceptionRequired ( null , this . org.springframework.web.method.annotation.MethodParameter ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( STRING , this . org.springframework.web.method.annotation.MethodParameter ) ; void ( STRING , this . org.springframework.web.method.annotation.MethodParameter ) ; void ( STRING , this . org.springframework.web.method.annotation.MethodParameter ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebDataBinder org.springframework.web.method.annotation.WebDataBinder = new WebRequestDataBinder ( null ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( any ( ) , notNull ( ) , eq ( STRING ) ) ) . willReturn ( org.springframework.web.method.annotation.WebDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; verify ( org.springframework.web.method.annotation.WebDataBinderFactory ) . createBinder ( any ( ) , notNull ( ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new TestBean ( ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( java.lang.String , java.lang.Object ) ; org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder = new org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ( java.lang.Object , java.lang.String ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ) . willReturn ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; assertTrue ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . boolean ( ) ) ; assertTrue ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new TestBean ( ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( java.lang.String , java.lang.Object ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . setBindingDisabled ( java.lang.String ) ; org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder = new org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ( java.lang.Object , java.lang.String ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ) . willReturn ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; assertFalse ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . boolean ( ) ) ; assertTrue ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new TestBean ( ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( java.lang.String , java.lang.Object ) ; org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder = new org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ( java.lang.Object , java.lang.String ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ) . willReturn ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; assertFalse ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . boolean ( ) ) ; assertTrue ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . boolean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = BindException .class ) public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new TestBean ( ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . addAttribute ( java.lang.Object ) ; org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder = new org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ( java.lang.Object , java.lang.String ) ; org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . getBindingResult ( ) . reject ( STRING ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ) . willReturn ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; verify ( org.springframework.web.method.annotation.WebDataBinderFactory ) . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new TestBean ( java.lang.String ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( java.lang.String , java.lang.Object ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( BindingResult . MODEL_KEY_PREFIX + java.lang.String , java.lang.Object ) ; java.lang.Object java.lang.Object = new TestBean ( ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( STRING , java.lang.Object ) ; org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder = new org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ( java.lang.Object , java.lang.String ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ) . willReturn ( org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; java.lang.Object [] java.lang.Object[] = this . org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . values ( ) . toArray ( ) ; assertSame ( STRING , java.lang.Object , java.lang.Object[] [ NUMBER ] ) ; assertSame ( STRING , org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.StubRequestDataBinder . getBindingResult ( ) , java.lang.Object[] [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . handleReturnValue ( STRING , this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest ) ; assertEquals ( STRING , this . org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestBean org.springframework.web.method.annotation.TestBean = new TestBean ( STRING ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . handleReturnValue ( org.springframework.web.method.annotation.TestBean , this . org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest ) ; assertSame ( org.springframework.web.method.annotation.TestBean , this . org.springframework.web.method.annotation.ModelAndViewContainer . getModel ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , MethodParameter org.springframework.web.method.annotation.MethodParameter ) throws java.lang.Exception { java.lang.Object java.lang.Object = new TestBean ( ) ; this . org.springframework.web.method.annotation.ModelAndViewContainer . addAttribute ( java.lang.String , java.lang.Object ) ; WebDataBinder org.springframework.web.method.annotation.WebDataBinder = new WebRequestDataBinder ( java.lang.Object ) ; WebDataBinderFactory org.springframework.web.method.annotation.WebDataBinderFactory = mock ( WebDataBinderFactory .class ) ; given ( org.springframework.web.method.annotation.WebDataBinderFactory . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ) . willReturn ( org.springframework.web.method.annotation.WebDataBinder ) ; this . org.springframework.web.method.annotation.ModelAttributeMethodProcessor . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , this . org.springframework.web.method.annotation.ModelAndViewContainer , this . org.springframework.web.method.annotation.NativeWebRequest , org.springframework.web.method.annotation.WebDataBinderFactory ) ; verify ( org.springframework.web.method.annotation.WebDataBinderFactory ) . createBinder ( this . org.springframework.web.method.annotation.NativeWebRequest , java.lang.Object , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { super( java.lang.Object , java.lang.String ); }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( WebRequest org.springframework.web.method.annotation.WebRequest ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object ... java.lang.Object[] ) { boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( @ ModelAttribute ( STRING ) @ org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.Valid TestBean org.springframework.web.method.annotation.TestBean , Errors org.springframework.web.method.annotation.Errors , int int , @ ModelAttribute TestBean org.springframework.web.method.annotation.TestBean , @ ModelAttribute ( name = STRING , binding = false ) @ org.springframework.web.method.annotation.ModelAttributeMethodProcessorTests.Valid TestBean org.springframework.web.method.annotation.TestBean , TestBean org.springframework.web.method.annotation.TestBean ) {		}  <METHOD_END>
<METHOD_START> @ ModelAttribute ( STRING ) @ java.lang.SuppressWarnings ( STRING ) private java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.web.method.annotation.TestBean org.springframework.web.method.annotation.TestBean ( ) { return null ; }  <METHOD_END>