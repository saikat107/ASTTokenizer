<METHOD_START> public void ( UDTValue org.springframework.data.cassandra.convert.UDTValue , CodecRegistry org.springframework.data.cassandra.convert.CodecRegistry , DefaultSpELExpressionEvaluator org.springframework.data.cassandra.convert.DefaultSpELExpressionEvaluator ) { Assert . notNull ( org.springframework.data.cassandra.convert.UDTValue , STRING ) ; Assert . notNull ( org.springframework.data.cassandra.convert.CodecRegistry , STRING ) ; Assert . notNull ( org.springframework.data.cassandra.convert.DefaultSpELExpressionEvaluator , STRING ) ; this . org.springframework.data.cassandra.convert.UDTValue = org.springframework.data.cassandra.convert.UDTValue ; this . org.springframework.data.cassandra.convert.CodecRegistry = org.springframework.data.cassandra.convert.CodecRegistry ; this . org.springframework.data.cassandra.convert.SpELExpressionEvaluator = org.springframework.data.cassandra.convert.DefaultSpELExpressionEvaluator ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > java.util.Optional<T> < T > java.util.Optional<T> ( CassandraPersistentProperty org.springframework.data.cassandra.convert.CassandraPersistentProperty ) { java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> = org.springframework.data.cassandra.convert.CassandraPersistentProperty . getSpelExpression ( ) ; if ( java.util.Optional<java.lang.String> . boolean ( ) ) { return java.util.Optional<java.lang.String> . java.util.Optional<T> ( java.lang.String -> java.util.Optional . java.util.Optional ( org.springframework.data.cassandra.convert.SpELExpressionEvaluator . evaluate ( java.lang.String ) ) ) ; } java.lang.String java.lang.String = org.springframework.data.cassandra.convert.CassandraPersistentProperty . getColumnName ( ) . toCql ( ) ; DataType org.springframework.data.cassandra.convert.DataType = org.springframework.data.cassandra.convert.UDTValue . getType ( ) . getFieldType ( java.lang.String ) ; return java.util.Optional . java.util.Optional ( org.springframework.data.cassandra.convert.UDTValue . get ( java.lang.String , org.springframework.data.cassandra.convert.CodecRegistry . codecFor ( org.springframework.data.cassandra.convert.DataType ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( CassandraPersistentProperty org.springframework.data.cassandra.convert.CassandraPersistentProperty ) { return org.springframework.data.cassandra.convert.UDTValue . getType ( ) . contains ( org.springframework.data.cassandra.convert.CassandraPersistentProperty . getColumnName ( ) . toCql ( ) ) ; }  <METHOD_END>