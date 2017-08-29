<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( boolean boolean ) { setUseDynamicLogger ( boolean ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.interceptor.MethodInvocation ) throws java.lang.Throwable { synchronized ( this ) { this . long ++ ; } return super. invoke ( org.springframework.aop.interceptor.MethodInvocation ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( MethodInvocation org.springframework.aop.interceptor.MethodInvocation ) { return org.springframework.aop.interceptor.MethodInvocation + STRING + this . long ; }  <METHOD_END>
<METHOD_START> public long long ( ) { return this . long ; }  <METHOD_END>
<METHOD_START> public synchronized void void ( ) { this . long = NUMBER ; }  <METHOD_END>
