<METHOD_START> protected void void ( java.lang.Object java.lang.Object , TagWriter org.springframework.web.servlet.tags.form.TagWriter ) throws org.springframework.web.servlet.tags.form.JspException { void ( java.lang.Object , java.lang.Object , org.springframework.web.servlet.tags.form.TagWriter ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , TagWriter org.springframework.web.servlet.tags.form.TagWriter ) throws org.springframework.web.servlet.tags.form.JspException { java.lang.String java.lang.String = convertToDisplayString ( java.lang.Object ) ; org.springframework.web.servlet.tags.form.TagWriter . writeAttribute ( STRING , processFieldValue ( getName ( ) , java.lang.String , java.lang.String ( ) ) ) ; if ( boolean ( java.lang.Object ) || ( java.lang.Object != java.lang.Object && boolean ( java.lang.Object ) ) ) { org.springframework.web.servlet.tags.form.TagWriter . writeAttribute ( STRING , STRING ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.Object java.lang.Object ) throws org.springframework.web.servlet.tags.form.JspException { return SelectedValueComparator . isSelected ( getBindStatus ( ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.Boolean java.lang.Boolean , TagWriter org.springframework.web.servlet.tags.form.TagWriter ) throws org.springframework.web.servlet.tags.form.JspException { org.springframework.web.servlet.tags.form.TagWriter . writeAttribute ( STRING , processFieldValue ( getName ( ) , STRING , java.lang.String ( ) ) ) ; if ( java.lang.Boolean ) { org.springframework.web.servlet.tags.form.TagWriter . writeAttribute ( STRING , STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) org.springframework.web.servlet.tags.form.JspException { return TagIdGenerator . nextId ( super. autogenerateId ( ) , this . pageContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected abstract int int ( TagWriter org.springframework.web.servlet.tags.form.TagWriter ) throws org.springframework.web.servlet.tags.form.JspException ;  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return ! STRING . boolean ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( )  <METHOD_END>