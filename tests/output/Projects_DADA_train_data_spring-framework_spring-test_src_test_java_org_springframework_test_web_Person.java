<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return java.lang.String ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.Person org.springframework.test.web.Person ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; return this ; }  <METHOD_END>
<METHOD_START> public double double ( ) { return double ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.Person org.springframework.test.web.Person ( double double ) { this . double = double ; return this ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return boolean ; }  <METHOD_END>
<METHOD_START> public org.springframework.test.web.Person org.springframework.test.web.Person ( boolean boolean ) { this . boolean = boolean ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( this == java.lang.Object ) { return true ; } if ( ! ( java.lang.Object instanceof org.springframework.test.web.Person ) ) { return false ; } org.springframework.test.web.Person org.springframework.test.web.Person = ( org.springframework.test.web.Person ) java.lang.Object ; return ( ObjectUtils . nullSafeEquals ( this . java.lang.String , org.springframework.test.web.Person . java.lang.String ) && ObjectUtils . nullSafeEquals ( this . double , org.springframework.test.web.Person . double ) && ObjectUtils . nullSafeEquals ( this . boolean , org.springframework.test.web.Person . boolean ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return org.springframework.test.web.Person .class . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String + STRING + this . double + STRING + this . boolean + STRING ; }  <METHOD_END>
