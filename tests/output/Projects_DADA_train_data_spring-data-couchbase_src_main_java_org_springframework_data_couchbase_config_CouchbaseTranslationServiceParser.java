<METHOD_START> @ java.lang.Override protected java.lang.Class java.lang.Class ( final org.w3c.dom.Element org.w3c.dom.Element ) { return JacksonTranslationService .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( final org.w3c.dom.Element org.w3c.dom.Element , final BeanDefinitionBuilder org.springframework.data.couchbase.config.BeanDefinitionBuilder ) { final java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.data.couchbase.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; } else { org.springframework.data.couchbase.config.BeanDefinitionBuilder . addPropertyValue ( STRING , new ObjectMapper ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( final org.w3c.dom.Element org.w3c.dom.Element , final AbstractBeanDefinition org.springframework.data.couchbase.config.AbstractBeanDefinition , final ParserContext org.springframework.data.couchbase.config.ParserContext ) { java.lang.String java.lang.String = super. resolveId ( org.w3c.dom.Element , org.springframework.data.couchbase.config.AbstractBeanDefinition , org.springframework.data.couchbase.config.ParserContext ) ; return StringUtils . hasText ( java.lang.String ) ? java.lang.String : BeanNames . COUCHBASE_TRANSLATION_SERVICE ; }  <METHOD_END>