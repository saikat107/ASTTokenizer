<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter ) { return View .class . boolean ( org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) throws java.lang.Exception { if ( java.lang.Object == null ) { return; } else if ( java.lang.Object instanceof View ) { View org.springframework.web.servlet.mvc.method.annotation.View = ( View ) java.lang.Object ; org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . setView ( org.springframework.web.servlet.mvc.method.annotation.View ) ; if ( org.springframework.web.servlet.mvc.method.annotation.View instanceof SmartView ) { if ( ( ( SmartView ) org.springframework.web.servlet.mvc.method.annotation.View ) . isRedirectView ( ) ) { org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer . setRedirectModelScenario ( true ) ; } } } else { throw new java.lang.UnsupportedOperationException ( STRING + org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getParameterType ( ) . getName ( ) + STRING + org.springframework.web.servlet.mvc.method.annotation.MethodParameter . getMethod ( ) ) ; } }  <METHOD_END>