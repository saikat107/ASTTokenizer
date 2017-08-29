<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.tests.aop.interceptor.MethodInvocation ) throws java.lang.Throwable { void ( ) ; return org.springframework.tests.aop.interceptor.MethodInvocation . proceed ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { this . int ++ ; }  <METHOD_END>
<METHOD_START> public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( ! ( java.lang.Object instanceof org.springframework.tests.aop.interceptor.NopInterceptor ) ) { return false ; } if ( this == java.lang.Object ) { return true ; } return this . int == ( ( org.springframework.tests.aop.interceptor.NopInterceptor ) java.lang.Object ) . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.tests.aop.interceptor.NopInterceptor .class . int ( ) ; }  <METHOD_END>
