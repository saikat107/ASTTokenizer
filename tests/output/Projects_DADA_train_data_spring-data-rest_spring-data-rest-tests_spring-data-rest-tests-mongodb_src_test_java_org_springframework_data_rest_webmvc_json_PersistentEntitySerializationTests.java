<METHOD_START> @ Bean @ java.lang.Override public org.springframework.data.rest.webmvc.json.ObjectMapper org.springframework.data.rest.webmvc.json.ObjectMapper ( ) { ObjectMapper org.springframework.data.rest.webmvc.json.ObjectMapper = super. objectMapper ( ) ; org.springframework.data.rest.webmvc.json.ObjectMapper . registerModule ( new JacksonSerializers ( new EnumTranslator ( new MessageSourceAccessor ( new StaticMessageSource ( ) ) ) ) ) ; return org.springframework.data.rest.webmvc.json.ObjectMapper ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { RequestContextHolder . setRequestAttributes ( new ServletWebRequest ( new MockHttpServletRequest ( ) ) ) ; this . org.springframework.data.rest.webmvc.json.LinkDiscoverer = new HalLinkDiscoverer ( ) ; this . org.springframework.data.rest.webmvc.json.ProjectionFactory = new SpelAwareProxyProjectionFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { User org.springframework.data.rest.webmvc.json.User = new User ( ) ; user . address = new Address ( ) ; user . address . street = STRING ; PersistentEntityResource org.springframework.data.rest.webmvc.json.PersistentEntityResource = PersistentEntityResource . build ( org.springframework.data.rest.webmvc.json.User , org.springframework.data.rest.webmvc.json.Repositories . getPersistentEntity ( User .class ) ) . withLink ( new Link ( STRING ) ) . build ( ) ; PagedResources < PersistentEntityResource > org.springframework.data.rest.webmvc.json.PagedResources<org.springframework.data.rest.webmvc.json.PersistentEntityResource> = new PagedResources < PersistentEntityResource > ( java.util.Arrays . java.util.List ( org.springframework.data.rest.webmvc.json.PersistentEntityResource ) , new PageMetadata ( NUMBER , NUMBER , NUMBER ) ) ; java.lang.String java.lang.String = org.springframework.data.rest.webmvc.json.ObjectMapper . writeValueAsString ( org.springframework.data.rest.webmvc.json.PagedResources<org.springframework.data.rest.webmvc.json.PersistentEntityResource> ) ; assertThat ( JsonPath .< java.lang.Object > read ( java.lang.String , STRING ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.data.rest.webmvc.json.ObjectMapper . readValue ( STRING , User .class ) . gender ) . isEqualTo ( Gender . MALE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { User org.springframework.data.rest.webmvc.json.User = org.springframework.data.rest.webmvc.json.UserRepository . save ( new User ( ) ) ; dave . colleaguesMap = new java.util.HashMap<java.lang.String,org.springframework.data.rest.webmvc.json.Nested> < java.lang.String , Nested > ( ) ; dave . colleaguesMap . put ( STRING , new Nested ( org.springframework.data.rest.webmvc.json.UserRepository . save ( new User ( ) ) ) ) ; PersistentEntityResource org.springframework.data.rest.webmvc.json.PersistentEntityResource = PersistentEntityResource . build ( org.springframework.data.rest.webmvc.json.User , org.springframework.data.rest.webmvc.json.Repositories . getPersistentEntity ( User .class ) ) . build ( ) ; assertThat ( JsonPath . parse ( org.springframework.data.rest.webmvc.json.ObjectMapper . writeValueAsString ( org.springframework.data.rest.webmvc.json.PersistentEntityResource ) ) . read ( STRING , java.lang.String .class ) , is ( notNullValue ( ) ) ) ; }  <METHOD_END>