<METHOD_START> @ java.lang.Override public final int int ( ) org.springframework.web.servlet.tags.JspException { try { this . org.springframework.web.servlet.tags.RequestContext = ( RequestContext ) this . pageContext . getAttribute ( java.lang.String ) ; if ( this . org.springframework.web.servlet.tags.RequestContext == null ) { this . org.springframework.web.servlet.tags.RequestContext = new JspAwareRequestContext ( this . pageContext ) ; this . pageContext . setAttribute ( java.lang.String , this . org.springframework.web.servlet.tags.RequestContext ) ; } return int ( ) ; } catch ( JspException org.springframework.web.servlet.tags.JspException ) { org.springframework.web.servlet.tags.Log . error ( org.springframework.web.servlet.tags.JspException . getMessage ( ) , org.springframework.web.servlet.tags.JspException ) ; throw org.springframework.web.servlet.tags.JspException ; } catch ( java.lang.RuntimeException java.lang.RuntimeException ) { org.springframework.web.servlet.tags.Log . error ( java.lang.RuntimeException . java.lang.String ( ) , java.lang.RuntimeException ) ; throw java.lang.RuntimeException ; } catch ( java.lang.Exception java.lang.Exception ) { org.springframework.web.servlet.tags.Log . error ( java.lang.Exception . java.lang.String ( ) , java.lang.Exception ) ; throw new JspTagException ( java.lang.Exception . java.lang.String ( ) ) ; } }  <METHOD_END>
<METHOD_START> protected final org.springframework.web.servlet.tags.RequestContext org.springframework.web.servlet.tags.RequestContext ( ) { return this . org.springframework.web.servlet.tags.RequestContext ; }  <METHOD_END>
<METHOD_START> protected abstract int int ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) throws java.lang.Throwable { throw java.lang.Throwable ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.web.servlet.tags.RequestContext = null ; }  <METHOD_END>