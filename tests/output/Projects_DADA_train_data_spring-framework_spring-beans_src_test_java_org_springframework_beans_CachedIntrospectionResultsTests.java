<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanWrapper org.springframework.beans.BeanWrapper = new BeanWrapperImpl ( TestBean .class ) ; assertTrue ( org.springframework.beans.BeanWrapper . isWritableProperty ( STRING ) ) ; assertTrue ( org.springframework.beans.BeanWrapper . isWritableProperty ( STRING ) ) ; assertTrue ( CachedIntrospectionResults . strongClassCache . containsKey ( TestBean .class ) ) ; java.lang.ClassLoader java.lang.ClassLoader = new OverridingClassLoader ( java.lang.Class<? extends org.springframework.beans.CachedIntrospectionResultsTests> ( ) . java.lang.ClassLoader ( ) ) ; java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.ClassLoader . java.lang.Class<?> ( STRING ) ; assertFalse ( CachedIntrospectionResults . strongClassCache . containsKey ( java.lang.Class<> ) ) ; CachedIntrospectionResults . acceptClassLoader ( java.lang.ClassLoader ) ; org.springframework.beans.BeanWrapper = new BeanWrapperImpl ( java.lang.Class<> ) ; assertTrue ( org.springframework.beans.BeanWrapper . isWritableProperty ( STRING ) ) ; assertTrue ( org.springframework.beans.BeanWrapper . isWritableProperty ( STRING ) ) ; assertTrue ( CachedIntrospectionResults . strongClassCache . containsKey ( java.lang.Class<> ) ) ; CachedIntrospectionResults . clearClassLoader ( java.lang.ClassLoader ) ; assertFalse ( CachedIntrospectionResults . strongClassCache . containsKey ( java.lang.Class<> ) ) ; assertTrue ( CachedIntrospectionResults . strongClassCache . containsKey ( TestBean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanUtils . getPropertyDescriptors ( java.util.ArrayList .class ) ; assertTrue ( CachedIntrospectionResults . strongClassCache . containsKey ( java.util.ArrayList .class ) ) ; CachedIntrospectionResults . clearClassLoader ( java.util.ArrayList .class . java.lang.ClassLoader ( ) ) ; assertFalse ( CachedIntrospectionResults . strongClassCache . containsKey ( java.util.ArrayList .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchMethodException , java.lang.SecurityException { @ java.lang.SuppressWarnings ( STRING ) class C { public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return this ; } public java.lang.String java.lang.String ( ) { return null ; } } CachedIntrospectionResults org.springframework.beans.CachedIntrospectionResults = CachedIntrospectionResults . forClass ( C .class ) ; java.beans.BeanInfo java.beans.BeanInfo = org.springframework.beans.CachedIntrospectionResults . getBeanInfo ( ) ; java.beans.PropertyDescriptor java.beans.PropertyDescriptor = null ; for ( java.beans.PropertyDescriptor java.beans.PropertyDescriptor : java.beans.BeanInfo . java.beans.PropertyDescriptor[] ( ) ) { if ( java.beans.PropertyDescriptor . java.lang.String ( ) . boolean ( STRING ) ) { java.beans.PropertyDescriptor = java.beans.PropertyDescriptor ; } } assertThat ( java.beans.PropertyDescriptor , notNullValue ( ) ) ; assertThat ( java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) , equalTo ( C .class . java.lang.reflect.Method ( STRING ) ) ) ; assertThat ( STRING + STRING + STRING , java.beans.PropertyDescriptor . java.lang.reflect.Method ( ) , equalTo ( C .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return this ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>