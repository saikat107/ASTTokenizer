<METHOD_START> public void ( ConfigurableBeanFactory org.springframework.web.reactive.result.method.annotation.ConfigurableBeanFactory , ReactiveAdapterRegistry org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ) { super( org.springframework.web.reactive.result.method.annotation.ConfigurableBeanFactory , org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { return checkAnnotatedParamNoReactiveWrapper ( org.springframework.web.reactive.result.method.annotation.MethodParameter , RequestAttribute .class , ( annot , type ) -> true ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.result.method.annotation.NamedValueInfo org.springframework.web.reactive.result.method.annotation.NamedValueInfo ( MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { RequestAttribute org.springframework.web.reactive.result.method.annotation.RequestAttribute = org.springframework.web.reactive.result.method.annotation.MethodParameter . getParameterAnnotation ( RequestAttribute .class ) ; return new NamedValueInfo ( org.springframework.web.reactive.result.method.annotation.RequestAttribute . name ( ) , org.springframework.web.reactive.result.method.annotation.RequestAttribute . required ( ) , ValueConstants . DEFAULT_NONE ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Optional<java.lang.Object> < java.lang.Object > java.util.Optional<java.lang.Object> ( java.lang.String java.lang.String , MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter , ServerWebExchange org.springframework.web.reactive.result.method.annotation.ServerWebExchange ) { return org.springframework.web.reactive.result.method.annotation.ServerWebExchange . getAttribute ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ) { java.lang.String java.lang.String = org.springframework.web.reactive.result.method.annotation.MethodParameter . getNestedParameterType ( ) . getSimpleName ( ) ; java.lang.String java.lang.String = STRING + java.lang.String + STRING + java.lang.String ; throw new ServerWebInputException ( java.lang.String , org.springframework.web.reactive.result.method.annotation.MethodParameter ) ; }  <METHOD_END>