<METHOD_START> @ java.lang.Override protected void void ( ) { this . org.springframework.web.servlet.tags.form.ButtonTag = org.springframework.web.servlet.tags.form.ButtonTag ( getWriter ( ) ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . setParent ( getFormTag ( ) ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . setPageContext ( getPageContext ( ) ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . setId ( STRING ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . setName ( STRING ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . setValue ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertEquals ( Tag . EVAL_BODY_INCLUDE , this . org.springframework.web.servlet.tags.form.ButtonTag . doStartTag ( ) ) ; assertEquals ( Tag . EVAL_PAGE , this . org.springframework.web.servlet.tags.form.ButtonTag . doEndTag ( ) ) ; java.lang.String java.lang.String = getOutput ( ) ; void ( java.lang.String ) ; void ( java.lang.String ) ; assertContainsAttribute ( java.lang.String , STRING , STRING ) ; assertContainsAttribute ( java.lang.String , STRING , STRING ) ; assertContainsAttribute ( java.lang.String , STRING , STRING ) ; assertContainsAttribute ( java.lang.String , STRING , STRING ) ; assertAttributeNotPresent ( java.lang.String , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.tags.form.ButtonTag . setDisabled ( true ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . doStartTag ( ) ; this . org.springframework.web.servlet.tags.form.ButtonTag . doEndTag ( ) ; java.lang.String java.lang.String = getOutput ( ) ; void ( java.lang.String ) ; void ( java.lang.String ) ; assertContainsAttribute ( java.lang.String , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.tags.form.TestBean org.springframework.web.servlet.tags.form.TestBean ( ) { return new TestBean ( ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.lang.String java.lang.String ) { assertTrue ( STRING , java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.lang.String java.lang.String ) { assertTrue ( STRING , java.lang.String . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) protected org.springframework.web.servlet.tags.form.ButtonTag org.springframework.web.servlet.tags.form.ButtonTag ( final java.io.Writer java.io.Writer ) { return new ButtonTag ( ) { @ java.lang.Override protected org.springframework.web.servlet.tags.form.TagWriter org.springframework.web.servlet.tags.form.TagWriter ( ) { return new TagWriter ( java.io.Writer ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.tags.form.TagWriter org.springframework.web.servlet.tags.form.TagWriter ( ) { return new TagWriter ( java.io.Writer ) ; }  <METHOD_END>