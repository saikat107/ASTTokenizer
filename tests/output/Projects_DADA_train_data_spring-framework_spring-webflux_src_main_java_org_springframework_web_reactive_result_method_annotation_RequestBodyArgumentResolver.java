<METHOD_START> public void ( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> < HttpMessageReader < ? > > java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> , ReactiveAdapterRegistry org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ) { super( java.util.List<org.springframework.web.reactive.result.method.annotation.HttpMessageReader<?>> , org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { return org.springframework.web.reactive.result.method.annotation.MethodParameter . hasParameterAnnotation ( RequestBody .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter , BindingContext org.springframework.web.reactive.result.method.annotation.BindingContext , ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) { RequestBody org.springframework.web.reactive.result.method.annotation.RequestBody = org.springframework.web.reactive.result.method.annotation.MethodParameter . getParameterAnnotation ( RequestBody .class ) ; return readBody ( org.springframework.web.reactive.result.method.annotation.MethodParameter , org.springframework.web.reactive.result.method.annotation.RequestBody . required ( ) , org.springframework.web.reactive.result.method.annotation.BindingContext , org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) ; }  <METHOD_END>