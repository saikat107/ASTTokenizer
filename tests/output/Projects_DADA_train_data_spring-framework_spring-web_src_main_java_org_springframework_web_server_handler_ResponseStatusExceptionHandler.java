<METHOD_START> @ java.lang.Override public org.springframework.web.server.handler.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.server.handler.Mono<java.lang.Void> ( ServerWebExchange org.springframework.web.server.handler.ServerWebExchange , java.lang.Throwable java.lang.Throwable ) { if ( java.lang.Throwable instanceof ResponseStatusException ) { org.springframework.web.server.handler.ServerWebExchange . getResponse ( ) . setStatusCode ( ( ( ResponseStatusException ) java.lang.Throwable ) . getStatus ( ) ) ; if ( java.lang.Throwable . java.lang.String ( ) != null ) { org.springframework.web.server.handler.Log . error ( java.lang.Throwable . java.lang.String ( ) ) ; } return Mono . empty ( ) ; } return Mono . error ( java.lang.Throwable ) ; }  <METHOD_END>