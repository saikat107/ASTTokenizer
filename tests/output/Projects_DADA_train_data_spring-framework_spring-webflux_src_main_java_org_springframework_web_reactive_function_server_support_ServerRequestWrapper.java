<METHOD_START> public void ( ServerRequest org.springframework.web.reactive.function.server.support.ServerRequest ) { Assert . notNull ( org.springframework.web.reactive.function.server.support.ServerRequest , STRING ) ; this . org.springframework.web.reactive.function.server.support.ServerRequest = org.springframework.web.reactive.function.server.support.ServerRequest ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.function.server.support.ServerRequest org.springframework.web.reactive.function.server.support.ServerRequest ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.support.HttpMethod org.springframework.web.reactive.function.server.support.HttpMethod ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . method ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . uri ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . path ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.support.Headers org.springframework.web.reactive.function.server.support.Headers ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . headers ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( BodyExtractor < T , ? super ServerHttpRequest > org.springframework.web.reactive.function.server.support.BodyExtractor<T,? super org.springframework.web.reactive.function.server.support.ServerHttpRequest> ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . body ( org.springframework.web.reactive.function.server.support.BodyExtractor<T,> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( BodyExtractor < T , ? super ServerHttpRequest > org.springframework.web.reactive.function.server.support.BodyExtractor<T,? super org.springframework.web.reactive.function.server.support.ServerHttpRequest> , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . body ( org.springframework.web.reactive.function.server.support.BodyExtractor<T,> , java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.web.reactive.function.server.support.Mono<T> < T > org.springframework.web.reactive.function.server.support.Mono<T> ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . bodyToMono ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > org.springframework.web.reactive.function.server.support.Flux<T> < T > org.springframework.web.reactive.function.server.support.Flux<T> ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . bodyToFlux ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > java.util.Optional<T> < T > java.util.Optional<T> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . attribute ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . attributes ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . queryParam ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . queryParams ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . pathVariable ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . pathVariables ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.support.Mono<org.springframework.web.reactive.function.server.support.WebSession> < WebSession > org.springframework.web.reactive.function.server.support.Mono<org.springframework.web.reactive.function.server.support.WebSession> ( ) { return this . org.springframework.web.reactive.function.server.support.ServerRequest . session ( ) ; }  <METHOD_END>
<METHOD_START> public void ( Headers org.springframework.web.reactive.function.server.support.Headers ) { Assert . notNull ( org.springframework.web.reactive.function.server.support.Headers , STRING ) ; this . org.springframework.web.reactive.function.server.support.Headers = org.springframework.web.reactive.function.server.support.Headers ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.reactive.function.server.support.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.function.server.support.MediaType> ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . accept ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.nio.charset.Charset> < java.nio.charset.Charset > java.util.List<java.nio.charset.Charset> ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . acceptCharset ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.util.Locale.LanguageRange> < java.util.Locale . java.util.Locale.LanguageRange > java.util.List<java.util.Locale.LanguageRange> ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . acceptLanguage ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.OptionalLong java.util.OptionalLong ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . contentLength ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Optional<org.springframework.web.reactive.function.server.support.MediaType> < MediaType > java.util.Optional<org.springframework.web.reactive.function.server.support.MediaType> ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . contentType ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.InetSocketAddress java.net.InetSocketAddress ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . host ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.reactive.function.server.support.HttpRange> < HttpRange > java.util.List<org.springframework.web.reactive.function.server.support.HttpRange> ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . range ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.function.server.support.Headers . header ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.function.server.support.HttpHeaders org.springframework.web.reactive.function.server.support.HttpHeaders ( ) { return this . org.springframework.web.reactive.function.server.support.Headers . asHttpHeaders ( ) ; }  <METHOD_END>