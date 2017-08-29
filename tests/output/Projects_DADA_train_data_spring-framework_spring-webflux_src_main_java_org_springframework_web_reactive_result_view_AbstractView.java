<METHOD_START> public void ( ) { this( new ReactiveAdapterRegistry ( ) ); }  <METHOD_END>
<METHOD_START> public void ( ReactiveAdapterRegistry org.springframework.web.reactive.result.view.ReactiveAdapterRegistry ) { this . java.util.List<org.springframework.web.reactive.result.view.MediaType> . add ( ViewResolverSupport . DEFAULT_CONTENT_TYPE ) ; this . org.springframework.web.reactive.result.view.ReactiveAdapterRegistry = org.springframework.web.reactive.result.view.ReactiveAdapterRegistry ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.web.reactive.result.view.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.result.view.MediaType> ) { Assert . notEmpty ( java.util.List<org.springframework.web.reactive.result.view.MediaType> , STRING ) ; this . java.util.List<org.springframework.web.reactive.result.view.MediaType> . clear ( ) ; if ( java.util.List<org.springframework.web.reactive.result.view.MediaType> != null ) { this . java.util.List<org.springframework.web.reactive.result.view.MediaType> . addAll ( java.util.List<org.springframework.web.reactive.result.view.MediaType> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.reactive.result.view.MediaType> < MediaType > java.util.List<org.springframework.web.reactive.result.view.MediaType> ( ) { return this . java.util.List<org.springframework.web.reactive.result.view.MediaType> ; }  <METHOD_END>
<METHOD_START> public void void ( java.nio.charset.Charset java.nio.charset.Charset ) { Assert . notNull ( java.nio.charset.Charset , STRING ) ; this . java.nio.charset.Charset = java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public java.nio.charset.Charset java.nio.charset.Charset ( ) { return this . java.nio.charset.Charset ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.web.reactive.result.view.ApplicationContext ) { this . org.springframework.web.reactive.result.view.ApplicationContext = org.springframework.web.reactive.result.view.ApplicationContext ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.result.view.ApplicationContext org.springframework.web.reactive.result.view.ApplicationContext ( ) { return this . org.springframework.web.reactive.result.view.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.view.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , MediaType org.springframework.web.reactive.result.view.MediaType , ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange ) { if ( org.springframework.web.reactive.result.view.Log . isTraceEnabled ( ) ) { org.springframework.web.reactive.result.view.Log . trace ( STRING + java.util.Map<java.lang.String,> ) ; } if ( org.springframework.web.reactive.result.view.MediaType != null ) { org.springframework.web.reactive.result.view.ServerWebExchange . getResponse ( ) . getHeaders ( ) . setContentType ( org.springframework.web.reactive.result.view.MediaType ) ; } return org.springframework.web.reactive.result.view.Mono<java.util.Map<java.lang.String,java.lang.Object>> ( java.util.Map<java.lang.String,> , org.springframework.web.reactive.result.view.ServerWebExchange ) . then ( mergedModel -> { if ( this . requestContextAttribute != null ) { mergedModel . put ( this . requestContextAttribute , createRequestContext ( exchange , mergedModel ) ) ; } return renderInternal ( mergedModel , contentType , exchange ) ; } ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.Mono<java.util.Map<java.lang.String,java.lang.Object>> < java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > > org.springframework.web.reactive.result.view.Mono<java.util.Map<java.lang.String,java.lang.Object>> ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange ) { int int = ( java.util.Map<java.lang.String,> != null ? java.util.Map<java.lang.String,> . int ( ) : NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( int ) ; if ( java.util.Map<java.lang.String,> != null ) { java.util.Map<java.lang.String,java.lang.Object> . void ( java.util.Map<java.lang.String,> ) ; } return org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( java.util.Map<java.lang.String,java.lang.Object> ) . then ( Mono . just ( java.util.Map<java.lang.String,java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.util.List<org.springframework.web.reactive.result.view.Mono<?>> < Mono < ? > > java.util.List<org.springframework.web.reactive.result.view.Mono<?>> = new java.util.ArrayList<org.springframework.web.reactive.result.view.Mono<?>> <> ( ) ; for ( java.util.Map . java.util.Map.Entry<java.lang.String,?> < java.lang.String , ? > java.util.Map.Entry<java.lang.String,?> : java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.Object>> ( ) ) { java.lang.Object java.lang.Object = java.util.Map.Entry<java.lang.String,> . getValue ( ) ; if ( java.lang.Object == null ) { continue; } ReactiveAdapter org.springframework.web.reactive.result.view.ReactiveAdapter = this . org.springframework.web.reactive.result.view.ReactiveAdapterRegistry . getAdapter ( null , java.lang.Object ) ; if ( org.springframework.web.reactive.result.view.ReactiveAdapter != null ) { java.util.List<java.lang.String> . boolean ( java.util.Map.Entry<java.lang.String,> . java.lang.String ( ) ) ; if ( org.springframework.web.reactive.result.view.ReactiveAdapter . isMultiValue ( ) ) { Flux < java.lang.Object > org.springframework.web.reactive.result.view.Flux<java.lang.Object> = Flux . from ( org.springframework.web.reactive.result.view.ReactiveAdapter . toPublisher ( java.lang.Object ) ) ; java.util.List<org.springframework.web.reactive.result.view.Mono<?>> . add ( org.springframework.web.reactive.result.view.Flux<java.lang.Object> . collectList ( ) . defaultIfEmpty ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ) ; } else { Mono < java.lang.Object > org.springframework.web.reactive.result.view.Mono<java.lang.Object> = Mono . from ( org.springframework.web.reactive.result.view.ReactiveAdapter . toPublisher ( java.lang.Object ) ) ; java.util.List<org.springframework.web.reactive.result.view.Mono<?>> . add ( org.springframework.web.reactive.result.view.Mono<java.lang.Object> . defaultIfEmpty ( java.lang.Object ) ) ; } } } if ( java.util.List<java.lang.String> . boolean ( ) ) { return Mono . empty ( ) ; } return Mono . when ( java.util.List<org.springframework.web.reactive.result.view.Mono<?>> , values -> { for ( int i = NUMBER ; i < values . length ; i ++ ) { if ( values [ i ] != NO_VALUE ) { model . put ( names . get ( i ) , values [ i ] ) ; } else { model . remove ( names . get ( i ) ) ; } } return NO_VALUE ; } ) . then ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.RequestContext org.springframework.web.reactive.result.view.RequestContext ( ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { return new RequestContext ( org.springframework.web.reactive.result.view.ServerWebExchange , java.util.Map<java.lang.String,java.lang.Object> , org.springframework.web.reactive.result.view.ApplicationContext ( ) , org.springframework.web.reactive.result.view.RequestDataValueProcessor ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.RequestDataValueProcessor org.springframework.web.reactive.result.view.RequestDataValueProcessor ( ) { ApplicationContext org.springframework.web.reactive.result.view.ApplicationContext = org.springframework.web.reactive.result.view.ApplicationContext ( ) ; if ( org.springframework.web.reactive.result.view.ApplicationContext != null && org.springframework.web.reactive.result.view.ApplicationContext . containsBean ( java.lang.String ) ) { return org.springframework.web.reactive.result.view.ApplicationContext . getBean ( java.lang.String , RequestDataValueProcessor .class ) ; } return null ; }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.web.reactive.result.view.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.Mono<java.lang.Void> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , MediaType org.springframework.web.reactive.result.view.MediaType , ServerWebExchange org.springframework.web.reactive.result.view.ServerWebExchange );  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return java.lang.Class<? extends org.springframework.web.reactive.result.view.AbstractView> ( ) . java.lang.String ( ) ; }  <METHOD_END>