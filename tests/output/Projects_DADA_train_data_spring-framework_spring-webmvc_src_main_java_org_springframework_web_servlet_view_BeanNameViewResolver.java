<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . int ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.servlet.view.View org.springframework.web.servlet.view.View ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) throws org.springframework.web.servlet.view.BeansException { ApplicationContext org.springframework.web.servlet.view.ApplicationContext = getApplicationContext ( ) ; if ( ! org.springframework.web.servlet.view.ApplicationContext . containsBean ( java.lang.String ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } return null ; } if ( ! org.springframework.web.servlet.view.ApplicationContext . isTypeMatch ( java.lang.String , View .class ) ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.String + STRING ) ; } return null ; } return org.springframework.web.servlet.view.ApplicationContext . getBean ( java.lang.String , View .class ) ; }  <METHOD_END>