<METHOD_START> @ Before public void void ( ) { org.springframework.aop.config.MethodLocatingFactoryBean = new MethodLocatingFactoryBean ( ) ; org.springframework.aop.config.BeanFactory = mock ( BeanFactory .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.aop.config.MethodLocatingFactoryBean . isSingleton ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( java.lang.reflect.Method .class , org.springframework.aop.config.MethodLocatingFactoryBean . getObjectType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.aop.config.MethodLocatingFactoryBean . setMethodName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.aop.config.MethodLocatingFactoryBean . setTargetBeanName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setMethodName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.aop.config.MethodLocatingFactoryBean . setTargetBeanName ( java.lang.String ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.aop.config.MethodLocatingFactoryBean . setTargetBeanName ( java.lang.String ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setMethodName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.aop.config.MethodLocatingFactoryBean . setTargetBeanName ( java.lang.String ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setMethodName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; verify ( org.springframework.aop.config.BeanFactory ) . getType ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { given ( org.springframework.aop.config.BeanFactory . getType ( java.lang.String ) ) . willReturn ( ( java.lang.Class ) java.lang.String .class ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setTargetBeanName ( java.lang.String ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setMethodName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; java.lang.Object java.lang.Object = org.springframework.aop.config.MethodLocatingFactoryBean . getObject ( ) ; assertNotNull ( java.lang.Object ) ; assertTrue ( java.lang.Object instanceof java.lang.reflect.Method ) ; java.lang.reflect.Method java.lang.reflect.Method = ( java.lang.reflect.Method ) java.lang.Object ; assertEquals ( STRING , java.lang.reflect.Method . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { given ( org.springframework.aop.config.BeanFactory . getType ( java.lang.String ) ) . willReturn ( ( java.lang.Class ) java.lang.String .class ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setTargetBeanName ( java.lang.String ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setMethodName ( STRING ) ; org.springframework.aop.config.MethodLocatingFactoryBean . setBeanFactory ( org.springframework.aop.config.BeanFactory ) ; }  <METHOD_END>