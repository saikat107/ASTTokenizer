<METHOD_START> @ Bean public org.springframework.data.rest.webmvc.jpa.LinkDiscoverer org.springframework.data.rest.webmvc.jpa.LinkDiscoverer ( ) { return new JsonPathLinkDiscoverer ( STRING , org.springframework.data.rest.webmvc.jpa.MediaType ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( RepositoryRestConfiguration org.springframework.data.rest.webmvc.jpa.RepositoryRestConfiguration ) { org.springframework.data.rest.webmvc.jpa.RepositoryRestConfiguration . setDefaultMediaType ( org.springframework.data.rest.webmvc.jpa.MediaType ) . useHalAsDefaultJsonMediaType ( false ) ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) { MockMvc org.springframework.data.rest.webmvc.jpa.MockMvc = MockMvcBuilders . webAppContextSetup ( org.springframework.data.rest.webmvc.jpa.WebApplicationContext ) . defaultRequest ( get ( STRING ) ) . build ( ) ; this . org.springframework.data.rest.webmvc.jpa.TestMvcClient = new TestMvcClient ( org.springframework.data.rest.webmvc.jpa.MockMvc , org.springframework.data.rest.webmvc.jpa.LinkDiscoverers ) ; this . org.springframework.data.rest.webmvc.jpa.Person = org.springframework.data.rest.webmvc.jpa.PersonRepository . save ( new Person ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResultActions org.springframework.data.rest.webmvc.jpa.ResultActions = org.springframework.data.rest.webmvc.jpa.TestMvcClient . follow ( STRING . java.lang.String ( org.springframework.data.rest.webmvc.jpa.Person . getId ( ) . toString ( ) ) ) ; org.springframework.data.rest.webmvc.jpa.ResultActions . andExpect ( jsonPath ( STRING ) . value ( hasSize ( NUMBER ) ) ) ; }  <METHOD_END>