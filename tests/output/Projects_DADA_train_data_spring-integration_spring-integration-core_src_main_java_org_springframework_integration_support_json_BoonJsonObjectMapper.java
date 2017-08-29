<METHOD_START> public void ( ) { this . org.springframework.integration.support.json.ObjectMapper = JsonFactory . create ( ) ; }  <METHOD_END>
<METHOD_START> public void ( JsonParserFactory org.springframework.integration.support.json.JsonParserFactory , JsonSerializerFactory org.springframework.integration.support.json.JsonSerializerFactory ) { this . org.springframework.integration.support.json.ObjectMapper = JsonFactory . create ( org.springframework.integration.support.json.JsonParserFactory , org.springframework.integration.support.json.JsonSerializerFactory ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.Object java.lang.Object ) throws java.lang.Exception { return this . org.springframework.integration.support.json.ObjectMapper . writeValueAsString ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object , java.io.Writer java.io.Writer ) { this . org.springframework.integration.support.json.ObjectMapper . toJson ( java.lang.Object , java.io.Writer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( final java.lang.Object java.lang.Object ) throws java.lang.Exception { java.io.PipedReader java.io.PipedReader = new java.io.PipedReader ( ) ; final java.io.PipedWriter java.io.PipedWriter = new java.io.PipedWriter ( java.io.PipedReader ) ; java.util.concurrent.Executors . java.util.concurrent.ExecutorService ( ) . void ( ( ) void ( java.lang.Object , java.io.PipedWriter ) ) ; return ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) this . org.springframework.integration.support.json.JsonSlurper . parse ( java.io.PipedReader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.lang.Class<T> < T > java.lang.Class<T> ) throws java.lang.Exception { if ( java.lang.Object instanceof java.lang.String ) { return this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.lang.String ) java.lang.Object , java.lang.Class<T> ) ; } else if ( java.lang.Object instanceof byte [] ) { return this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( byte [] ) java.lang.Object , java.lang.Class<T> ) ; } else if ( java.lang.Object instanceof char [] ) { return this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( char [] ) java.lang.Object , java.lang.Class<T> ) ; } else if ( java.lang.Object instanceof java.io.File ) { return this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.io.File ) java.lang.Object , java.lang.Class<T> ) ; } else if ( java.lang.Object instanceof java.io.InputStream ) { return this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.io.InputStream ) java.lang.Object , java.lang.Class<T> ) ; } else if ( java.lang.Object instanceof java.io.Reader ) { return this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.io.Reader ) java.lang.Object , java.lang.Class<T> ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.util.Collection<java.lang.Class<?>> + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( { STRING , STRING } ) public < T > T T ( java.lang.Object java.lang.Object , java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) throws java.lang.Exception { JsonParserAndMapper org.springframework.integration.support.json.JsonParserAndMapper = this . org.springframework.integration.support.json.ObjectMapper . parser ( ) ; java.lang.Class<?> < ? > java.lang.Class<?> = this . java.lang.Class<?> ( java.util.Map<java.lang.String,java.lang.Object> , JsonHeaders . TYPE_ID ) ; java.lang.Class<?> < ? > java.lang.Class<?> = this . java.lang.Class<?> ( java.util.Map<java.lang.String,java.lang.Object> , JsonHeaders . CONTENT_TYPE_ID ) ; java.lang.Class<?> < ? > java.lang.Class<?> = this . java.lang.Class<?> ( java.util.Map<java.lang.String,java.lang.Object> , JsonHeaders . KEY_TYPE_ID ) ; if ( java.lang.Class<> != null ) { org.springframework.integration.support.json.Log . warn ( STRING ) ; if ( java.lang.Object instanceof java.lang.String ) { return ( T ) org.springframework.integration.support.json.JsonParserAndMapper . parseMap ( ( java.lang.String ) java.lang.Object ) ; } else if ( java.lang.Object instanceof byte [] ) { return ( T ) org.springframework.integration.support.json.JsonParserAndMapper . parseMap ( ( byte [] ) java.lang.Object ) ; } else if ( java.lang.Object instanceof char [] ) { return ( T ) org.springframework.integration.support.json.JsonParserAndMapper . parseMap ( ( char [] ) java.lang.Object ) ; } else if ( java.lang.Object instanceof java.io.File ) { return ( T ) org.springframework.integration.support.json.JsonParserAndMapper . parseMap ( new java.io.FileReader ( ( java.io.File ) java.lang.Object ) ) ; } else if ( java.lang.Object instanceof java.io.InputStream ) { return ( T ) org.springframework.integration.support.json.JsonParserAndMapper . parseMap ( ( java.io.InputStream ) java.lang.Object ) ; } else if ( java.lang.Object instanceof java.io.Reader ) { return ( T ) org.springframework.integration.support.json.JsonParserAndMapper . parseMap ( ( java.io.Reader ) java.lang.Object ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.util.Collection<java.lang.Class<?>> + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } } if ( java.lang.Class<> != null ) { if ( java.lang.Object instanceof java.lang.String ) { return ( T ) this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.lang.String ) java.lang.Object , ( java.lang.Class<java.util.Collection> < java.util.Collection > ) java.lang.Class<> , java.lang.Class<> ) ; } else if ( java.lang.Object instanceof byte [] ) { return ( T ) this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( byte [] ) java.lang.Object , ( java.lang.Class<java.util.Collection> < java.util.Collection > ) java.lang.Class<> , java.lang.Class<> ) ; } else if ( java.lang.Object instanceof char [] ) { return ( T ) this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( char [] ) java.lang.Object , ( java.lang.Class<java.util.Collection> < java.util.Collection > ) java.lang.Class<> , java.lang.Class<> ) ; } else if ( java.lang.Object instanceof java.io.File ) { return ( T ) this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.io.File ) java.lang.Object , ( java.lang.Class<java.util.Collection> < java.util.Collection > ) java.lang.Class<> , java.lang.Class<> ) ; } else if ( java.lang.Object instanceof java.io.InputStream ) { return ( T ) this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.io.InputStream ) java.lang.Object , ( java.lang.Class<java.util.Collection> < java.util.Collection > ) java.lang.Class<> , java.lang.Class<> ) ; } else if ( java.lang.Object instanceof java.io.Reader ) { return ( T ) this . org.springframework.integration.support.json.ObjectMapper . readValue ( ( java.io.Reader ) java.lang.Object , ( java.lang.Class<java.util.Collection> < java.util.Collection > ) java.lang.Class<> , java.lang.Class<> ) ; } else { throw new java.lang.IllegalArgumentException ( STRING + java.util.Collection<java.lang.Class<?>> + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } } return ( T ) fromJson ( java.lang.Object , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , java.lang.String java.lang.String ) throws java.lang.Exception { java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; if ( java.lang.Object instanceof java.lang.Class<?> < ? > ) { return ( java.lang.Class<?> < ? > ) java.lang.Object ; } else if ( java.lang.Object != null ) { return ClassUtils . forName ( java.lang.Object . java.lang.String ( ) , this . java.lang.ClassLoader ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public < T > T T ( java.lang.Object java.lang.Object , java.lang.reflect.Type java.lang.reflect.Type ) throws java.lang.Exception { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>