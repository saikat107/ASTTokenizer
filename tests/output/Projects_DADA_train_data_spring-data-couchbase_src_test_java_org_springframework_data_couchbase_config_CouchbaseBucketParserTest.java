<METHOD_START> @ BeforeClass public static void void ( ) { org.springframework.data.couchbase.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; BeanDefinitionReader org.springframework.data.couchbase.config.BeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.couchbase.config.DefaultListableBeanFactory ) ; int int = org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; java.lang.System . java.io.PrintStream . void ( int ) ; }  <METHOD_END>
<METHOD_START> @ AfterClass public static void void ( ) {	}  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; RuntimeBeanReference org.springframework.data.couchbase.config.RuntimeBeanReference = ( RuntimeBeanReference ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.RuntimeBeanReference . getBeanName ( ) , is ( equalTo ( BeanNames . COUCHBASE_CLUSTER ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; RuntimeBeanReference org.springframework.data.couchbase.config.RuntimeBeanReference = ( RuntimeBeanReference ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.RuntimeBeanReference . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; RuntimeBeanReference org.springframework.data.couchbase.config.RuntimeBeanReference = ( RuntimeBeanReference ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.RuntimeBeanReference . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( java.lang.String .class ) ) ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) . toString ( ) , is ( ( equalTo ( STRING ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition , is ( notNullValue ( ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) , is ( equalTo ( NUMBER ) ) ) ; assertThat ( org.springframework.data.couchbase.config.BeanDefinition . getPropertyValues ( ) . size ( ) , is ( equalTo ( NUMBER ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( RuntimeBeanReference .class ) ) ) ; RuntimeBeanReference org.springframework.data.couchbase.config.RuntimeBeanReference = ( RuntimeBeanReference ) ConstructorArgumentValues.ValueHolder . getValue ( ) ; assertThat ( org.springframework.data.couchbase.config.RuntimeBeanReference . getBeanName ( ) , is ( equalTo ( STRING ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( java.lang.String .class ) ) ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) . toString ( ) , is ( ( equalTo ( STRING ) ) ) ) ; ConstructorArgumentValues . ConstructorArgumentValues ConstructorArgumentValues.ValueHolder = org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentValue ( NUMBER , java.lang.Object .class ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) , is ( instanceOf ( java.lang.String .class ) ) ) ; assertThat ( ConstructorArgumentValues.ValueHolder . getValue ( ) . toString ( ) , is ( ( equalTo ( STRING ) ) ) ) ; }  <METHOD_END>