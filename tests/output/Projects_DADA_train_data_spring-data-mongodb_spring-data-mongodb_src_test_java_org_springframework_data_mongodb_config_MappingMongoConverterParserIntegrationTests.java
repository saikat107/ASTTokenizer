<METHOD_START> @ Test public void void ( ) { void ( ) ; org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; MappingMongoConverter org.springframework.data.mongodb.config.MappingMongoConverter = org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBean ( STRING , MappingMongoConverter .class ) ; MongoTypeMapper org.springframework.data.mongodb.config.MongoTypeMapper = org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBean ( CustomMongoTypeMapper .class ) ; assertThat ( org.springframework.data.mongodb.config.MappingMongoConverter . getTypeMapper ( ) , is ( org.springframework.data.mongodb.config.MongoTypeMapper ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; CustomConversions org.springframework.data.mongodb.config.CustomConversions = org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBean ( CustomConversions .class ) ; assertThat ( org.springframework.data.mongodb.config.CustomConversions . hasCustomWriteTarget ( Person .class ) , is ( true ) ) ; assertThat ( org.springframework.data.mongodb.config.CustomConversions . hasCustomWriteTarget ( Account .class ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( ) ; BeanDefinition org.springframework.data.mongodb.config.BeanDefinition = org.springframework.data.mongodb.config.DefaultListableBeanFactory . getBeanDefinition ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.data.mongodb.config.BeanDefinition . getPropertyValues ( ) . getPropertyValue ( STRING ) . getValue ( ) ; assertThat ( java.lang.Object , is ( instanceOf ( BeanDefinition .class ) ) ) ; BeanDefinition org.springframework.data.mongodb.config.BeanDefinition = ( BeanDefinition ) java.lang.Object ; assertThat ( org.springframework.data.mongodb.config.BeanDefinition . getBeanClassName ( ) , is ( CamelCaseAbbreviatingFieldNamingStrategy .class . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.ExpectedException . expect ( BeanDefinitionParsingException .class ) ; org.springframework.data.mongodb.config.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.mongodb.config.ExpectedException . expectMessage ( STRING ) ; BeanDefinitionRegistry org.springframework.data.mongodb.config.BeanDefinitionRegistry = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.data.mongodb.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.mongodb.config.BeanDefinitionRegistry ) ; org.springframework.data.mongodb.config.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.config.ExpectedException . expect ( BeanDefinitionParsingException .class ) ; org.springframework.data.mongodb.config.ExpectedException . expectMessage ( STRING ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . void ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . void ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { org.springframework.data.mongodb.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.data.mongodb.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.mongodb.config.DefaultListableBeanFactory ) ; org.springframework.data.mongodb.config.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private static void void ( java.lang.String java.lang.String ) { BeanDefinitionRegistry org.springframework.data.mongodb.config.BeanDefinitionRegistry = new DefaultListableBeanFactory ( ) ; XmlBeanDefinitionReader org.springframework.data.mongodb.config.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.mongodb.config.BeanDefinitionRegistry ) ; org.springframework.data.mongodb.config.XmlBeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; BeanDefinition org.springframework.data.mongodb.config.BeanDefinition = org.springframework.data.mongodb.config.XmlBeanDefinitionReader . getRegistry ( ) . getBeanDefinition ( java.lang.String . java.lang.String ( STRING ) ) ; BeanReference org.springframework.data.mongodb.config.BeanReference = ( BeanReference ) org.springframework.data.mongodb.config.BeanDefinition . getPropertyValues ( ) . getPropertyValue ( STRING ) . getValue ( ) ; assertThat ( org.springframework.data.mongodb.config.BeanReference . getBeanName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.mongodb.config.Document org.springframework.data.mongodb.config.Document ( Person org.springframework.data.mongodb.config.Person ) { return null ; }  <METHOD_END>
<METHOD_START> public java.util.Set<org.springframework.data.mongodb.config.ConvertiblePair> < ConvertiblePair > java.util.Set<org.springframework.data.mongodb.config.ConvertiblePair> ( ) { return java.util.Collections . java.util.Set ( new ConvertiblePair ( Account .class , Document .class ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , TypeDescriptor org.springframework.data.mongodb.config.TypeDescriptor , TypeDescriptor org.springframework.data.mongodb.config.TypeDescriptor ) { return null ; }  <METHOD_END>