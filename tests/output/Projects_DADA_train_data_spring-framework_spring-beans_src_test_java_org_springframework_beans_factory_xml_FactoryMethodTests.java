<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getName ( ) ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.TestBean . getAge ( ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . destroySingletons ( ) ; assertTrue ( org.springframework.beans.factory.xml.TestBean . wasDestroyed ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; try { org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.xml.BeanCreationException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertNull ( org.springframework.beans.factory.xml.FactoryMethods ) ; try { org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.xml.BeanCreationException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( null , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( null , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( null , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.TestBean . getAge ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.TestBean . getAge ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) , org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) ) ; assertNotSame ( org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; assertNotSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) , org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; assertNotSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) , org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; assertNotSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; assertEquals ( TestBean .class , org.springframework.beans.factory.xml.DefaultListableBeanFactory . getType ( STRING ) ) ; assertEquals ( TestBean .class , org.springframework.beans.factory.xml.DefaultListableBeanFactory . getType ( STRING ) ) ; java.lang.String [] java.lang.String[] = org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanNamesForType ( TestBean .class ) ; assertTrue ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; assertTrue ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.TestBean . getAge ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getName ( ) ) ; org.springframework.beans.factory.xml.TestBean = ( TestBean ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.TestBean . getAge ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.TestBean . getName ( ) ) ; assertEquals ( TestBean .class , org.springframework.beans.factory.xml.DefaultListableBeanFactory . getType ( STRING ) ) ; assertEquals ( TestBean .class , org.springframework.beans.factory.xml.DefaultListableBeanFactory . getType ( STRING ) ) ; java.lang.String[] = org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanNamesForType ( TestBean .class ) ; assertTrue ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; assertTrue ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; InstanceFactory . count = NUMBER ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; assertEquals ( NUMBER , InstanceFactory . count ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertEquals ( NUMBER , InstanceFactory . count ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; assertEquals ( NUMBER , InstanceFactory . count ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; try { org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.xml.BeanCreationException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; try { org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.xml.BeanCreationException ) { assertTrue ( org.springframework.beans.factory.xml.BeanCreationException . getMessage ( ) . contains ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; try { org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , new TestBean ( ) ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.beans.factory.xml.BeanCreationException ) { assertTrue ( org.springframework.beans.factory.xml.BeanCreationException . getMessage ( ) . contains ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = new TestBean ( ) ; org.springframework.beans.factory.xml.TestBean . setName ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = new TestBean ( ) ; org.springframework.beans.factory.xml.TestBean . setName ( STRING ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.xml.TestBean ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.xml.TestBean ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) , STRING ) ; assertEquals ( org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) , org.springframework.beans.factory.xml.FactoryMethods . getStringValue ( ) ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; assertNotSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.xml.TestBean , new java.lang.Integer ( NUMBER ) , STRING ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.xml.TestBean ) ; assertEquals ( NUMBER , org.springframework.beans.factory.xml.FactoryMethods . getNum ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; TestBean org.springframework.beans.factory.xml.TestBean = new TestBean ( ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , org.springframework.beans.factory.xml.TestBean ) ; assertSame ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , new TestBean ( ) ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; assertSame ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; TestBean org.springframework.beans.factory.xml.TestBean = org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ; FactoryMethods org.springframework.beans.factory.xml.FactoryMethods = ( FactoryMethods ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING , new TestBean ( ) ) ; assertSame ( org.springframework.beans.factory.xml.FactoryMethods , org.springframework.beans.factory.xml.FactoryMethods ) ; assertSame ( org.springframework.beans.factory.xml.TestBean , org.springframework.beans.factory.xml.FactoryMethods . getTestBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; assertTrue ( java.util.List .class . boolean ( org.springframework.beans.factory.xml.DefaultListableBeanFactory . getType ( STRING ) ) ) ; java.lang.String [] java.lang.String[] = org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanNamesForType ( FactoryMethods .class ) ; assertTrue ( ! java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; java.lang.String[] = org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanNamesForType ( java.util.List .class ) ; assertTrue ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; org.springframework.beans.factory.xml.DefaultListableBeanFactory . preInstantiateSingletons ( ) ; assertTrue ( java.util.List .class . boolean ( org.springframework.beans.factory.xml.DefaultListableBeanFactory . getType ( STRING ) ) ) ; java.lang.String[] = org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanNamesForType ( FactoryMethods .class ) ; assertTrue ( ! java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; java.lang.String[] = org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBeanNamesForType ( java.util.List .class ) ; assertTrue ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) . boolean ( STRING ) ) ; java.util.List<?> < ? > java.util.List<?> = ( java.util.List<?> < ? > ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( java.util.Collections . java.util.List , java.util.List<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { DefaultListableBeanFactory org.springframework.beans.factory.xml.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.beans.factory.xml.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.xml.DefaultListableBeanFactory ) ; org.springframework.beans.factory.xml.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.beans.factory.xml.FactoryMethodTests> ( ) ) ) ; org.springframework.beans.factory.xml.MailSession org.springframework.beans.factory.xml.MailSession = ( org.springframework.beans.factory.xml.MailSession ) org.springframework.beans.factory.xml.DefaultListableBeanFactory . getBean ( STRING ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.MailSession . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.MailSession . java.lang.Object ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void ( ) {	}  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { this . java.util.Properties = java.util.Properties ; }  <METHOD_END>
<METHOD_START> public static org.springframework.beans.factory.xml.MailSession org.springframework.beans.factory.xml.MailSession ( java.util.Properties java.util.Properties ) { org.springframework.beans.factory.xml.MailSession org.springframework.beans.factory.xml.MailSession = new org.springframework.beans.factory.xml.MailSession ( ) ; org.springframework.beans.factory.xml.MailSession . void ( java.util.Properties ) ; return org.springframework.beans.factory.xml.MailSession ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return this . java.util.Properties . java.lang.Object ( java.lang.String ) ; }  <METHOD_END>