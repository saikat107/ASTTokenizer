<METHOD_START> @ Before public void void ( ) java.lang.Exception { org.springframework.web.method.annotation.WebArgumentResolver = mock ( WebArgumentResolver .class ) ; org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter = new org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter ( org.springframework.web.method.annotation.WebArgumentResolver ) ; org.springframework.web.method.annotation.MethodParameter = new MethodParameter ( java.lang.Class<? extends org.springframework.web.method.annotation.WebArgumentResolverAdapterTests> ( ) . java.lang.reflect.Method ( STRING , java.lang.Integer . java.lang.Class<java.lang.Integer> ) , NUMBER ) ; org.springframework.web.method.annotation.NativeWebRequest = new ServletWebRequest ( new MockHttpServletRequest ( ) ) ; RequestContextHolder . setRequestAttributes ( org.springframework.web.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { RequestContextHolder . resetRequestAttributes ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willReturn ( NUMBER ) ; assertTrue ( STRING , org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; verify ( org.springframework.web.method.annotation.WebArgumentResolver ) . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willReturn ( WebArgumentResolver . UNRESOLVED ) ; assertFalse ( STRING , org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; verify ( org.springframework.web.method.annotation.WebArgumentResolver ) . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willReturn ( STRING ) ; assertFalse ( STRING , org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; verify ( org.springframework.web.method.annotation.WebArgumentResolver ) . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willThrow ( new java.lang.Exception ( ) ) ; assertFalse ( STRING , org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . supportsParameter ( org.springframework.web.method.annotation.MethodParameter ) ) ; verify ( org.springframework.web.method.annotation.WebArgumentResolver ) . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { int int = NUMBER ; given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willReturn ( int ) ; java.lang.Object java.lang.Object = org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , null , org.springframework.web.method.annotation.NativeWebRequest , null ) ; assertEquals ( STRING , int , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willReturn ( WebArgumentResolver . UNRESOLVED ) ; org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , null , org.springframework.web.method.annotation.NativeWebRequest , null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willReturn ( STRING ) ; org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , null , org.springframework.web.method.annotation.NativeWebRequest , null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.Exception .class ) public void void ( ) java.lang.Exception { given ( org.springframework.web.method.annotation.WebArgumentResolver . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , org.springframework.web.method.annotation.NativeWebRequest ) ) . willThrow ( new java.lang.Exception ( ) ) ; org.springframework.web.method.annotation.WebArgumentResolverAdapterTests.TestWebArgumentResolverAdapter . resolveArgument ( org.springframework.web.method.annotation.MethodParameter , null , org.springframework.web.method.annotation.NativeWebRequest , null ) ; }  <METHOD_END>
<METHOD_START> public void void ( int int ) {	}  <METHOD_END>
<METHOD_START> public void ( WebArgumentResolver org.springframework.web.method.annotation.WebArgumentResolver ) { super( org.springframework.web.method.annotation.WebArgumentResolver ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.method.annotation.NativeWebRequest org.springframework.web.method.annotation.NativeWebRequest ( ) { return org.springframework.web.method.annotation.WebArgumentResolverAdapterTests .this . org.springframework.web.method.annotation.NativeWebRequest ; }  <METHOD_END>