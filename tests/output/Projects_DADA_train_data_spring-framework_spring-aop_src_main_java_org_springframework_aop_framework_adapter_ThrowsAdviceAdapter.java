<METHOD_START> @ java.lang.Override public boolean boolean ( Advice org.springframework.aop.framework.adapter.Advice ) { return ( org.springframework.aop.framework.adapter.Advice instanceof ThrowsAdvice ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.aop.framework.adapter.MethodInterceptor org.springframework.aop.framework.adapter.MethodInterceptor ( Advisor org.springframework.aop.framework.adapter.Advisor ) { return new ThrowsAdviceInterceptor ( org.springframework.aop.framework.adapter.Advisor . getAdvice ( ) ) ; }  <METHOD_END>