<METHOD_START> public void ( GraphQueryMethod org.springframework.data.neo4j.repository.query.GraphQueryMethod , Session org.springframework.data.neo4j.repository.query.Session ) { super( org.springframework.data.neo4j.repository.query.GraphQueryMethod , org.springframework.data.neo4j.repository.query.Session ); this . org.springframework.data.neo4j.repository.query.GraphQueryMethod = org.springframework.data.neo4j.repository.query.GraphQueryMethod ; this . org.springframework.data.neo4j.repository.query.Session = org.springframework.data.neo4j.repository.query.Session ; }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( Query org.springframework.data.neo4j.repository.query.Query , java.lang.Object [] java.lang.Object[] ) { if ( org.springframework.data.neo4j.repository.query.Logger . isDebugEnabled ( ) ) { org.springframework.data.neo4j.repository.query.Logger . debug ( STRING , org.springframework.data.neo4j.repository.query.GraphQueryMethod . getName ( ) ) ; } GraphParameterAccessor org.springframework.data.neo4j.repository.query.GraphParameterAccessor = new GraphParametersParameterAccessor ( org.springframework.data.neo4j.repository.query.GraphQueryMethod , java.lang.Object[] ) ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.data.neo4j.repository.query.GraphQueryMethod . getMethod ( ) . getReturnType ( ) ; ResultProcessor org.springframework.data.neo4j.repository.query.ResultProcessor = org.springframework.data.neo4j.repository.query.GraphQueryMethod . getResultProcessor ( ) . withDynamicProjection ( org.springframework.data.neo4j.repository.query.GraphParameterAccessor ) ; java.lang.Object java.lang.Object = getExecution ( org.springframework.data.neo4j.repository.query.GraphParameterAccessor ) . execute ( org.springframework.data.neo4j.repository.query.Query , org.springframework.data.neo4j.repository.query.ResultProcessor . getReturnedType ( ) . getReturnedType ( ) ) ; return Result .class . boolean ( java.lang.Class<> ) ? java.lang.Object : org.springframework.data.neo4j.repository.query.ResultProcessor . withDynamicProjection ( org.springframework.data.neo4j.repository.query.GraphParameterAccessor ) . processResult ( java.lang.Object , new CustomResultConverter ( org.springframework.data.neo4j.repository.query.MetaData ( ) , org.springframework.data.neo4j.repository.query.ResultProcessor . getReturnedType ( ) . getReturnedType ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.neo4j.repository.query.MetaData org.springframework.data.neo4j.repository.query.MetaData ( ) { return org.springframework.data.neo4j.repository.query.Session . doInTransaction ( ( requestHandler , transaction , metaData ) -> metaData ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.neo4j.repository.query.Query org.springframework.data.neo4j.repository.query.Query ( java.lang.Object [] java.lang.Object[] ) { return new Query ( java.lang.String ( ) , org.springframework.data.neo4j.repository.query.GraphQueryMethod . getCountQueryString ( ) , java.util.Map<java.lang.String,java.lang.Object> ( java.lang.Object[] ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( ) { return getQueryMethod ( ) . getQuery ( ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.lang.Object [] java.lang.Object[] ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; Parameters < ? , ? > org.springframework.data.neo4j.repository.query.Parameters<?,?> = org.springframework.data.neo4j.repository.query.GraphQueryMethod . getParameters ( ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { Parameter org.springframework.data.neo4j.repository.query.Parameter = org.springframework.data.neo4j.repository.query.Parameters<,> . getParameter ( int ) ; java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Object[] [ int ] ) ; if ( org.springframework.data.neo4j.repository.query.Parameter . isExplicitlyNamed ( ) ) { org.springframework.data.neo4j.repository.query.Parameter . getName ( ) . ifPresent ( name -> params . put ( name , parameterValue ) ) ; } else { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING + int , java.lang.Object ) ; } } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = org.springframework.data.neo4j.repository.query.Session . resolveGraphIdFor ( java.lang.Object ) ; if ( java.lang.Object == null ) { java.lang.Object = java.lang.Object ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return false ; }  <METHOD_END>