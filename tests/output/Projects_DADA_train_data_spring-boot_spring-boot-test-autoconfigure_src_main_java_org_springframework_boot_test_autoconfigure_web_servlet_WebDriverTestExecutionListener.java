<METHOD_START> @ java.lang.Override public void void ( TestContext org.springframework.boot.test.autoconfigure.web.servlet.TestContext ) throws java.lang.Exception { WebDriverScope org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope = WebDriverScope . getFrom ( org.springframework.boot.test.autoconfigure.web.servlet.TestContext . getApplicationContext ( ) ) ; if ( org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope != null && org.springframework.boot.test.autoconfigure.web.servlet.WebDriverScope . reset ( ) ) { org.springframework.boot.test.autoconfigure.web.servlet.TestContext . setAttribute ( DependencyInjectionTestExecutionListener . REINJECT_DEPENDENCIES_ATTRIBUTE , java.lang.Boolean . java.lang.Boolean ) ; } }  <METHOD_END>