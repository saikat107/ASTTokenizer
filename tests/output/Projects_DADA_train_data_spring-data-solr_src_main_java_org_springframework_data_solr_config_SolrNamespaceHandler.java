<METHOD_START> @ java.lang.Override public void void ( ) { RepositoryConfigurationExtension org.springframework.data.solr.config.RepositoryConfigurationExtension = new SolrRepositoryConfigExtension ( ) ; RepositoryBeanDefinitionParser org.springframework.data.solr.config.RepositoryBeanDefinitionParser = new RepositoryBeanDefinitionParser ( org.springframework.data.solr.config.RepositoryConfigurationExtension ) ; registerBeanDefinitionParser ( STRING , org.springframework.data.solr.config.RepositoryBeanDefinitionParser ) ; registerBeanDefinitionParser ( STRING , new EmbeddedSolrServerBeanDefinitionParser ( ) ) ; registerBeanDefinitionParser ( STRING , new HttpSolrClientBeanDefinitionParser ( ) ) ; }  <METHOD_END>