<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.beans.factory.config.BeanFactory ) { this . org.springframework.beans.factory.config.BeanFactory = org.springframework.beans.factory.config.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.beans.factory.config.BeanFactory org.springframework.beans.factory.config.BeanFactory ( ) { return this . org.springframework.beans.factory.config.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected org.springframework.beans.factory.config.TypeConverter org.springframework.beans.factory.config.TypeConverter ( ) { BeanFactory org.springframework.beans.factory.config.BeanFactory = org.springframework.beans.factory.config.BeanFactory ( ) ; if ( org.springframework.beans.factory.config.BeanFactory instanceof ConfigurableBeanFactory ) { return ( ( ConfigurableBeanFactory ) org.springframework.beans.factory.config.BeanFactory ) . getTypeConverter ( ) ; } else { return new SimpleTypeConverter ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( boolean ( ) ) { this . boolean = true ; this . T = T ( ) ; this . T = null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final T T ( ) java.lang.Exception { if ( boolean ( ) ) { return ( this . boolean ? this . T : T ( ) ) ; } else { return T ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private T T ( ) java.lang.Exception { java.lang.Class<?> < ? > [] java.lang.Class<?>[] = java.lang.Class<?>[] ( ) ; if ( java.lang.Class<?>[] == null ) { throw new FactoryBeanNotInitializedException ( java.lang.Class<? extends org.springframework.beans.factory.config.AbstractFactoryBean> ( ) . java.lang.String ( ) + STRING ) ; } if ( this . T == null ) { this . T = ( T ) java.lang.reflect.Proxy . java.lang.Object ( this . java.lang.ClassLoader , java.lang.Class<?>[] , new org.springframework.beans.factory.config.AbstractFactoryBean<T>.EarlySingletonInvocationHandler ( ) ) ; } return this . T ; }  <METHOD_END>
<METHOD_START> private T T ( ) java.lang.IllegalStateException { if ( ! this . boolean ) { throw new java.lang.IllegalStateException ( STRING ) ; } return this . T ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( boolean ( ) ) { void ( this . T ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public abstract java.lang.Class<?> < ? > java.lang.Class<?> ( )  <METHOD_END>
<METHOD_START> protected abstract T T ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > [] java.lang.Class<?>[] ( ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Class<?> ( ) ; return ( java.lang.Class<> != null && java.lang.Class<> . boolean ( ) ? new java.lang.Class<?> < ? > [] { java.lang.Class<> } : null ) ; }  <METHOD_END>
<METHOD_START> protected void void ( T T ) throws java.lang.Exception {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] ) throws java.lang.Throwable { if ( ReflectionUtils . isEqualsMethod ( java.lang.reflect.Method ) ) { return ( java.lang.Object == java.lang.Object[] [ NUMBER ] ) ; } else if ( ReflectionUtils . isHashCodeMethod ( java.lang.reflect.Method ) ) { return java.lang.System . int ( java.lang.Object ) ; } else if ( ! boolean && ReflectionUtils . isToStringMethod ( java.lang.reflect.Method ) ) { return STRING + ObjectUtils . nullSafeToString ( java.lang.Class<?>[] ( ) ) ; } try { return java.lang.reflect.Method . java.lang.Object ( T ( ) , java.lang.Object[] ) ; } catch ( java.lang.reflect.InvocationTargetException java.lang.reflect.InvocationTargetException ) { throw java.lang.reflect.InvocationTargetException . java.lang.Throwable ( ) ; } }  <METHOD_END>