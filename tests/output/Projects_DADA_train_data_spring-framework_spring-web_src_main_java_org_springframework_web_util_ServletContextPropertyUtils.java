<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , ServletContext org.springframework.web.util.ServletContext ) { return java.lang.String ( java.lang.String , org.springframework.web.util.ServletContext , false ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , ServletContext org.springframework.web.util.ServletContext , boolean boolean ) { PropertyPlaceholderHelper org.springframework.web.util.PropertyPlaceholderHelper = ( boolean ? org.springframework.web.util.PropertyPlaceholderHelper : org.springframework.web.util.PropertyPlaceholderHelper ) ; return org.springframework.web.util.PropertyPlaceholderHelper . replacePlaceholders ( java.lang.String , new org.springframework.web.util.ServletContextPropertyUtils.ServletContextPlaceholderResolver ( java.lang.String , org.springframework.web.util.ServletContext ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , ServletContext org.springframework.web.util.ServletContext ) { this . java.lang.String = java.lang.String ; this . org.springframework.web.util.ServletContext = org.springframework.web.util.ServletContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { try { java.lang.String java.lang.String = this . org.springframework.web.util.ServletContext . getInitParameter ( java.lang.String ) ; if ( java.lang.String == null ) { java.lang.String = java.lang.System . java.lang.String ( java.lang.String ) ; if ( java.lang.String == null ) { java.lang.String = java.lang.System . java.lang.String ( java.lang.String ) ; } } return java.lang.String ; } catch ( java.lang.Throwable java.lang.Throwable ) { java.lang.System . java.io.PrintStream . void ( STRING + java.lang.String + STRING + this . java.lang.String + STRING + java.lang.Throwable ) ; return null ; } }  <METHOD_END>