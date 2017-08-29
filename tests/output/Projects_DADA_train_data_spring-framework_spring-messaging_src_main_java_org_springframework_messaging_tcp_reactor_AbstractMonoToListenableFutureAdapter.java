<METHOD_START> protected void ( Mono < S > org.springframework.messaging.tcp.reactor.Mono<S> ) { Assert . notNull ( org.springframework.messaging.tcp.reactor.Mono<S> , STRING ) ; this . org.springframework.messaging.tcp.reactor.MonoProcessor<S> = org.springframework.messaging.tcp.reactor.Mono<S> . doOnSuccess ( result -> { T adapted ; try { adapted = adapt ( result ) ; } catch ( Throwable ex ) { registry . failure ( ex ) ; return; } registry . success ( adapted ) ; } ) . doOnError ( this . org.springframework.messaging.tcp.reactor.ListenableFutureCallbackRegistry<T> :: failure ) . subscribe ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( ) java.lang.InterruptedException { S S = this . org.springframework.messaging.tcp.reactor.MonoProcessor<S> . block ( ) ; return T ( S ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public T T ( long long , java.util.concurrent.TimeUnit java.util.concurrent.TimeUnit ) throws java.lang.InterruptedException , java.util.concurrent.ExecutionException , java.util.concurrent.TimeoutException { Assert . notNull ( java.util.concurrent.TimeUnit , STRING ) ; java.time.Duration java.time.Duration = java.time.Duration . java.time.Duration ( java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit . long ( long , java.util.concurrent.TimeUnit ) ) ; S S = this . org.springframework.messaging.tcp.reactor.MonoProcessor<S> . block ( java.time.Duration ) ; return T ( S ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( boolean boolean ) { if ( boolean ( ) ) { return false ; } this . org.springframework.messaging.tcp.reactor.MonoProcessor<S> . cancel ( ) ; return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.messaging.tcp.reactor.MonoProcessor<S> . isCancelled ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.messaging.tcp.reactor.MonoProcessor<S> . isTerminated ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ListenableFutureCallback < ? super T > org.springframework.messaging.tcp.reactor.ListenableFutureCallback<? super T> ) { this . org.springframework.messaging.tcp.reactor.ListenableFutureCallbackRegistry<T> . addCallback ( org.springframework.messaging.tcp.reactor.ListenableFutureCallback<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SuccessCallback < ? super T > org.springframework.messaging.tcp.reactor.SuccessCallback<? super T> , FailureCallback org.springframework.messaging.tcp.reactor.FailureCallback ) { this . org.springframework.messaging.tcp.reactor.ListenableFutureCallbackRegistry<T> . addSuccessCallback ( org.springframework.messaging.tcp.reactor.SuccessCallback<> ) ; this . org.springframework.messaging.tcp.reactor.ListenableFutureCallbackRegistry<T> . addFailureCallback ( org.springframework.messaging.tcp.reactor.FailureCallback ) ; }  <METHOD_END>
<METHOD_START> protected abstract T T ( S S );  <METHOD_END>