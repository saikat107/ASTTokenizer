<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new URLEditor ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new URLEditor ( ) ; java.beans.PropertyEditor . void ( STRING ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.net.URL ) ; java.net.URL java.net.URL = ( java.net.URL ) java.lang.Object ; assertEquals ( java.net.URL . java.lang.String ( ) , java.beans.PropertyEditor . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new URLEditor ( ) ; java.beans.PropertyEditor . void ( STRING ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.net.URL ) ; java.net.URL java.net.URL = ( java.net.URL ) java.lang.Object ; assertEquals ( java.net.URL . java.lang.String ( ) , java.beans.PropertyEditor . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new URLEditor ( ) ; java.beans.PropertyEditor . void ( STRING + ClassUtils . classPackageAsResourcePath ( java.lang.Class<? extends org.springframework.beans.propertyeditors.URLEditorTests> ( ) ) + STRING + ClassUtils . getShortName ( java.lang.Class<? extends org.springframework.beans.propertyeditors.URLEditorTests> ( ) ) + STRING ) ; java.lang.Object java.lang.Object = java.beans.PropertyEditor . java.lang.Object ( ) ; assertTrue ( java.lang.Object instanceof java.net.URL ) ; java.net.URL java.net.URL = ( java.net.URL ) java.lang.Object ; assertEquals ( java.net.URL . java.lang.String ( ) , java.beans.PropertyEditor . java.lang.String ( ) ) ; assertTrue ( ! java.net.URL . java.lang.String ( ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new URLEditor ( ) ; java.beans.PropertyEditor . void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new URLEditor ( ) ; java.beans.PropertyEditor . void ( null ) ; assertNull ( java.beans.PropertyEditor . java.lang.Object ( ) ) ; assertEquals ( STRING , java.beans.PropertyEditor . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.beans.PropertyEditor java.beans.PropertyEditor = new URLEditor ( ) ; assertEquals ( STRING , java.beans.PropertyEditor . java.lang.String ( ) ) ; }  <METHOD_END>