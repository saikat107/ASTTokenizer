<METHOD_START> public void ( CassandraQueryMethod org.springframework.data.cassandra.repository.query.CassandraQueryMethod , java.lang.Object [] java.lang.Object[] ) { super( org.springframework.data.cassandra.repository.query.CassandraQueryMethod , java.lang.Object[] ); this . java.lang.Object[] = java.lang.Object[] ; this . java.util.List<org.springframework.data.cassandra.repository.query.MonoProcessor<?>> = new java.util.ArrayList <> ( java.lang.Object[] . int ) ; for ( java.lang.Object java.lang.Object : java.lang.Object[] ) { if ( java.lang.Object == null || ! ReactiveWrappers . supports ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { java.util.List<org.springframework.data.cassandra.repository.query.MonoProcessor<?>> . add ( null ) ; continue; } if ( ReactiveWrappers . isSingleValueType ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { java.util.List<org.springframework.data.cassandra.repository.query.MonoProcessor<?>> . add ( ReactiveWrapperConverters . toWrapper ( java.lang.Object , Mono .class ) . subscribe ( ) ) ; } else { java.util.List<org.springframework.data.cassandra.repository.query.MonoProcessor<?>> . add ( ReactiveWrapperConverters . toWrapper ( java.lang.Object , Flux .class ) . collectList ( ) . subscribe ( ) ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override protected < T > T T ( int int ) { return ( java.util.List<org.springframework.data.cassandra.repository.query.MonoProcessor<?>> . get ( int ) != null ? ( T ) java.util.List<org.springframework.data.cassandra.repository.query.MonoProcessor<?>> . get ( int ) . block ( ) : super. getValue ( int ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object [] java.lang.Object[] ( ) { java.lang.Object [] java.lang.Object[] = new java.lang.Object [ java.lang.Object[] . int ] ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { java.lang.Object[] [ int ] = java.lang.Object ( int ) ; } return java.lang.Object[] ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( int int ) { return java.lang.Object ( getParameters ( ) . getBindableParameter ( int ) . getIndex ( ) ) ; }  <METHOD_END>