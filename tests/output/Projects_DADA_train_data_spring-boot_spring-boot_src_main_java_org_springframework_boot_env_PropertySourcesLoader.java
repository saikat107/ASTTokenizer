<METHOD_START> public void ( ) { this( new MutablePropertySources ( ) ); }  <METHOD_END>
<METHOD_START> public void ( MutablePropertySources org.springframework.boot.env.MutablePropertySources ) { Assert . notNull ( org.springframework.boot.env.MutablePropertySources , STRING ) ; this . org.springframework.boot.env.MutablePropertySources = org.springframework.boot.env.MutablePropertySources ; this . java.util.List<org.springframework.boot.env.PropertySourceLoader> = SpringFactoriesLoader . loadFactories ( PropertySourceLoader .class , java.lang.Class<? extends org.springframework.boot.env.PropertySourcesLoader> ( ) . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.env.PropertySource<?> < ? > org.springframework.boot.env.PropertySource<?> ( Resource org.springframework.boot.env.Resource ) throws java.io.IOException { return org.springframework.boot.env.PropertySource<?> ( org.springframework.boot.env.Resource , null ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.env.PropertySource<?> < ? > org.springframework.boot.env.PropertySource<?> ( Resource org.springframework.boot.env.Resource , java.lang.String java.lang.String ) throws java.io.IOException { return org.springframework.boot.env.PropertySource<?> ( org.springframework.boot.env.Resource , org.springframework.boot.env.Resource . getDescription ( ) , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.env.PropertySource<?> < ? > org.springframework.boot.env.PropertySource<?> ( Resource org.springframework.boot.env.Resource , java.lang.String java.lang.String , java.lang.String java.lang.String )			throws java.io.IOException { return org.springframework.boot.env.PropertySource<?> ( org.springframework.boot.env.Resource , null , java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.env.PropertySource<?> < ? > org.springframework.boot.env.PropertySource<?> ( Resource org.springframework.boot.env.Resource , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.io.IOException { if ( boolean ( org.springframework.boot.env.Resource ) ) { java.lang.String java.lang.String = java.lang.String ( java.lang.String , java.lang.String ) ; for ( PropertySourceLoader org.springframework.boot.env.PropertySourceLoader : this . java.util.List<org.springframework.boot.env.PropertySourceLoader> ) { if ( boolean ( org.springframework.boot.env.PropertySourceLoader , org.springframework.boot.env.Resource ) ) { PropertySource < ? > org.springframework.boot.env.PropertySource<?> = org.springframework.boot.env.PropertySourceLoader . load ( java.lang.String , org.springframework.boot.env.Resource , java.lang.String ) ; void ( java.lang.String , org.springframework.boot.env.PropertySource<> , java.lang.String ) ; return org.springframework.boot.env.PropertySource<> ; } } } return null ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( Resource org.springframework.boot.env.Resource ) { return org.springframework.boot.env.Resource != null && org.springframework.boot.env.Resource . exists ( ) && StringUtils . hasText ( StringUtils . getFilenameExtension ( org.springframework.boot.env.Resource . getFilename ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return ( java.lang.String == null ? java.lang.String : java.lang.String + STRING + java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( PropertySourceLoader org.springframework.boot.env.PropertySourceLoader , Resource org.springframework.boot.env.Resource ) { java.lang.String java.lang.String = org.springframework.boot.env.Resource . getFilename ( ) . toLowerCase ( ) ; for ( java.lang.String java.lang.String : org.springframework.boot.env.PropertySourceLoader . getFileExtensions ( ) ) { if ( java.lang.String . boolean ( STRING + java.lang.String . java.lang.String ( ) ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , PropertySource < ? > org.springframework.boot.env.PropertySource<?> , java.lang.String java.lang.String ) { if ( org.springframework.boot.env.PropertySource<> == null ) { return; } if ( java.lang.String == null ) { this . org.springframework.boot.env.MutablePropertySources . addLast ( org.springframework.boot.env.PropertySource<> ) ; return; } EnumerableCompositePropertySource org.springframework.boot.env.EnumerableCompositePropertySource = org.springframework.boot.env.EnumerableCompositePropertySource ( java.lang.String ) ; org.springframework.boot.env.EnumerableCompositePropertySource . add ( org.springframework.boot.env.PropertySource<> ) ; org.springframework.boot.env.Log . trace ( STRING + org.springframework.boot.env.PropertySource<> + STRING + java.lang.String ) ; if ( this . org.springframework.boot.env.MutablePropertySources . contains ( org.springframework.boot.env.EnumerableCompositePropertySource . getName ( ) ) ) { this . org.springframework.boot.env.MutablePropertySources . replace ( org.springframework.boot.env.EnumerableCompositePropertySource . getName ( ) , org.springframework.boot.env.EnumerableCompositePropertySource ) ; } else { this . org.springframework.boot.env.MutablePropertySources . addFirst ( org.springframework.boot.env.EnumerableCompositePropertySource ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.env.EnumerableCompositePropertySource org.springframework.boot.env.EnumerableCompositePropertySource ( java.lang.String java.lang.String ) { PropertySource < ? > org.springframework.boot.env.PropertySource<?> = this . org.springframework.boot.env.MutablePropertySources . get ( java.lang.String ) ; if ( org.springframework.boot.env.PropertySource<> instanceof EnumerableCompositePropertySource ) { return ( EnumerableCompositePropertySource ) org.springframework.boot.env.PropertySource<> ; } EnumerableCompositePropertySource org.springframework.boot.env.EnumerableCompositePropertySource = new EnumerableCompositePropertySource ( java.lang.String ) ; return org.springframework.boot.env.EnumerableCompositePropertySource ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.env.MutablePropertySources org.springframework.boot.env.MutablePropertySources ( ) { return this . org.springframework.boot.env.MutablePropertySources ; }  <METHOD_END>
<METHOD_START> public java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; for ( PropertySourceLoader org.springframework.boot.env.PropertySourceLoader : this . java.util.List<org.springframework.boot.env.PropertySourceLoader> ) { java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List ( org.springframework.boot.env.PropertySourceLoader . getFileExtensions ( ) ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>