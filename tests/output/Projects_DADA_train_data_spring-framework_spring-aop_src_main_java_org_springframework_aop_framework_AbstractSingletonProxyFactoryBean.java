<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > [] java.lang.Class<?>[] ) { this . java.lang.Class<?>[] = java.lang.Class<?>[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object [] java.lang.Object[] ) { this . java.lang.Object[] = java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object [] java.lang.Object[] ) { this . java.lang.Object[] = java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> public void void ( AdvisorAdapterRegistry org.springframework.aop.framework.AdvisorAdapterRegistry ) { this . org.springframework.aop.framework.AdvisorAdapterRegistry = org.springframework.aop.framework.AdvisorAdapterRegistry ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { if ( this . java.lang.ClassLoader == null ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . java.lang.Object == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } if ( this . java.lang.Object instanceof java.lang.String ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } if ( this . java.lang.ClassLoader == null ) { this . java.lang.ClassLoader = ClassUtils . getDefaultClassLoader ( ) ; } ProxyFactory org.springframework.aop.framework.ProxyFactory = new ProxyFactory ( ) ; if ( this . java.lang.Object[] != null ) { for ( java.lang.Object java.lang.Object : this . java.lang.Object[] ) { org.springframework.aop.framework.ProxyFactory . addAdvisor ( this . org.springframework.aop.framework.AdvisorAdapterRegistry . wrap ( java.lang.Object ) ) ; } } org.springframework.aop.framework.ProxyFactory . addAdvisor ( this . org.springframework.aop.framework.AdvisorAdapterRegistry . wrap ( java.lang.Object ( ) ) ) ; if ( this . java.lang.Object[] != null ) { for ( java.lang.Object java.lang.Object : this . java.lang.Object[] ) { org.springframework.aop.framework.ProxyFactory . addAdvisor ( this . org.springframework.aop.framework.AdvisorAdapterRegistry . wrap ( java.lang.Object ) ) ; } } org.springframework.aop.framework.ProxyFactory . copyFrom ( this ) ; TargetSource org.springframework.aop.framework.TargetSource = org.springframework.aop.framework.TargetSource ( this . java.lang.Object ) ; org.springframework.aop.framework.ProxyFactory . setTargetSource ( org.springframework.aop.framework.TargetSource ) ; if ( this . java.lang.Class<?>[] != null ) { org.springframework.aop.framework.ProxyFactory . setInterfaces ( this . java.lang.Class<?>[] ) ; } else if ( ! isProxyTargetClass ( ) ) { org.springframework.aop.framework.ProxyFactory . setInterfaces ( ClassUtils . getAllInterfacesForClass ( org.springframework.aop.framework.TargetSource . getTargetClass ( ) , this . java.lang.ClassLoader ) ) ; } void ( org.springframework.aop.framework.ProxyFactory ) ; this . java.lang.Object = org.springframework.aop.framework.ProxyFactory . getProxy ( this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.aop.framework.TargetSource org.springframework.aop.framework.TargetSource ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof TargetSource ) { return ( TargetSource ) java.lang.Object ; } else { return new SingletonTargetSource ( java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( ProxyFactory org.springframework.aop.framework.ProxyFactory ) {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) { if ( this . java.lang.Object == null ) { throw new FactoryBeanNotInitializedException ( ) ; } return this . java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { if ( this . java.lang.Object != null ) { return this . java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; } if ( this . java.lang.Class<?>[] != null && this . java.lang.Class<?>[] . int == NUMBER ) { return this . java.lang.Class<?>[] [ NUMBER ] ; } if ( this . java.lang.Object instanceof TargetSource ) { return ( ( TargetSource ) this . java.lang.Object ) . getTargetClass ( ) ; } if ( this . java.lang.Object != null ) { return this . java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( )  <METHOD_END>