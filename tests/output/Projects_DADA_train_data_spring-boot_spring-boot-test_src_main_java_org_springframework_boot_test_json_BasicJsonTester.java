<METHOD_START> protected void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this( java.lang.Class<> , null ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.nio.charset.Charset java.nio.charset.Charset ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . org.springframework.boot.test.json.JsonLoader = new JsonLoader ( java.lang.Class<> , java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType ) { this . void ( java.lang.Class<> , null , org.springframework.boot.test.json.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> protected final void void ( java.lang.Class<?> < ? > java.lang.Class<?> , java.nio.charset.Charset java.nio.charset.Charset , ResolvableType org.springframework.boot.test.json.ResolvableType ) { if ( this . org.springframework.boot.test.json.JsonLoader == null ) { this . org.springframework.boot.test.json.JsonLoader = new JsonLoader ( java.lang.Class<> , java.nio.charset.Charset ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( java.lang.CharSequence java.lang.CharSequence ) { void ( ) ; return org.springframework.boot.test.json.JsonContent<java.lang.Object> ( this . org.springframework.boot.test.json.JsonLoader . getJson ( java.lang.CharSequence ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { void ( ) ; return org.springframework.boot.test.json.JsonContent<java.lang.Object> ( this . org.springframework.boot.test.json.JsonLoader . getJson ( java.lang.String , java.lang.Class<> ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( byte [] byte[] ) { void ( ) ; return org.springframework.boot.test.json.JsonContent<java.lang.Object> ( this . org.springframework.boot.test.json.JsonLoader . getJson ( byte[] ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( java.io.File java.io.File ) { void ( ) ; return org.springframework.boot.test.json.JsonContent<java.lang.Object> ( this . org.springframework.boot.test.json.JsonLoader . getJson ( java.io.File ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( java.io.InputStream java.io.InputStream ) { void ( ) ; return org.springframework.boot.test.json.JsonContent<java.lang.Object> ( this . org.springframework.boot.test.json.JsonLoader . getJson ( java.io.InputStream ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( Resource org.springframework.boot.test.json.Resource ) { void ( ) ; return org.springframework.boot.test.json.JsonContent<java.lang.Object> ( this . org.springframework.boot.test.json.JsonLoader . getJson ( org.springframework.boot.test.json.Resource ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { Assert . state ( this . org.springframework.boot.test.json.JsonLoader != null , STRING ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.test.json.JsonContent<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.JsonContent<java.lang.Object> ( java.lang.String java.lang.String ) { return new JsonContent <> ( this . org.springframework.boot.test.json.JsonLoader . getResourceLoadClass ( ) , null , java.lang.String ) ; }  <METHOD_END>