<METHOD_START> @ Before public void void ( ) { org.springframework.data.couchbase.config.DefaultListableBeanFactory = new DefaultListableBeanFactory ( ) ; org.springframework.data.couchbase.config.BeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.data.couchbase.config.DefaultListableBeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( BeanNames . COUCHBASE_TEMPLATE ) ; assertEquals ( NUMBER , org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) ) ; org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( BeanNames . COUCHBASE_TEMPLATE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; BeanDefinition org.springframework.data.couchbase.config.BeanDefinition = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBeanDefinition ( BeanNames . COUCHBASE_TEMPLATE ) ; assertEquals ( NUMBER , org.springframework.data.couchbase.config.BeanDefinition . getConstructorArgumentValues ( ) . getArgumentCount ( ) ) ; org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( BeanNames . COUCHBASE_TEMPLATE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( STRING ) ; org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; CouchbaseTemplate org.springframework.data.couchbase.config.CouchbaseTemplate = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( BeanNames . COUCHBASE_TEMPLATE , CouchbaseTemplate .class ) ; assertTrue ( org.springframework.data.couchbase.config.CouchbaseTemplate . getConverter ( ) instanceof MappingCouchbaseConverter ) ; MappingCouchbaseConverter org.springframework.data.couchbase.config.MappingCouchbaseConverter = ( ( MappingCouchbaseConverter ) org.springframework.data.couchbase.config.CouchbaseTemplate . getConverter ( ) ) ; assertEquals ( STRING , org.springframework.data.couchbase.config.MappingCouchbaseConverter . getTypeKey ( ) ) ; User org.springframework.data.couchbase.config.User = new User ( STRING , STRING , NUMBER ) ; org.springframework.data.couchbase.config.CouchbaseTemplate . save ( org.springframework.data.couchbase.config.User ) ; JsonDocument org.springframework.data.couchbase.config.JsonDocument = org.springframework.data.couchbase.config.CouchbaseTemplate . getCouchbaseBucket ( ) . get ( STRING ) ; org.springframework.data.couchbase.config.CouchbaseTemplate . getCouchbaseBucket ( ) . remove ( STRING ) ; assertNotNull ( org.springframework.data.couchbase.config.JsonDocument ) ; JsonObject org.springframework.data.couchbase.config.JsonObject = org.springframework.data.couchbase.config.JsonDocument . content ( ) ; assertNull ( org.springframework.data.couchbase.config.JsonObject . get ( MappingCouchbaseConverter . TYPEKEY_DEFAULT ) ) ; assertEquals ( STRING , org.springframework.data.couchbase.config.JsonObject . getString ( STRING ) ) ; assertEquals ( STRING , org.springframework.data.couchbase.config.JsonObject . getString ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; CouchbaseTemplate org.springframework.data.couchbase.config.CouchbaseTemplate = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( STRING , CouchbaseTemplate .class ) ; assertEquals ( Consistency . EVENTUALLY_CONSISTENT , org.springframework.data.couchbase.config.CouchbaseTemplate . getDefaultConsistency ( ) ) ; assertNotEquals ( Consistency . DEFAULT_CONSISTENCY , org.springframework.data.couchbase.config.CouchbaseTemplate . getDefaultConsistency ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; CouchbaseTemplate org.springframework.data.couchbase.config.CouchbaseTemplate = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( STRING , CouchbaseTemplate .class ) ; assertEquals ( Consistency . DEFAULT_CONSISTENCY , org.springframework.data.couchbase.config.CouchbaseTemplate . getDefaultConsistency ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.couchbase.config.BeanDefinitionReader . loadBeanDefinitions ( new ClassPathResource ( STRING ) ) ; CouchbaseTemplate org.springframework.data.couchbase.config.CouchbaseTemplate = org.springframework.data.couchbase.config.DefaultListableBeanFactory . getBean ( BeanNames . COUCHBASE_TEMPLATE , CouchbaseTemplate .class ) ; assertEquals ( Consistency . DEFAULT_CONSISTENCY , org.springframework.data.couchbase.config.CouchbaseTemplate . getDefaultConsistency ( ) ) ; }  <METHOD_END>