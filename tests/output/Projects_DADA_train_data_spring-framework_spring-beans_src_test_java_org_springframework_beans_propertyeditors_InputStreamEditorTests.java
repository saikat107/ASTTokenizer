<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new InputStreamEditor ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.InputStream java.io.InputStream = null ; try { java.lang.String java.lang.String = STRING + ClassUtils . classPackageAsResourcePath ( java.lang.Class<? extends org.springframework.beans.propertyeditors.InputStreamEditorTests> ( ) ) + STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.propertyeditors.InputStreamEditorTests> ( ) ) + STRING ; InputStreamEditor org.springframework.beans.propertyeditors.InputStreamEditor = new InputStreamEditor ( ) ; org.springframework.beans.propertyeditors.InputStreamEditor . setAsText ( java.lang.String ) ; java.lang.Object java.lang.Object = org.springframework.beans.propertyeditors.InputStreamEditor . getValue ( ) ; assertNotNull ( java.lang.Object ) ; assertTrue ( java.lang.Object instanceof java.io.InputStream ) ; java.io.InputStream = ( java.io.InputStream ) java.lang.Object ; assertTrue ( java.io.InputStream . int ( ) > NUMBER ) ; } finally { if ( java.io.InputStream != null ) { java.io.InputStream . void ( ) ; } } }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { InputStreamEditor org.springframework.beans.propertyeditors.InputStreamEditor = new InputStreamEditor ( ) ; org.springframework.beans.propertyeditors.InputStreamEditor . setAsText ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNull ( new InputStreamEditor ( ) . getAsText ( ) ) ; java.lang.String java.lang.String = STRING + ClassUtils . classPackageAsResourcePath ( java.lang.Class<? extends org.springframework.beans.propertyeditors.InputStreamEditorTests> ( ) ) + STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.propertyeditors.InputStreamEditorTests> ( ) ) + STRING ; InputStreamEditor org.springframework.beans.propertyeditors.InputStreamEditor = new InputStreamEditor ( ) ; org.springframework.beans.propertyeditors.InputStreamEditor . setAsText ( java.lang.String ) ; assertNull ( org.springframework.beans.propertyeditors.InputStreamEditor . getAsText ( ) ) ; }  <METHOD_END>