<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public java.lang.String [] java.lang.String[] ( ) { return this . java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( HttpServletRequest org.springframework.web.servlet.i18n.HttpServletRequest , HttpServletResponse org.springframework.web.servlet.i18n.HttpServletResponse , java.lang.Object java.lang.Object )			throws org.springframework.web.servlet.i18n.ServletException { java.lang.String java.lang.String = org.springframework.web.servlet.i18n.HttpServletRequest . getParameter ( java.lang.String ( ) ) ; if ( java.lang.String != null ) { if ( boolean ( org.springframework.web.servlet.i18n.HttpServletRequest . getMethod ( ) ) ) { LocaleResolver org.springframework.web.servlet.i18n.LocaleResolver = RequestContextUtils . getLocaleResolver ( org.springframework.web.servlet.i18n.HttpServletRequest ) ; if ( org.springframework.web.servlet.i18n.LocaleResolver == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } try { org.springframework.web.servlet.i18n.LocaleResolver . setLocale ( org.springframework.web.servlet.i18n.HttpServletRequest , org.springframework.web.servlet.i18n.HttpServletResponse , java.util.Locale ( java.lang.String ) ) ; } catch ( java.lang.IllegalArgumentException java.lang.IllegalArgumentException ) { if ( boolean ( ) ) { org.springframework.web.servlet.i18n.Log . debug ( STRING + java.lang.String + STRING + java.lang.IllegalArgumentException . java.lang.String ( ) ) ; } else { throw java.lang.IllegalArgumentException ; } } } } return true ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = java.lang.String[] ( ) ; if ( ObjectUtils . isEmpty ( java.lang.String[] ) ) { return true ; } for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( java.lang.String . boolean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> protected java.util.Locale java.util.Locale ( java.lang.String java.lang.String ) { return ( boolean ( ) ? java.util.Locale . java.util.Locale ( java.lang.String ) : StringUtils . parseLocaleString ( java.lang.String ) ) ; }  <METHOD_END>