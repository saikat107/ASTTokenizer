<METHOD_START> public void ( ServerProperties org.springframework.boot.autoconfigure.web.reactive.ServerProperties ) { this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties = org.springframework.boot.autoconfigure.web.reactive.ServerProperties ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return NUMBER ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableReactiveWebServerFactory org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory ) { if ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getPort ( ) != null ) { org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory . setPort ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getPort ( ) ) ; } if ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getAddress ( ) != null ) { org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory . setAddress ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getAddress ( ) ) ; } if ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getSsl ( ) != null ) { org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory . setSsl ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getSsl ( ) ) ; } if ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getCompression ( ) != null ) { org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory . setCompression ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . getCompression ( ) ) ; } }  <METHOD_END>