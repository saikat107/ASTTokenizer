<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultListableBeanFactory org.springframework.aop.target.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.aop.target.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.aop.target.DefaultListableBeanFactory ) ; org.springframework.aop.target.XmlBeanDefinitionReader . loadBeanDefinitions ( org.springframework.aop.target.Resource ) ; org.springframework.aop.target.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; ITestBean org.springframework.aop.target.ITestBean = ( ITestBean ) org.springframework.aop.target.DefaultListableBeanFactory . getBean ( STRING ) ; assertTrue ( AopUtils . isAopProxy ( org.springframework.aop.target.ITestBean ) ) ; }  <METHOD_END>