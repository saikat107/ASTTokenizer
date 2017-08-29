<METHOD_START> public void ( ) { this( new ReactiveAdapterRegistry ( ) , new SyncTaskExecutor ( ) , new ContentNegotiationManager ( ) ); }  <METHOD_END>
<METHOD_START> void ( ReactiveAdapterRegistry org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry , TaskExecutor org.springframework.web.servlet.mvc.method.annotation.TaskExecutor , ContentNegotiationManager org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager ) { Assert . notNull ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry , STRING ) ; Assert . notNull ( org.springframework.web.servlet.mvc.method.annotation.TaskExecutor , STRING ) ; Assert . notNull ( org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager , STRING ) ; this . org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry = org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry ; this . org.springframework.web.servlet.mvc.method.annotation.TaskExecutor = org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ; this . org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager = org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry . hasAdapters ( ) && this . org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry . getAdapter ( java.lang.Class<> ) != null ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( java.lang.Object java.lang.Object , MethodParameter org.springframework.web.servlet.mvc.method.annotation.MethodParameter , ModelAndViewContainer org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer , NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) throws java.lang.Exception { Assert . notNull ( java.lang.Object , STRING ) ; ReactiveAdapter org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter = this . org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapterRegistry . getAdapter ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; Assert . state ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter != null , STRING + java.lang.Object ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.web.servlet.mvc.method.annotation.MethodParameter . nested ( ) . getNestedParameterType ( ) ; java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> = java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) ; java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> = java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> . stream ( ) . filter ( MimeType :: isConcrete ) . findFirst ( ) ; boolean boolean = boolean ( java.lang.Class<> , java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ; if ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter . isMultiValue ( ) ) { if ( java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> . stream ( ) . anyMatch ( MediaType . TEXT_EVENT_STREAM :: includes ) || ServerSentEvent .class . boolean ( java.lang.Class<> ) ) { SseEmitter org.springframework.web.servlet.mvc.method.annotation.SseEmitter = new SseEmitter ( ) ; new org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.SseEmitterSubscriber ( org.springframework.web.servlet.mvc.method.annotation.SseEmitter , this . org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) . void ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter , java.lang.Object ) ; return org.springframework.web.servlet.mvc.method.annotation.SseEmitter ; } if ( java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> . stream ( ) . anyMatch ( MediaType . APPLICATION_STREAM_JSON :: includes ) ) { ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter = org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( MediaType . APPLICATION_STREAM_JSON ) ; new org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.JsonEmitterSubscriber ( org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , this . org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) . void ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter , java.lang.Object ) ; return org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ; } if ( java.lang.CharSequence .class . boolean ( java.lang.Class<> ) && ! boolean ) { ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter = org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> . orElse ( MediaType . TEXT_PLAIN ) ) ; new org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.TextEmitterSubscriber ( org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , this . org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) . void ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter , java.lang.Object ) ; return org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ; } } DeferredResult < java.lang.Object > org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> = new DeferredResult <> ( ) ; new org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.DeferredResultSubscriber ( org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> , boolean ) . void ( org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter , java.lang.Object ) ; WebAsyncUtils . getAsyncManager ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) . startDeferredResultProcessing ( org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> , org.springframework.web.servlet.mvc.method.annotation.ModelAndViewContainer ) ; return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> ( NativeWebRequest org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest )			throws org.springframework.web.servlet.mvc.method.annotation.HttpMediaTypeNotAcceptableException { java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> = ( java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > ) org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest . getAttribute ( HandlerMapping . PRODUCIBLE_MEDIA_TYPES_ATTRIBUTE , RequestAttributes . SCOPE_REQUEST ) ; return CollectionUtils . isEmpty ( java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) ? this . org.springframework.web.servlet.mvc.method.annotation.ContentNegotiationManager . resolveMediaTypes ( org.springframework.web.servlet.mvc.method.annotation.NativeWebRequest ) : java.util.Collection<org.springframework.web.servlet.mvc.method.annotation.MediaType> ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> , java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> < MediaType > java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> ) { return java.lang.CharSequence .class . boolean ( java.lang.Class<> ) && java.util.Optional<org.springframework.web.servlet.mvc.method.annotation.MediaType> . filter ( type -> MediaType . APPLICATION_JSON . includes ( type ) || JSON_TYPE . includes ( type ) ) . isPresent ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( MediaType org.springframework.web.servlet.mvc.method.annotation.MediaType ) { return new ResponseBodyEmitter ( ) { @ java.lang.Override protected void void ( ServerHttpResponse org.springframework.web.servlet.mvc.method.annotation.ServerHttpResponse ) { org.springframework.web.servlet.mvc.method.annotation.ServerHttpResponse . getHeaders ( ) . setContentType ( org.springframework.web.servlet.mvc.method.annotation.MediaType ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ServerHttpResponse org.springframework.web.servlet.mvc.method.annotation.ServerHttpResponse ) { org.springframework.web.servlet.mvc.method.annotation.ServerHttpResponse . getHeaders ( ) . setContentType ( org.springframework.web.servlet.mvc.method.annotation.MediaType ) ; }  <METHOD_END>
<METHOD_START> protected void ( ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , TaskExecutor org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) { this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter = org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ; this . org.springframework.web.servlet.mvc.method.annotation.TaskExecutor = org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ; }  <METHOD_END>
<METHOD_START> public void void ( ReactiveAdapter org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter , java.lang.Object java.lang.Object ) { Publisher < java.lang.Object > org.springframework.web.servlet.mvc.method.annotation.Publisher<java.lang.Object> = org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter . toPublisher ( java.lang.Object ) ; org.springframework.web.servlet.mvc.method.annotation.Publisher<java.lang.Object> . subscribe ( this ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) { return this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final void void ( Subscription org.springframework.web.servlet.mvc.method.annotation.Subscription ) { this . org.springframework.web.servlet.mvc.method.annotation.Subscription = org.springframework.web.servlet.mvc.method.annotation.Subscription ; if ( org.springframework.web.servlet.mvc.method.annotation.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.mvc.method.annotation.Log . debug ( STRING + this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ) ; } this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter . onTimeout ( ( ) { if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + this . emitter ) ; } terminate ( ) ; this . emitter . complete ( ) ; } ) ; org.springframework.web.servlet.mvc.method.annotation.Subscription . request ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final void void ( java.lang.Object java.lang.Object ) { this . java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( java.lang.Object ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final void void ( java.lang.Throwable java.lang.Throwable ) { this . java.lang.Throwable = java.lang.Throwable ; this . boolean = true ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final void void ( ) { this . boolean = true ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( this . java.util.concurrent.atomic.AtomicLong . long ( ) == NUMBER ) { void ( ) ; } }  <METHOD_END>
<METHOD_START> private void void ( ) { try { this . org.springframework.web.servlet.mvc.method.annotation.TaskExecutor . execute ( this ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { try { void ( ) ; } finally { this . java.util.concurrent.atomic.AtomicLong . long ( ) ; this . java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( null ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . boolean ) { this . java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( null ) ; return; } boolean boolean = this . boolean ; java.lang.Object java.lang.Object = this . java.util.concurrent.atomic.AtomicReference<java.lang.Object> . java.lang.Object ( ) ; if ( java.lang.Object != null ) { this . java.util.concurrent.atomic.AtomicReference<java.lang.Object> . void ( null ) ; try { void ( java.lang.Object ) ; this . org.springframework.web.servlet.mvc.method.annotation.Subscription . request ( NUMBER ) ; } catch ( final java.lang.Throwable java.lang.Throwable ) { if ( org.springframework.web.servlet.mvc.method.annotation.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.mvc.method.annotation.Log . debug ( STRING + this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , java.lang.Throwable ) ; } void ( ) ; return; } } if ( boolean ) { this . boolean = true ; java.lang.Throwable java.lang.Throwable = this . java.lang.Throwable ; this . java.lang.Throwable = null ; if ( java.lang.Throwable != null ) { if ( org.springframework.web.servlet.mvc.method.annotation.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.mvc.method.annotation.Log . debug ( STRING + this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , java.lang.Throwable ) ; } this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter . completeWithError ( java.lang.Throwable ) ; } else { if ( org.springframework.web.servlet.mvc.method.annotation.Log . isDebugEnabled ( ) ) { org.springframework.web.servlet.mvc.method.annotation.Log . debug ( STRING + this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ) ; } this . org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter . complete ( ) ; } return; } if ( this . java.util.concurrent.atomic.AtomicLong . long ( ) != NUMBER ) { void ( ) ; } }  <METHOD_END>
<METHOD_START> protected abstract void void ( java.lang.Object java.lang.Object ) throws java.io.IOException ;  <METHOD_END>
<METHOD_START> private void void ( ) { this . boolean = true ; this . org.springframework.web.servlet.mvc.method.annotation.Subscription . cancel ( ) ; }  <METHOD_END>
<METHOD_START> void ( SseEmitter org.springframework.web.servlet.mvc.method.annotation.SseEmitter , TaskExecutor org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) { super( org.springframework.web.servlet.mvc.method.annotation.SseEmitter , org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { if ( java.lang.Object instanceof ServerSentEvent ) { ServerSentEvent < ? > org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<?> = ( ServerSentEvent < ? > ) java.lang.Object ; ( ( SseEmitter ) org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) ) . send ( SseEmitter.SseEventBuilder ( org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<> ) ) ; } else { org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) . send ( java.lang.Object , MediaType . APPLICATION_JSON ) ; } }  <METHOD_END>
<METHOD_START> private SseEmitter . SseEmitter.SseEventBuilder SseEmitter.SseEventBuilder ( ServerSentEvent < ? > org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<?> ) { SseEmitter . SseEmitter SseEmitter.SseEventBuilder = SseEmitter . event ( ) ; org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<> . id ( ) . ifPresent ( SseEmitter.SseEventBuilder :: id ) ; org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<> . comment ( ) . ifPresent ( SseEmitter.SseEventBuilder :: comment ) ; org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<> . data ( ) . ifPresent ( SseEmitter.SseEventBuilder :: data ) ; org.springframework.web.servlet.mvc.method.annotation.ServerSentEvent<> . retry ( ) . ifPresent ( duration -> builder . reconnectTime ( duration . toMillis ( ) ) ) ; return SseEmitter.SseEventBuilder ; }  <METHOD_END>
<METHOD_START> void ( ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , TaskExecutor org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) { super( org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) . send ( java.lang.Object , MediaType . APPLICATION_JSON ) ; org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) . send ( STRING , MediaType . TEXT_PLAIN ) ; }  <METHOD_END>
<METHOD_START> void ( ResponseBodyEmitter org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , TaskExecutor org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ) { super( org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter , org.springframework.web.servlet.mvc.method.annotation.TaskExecutor ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.Object java.lang.Object ) throws java.io.IOException { org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter ( ) . send ( java.lang.Object , MediaType . TEXT_PLAIN ) ; }  <METHOD_END>
<METHOD_START> void ( DeferredResult < java.lang.Object > org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> , boolean boolean ) { this . org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> = org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( ReactiveAdapter org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter , java.lang.Object java.lang.Object ) { Publisher < java.lang.Object > org.springframework.web.servlet.mvc.method.annotation.Publisher<java.lang.Object> = org.springframework.web.servlet.mvc.method.annotation.ReactiveAdapter . toPublisher ( java.lang.Object ) ; org.springframework.web.servlet.mvc.method.annotation.Publisher<java.lang.Object> . subscribe ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Subscription org.springframework.web.servlet.mvc.method.annotation.Subscription ) { this . org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> . onTimeout ( org.springframework.web.servlet.mvc.method.annotation.Subscription :: cancel ) ; org.springframework.web.servlet.mvc.method.annotation.Subscription . request ( java.lang.Long . long ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) { this . org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.CollectedValuesList . boolean ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Throwable java.lang.Throwable ) { this . org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> . setErrorResult ( java.lang.Throwable ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { if ( this . org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.CollectedValuesList . int ( ) > NUMBER ) { this . org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> . setResult ( this . org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.CollectedValuesList ) ; } else if ( this . org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.CollectedValuesList . int ( ) == NUMBER ) { this . org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> . setResult ( this . org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.CollectedValuesList . java.lang.Object ( NUMBER ) ) ; } else { this . org.springframework.web.servlet.mvc.method.annotation.DeferredResult<java.lang.Object> . setResult ( this . boolean ? this . org.springframework.web.servlet.mvc.method.annotation.ReactiveTypeHandler.CollectedValuesList : null ) ; } }  <METHOD_END>