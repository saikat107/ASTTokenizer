<METHOD_START> @ Test public void void ( ) java.lang.Exception { TypeDescriptor org.springframework.data.repository.core.support.TypeDescriptor = org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ; java.util.List<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > java.util.List<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = java.util.Collections . java.util.List<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; assertThat ( org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( java.util.List<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ) ) . isInstanceOf ( java.util.Set .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( null , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isEqualTo ( java.util.Optional . java.util.Optional<java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity = new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( java.util.Optional .class ) ; java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ) . isEqualTo ( java.util.Optional . java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( null , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isEqualTo ( com . google . common . base . Optional . absent ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity = new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( com . com.google . com.google . com.google . com.google .class ) ; com . com.google . com.google . com.google . com.google < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > optional = ( com . com.google . com.google . com.google . com.google < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( optional ) . isEqualTo ( com . com.google . com.google . com.google . Optional . of ( org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( null , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ) . isInstanceOf ( java.util.Map .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Single . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Publisher .class ) ; Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . from ( ( Publisher < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ) ; assertThat ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Single . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Single . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Flux .class ) ; Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . next ( ) . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Observable . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Publisher .class ) ; Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . from ( ( Publisher < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ) ; assertThat ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Observable . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Observable . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Flux .class ) ; Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . next ( ) . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Observable . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Single .class ) ; Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Single . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Observable .class ) ; Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Single .class ) ; Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Completable .class ) ; Completable org.springframework.data.repository.core.support.Completable = ( Completable ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Completable . get ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . error ( new InvalidDataAccessApiUsageException ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Completable .class ) ; Completable org.springframework.data.repository.core.support.Completable = ( Completable ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Completable . get ( ) ) . isInstanceOf ( InvalidDataAccessApiUsageException .class ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Completable org.springframework.data.repository.core.support.Completable = Completable . complete ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Completable , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; Mono org.springframework.data.repository.core.support.Mono = ( Mono ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Mono . block ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Completable org.springframework.data.repository.core.support.Completable = Completable . error ( new InvalidDataAccessApiUsageException ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Completable , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; Mono org.springframework.data.repository.core.support.Mono = ( Mono ) java.lang.Object ; org.springframework.data.repository.core.support.Mono . block ( ) ; fail ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Observable .class ) ; Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Flux . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Single .class ) ; Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Single < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . value ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . next ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Flux . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Observable .class ) ; Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Observable < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . toBlocking ( ) . first ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . next ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Flux . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Mono .class ) ; Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . next ( ) . block ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { Mono < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = Mono . just ( new org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity ( ) ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.core.support.QueryExecutionResultHandler . postProcessInvocationResult ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> , org.springframework.data.repository.core.support.TypeDescriptor ( STRING ) ) ; assertThat ( java.lang.Object ) . isInstanceOf ( Flux .class ) ; Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> = ( Flux < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > ) java.lang.Object ; assertThat ( org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . next ( ) . block ( ) ) . isEqualTo ( org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> . block ( ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.repository.core.support.TypeDescriptor org.springframework.data.repository.core.support.TypeDescriptor ( java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Sample .class . java.lang.reflect.Method ( java.lang.String ) ; MethodParameter org.springframework.data.repository.core.support.MethodParameter = new MethodParameter ( java.lang.reflect.Method , - NUMBER ) ; return TypeDescriptor . nested ( org.springframework.data.repository.core.support.MethodParameter , NUMBER ) ; }  <METHOD_END>
<METHOD_START> java.util.Set<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > java.util.Set<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > java.util.Optional<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> com . com.google . com.google . com.google . com.google < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > guavaOptional ( )  <METHOD_END>
<METHOD_START> java.util.Map<java.lang.Integer,org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < java.lang.Integer , org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > java.util.Map<java.lang.Integer,org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.core.support.Publisher<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Publisher<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Mono<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Flux<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Observable<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> < org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity > org.springframework.data.repository.core.support.Single<org.springframework.data.repository.core.support.QueryExecutionResultHandlerUnitTests.Entity> ( )  <METHOD_END>
<METHOD_START> org.springframework.data.repository.core.support.Completable org.springframework.data.repository.core.support.Completable ( )  <METHOD_END>