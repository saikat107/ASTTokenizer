<METHOD_START> protected void ( WebApplicationContext org.springframework.test.web.servlet.setup.WebApplicationContext ) { Assert . notNull ( org.springframework.test.web.servlet.setup.WebApplicationContext , STRING ) ; Assert . notNull ( org.springframework.test.web.servlet.setup.WebApplicationContext . getServletContext ( ) , STRING ) ; this . org.springframework.test.web.servlet.setup.WebApplicationContext = org.springframework.test.web.servlet.setup.WebApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.test.web.servlet.setup.WebApplicationContext org.springframework.test.web.servlet.setup.WebApplicationContext ( ) { ServletContext org.springframework.test.web.servlet.setup.ServletContext = this . org.springframework.test.web.servlet.setup.WebApplicationContext . getServletContext ( ) ; ApplicationContext org.springframework.test.web.servlet.setup.ApplicationContext = WebApplicationContextUtils . getWebApplicationContext ( org.springframework.test.web.servlet.setup.ServletContext ) ; if ( org.springframework.test.web.servlet.setup.ApplicationContext == null ) { org.springframework.test.web.servlet.setup.ApplicationContext = this . org.springframework.test.web.servlet.setup.WebApplicationContext ; ApplicationContext org.springframework.test.web.servlet.setup.ApplicationContext = this . org.springframework.test.web.servlet.setup.WebApplicationContext . getParent ( ) ; while ( org.springframework.test.web.servlet.setup.ApplicationContext != null ) { if ( org.springframework.test.web.servlet.setup.ApplicationContext instanceof WebApplicationContext && ! ( org.springframework.test.web.servlet.setup.ApplicationContext . getParent ( ) instanceof WebApplicationContext ) ) { org.springframework.test.web.servlet.setup.ApplicationContext = org.springframework.test.web.servlet.setup.ApplicationContext ; break; } org.springframework.test.web.servlet.setup.ApplicationContext = org.springframework.test.web.servlet.setup.ApplicationContext . getParent ( ) ; } org.springframework.test.web.servlet.setup.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.test.web.servlet.setup.ApplicationContext ) ; } return this . org.springframework.test.web.servlet.setup.WebApplicationContext ; }  <METHOD_END>