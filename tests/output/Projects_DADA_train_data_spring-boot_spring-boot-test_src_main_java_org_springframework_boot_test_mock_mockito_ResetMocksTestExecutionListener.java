<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.boot.test.mock.mockito.TestContext ) throws java.lang.Exception { void ( org.springframework.boot.test.mock.mockito.TestContext . getApplicationContext ( ) , MockReset . BEFORE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.boot.test.mock.mockito.TestContext ) throws java.lang.Exception { void ( org.springframework.boot.test.mock.mockito.TestContext . getApplicationContext ( ) , MockReset . AFTER ) ; }  <METHOD_END>
<METHOD_START> private void void ( ApplicationContext org.springframework.boot.test.mock.mockito.ApplicationContext , MockReset org.springframework.boot.test.mock.mockito.MockReset ) { if ( org.springframework.boot.test.mock.mockito.ApplicationContext instanceof ConfigurableApplicationContext ) { void ( ( ConfigurableApplicationContext ) org.springframework.boot.test.mock.mockito.ApplicationContext , org.springframework.boot.test.mock.mockito.MockReset ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ConfigurableApplicationContext org.springframework.boot.test.mock.mockito.ConfigurableApplicationContext , MockReset org.springframework.boot.test.mock.mockito.MockReset ) { ConfigurableListableBeanFactory org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory = org.springframework.boot.test.mock.mockito.ConfigurableApplicationContext . getBeanFactory ( ) ; java.lang.String [] java.lang.String[] = org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory . getBeanDefinitionNames ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet <> ( java.util.Arrays . java.util.List ( org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory . getSingletonNames ( ) ) ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { BeanDefinition org.springframework.boot.test.mock.mockito.BeanDefinition = org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory . getBeanDefinition ( java.lang.String ) ; if ( org.springframework.boot.test.mock.mockito.BeanDefinition . isSingleton ( ) && java.util.Set<java.lang.String> . boolean ( java.lang.String ) ) { java.lang.Object java.lang.Object = org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory . getSingleton ( java.lang.String ) ; if ( org.springframework.boot.test.mock.mockito.MockReset . equals ( MockReset . get ( java.lang.Object ) ) ) { Mockito . reset ( java.lang.Object ) ; } } } try { MockitoBeans org.springframework.boot.test.mock.mockito.MockitoBeans = org.springframework.boot.test.mock.mockito.ConfigurableListableBeanFactory . getBean ( MockitoBeans .class ) ; for ( java.lang.Object java.lang.Object : org.springframework.boot.test.mock.mockito.MockitoBeans ) { if ( org.springframework.boot.test.mock.mockito.MockReset . equals ( MockReset . get ( java.lang.Object ) ) ) { Mockito . reset ( java.lang.Object ) ; } } } catch ( NoSuchBeanDefinitionException org.springframework.boot.test.mock.mockito.NoSuchBeanDefinitionException ) { } if ( org.springframework.boot.test.mock.mockito.ConfigurableApplicationContext . getParent ( ) != null ) { void ( org.springframework.boot.test.mock.mockito.ConfigurableApplicationContext . getParent ( ) , org.springframework.boot.test.mock.mockito.MockReset ) ; } }  <METHOD_END>