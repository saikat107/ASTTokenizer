<METHOD_START> void ( ResourceLoader org.springframework.boot.ResourceLoader , Banner org.springframework.boot.Banner ) { this . org.springframework.boot.ResourceLoader = org.springframework.boot.ResourceLoader ; this . org.springframework.boot.Banner = org.springframework.boot.Banner ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.Banner org.springframework.boot.Banner ( Environment org.springframework.boot.Environment , java.lang.Class<?> < ? > java.lang.Class<?> , Log org.springframework.boot.Log ) { Banner org.springframework.boot.Banner = org.springframework.boot.Banner ( org.springframework.boot.Environment ) ; try { org.springframework.boot.Log . info ( java.lang.String ( org.springframework.boot.Banner , org.springframework.boot.Environment , java.lang.Class<> ) ) ; } catch ( java.io.UnsupportedEncodingException java.io.UnsupportedEncodingException ) { org.springframework.boot.Log . warn ( STRING , java.io.UnsupportedEncodingException ) ; } return new org.springframework.boot.SpringApplicationBannerPrinter.PrintedBanner ( org.springframework.boot.Banner , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.Banner org.springframework.boot.Banner ( Environment org.springframework.boot.Environment , java.lang.Class<?> < ? > java.lang.Class<?> , java.io.PrintStream java.io.PrintStream ) { Banner org.springframework.boot.Banner = org.springframework.boot.Banner ( org.springframework.boot.Environment ) ; org.springframework.boot.Banner . printBanner ( org.springframework.boot.Environment , java.lang.Class<> , java.io.PrintStream ) ; return new org.springframework.boot.SpringApplicationBannerPrinter.PrintedBanner ( org.springframework.boot.Banner , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.Banner org.springframework.boot.Banner ( Environment org.springframework.boot.Environment ) { org.springframework.boot.SpringApplicationBannerPrinter.Banners org.springframework.boot.SpringApplicationBannerPrinter.Banners = new org.springframework.boot.SpringApplicationBannerPrinter.Banners ( ) ; org.springframework.boot.SpringApplicationBannerPrinter.Banners . void ( org.springframework.boot.Banner ( org.springframework.boot.Environment ) ) ; org.springframework.boot.SpringApplicationBannerPrinter.Banners . void ( org.springframework.boot.Banner ( org.springframework.boot.Environment ) ) ; if ( org.springframework.boot.SpringApplicationBannerPrinter.Banners . boolean ( ) ) { return org.springframework.boot.SpringApplicationBannerPrinter.Banners ; } if ( this . org.springframework.boot.Banner != null ) { return this . org.springframework.boot.Banner ; } return org.springframework.boot.Banner ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.Banner org.springframework.boot.Banner ( Environment org.springframework.boot.Environment ) { java.lang.String java.lang.String = org.springframework.boot.Environment . getProperty ( java.lang.String , java.lang.String ) ; Resource org.springframework.boot.Resource = this . org.springframework.boot.ResourceLoader . getResource ( java.lang.String ) ; if ( org.springframework.boot.Resource . exists ( ) ) { return new ResourceBanner ( org.springframework.boot.Resource ) ; } return null ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.Banner org.springframework.boot.Banner ( Environment org.springframework.boot.Environment ) { java.lang.String java.lang.String = org.springframework.boot.Environment . getProperty ( java.lang.String ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { Resource org.springframework.boot.Resource = this . org.springframework.boot.ResourceLoader . getResource ( java.lang.String ) ; return ( org.springframework.boot.Resource . exists ( ) ? new ImageBanner ( org.springframework.boot.Resource ) : null ) ; } for ( java.lang.String java.lang.String : java.lang.String[] ) { Resource org.springframework.boot.Resource = this . org.springframework.boot.ResourceLoader . getResource ( STRING + java.lang.String ) ; if ( org.springframework.boot.Resource . exists ( ) ) { return new ImageBanner ( org.springframework.boot.Resource ) ; } } return null ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( Banner org.springframework.boot.Banner , Environment org.springframework.boot.Environment , java.lang.Class<?> < ? > java.lang.Class<?> ) throws java.io.UnsupportedEncodingException { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; org.springframework.boot.Banner . printBanner ( org.springframework.boot.Environment , java.lang.Class<> , new java.io.PrintStream ( java.io.ByteArrayOutputStream ) ) ; java.lang.String java.lang.String = org.springframework.boot.Environment . getProperty ( STRING , STRING ) ; return java.io.ByteArrayOutputStream . java.lang.String ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( Banner org.springframework.boot.Banner ) { if ( org.springframework.boot.Banner != null ) { this . java.util.List<org.springframework.boot.Banner> . add ( org.springframework.boot.Banner ) ; } }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return ! this . java.util.List<org.springframework.boot.Banner> . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.boot.Environment , java.lang.Class<?> < ? > java.lang.Class<?> , java.io.PrintStream java.io.PrintStream ) { for ( Banner org.springframework.boot.Banner : this . java.util.List<org.springframework.boot.Banner> ) { org.springframework.boot.Banner . printBanner ( org.springframework.boot.Environment , java.lang.Class<> , java.io.PrintStream ) ; } }  <METHOD_END>
<METHOD_START> void ( Banner org.springframework.boot.Banner , java.lang.Class<?> < ? > java.lang.Class<?> ) { this . org.springframework.boot.Banner = org.springframework.boot.Banner ; this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.boot.Environment , java.lang.Class<?> < ? > java.lang.Class<?> , java.io.PrintStream java.io.PrintStream ) { java.lang.Class<?> = ( java.lang.Class<> == null ? this . java.lang.Class<> : java.lang.Class<> ) ; this . org.springframework.boot.Banner . printBanner ( org.springframework.boot.Environment , java.lang.Class<> , java.io.PrintStream ) ; }  <METHOD_END>