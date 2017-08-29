<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); Assert . hasText ( java.lang.String , STRING ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.lang.String java.lang.String ) { return this . org.springframework.data.solr.core.query.ParameterHolder<T> . get ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( T T ) { Assert . notNull ( T , STRING ) ; this . org.springframework.data.solr.core.query.ParameterHolder<T> . add ( T ) ; }  <METHOD_END>
<METHOD_START> public T T ( java.lang.String java.lang.String ) { return this . org.springframework.data.solr.core.query.ParameterHolder<T> . remove ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.util.Collection<T> < T > java.util.Collection<T> ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<T> . getParameters ( ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! this . org.springframework.data.solr.core.query.ParameterHolder<T> . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> public < S > S S ( java.lang.String java.lang.String ) { return this . org.springframework.data.solr.core.query.ParameterHolder<T> . getParameterValue ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<T> < T > java.util.Iterator<T> ( ) { return this . org.springframework.data.solr.core.query.ParameterHolder<T> . iterator ( ) ; }  <METHOD_END>
