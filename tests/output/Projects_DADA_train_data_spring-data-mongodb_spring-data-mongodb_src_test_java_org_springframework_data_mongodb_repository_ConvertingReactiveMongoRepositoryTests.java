<METHOD_START> @ Before public void void ( ) { StepVerifier . create ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.MixedReactivePersonRepostitory . deleteAll ( ) ) . verifyComplete ( ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson = new org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ( STRING , STRING , NUMBER ) ; StepVerifier . create ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.MixedReactivePersonRepostitory . save ( java.util.Arrays . java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) ) ) . expectNextCount ( NUMBER ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StepVerifier . create ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePersonRepostitory . exists ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getId ( ) ) ) . expectNext ( true ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StepVerifier . create ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePersonRepostitory . org.springframework.data.mongodb.repository.Publisher<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) ) . expectNext ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava1PersonRepostitory . exists ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getId ( ) ) . test ( ) . awaitTerminalEvent ( ) . assertValue ( true ) . assertNoErrors ( ) . assertCompleted ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava1PersonRepostitory . exists ( Single . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getId ( ) ) ) . test ( ) . awaitTerminalEvent ( ) . assertValue ( true ) . assertNoErrors ( ) . assertCompleted ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava1PersonRepostitory . org.springframework.data.mongodb.repository.Observable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getFirstname ( ) , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) . test ( ) . awaitTerminalEvent ( ) . assertValue ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) . assertNoErrors ( ) . assertCompleted ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson > java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava1PersonRepostitory . org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) . test ( ) . awaitTerminalEvent ( ) . assertValueCount ( NUMBER ) . assertNoErrors ( ) . assertCompleted ( ) . getOnNextEvents ( ) ; org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson = java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson ( NUMBER ) ; assertThat ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson . java.lang.String ( ) , is ( equalTo ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getFirstname ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava1PersonRepostitory . org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) . test ( ) . awaitTerminalEvent ( ) . assertValue ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) . assertNoErrors ( ) . assertCompleted ( ) . getOnNextEvents ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestObserver < java.lang.Boolean > org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava2PersonRepostitory . exists ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getId ( ) ) . test ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . awaitTerminalEvent ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . assertComplete ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . assertNoErrors ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . assertValue ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestObserver < java.lang.Boolean > org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava2PersonRepostitory . exists ( io . reactivex . Single . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getId ( ) ) ) . test ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . awaitTerminalEvent ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . assertComplete ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . assertNoErrors ( ) ; org.springframework.data.mongodb.repository.TestObserver<java.lang.Boolean> . assertValue ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { io . io . io . io < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > testSubscriber = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava2PersonRepostitory . org.springframework.data.mongodb.repository.Flowable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getFirstname ( ) , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) . test ( ) ; testSubscriber . awaitTerminalEvent ( ) ; testSubscriber . assertComplete ( ) ; testSubscriber . assertNoErrors ( ) ; testSubscriber . assertValue ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestObserver < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson > org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava2PersonRepostitory . findProjectedByLastname ( Maybe . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) ) . test ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . awaitTerminalEvent ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . assertComplete ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . assertNoErrors ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . assertValue ( actual -> { assertThat ( actual . getFirstname ( ) , is ( equalTo ( carter . getFirstname ( ) ) ) ) ; return true ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestObserver < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson > org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava2PersonRepostitory . findProjectedByLastname ( Single . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) ) . test ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . awaitTerminalEvent ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . assertComplete ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . assertNoErrors ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> . assertValue ( actual -> { assertThat ( actual . getFirstname ( ) , is ( equalTo ( carter . getFirstname ( ) ) ) ) ; return true ; } ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestObserver < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.RxJava2PersonRepostitory . org.springframework.data.mongodb.repository.Maybe<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) . test ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> . awaitTerminalEvent ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> . assertComplete ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> . assertNoErrors ( ) ; org.springframework.data.mongodb.repository.TestObserver<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> . assertValue ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.MixedReactivePersonRepostitory . org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) . test ( ) . awaitTerminalEvent ( ) . assertValue ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) . assertNoErrors ( ) . assertCompleted ( ) . getOnNextEvents ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StepVerifier . create ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.MixedReactivePersonRepostitory . org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( Single . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) ) ) . expectNext ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { StepVerifier . create ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.MixedReactivePersonRepostitory . org.springframework.data.mongodb.repository.Flux<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( Observable . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) ) ) . expectNextCount ( NUMBER ) . verifyComplete ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> = org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.MixedReactivePersonRepostitory . org.springframework.data.mongodb.repository.Observable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( Flux . just ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson . getLastname ( ) ) , NUMBER ) . test ( ) . awaitTerminalEvent ( ) . assertValueCount ( NUMBER ) . assertNoErrors ( ) . assertCompleted ( ) . getOnNextEvents ( ) ; assertThat ( java.util.List<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> , hasItems ( org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson , org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson ) ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Publisher<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Publisher<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Observable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Observable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson > org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Flowable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Flowable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Maybe<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Maybe<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> io . io . io < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson > findProjectedByLastname ( Maybe < java.lang.String > org.springframework.data.mongodb.repository.Maybe<java.lang.String> );  <METHOD_END>
<METHOD_START> io . io . io < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ProjectedPerson > findProjectedByLastname ( Single < java.lang.String > org.springframework.data.mongodb.repository.Single<java.lang.String> );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Single<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Mono<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Mono<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( Single < java.lang.String > org.springframework.data.mongodb.repository.Single<java.lang.String> );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Flux<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Flux<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( Observable < java.lang.String > org.springframework.data.mongodb.repository.Observable<java.lang.String> );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Flux<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Flux<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( java.lang.String java.lang.String , Sort org.springframework.data.mongodb.repository.Sort );  <METHOD_END>
<METHOD_START> org.springframework.data.mongodb.repository.Observable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> < org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson > org.springframework.data.mongodb.repository.Observable<org.springframework.data.mongodb.repository.ConvertingReactiveMongoRepositoryTests.ReactivePerson> ( Flux < java.lang.String > org.springframework.data.mongodb.repository.Flux<java.lang.String> , int int );  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.String java.lang.String , int int ) { this . java.lang.String = java.lang.String ; this . java.lang.String = java.lang.String ; this . int = int ; }  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>
<METHOD_START> java.lang.String java.lang.String ( )  <METHOD_END>