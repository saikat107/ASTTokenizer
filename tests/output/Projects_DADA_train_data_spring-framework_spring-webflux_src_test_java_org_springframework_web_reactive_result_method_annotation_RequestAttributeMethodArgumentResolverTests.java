<METHOD_START> @ Before public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext . refresh ( ) ; ReactiveAdapterRegistry org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry = new ReactiveAdapterRegistry ( ) ; this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver = new RequestAttributeMethodArgumentResolver ( org.springframework.web.reactive.result.method.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) , org.springframework.web.reactive.result.method.annotation.ReactiveAdapterRegistry ) ; this . java.lang.reflect.Method = ReflectionUtils . findMethod ( java.lang.Class<? extends org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests> ( ) , STRING , ( java.lang.Class<?> < ? > [] ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertTrue ( this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . supportsParameter ( new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ) ) ; assertFalse ( this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . supportsParameter ( new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ) ) ; try { this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . supportsParameter ( new MethodParameter ( this . java.lang.reflect.Method , NUMBER ) ) ; fail ( ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertTrue ( STRING + java.lang.IllegalStateException . java.lang.String ( ) , java.lang.IllegalStateException . java.lang.String ( ) . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.MethodParameter ( NUMBER ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; StepVerifier . create ( org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> ) . expectNextCount ( NUMBER ) . expectError ( ServerWebInputException .class ) . verify ( ) ; org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo = new org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ( ) ; this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getAttributes ( ) . put ( STRING , org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ) ; org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; assertSame ( org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.MethodParameter ( NUMBER ) ; org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo = new org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ( ) ; this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getAttributes ( ) . put ( STRING , org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; assertSame ( org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.MethodParameter ( NUMBER ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; assertNull ( org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo = new org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ( ) ; this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getAttributes ( ) . put ( STRING , org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ) ; org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; assertSame ( org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = org.springframework.web.reactive.result.method.annotation.MethodParameter ( NUMBER ) ; Mono < java.lang.Object > org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , new BindingContext ( ) , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; assertNotNull ( org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; assertEquals ( java.util.Optional .class , org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) . getClass ( ) ) ; assertFalse ( ( ( java.util.Optional<?> < ? > ) org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) . boolean ( ) ) ; ConfigurableWebBindingInitializer org.springframework.web.reactive.result.method.annotation.ConfigurableWebBindingInitializer = new ConfigurableWebBindingInitializer ( ) ; org.springframework.web.reactive.result.method.annotation.ConfigurableWebBindingInitializer . setConversionService ( new DefaultFormattingConversionService ( ) ) ; BindingContext org.springframework.web.reactive.result.method.annotation.BindingContext = new BindingContext ( org.springframework.web.reactive.result.method.annotation.ConfigurableWebBindingInitializer ) ; org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo = new org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ( ) ; this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange . getAttributes ( ) . put ( STRING , org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo ) ; org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> = this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . resolveArgument ( org.springframework.web.reactive.result.method.annotation.MethodParameter , org.springframework.web.reactive.result.method.annotation.BindingContext , this . org.springframework.web.reactive.result.method.annotation.MockServerWebExchange ) ; assertNotNull ( org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ) ; assertEquals ( java.util.Optional .class , org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) . getClass ( ) ) ; java.util.Optional<?> < ? > java.util.Optional<?> = ( java.util.Optional<?> < ? > ) org.springframework.web.reactive.result.method.annotation.Mono<java.lang.Object> . block ( ) ; assertTrue ( java.util.Optional<> . boolean ( ) ) ; assertSame ( org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , java.util.Optional<> . get ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.method.annotation.MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter ( int int ) { MethodParameter org.springframework.web.reactive.result.method.annotation.MethodParameter = new SynthesizingMethodParameter ( this . java.lang.reflect.Method , int ) ; org.springframework.web.reactive.result.method.annotation.MethodParameter . initParameterNameDiscovery ( new DefaultParameterNameDiscoverer ( ) ) ; GenericTypeResolver . resolveParameterType ( org.springframework.web.reactive.result.method.annotation.MethodParameter , this . org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolver . getClass ( ) ) ; return org.springframework.web.reactive.result.method.annotation.MethodParameter ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) private void void ( @ RequestAttribute org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , @ RequestAttribute ( STRING ) org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , @ RequestAttribute ( name = STRING , required = false ) org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo , @ RequestAttribute ( name = STRING ) java.util.Optional<org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo> < org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo > java.util.Optional<org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo> , java.lang.String java.lang.String , @ RequestAttribute Mono < org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo > org.springframework.web.reactive.result.method.annotation.Mono<org.springframework.web.reactive.result.method.annotation.RequestAttributeMethodArgumentResolverTests.Foo> ) {	}  <METHOD_END>