<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.reflect.Method java.lang.reflect.Method ) { return ( AnnotationUtils . findAnnotation ( java.lang.reflect.Method , TransactionalEventListener .class ) != null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.transaction.event.ApplicationListener<?> < ? > org.springframework.transaction.event.ApplicationListener<?> ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.reflect.Method java.lang.reflect.Method ) { return new ApplicationListenerMethodTransactionalAdapter ( java.lang.String , java.lang.Class<> , java.lang.reflect.Method ) ; }  <METHOD_END>