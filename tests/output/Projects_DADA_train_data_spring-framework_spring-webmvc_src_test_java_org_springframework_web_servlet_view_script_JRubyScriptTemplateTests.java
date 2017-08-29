<METHOD_START> @ Before public void void ( ) { this . org.springframework.web.servlet.view.script.WebApplicationContext = mock ( WebApplicationContext .class ) ; this . org.springframework.web.servlet.view.script.ServletContext = new MockServletContext ( ) ; this . org.springframework.web.servlet.view.script.ServletContext . setAttribute ( WebApplicationContext . ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE , this . org.springframework.web.servlet.view.script.WebApplicationContext ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; MockHttpServletResponse org.springframework.web.servlet.view.script.MockHttpServletResponse = org.springframework.web.servlet.view.script.MockHttpServletResponse ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; assertEquals ( STRING , org.springframework.web.servlet.view.script.MockHttpServletResponse . getContentAsString ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.view.script.MockHttpServletResponse org.springframework.web.servlet.view.script.MockHttpServletResponse ( java.lang.String java.lang.String , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) throws java.lang.Exception { ScriptTemplateView org.springframework.web.servlet.view.script.ScriptTemplateView = org.springframework.web.servlet.view.script.ScriptTemplateView ( java.lang.String ) ; MockHttpServletResponse org.springframework.web.servlet.view.script.MockHttpServletResponse = new MockHttpServletResponse ( ) ; MockHttpServletRequest org.springframework.web.servlet.view.script.MockHttpServletRequest = new MockHttpServletRequest ( ) ; org.springframework.web.servlet.view.script.ScriptTemplateView . renderMergedOutputModel ( java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.servlet.view.script.MockHttpServletRequest , org.springframework.web.servlet.view.script.MockHttpServletResponse ) ; return org.springframework.web.servlet.view.script.MockHttpServletResponse ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.view.script.ScriptTemplateView org.springframework.web.servlet.view.script.ScriptTemplateView ( java.lang.String java.lang.String ) throws java.lang.Exception { AnnotationConfigApplicationContext org.springframework.web.servlet.view.script.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.web.servlet.view.script.AnnotationConfigApplicationContext . register ( org.springframework.web.servlet.view.script.JRubyScriptTemplateTests.ScriptTemplatingConfiguration .class ) ; org.springframework.web.servlet.view.script.AnnotationConfigApplicationContext . refresh ( ) ; ScriptTemplateView org.springframework.web.servlet.view.script.ScriptTemplateView = new ScriptTemplateView ( ) ; org.springframework.web.servlet.view.script.ScriptTemplateView . setApplicationContext ( org.springframework.web.servlet.view.script.AnnotationConfigApplicationContext ) ; org.springframework.web.servlet.view.script.ScriptTemplateView . setUrl ( java.lang.String ) ; org.springframework.web.servlet.view.script.ScriptTemplateView . afterPropertiesSet ( ) ; return org.springframework.web.servlet.view.script.ScriptTemplateView ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.web.servlet.view.script.ScriptTemplateConfigurer org.springframework.web.servlet.view.script.ScriptTemplateConfigurer ( ) { ScriptTemplateConfigurer org.springframework.web.servlet.view.script.ScriptTemplateConfigurer = new ScriptTemplateConfigurer ( ) ; org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setScripts ( STRING ) ; org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setEngineName ( STRING ) ; org.springframework.web.servlet.view.script.ScriptTemplateConfigurer . setRenderFunction ( STRING ) ; return org.springframework.web.servlet.view.script.ScriptTemplateConfigurer ; }  <METHOD_END>