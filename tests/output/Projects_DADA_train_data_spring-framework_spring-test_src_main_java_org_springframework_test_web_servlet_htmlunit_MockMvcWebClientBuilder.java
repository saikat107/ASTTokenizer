<METHOD_START> protected void ( MockMvc org.springframework.test.web.servlet.htmlunit.MockMvc ) { super( org.springframework.test.web.servlet.htmlunit.MockMvc ); }  <METHOD_END>
<METHOD_START> protected void ( WebApplicationContext org.springframework.test.web.servlet.htmlunit.WebApplicationContext ) { super( org.springframework.test.web.servlet.htmlunit.WebApplicationContext ); }  <METHOD_END>
<METHOD_START> protected void ( WebApplicationContext org.springframework.test.web.servlet.htmlunit.WebApplicationContext , MockMvcConfigurer org.springframework.test.web.servlet.htmlunit.MockMvcConfigurer ) { super( org.springframework.test.web.servlet.htmlunit.WebApplicationContext , org.springframework.test.web.servlet.htmlunit.MockMvcConfigurer ); }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( MockMvc org.springframework.test.web.servlet.htmlunit.MockMvc ) { Assert . notNull ( org.springframework.test.web.servlet.htmlunit.MockMvc , STRING ) ; return new org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( org.springframework.test.web.servlet.htmlunit.MockMvc ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( WebApplicationContext org.springframework.test.web.servlet.htmlunit.WebApplicationContext ) { Assert . notNull ( org.springframework.test.web.servlet.htmlunit.WebApplicationContext , STRING ) ; return new org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( org.springframework.test.web.servlet.htmlunit.WebApplicationContext ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( WebApplicationContext org.springframework.test.web.servlet.htmlunit.WebApplicationContext , MockMvcConfigurer org.springframework.test.web.servlet.htmlunit.MockMvcConfigurer ) { Assert . notNull ( org.springframework.test.web.servlet.htmlunit.WebApplicationContext , STRING ) ; Assert . notNull ( org.springframework.test.web.servlet.htmlunit.MockMvcConfigurer , STRING ) ; return new org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( org.springframework.test.web.servlet.htmlunit.WebApplicationContext , org.springframework.test.web.servlet.htmlunit.MockMvcConfigurer ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient ) { Assert . notNull ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ; org.springframework.test.web.servlet.htmlunit.WebClient . setWebConnection ( createConnection ( org.springframework.test.web.servlet.htmlunit.WebClient ) ) ; this . org.springframework.test.web.servlet.htmlunit.WebClient = org.springframework.test.web.servlet.htmlunit.WebClient ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.servlet.htmlunit.WebClient org.springframework.test.web.servlet.htmlunit.WebClient ( ) { return ( this . org.springframework.test.web.servlet.htmlunit.WebClient != null ? this . org.springframework.test.web.servlet.htmlunit.WebClient : org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilder ( new WebClient ( ) ) . build ( ) ) ; }  <METHOD_END>