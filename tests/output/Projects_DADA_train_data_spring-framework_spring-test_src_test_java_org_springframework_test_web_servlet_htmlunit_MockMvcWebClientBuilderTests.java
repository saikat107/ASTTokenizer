<METHOD_START> @ Before public void void ( ) { this . org.springframework.test.web.servlet.htmlunit.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.test.web.servlet.htmlunit.WebApplicationContext ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { MockMvcWebClientBuilder . mockMvcSetup ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { MockMvcWebClientBuilder . webAppContextSetup ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.test.web.servlet.htmlunit.WebClient = MockMvcWebClientBuilder . mockMvcSetup ( this . org.springframework.test.web.servlet.htmlunit.MockMvc ) . build ( ) ; void ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ; Assume . group ( TestGroup . PERFORMANCE , ( ) assertMockMvcNotUsed ( client , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { WebClient org.springframework.test.web.servlet.htmlunit.WebClient = new WebClient ( ) ; WebClient org.springframework.test.web.servlet.htmlunit.WebClient = MockMvcWebClientBuilder . mockMvcSetup ( this . org.springframework.test.web.servlet.htmlunit.MockMvc ) . withDelegate ( org.springframework.test.web.servlet.htmlunit.WebClient ) . build ( ) ; void ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) ; Assume . group ( TestGroup . PERFORMANCE , ( ) assertMockMvcNotUsed ( client , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.htmlunit.MockMvc = MockMvcBuilders . standaloneSetup ( new org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilderTests.CookieController ( ) ) . build ( ) ; WebClient org.springframework.test.web.servlet.htmlunit.WebClient = MockMvcWebClientBuilder . mockMvcSetup ( this . org.springframework.test.web.servlet.htmlunit.MockMvc ) . build ( ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; org.springframework.test.web.servlet.htmlunit.WebClient . getCookieManager ( ) . addCookie ( new Cookie ( STRING , STRING , STRING ) ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.htmlunit.MockMvc = MockMvcBuilders . standaloneSetup ( new org.springframework.test.web.servlet.htmlunit.MockMvcWebClientBuilderTests.CookieController ( ) ) . build ( ) ; WebClient org.springframework.test.web.servlet.htmlunit.WebClient = MockMvcWebClientBuilder . mockMvcSetup ( this . org.springframework.test.web.servlet.htmlunit.MockMvc ) . build ( ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , STRING ) . getContentAsString ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String java.lang.String ) throws java.lang.Exception { assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String ) . getContentAsString ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String java.lang.String ) throws java.lang.Exception { assertThat ( org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String ) . getContentAsString ( ) , not ( equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.htmlunit.WebResponse org.springframework.test.web.servlet.htmlunit.WebResponse ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String java.lang.String ) throws java.io.IOException { return org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , new WebRequest ( new java.net.URL ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.htmlunit.WebResponse org.springframework.test.web.servlet.htmlunit.WebResponse ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String java.lang.String ) throws java.io.IOException { return org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , new WebRequest ( new java.net.URL ( java.lang.String ) , HttpMethod . POST ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.htmlunit.WebResponse org.springframework.test.web.servlet.htmlunit.WebResponse ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient , java.lang.String java.lang.String ) throws java.io.IOException { return org.springframework.test.web.servlet.htmlunit.WebResponse ( org.springframework.test.web.servlet.htmlunit.WebClient , new WebRequest ( new java.net.URL ( java.lang.String ) , HttpMethod . DELETE ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.test.web.servlet.htmlunit.WebResponse org.springframework.test.web.servlet.htmlunit.WebResponse ( WebClient org.springframework.test.web.servlet.htmlunit.WebClient , WebRequest org.springframework.test.web.servlet.htmlunit.WebRequest ) throws java.io.IOException { return org.springframework.test.web.servlet.htmlunit.WebClient . getWebConnection ( ) . getResponse ( org.springframework.test.web.servlet.htmlunit.WebRequest ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping public java.lang.String java.lang.String ( HttpServletRequest org.springframework.test.web.servlet.htmlunit.HttpServletRequest ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( path = STRING , produces = STRING ) java.lang.String java.lang.String ( @ CookieValue ( name = java.lang.String , defaultValue = STRING ) java.lang.String java.lang.String ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> @ PostMapping ( path = STRING , produces = STRING ) java.lang.String java.lang.String ( @ RequestParam java.lang.String java.lang.String , HttpServletResponse org.springframework.test.web.servlet.htmlunit.HttpServletResponse ) { org.springframework.test.web.servlet.htmlunit.HttpServletResponse . addCookie ( new javax . javax.servlet . javax.servlet . javax.servlet ( java.lang.String , java.lang.String ) ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ DeleteMapping ( path = STRING , produces = STRING ) java.lang.String java.lang.String ( HttpServletResponse org.springframework.test.web.servlet.htmlunit.HttpServletResponse ) { javax . javax.servlet . javax.servlet . javax.servlet javax.servlet.http.Cookie = new javax . javax.servlet . javax.servlet . javax.servlet ( java.lang.String , STRING ) ; javax.servlet.http.Cookie . setMaxAge ( NUMBER ) ; org.springframework.test.web.servlet.htmlunit.HttpServletResponse . addCookie ( javax.servlet.http.Cookie ) ; return STRING ; }  <METHOD_END>