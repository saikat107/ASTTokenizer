<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public T T ( java.lang.String java.lang.String ) { return ( T ) super. name ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public T T ( CqlIdentifier org.springframework.cassandra.core.keyspace.CqlIdentifier ) { return ( T ) super. name ( org.springframework.cassandra.core.keyspace.CqlIdentifier ) ; }  <METHOD_END>
<METHOD_START> public T T ( TableOption org.springframework.cassandra.core.keyspace.TableOption ) { return T ( org.springframework.cassandra.core.keyspace.TableOption , null ) ; }  <METHOD_END>
<METHOD_START> public T T ( TableOption org.springframework.cassandra.core.keyspace.TableOption , java.lang.Object java.lang.Object ) { org.springframework.cassandra.core.keyspace.TableOption . checkValue ( java.lang.Object ) ; return T ( org.springframework.cassandra.core.keyspace.TableOption . getName ( ) , java.lang.Object , org.springframework.cassandra.core.keyspace.TableOption . escapesValue ( ) , org.springframework.cassandra.core.keyspace.TableOption . quotesValue ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public T T ( java.lang.String java.lang.String , java.lang.Object java.lang.Object , boolean boolean , boolean boolean ) { if ( ! ( java.lang.Object instanceof java.util.Map ) ) { if ( boolean ) { java.lang.Object = escapeSingle ( java.lang.Object ) ; } if ( boolean ) { java.lang.Object = singleQuote ( java.lang.Object ) ; } } java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; return ( T ) this ; }  <METHOD_END>
<METHOD_START> public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) { return java.util.Collections . java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>