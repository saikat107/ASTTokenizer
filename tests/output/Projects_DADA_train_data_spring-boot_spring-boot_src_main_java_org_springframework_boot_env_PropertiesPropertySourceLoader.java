<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return new java.lang.String [] { STRING , STRING } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.env.PropertySource<?> < ? > org.springframework.boot.env.PropertySource<?> ( java.lang.String java.lang.String , Resource org.springframework.boot.env.Resource , java.lang.String java.lang.String )			throws java.io.IOException { if ( java.lang.String == null ) { java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,?> ( org.springframework.boot.env.Resource ) ; if ( ! java.util.Map<java.lang.String,> . boolean ( ) ) { return new OriginTrackedMapPropertySource ( java.lang.String , java.util.Map<java.lang.String,> ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( { STRING , STRING } ) private java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( Resource org.springframework.boot.env.Resource ) throws java.io.IOException { java.lang.String java.lang.String = org.springframework.boot.env.Resource . getFilename ( ) ; if ( java.lang.String != null && java.lang.String . boolean ( java.lang.String ) ) { return ( java.util.Map ) PropertiesLoaderUtils . loadProperties ( org.springframework.boot.env.Resource ) ; } return new OriginTrackedPropertiesLoader ( org.springframework.boot.env.Resource ) . load ( ) ; }  <METHOD_END>