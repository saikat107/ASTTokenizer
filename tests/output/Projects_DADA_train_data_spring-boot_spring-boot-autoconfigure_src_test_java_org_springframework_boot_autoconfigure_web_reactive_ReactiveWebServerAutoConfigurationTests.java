<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext = new ReactiveWebServerApplicationContext ( org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerAutoConfigurationTests.BaseConfiguration .class ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext . getBeansOfType ( ReactiveWebServerFactory .class ) ) . hasSize ( NUMBER ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext . getBeansOfType ( WebServerFactoryCustomizer .class ) ) . hasSize ( NUMBER ) ; assertThat ( this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext . getBeansOfType ( DefaultReactiveWebServerCustomizer .class ) ) . hasSize ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.web.reactive.ExpectedException . expect ( ApplicationContextException .class ) ; this . org.springframework.boot.autoconfigure.web.reactive.ExpectedException . expectMessage ( Matchers . containsString ( STRING ) ) ; this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext = new ReactiveWebServerApplicationContext ( org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerAutoConfigurationTests.MissingHttpHandlerConfiguration .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.web.reactive.ExpectedException . expect ( ApplicationContextException .class ) ; this . org.springframework.boot.autoconfigure.web.reactive.ExpectedException . expectMessage ( Matchers . containsString ( STRING ) ) ; this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext = new ReactiveWebServerApplicationContext ( org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerAutoConfigurationTests.BaseConfiguration .class , org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerAutoConfigurationTests.TooManyHttpHandlers .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext = new ReactiveWebServerApplicationContext ( org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerAutoConfigurationTests.BaseConfiguration .class , org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerAutoConfigurationTests.ReactiveWebServerCustomization .class ) ; MockReactiveWebServerFactory org.springframework.boot.autoconfigure.web.reactive.MockReactiveWebServerFactory = this . org.springframework.boot.autoconfigure.web.reactive.ReactiveWebServerApplicationContext . getBean ( MockReactiveWebServerFactory .class ) ; assertThat ( org.springframework.boot.autoconfigure.web.reactive.MockReactiveWebServerFactory . getPort ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.reactive.HttpHandler org.springframework.boot.autoconfigure.web.reactive.HttpHandler ( ) { return Mockito . mock ( HttpHandler .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.reactive.HttpHandler org.springframework.boot.autoconfigure.web.reactive.HttpHandler ( ) { return Mockito . mock ( HttpHandler .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.reactive.WebServerFactoryCustomizer<org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory> < ConfigurableReactiveWebServerFactory > org.springframework.boot.autoconfigure.web.reactive.WebServerFactoryCustomizer<org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory> ( ) { return ( server ) -> server . setPort ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.reactive.MockReactiveWebServerFactory org.springframework.boot.autoconfigure.web.reactive.MockReactiveWebServerFactory ( ) { return new MockReactiveWebServerFactory ( ) ; }  <METHOD_END>