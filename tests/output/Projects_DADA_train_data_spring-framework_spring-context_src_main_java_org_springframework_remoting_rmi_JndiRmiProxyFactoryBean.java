<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) javax.naming.NamingException { super. afterPropertiesSet ( ) ; if ( getServiceInterface ( ) == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } this . java.lang.Object = new ProxyFactory ( getServiceInterface ( ) , this ) . getProxy ( this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return getServiceInterface ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
