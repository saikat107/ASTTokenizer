<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockMvc org.springframework.test.web.servlet.setup.MockMvc = MockMvcBuilders . standaloneSetup ( new org.springframework.test.web.servlet.setup.SharedHttpSessionTests.TestController ( ) ) . apply ( sharedHttpSession ( ) ) . build ( ) ; java.lang.String java.lang.String = STRING ; MvcResult org.springframework.test.web.servlet.setup.MvcResult = org.springframework.test.web.servlet.setup.MockMvc . perform ( get ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) . andReturn ( ) ; HttpSession org.springframework.test.web.servlet.setup.HttpSession = org.springframework.test.web.servlet.setup.MvcResult . getRequest ( ) . getSession ( false ) ; assertNotNull ( org.springframework.test.web.servlet.setup.HttpSession ) ; assertEquals ( NUMBER , org.springframework.test.web.servlet.setup.HttpSession . getAttribute ( STRING ) ) ; org.springframework.test.web.servlet.setup.MvcResult = org.springframework.test.web.servlet.setup.MockMvc . perform ( get ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) . andReturn ( ) ; org.springframework.test.web.servlet.setup.HttpSession = org.springframework.test.web.servlet.setup.MvcResult . getRequest ( ) . getSession ( false ) ; assertNotNull ( org.springframework.test.web.servlet.setup.HttpSession ) ; assertEquals ( NUMBER , org.springframework.test.web.servlet.setup.HttpSession . getAttribute ( STRING ) ) ; org.springframework.test.web.servlet.setup.MvcResult = org.springframework.test.web.servlet.setup.MockMvc . perform ( get ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) . andReturn ( ) ; org.springframework.test.web.servlet.setup.HttpSession = org.springframework.test.web.servlet.setup.MvcResult . getRequest ( ) . getSession ( false ) ; assertNotNull ( org.springframework.test.web.servlet.setup.HttpSession ) ; assertEquals ( NUMBER , org.springframework.test.web.servlet.setup.HttpSession . getAttribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MockMvc org.springframework.test.web.servlet.setup.MockMvc = MockMvcBuilders . standaloneSetup ( new org.springframework.test.web.servlet.setup.SharedHttpSessionTests.TestController ( ) ) . apply ( sharedHttpSession ( ) ) . build ( ) ; java.lang.String java.lang.String = STRING ; MvcResult org.springframework.test.web.servlet.setup.MvcResult = org.springframework.test.web.servlet.setup.MockMvc . perform ( get ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) . andReturn ( ) ; HttpSession org.springframework.test.web.servlet.setup.HttpSession = org.springframework.test.web.servlet.setup.MvcResult . getRequest ( ) . getSession ( false ) ; assertNull ( org.springframework.test.web.servlet.setup.HttpSession ) ; org.springframework.test.web.servlet.setup.MvcResult = org.springframework.test.web.servlet.setup.MockMvc . perform ( get ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) . andReturn ( ) ; org.springframework.test.web.servlet.setup.HttpSession = org.springframework.test.web.servlet.setup.MvcResult . getRequest ( ) . getSession ( false ) ; assertNull ( org.springframework.test.web.servlet.setup.HttpSession ) ; java.lang.String = STRING ; org.springframework.test.web.servlet.setup.MvcResult = org.springframework.test.web.servlet.setup.MockMvc . perform ( get ( java.lang.String ) ) . andExpect ( status ( ) . isOk ( ) ) . andReturn ( ) ; org.springframework.test.web.servlet.setup.HttpSession = org.springframework.test.web.servlet.setup.MvcResult . getRequest ( ) . getSession ( false ) ; assertNotNull ( org.springframework.test.web.servlet.setup.HttpSession ) ; assertEquals ( NUMBER , org.springframework.test.web.servlet.setup.HttpSession . getAttribute ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) public java.lang.String java.lang.String ( HttpSession org.springframework.test.web.servlet.setup.HttpSession ) { java.lang.Integer java.lang.Integer = ( java.lang.Integer ) org.springframework.test.web.servlet.setup.HttpSession . getAttribute ( STRING ) ; org.springframework.test.web.servlet.setup.HttpSession . setAttribute ( STRING , ( java.lang.Integer != null ? java.lang.Integer + NUMBER : NUMBER ) ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ GetMapping ( STRING ) public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>