<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; Assert . notNull ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; this . org.springframework.web.servlet.config.annotation.RedirectView = new RedirectView ( java.lang.String ) ; this . org.springframework.web.servlet.config.annotation.RedirectView . setContextRelative ( true ) ; this . org.springframework.web.servlet.config.annotation.ParameterizableViewController . setView ( this . org.springframework.web.servlet.config.annotation.RedirectView ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration ( HttpStatus org.springframework.web.servlet.config.annotation.HttpStatus ) { Assert . isTrue ( org.springframework.web.servlet.config.annotation.HttpStatus . is3xxRedirection ( ) , STRING ) ; this . org.springframework.web.servlet.config.annotation.RedirectView . setStatusCode ( org.springframework.web.servlet.config.annotation.HttpStatus ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration ( boolean boolean ) { this . org.springframework.web.servlet.config.annotation.RedirectView . setContextRelative ( boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration org.springframework.web.servlet.config.annotation.RedirectViewControllerRegistration ( boolean boolean ) { this . org.springframework.web.servlet.config.annotation.RedirectView . setPropagateQueryParams ( boolean ) ; return this ; }  <METHOD_END>
<METHOD_START> protected void void ( ApplicationContext org.springframework.web.servlet.config.annotation.ApplicationContext ) { this . org.springframework.web.servlet.config.annotation.ParameterizableViewController . setApplicationContext ( org.springframework.web.servlet.config.annotation.ApplicationContext ) ; this . org.springframework.web.servlet.config.annotation.RedirectView . setApplicationContext ( org.springframework.web.servlet.config.annotation.ApplicationContext ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.config.annotation.ParameterizableViewController org.springframework.web.servlet.config.annotation.ParameterizableViewController ( ) { return this . org.springframework.web.servlet.config.annotation.ParameterizableViewController ; }  <METHOD_END>