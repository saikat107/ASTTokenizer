<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.TestBean . getSpouse ( ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( TestBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . setAutowireMode ( RootBeanDefinition . AUTOWIRE_BY_TYPE ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanDefinition ( STRING ) . setPrimary ( true ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( TestBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . setAutowireMode ( RootBeanDefinition . AUTOWIRE_BY_TYPE ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( PropertiesFactoryBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( TestBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . setAutowireMode ( RootBeanDefinition . AUTOWIRE_BY_TYPE ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( PropertiesFactoryBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , STRING ) ; org.springframework.beans.factory.xml.RootBeanDefinition . setPrimary ( true ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanDefinition ( STRING ) . setPrimary ( true ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( TestBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . setAutowireMode ( RootBeanDefinition . AUTOWIRE_BY_TYPE ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( STRING ) ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; RootBeanDefinition org.springframework.beans.factory.xml.RootBeanDefinition = new RootBeanDefinition ( PropertiesFactoryBean .class ) ; org.springframework.beans.factory.xml.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , STRING ) ; org.springframework.beans.factory.xml.RootBeanDefinition . setPrimary ( true ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . registerBeanDefinition ( STRING , org.springframework.beans.factory.xml.RootBeanDefinition ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { CountingFactory . reset ( ) ; DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; assertEquals ( NUMBER , CountingFactory . getFactoryBeanInstanceCount ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.TestBean . getSpouse ( ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.TestBean ) ; assertNotSame ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.TestBean ) ; assertEquals ( org.springframework.beans.factory.xml.TestBean . getSpouse ( ) , org.springframework.beans.factory.xml.TestBean . getSpouse ( ) ) ; assertNotSame ( org.springframework.beans.factory.xml.TestBean . getSpouse ( ) , org.springframework.beans.factory.xml.TestBean . getSpouse ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = org.springframework.beans.factory.xml.DefaultListableBeanFactory ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getSomeProperties ( ) . getProperty ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.xml.DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory ( java.lang.String java.lang.String ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) . loadBeanDefinitions ( new ClassPathResource ( java.lang.String , java.lang.Class<? extends org.springframework.beans.factory.xml.AutowireWithExclusionTests> ( ) ) ) ; return org.springframework.beans.factory.xml.DefaultListableBeanFactory ; }  <METHOD_END>