<METHOD_START> public void ( ResourceLoader org.springframework.beans.factory.xml.ResourceLoader ) { super( org.springframework.beans.factory.xml.ResourceLoader . getClassLoader ( ) ); this . org.springframework.beans.factory.xml.ResourceLoader = org.springframework.beans.factory.xml.ResourceLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.xml.sax.InputSource org.xml.sax.InputSource ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws org.xml.sax.SAXException , java.io.IOException { org.xml.sax.InputSource org.xml.sax.InputSource = super. resolveEntity ( java.lang.String , java.lang.String ) ; if ( org.xml.sax.InputSource == null && java.lang.String != null ) { java.lang.String java.lang.String = null ; try { java.lang.String java.lang.String = java.net.URLDecoder . java.lang.String ( java.lang.String , STRING ) ; java.lang.String java.lang.String = new java.net.URL ( java.lang.String ) . java.lang.String ( ) ; java.lang.String java.lang.String = new java.io.File ( STRING ) . java.net.URI ( ) . java.net.URL ( ) . java.lang.String ( ) ; if ( java.lang.String . boolean ( java.lang.String ) ) { java.lang.String = java.lang.String . java.lang.String ( java.lang.String . int ( ) ) ; } } catch ( java.lang.Exception java.lang.Exception ) { if ( org.springframework.beans.factory.xml.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.xml.Log . debug ( STRING + java.lang.String + STRING , java.lang.Exception ) ; } java.lang.String = java.lang.String ; } if ( java.lang.String != null ) { if ( org.springframework.beans.factory.xml.Log . isTraceEnabled ( ) ) { org.springframework.beans.factory.xml.Log . trace ( STRING + java.lang.String + STRING + java.lang.String + STRING ) ; } Resource org.springframework.beans.factory.xml.Resource = this . org.springframework.beans.factory.xml.ResourceLoader . getResource ( java.lang.String ) ; org.xml.sax.InputSource = new org.xml.sax.InputSource ( org.springframework.beans.factory.xml.Resource . getInputStream ( ) ) ; org.xml.sax.InputSource . void ( java.lang.String ) ; org.xml.sax.InputSource . void ( java.lang.String ) ; if ( org.springframework.beans.factory.xml.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.xml.Log . debug ( STRING + java.lang.String + STRING + org.springframework.beans.factory.xml.Resource ) ; } } } return org.xml.sax.InputSource ; }  <METHOD_END>