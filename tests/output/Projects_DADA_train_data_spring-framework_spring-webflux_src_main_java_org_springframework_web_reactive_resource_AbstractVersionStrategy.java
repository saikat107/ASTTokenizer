<METHOD_START> protected void ( VersionPathStrategy org.springframework.web.reactive.resource.VersionPathStrategy ) { Assert . notNull ( org.springframework.web.reactive.resource.VersionPathStrategy , STRING ) ; this . org.springframework.web.reactive.resource.VersionPathStrategy = org.springframework.web.reactive.resource.VersionPathStrategy ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.resource.VersionPathStrategy org.springframework.web.reactive.resource.VersionPathStrategy ( ) { return this . org.springframework.web.reactive.resource.VersionPathStrategy ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.resource.VersionPathStrategy . extractVersion ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.resource.VersionPathStrategy . removeVersion ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return this . org.springframework.web.reactive.resource.VersionPathStrategy . addVersion ( java.lang.String , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return ( java.lang.String . boolean ( this . java.lang.String ) ? this . java.lang.String : null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( this . java.lang.String . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { if ( java.lang.String . boolean ( STRING ) ) { return java.lang.String ; } else { return ( this . java.lang.String . boolean ( STRING ) || java.lang.String . boolean ( STRING ) ? this . java.lang.String + java.lang.String : this . java.lang.String + '/' + java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.util.regex.Matcher java.util.regex.Matcher = java.util.regex.Pattern . java.util.regex.Matcher ( java.lang.String ) ; if ( java.util.regex.Matcher . boolean ( ) ) { java.lang.String java.lang.String = java.util.regex.Matcher . java.lang.String ( NUMBER ) ; return ( java.lang.String . boolean ( STRING ) ? java.lang.String . java.lang.String ( java.lang.String . int ( '-' ) + NUMBER ) : java.lang.String ) ; } else { return null ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { return StringUtils . delete ( java.lang.String , STRING + java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String ) { java.lang.String java.lang.String = StringUtils . stripFilenameExtension ( java.lang.String ) ; java.lang.String java.lang.String = StringUtils . getFilenameExtension ( java.lang.String ) ; return ( java.lang.String + '-' + java.lang.String + '.' + java.lang.String ) ; }  <METHOD_END>