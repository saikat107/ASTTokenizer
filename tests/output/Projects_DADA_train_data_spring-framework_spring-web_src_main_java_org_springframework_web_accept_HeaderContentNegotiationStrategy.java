<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.web.accept.MediaType> < MediaType > java.util.List<org.springframework.web.accept.MediaType> ( NativeWebRequest org.springframework.web.accept.NativeWebRequest )			throws org.springframework.web.accept.HttpMediaTypeNotAcceptableException { java.lang.String [] java.lang.String[] = org.springframework.web.accept.NativeWebRequest . getHeaderValues ( HttpHeaders . ACCEPT ) ; if ( java.lang.String[] == null ) { return java.util.Collections . java.util.List<org.springframework.web.accept.MediaType> ( ) ; } java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ; try { java.util.List<org.springframework.web.accept.MediaType> < MediaType > java.util.List<org.springframework.web.accept.MediaType> = MediaType . parseMediaTypes ( java.util.List<java.lang.String> ) ; MediaType . sortBySpecificityAndQuality ( java.util.List<org.springframework.web.accept.MediaType> ) ; return java.util.List<org.springframework.web.accept.MediaType> ; } catch ( InvalidMediaTypeException org.springframework.web.accept.InvalidMediaTypeException ) { throw new HttpMediaTypeNotAcceptableException ( STRING + java.util.List<java.lang.String> + STRING + org.springframework.web.accept.InvalidMediaTypeException . getMessage ( ) ) ; } }  <METHOD_END>