<METHOD_START> @ java.lang.Override public void void ( ) { this . boolean = true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . boolean = false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( MethodInvocation test.mixin.MethodInvocation ) throws java.lang.Throwable { if ( boolean ( ) && test.mixin.MethodInvocation . getMethod ( ) . getName ( ) . indexOf ( STRING ) == NUMBER ) throw new LockedException ( ) ; return super. invoke ( test.mixin.MethodInvocation ) ; }  <METHOD_END>
