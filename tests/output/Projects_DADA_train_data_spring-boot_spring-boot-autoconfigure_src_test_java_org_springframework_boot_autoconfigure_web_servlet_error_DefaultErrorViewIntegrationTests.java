<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.autoconfigure.web.servlet.error.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.boot.autoconfigure.web.servlet.error.WebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MvcResult org.springframework.boot.autoconfigure.web.servlet.error.MvcResult = this . org.springframework.boot.autoconfigure.web.servlet.error.MockMvc . perform ( get ( STRING ) . accept ( MediaType . TEXT_HTML ) ) . andExpect ( status ( ) . is5xxServerError ( ) ) . andReturn ( ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.web.servlet.error.MvcResult . getResponse ( ) . getContentAsString ( ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MvcResult org.springframework.boot.autoconfigure.web.servlet.error.MvcResult = this . org.springframework.boot.autoconfigure.web.servlet.error.MockMvc . perform ( get ( STRING ) . requestAttr ( STRING , new java.lang.RuntimeException ( STRING ) ) . accept ( MediaType . TEXT_HTML ) ) . andExpect ( status ( ) . is5xxServerError ( ) ) . andReturn ( ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.web.servlet.error.MvcResult . getResponse ( ) . getContentAsString ( ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING + java.lang.Class<? extends org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewIntegrationTests> ( ) . java.lang.String ( ) + STRING ; MvcResult org.springframework.boot.autoconfigure.web.servlet.error.MvcResult = this . org.springframework.boot.autoconfigure.web.servlet.error.MockMvc . perform ( get ( STRING ) . requestAttr ( STRING , new java.lang.RuntimeException ( java.lang.String ) ) . accept ( MediaType . TEXT_HTML ) ) . andExpect ( status ( ) . is5xxServerError ( ) ) . andReturn ( ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.web.servlet.error.MvcResult . getResponse ( ) . getContentAsString ( ) ; assertThat ( java.lang.String ) . doesNotContain ( STRING ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) { SpringApplication . run ( org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewIntegrationTests.TestConfiguration .class , java.lang.String[] ) ; }  <METHOD_END>