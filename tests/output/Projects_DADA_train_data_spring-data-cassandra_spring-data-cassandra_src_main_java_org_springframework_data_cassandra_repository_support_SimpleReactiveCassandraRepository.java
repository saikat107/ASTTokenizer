<METHOD_START> public void ( CassandraEntityInformation < T , ID > org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> , ReactiveCassandraOperations org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> , STRING ) ; Assert . notNull ( org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations , STRING ) ; this . org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> = org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> ; this . org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations = org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > org.springframework.data.cassandra.repository.support.Mono<S> < S > org.springframework.data.cassandra.repository.support.Mono<S> ( S S ) { Assert . notNull ( S , STRING ) ; if ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . isNew ( S ) ) { return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . insert ( S ) ; } return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . update ( S ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > org.springframework.data.cassandra.repository.support.Flux<S> < S > org.springframework.data.cassandra.repository.support.Flux<S> ( java.lang.Iterable<S> < S > java.lang.Iterable<S> ) { Assert . notNull ( java.lang.Iterable<S> , STRING ) ; return org.springframework.data.cassandra.repository.support.Mono ( Flux . fromIterable ( java.lang.Iterable<S> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > org.springframework.data.cassandra.repository.support.Flux<S> < S > org.springframework.data.cassandra.repository.support.Flux<S> ( Publisher < S > org.springframework.data.cassandra.repository.support.Publisher<S> ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.Publisher<S> , STRING ) ; return Flux . from ( org.springframework.data.cassandra.repository.support.Publisher<S> ) . flatMap ( entity -> { if ( entityInformation . isNew ( entity ) ) { return operations . insert ( entity ) ; } return operations . update ( entity ) ; } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > org.springframework.data.cassandra.repository.support.Mono<S> < S > org.springframework.data.cassandra.repository.support.Mono<S> ( S S ) { Assert . notNull ( S , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . insert ( S ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > org.springframework.data.cassandra.repository.support.Flux<S> < S > org.springframework.data.cassandra.repository.support.Flux<S> ( java.lang.Iterable<S> < S > java.lang.Iterable<S> ) { Assert . notNull ( java.lang.Iterable<S> , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . insert ( Flux . fromIterable ( java.lang.Iterable<S> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < S extends T > org.springframework.data.cassandra.repository.support.Flux<S> < S > org.springframework.data.cassandra.repository.support.Flux<S> ( Publisher < S > org.springframework.data.cassandra.repository.support.Publisher<S> ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.Publisher<S> , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . insert ( org.springframework.data.cassandra.repository.support.Publisher<S> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<T> < T > org.springframework.data.cassandra.repository.support.Mono<T> ( ID ID ) { Assert . notNull ( ID , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . selectOneById ( ID , org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getJavaType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<T> < T > org.springframework.data.cassandra.repository.support.Mono<T> ( Mono < ID > org.springframework.data.cassandra.repository.support.Mono<ID> ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.Mono<ID> , STRING ) ; return org.springframework.data.cassandra.repository.support.Mono<ID> . then ( id -> operations . selectOneById ( id , entityInformation . getJavaType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Boolean> < java.lang.Boolean > org.springframework.data.cassandra.repository.support.Mono<java.lang.Boolean> ( ID ID ) { Assert . notNull ( ID , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . exists ( ID , org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getJavaType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Boolean> < java.lang.Boolean > org.springframework.data.cassandra.repository.support.Mono<java.lang.Boolean> ( Mono < ID > org.springframework.data.cassandra.repository.support.Mono<ID> ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.Mono<ID> , STRING ) ; return org.springframework.data.cassandra.repository.support.Mono<ID> . then ( id -> operations . exists ( id , entityInformation . getJavaType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Flux<T> < T > org.springframework.data.cassandra.repository.support.Flux<T> ( ) { Select org.springframework.data.cassandra.repository.support.Select = QueryBuilder . select ( ) . from ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getTableName ( ) . toCql ( ) ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . select ( org.springframework.data.cassandra.repository.support.Select , org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getJavaType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Flux<T> < T > org.springframework.data.cassandra.repository.support.Flux<T> ( java.lang.Iterable<ID> < ID > java.lang.Iterable<ID> ) { Assert . notNull ( java.lang.Iterable<ID> , STRING ) ; return org.springframework.data.cassandra.repository.support.Flux<T> ( Flux . fromIterable ( java.lang.Iterable<ID> ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Flux<T> < T > org.springframework.data.cassandra.repository.support.Flux<T> ( Publisher < ID > org.springframework.data.cassandra.repository.support.Publisher<ID> ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.Publisher<ID> , STRING ) ; return Flux . from ( org.springframework.data.cassandra.repository.support.Publisher<ID> ) . flatMap ( id -> operations . selectOneById ( id , entityInformation . getJavaType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Long> < java.lang.Long > org.springframework.data.cassandra.repository.support.Mono<java.lang.Long> ( ) { return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . count ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getJavaType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> ( ID ID ) { Assert . notNull ( ID , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . deleteById ( ID , org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getJavaType ( ) ) . then ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> ( T T ) { Assert . notNull ( T , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . delete ( T ) . then ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> ( java.lang.Iterable<? extends T> < ? extends T > java.lang.Iterable<? extends T> ) { Assert . notNull ( java.lang.Iterable<> , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . delete ( Flux . fromIterable ( java.lang.Iterable<> ) ) . then ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> ( Publisher < ? extends T > org.springframework.data.cassandra.repository.support.Publisher<? extends T> ) { Assert . notNull ( org.springframework.data.cassandra.repository.support.Publisher<> , STRING ) ; return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . delete ( org.springframework.data.cassandra.repository.support.Publisher<> ) . then ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> < java.lang.Void > org.springframework.data.cassandra.repository.support.Mono<java.lang.Void> ( ) { return org.springframework.data.cassandra.repository.support.ReactiveCassandraOperations . truncate ( org.springframework.data.cassandra.repository.support.CassandraEntityInformation<T,ID> . getJavaType ( ) ) ; }  <METHOD_END>