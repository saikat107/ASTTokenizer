<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element , AbstractBeanDefinition org.springframework.cassandra.config.xml.AbstractBeanDefinition , ParserContext org.springframework.cassandra.config.xml.ParserContext )			throws org.springframework.cassandra.config.xml.BeanDefinitionStoreException { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.AbstractBeanDefinition , org.springframework.cassandra.config.xml.ParserContext ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : DefaultCqlBeanNames . CLUSTER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.cassandra.config.xml.AbstractBeanDefinition org.springframework.cassandra.config.xml.AbstractBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( CassandraCqlClusterFactoryBean .class ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . setLazyInit ( org.springframework.cassandra.config.xml.ParserContext . isDefaultLazyInit ( ) ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setDestroyMethodName ( STRING ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getRawBeanDefinition ( ) . setSource ( org.springframework.cassandra.config.xml.ParserContext . extractSource ( org.w3c.dom.Element ) ) ; if ( org.springframework.cassandra.config.xml.ParserContext . isNested ( ) ) { org.springframework.cassandra.config.xml.BeanDefinitionBuilder . setScope ( org.springframework.cassandra.config.xml.ParserContext . getContainingBeanDefinition ( ) . getScope ( ) ) ; } void ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.ParserContext , org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) ; return org.springframework.cassandra.config.xml.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) { addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; void ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.ParserContext , org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) ; }  <METHOD_END>
<METHOD_START> protected void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext , BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) { ManagedSet < BeanDefinition > org.springframework.cassandra.config.xml.ManagedSet<org.springframework.cassandra.config.xml.BeanDefinition> = new ManagedSet <> ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( PoolingOptionsFactoryBean .class ) ; addOptionalPropertyReference ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : DomUtils . getChildElements ( org.w3c.dom.Element ) ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( ) ; if ( STRING . boolean ( java.lang.String ) ) { org.springframework.cassandra.config.xml.ManagedSet<org.springframework.cassandra.config.xml.BeanDefinition> . add ( org.springframework.cassandra.config.xml.BeanDefinition ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.ParserContext ) ) ; } else if ( STRING . boolean ( java.lang.String ) ) { void ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) ; } else if ( STRING . boolean ( java.lang.String ) ) { void ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) ; } else if ( STRING . boolean ( java.lang.String ) ) { org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.cassandra.config.xml.BeanDefinition ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.ParserContext ) ) ; } else if ( STRING . boolean ( java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ( org.w3c.dom.Element ) ) ; } else if ( STRING . boolean ( java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ( org.w3c.dom.Element ) ) ; } } org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.Object ( org.w3c.dom.Element , org.springframework.cassandra.config.xml.ParserContext , org.springframework.cassandra.config.xml.ManagedSet<org.springframework.cassandra.config.xml.BeanDefinition> ) ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , getSourceBeanDefinition ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , org.springframework.cassandra.config.xml.ParserContext , org.w3c.dom.Element ) ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.List<java.lang.String> ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.cassandra.config.xml.BeanDefinition org.springframework.cassandra.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( KeyspaceActionSpecificationFactoryBean .class ) ; addRequiredPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , KeyspaceAttributes . DEFAULT_REPLICATION_STRATEGY . name ( ) ) ; addRequiredPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , java.lang.String . java.lang.String ( KeyspaceAttributes . DEFAULT_REPLICATION_FACTOR ) ) ; addRequiredPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , STRING ) ; addRequiredPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; void ( DomUtils . getChildElementByTagName ( org.w3c.dom.Element , STRING ) , org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) ; return getSourceBeanDefinition ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , org.springframework.cassandra.config.xml.ParserContext , org.w3c.dom.Element ) ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) { ManagedList < java.lang.String > org.springframework.cassandra.config.xml.ManagedList<java.lang.String> = new ManagedList <> ( ) ; ManagedList < java.lang.String > org.springframework.cassandra.config.xml.ManagedList<java.lang.String> = new ManagedList <> ( ) ; if ( org.w3c.dom.Element != null ) { addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , KeyspaceAttributes . DEFAULT_REPLICATION_STRATEGY . name ( ) ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , java.lang.String . java.lang.String ( KeyspaceAttributes . DEFAULT_REPLICATION_FACTOR ) ) ; for ( org.w3c.dom.Element org.w3c.dom.Element : DomUtils . getChildElementsByTagName ( org.w3c.dom.Element , STRING ) ) { org.springframework.cassandra.config.xml.ManagedList<java.lang.String> . add ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; org.springframework.cassandra.config.xml.ManagedList<java.lang.String> . add ( org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } } org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.cassandra.config.xml.ManagedList<java.lang.String> ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.cassandra.config.xml.ManagedList<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext , ManagedSet < BeanDefinition > org.springframework.cassandra.config.xml.ManagedSet<org.springframework.cassandra.config.xml.BeanDefinition> ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( MultiLevelSetFlattenerFactoryBean .class ) ; org.springframework.cassandra.config.xml.BeanDefinitionBuilder . addPropertyValue ( STRING , org.springframework.cassandra.config.xml.ManagedSet<org.springframework.cassandra.config.xml.BeanDefinition> ) ; return getSourceBeanDefinition ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , org.springframework.cassandra.config.xml.ParserContext , org.w3c.dom.Element ) ; }  <METHOD_END>
<METHOD_START> void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) { addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; }  <METHOD_END>
<METHOD_START> void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder ) { addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING , null ) ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( org.w3c.dom.Element org.w3c.dom.Element ) { return org.w3c.dom.Element . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> org.springframework.cassandra.config.xml.BeanDefinition org.springframework.cassandra.config.xml.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cassandra.config.xml.ParserContext ) { BeanDefinitionBuilder org.springframework.cassandra.config.xml.BeanDefinitionBuilder = BeanDefinitionBuilder . genericBeanDefinition ( SocketOptionsFactoryBean .class ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; addOptionalPropertyValue ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , STRING , org.w3c.dom.Element , STRING ) ; return getSourceBeanDefinition ( org.springframework.cassandra.config.xml.BeanDefinitionBuilder , org.springframework.cassandra.config.xml.ParserContext , org.w3c.dom.Element ) ; }  <METHOD_END>