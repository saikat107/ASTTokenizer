<METHOD_START> @ Before public void void ( ) java.lang.Exception { java.io.StringReader java.io.StringReader = new java.io.StringReader ( java.lang.String ) ; org.w3c.dom.Document = javax.xml.parsers.DocumentBuilderFactory . javax.xml.parsers.DocumentBuilderFactory ( ) . javax.xml.parsers.DocumentBuilder ( ) . org.w3c.dom.Document ( new org.xml.sax.InputSource ( java.io.StringReader ) ) ; org.springframework.integration.xml.source.DomSourceFactory = new DomSourceFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.transform.Source javax.xml.transform.Source = org.springframework.integration.xml.source.DomSourceFactory . createSource ( org.w3c.dom.Document ) ; assertNotNull ( STRING , javax.xml.transform.Source ) ; assertEquals ( STRING , javax.xml.transform.dom.DOMSource .class , javax.xml.transform.Source . java.lang.Class<? extends javax.xml.transform.Source> ( ) ) ; assertXMLEqual ( STRING , java.lang.String , java.lang.String ( javax.xml.transform.Source ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.transform.Source javax.xml.transform.Source = org.springframework.integration.xml.source.DomSourceFactory . createSource ( java.lang.String ) ; assertNotNull ( STRING , javax.xml.transform.Source ) ; assertEquals ( STRING , javax.xml.transform.dom.DOMSource .class , javax.xml.transform.Source . java.lang.Class<? extends javax.xml.transform.Source> ( ) ) ; assertXMLEqual ( STRING , java.lang.String , java.lang.String ( javax.xml.transform.Source ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) java.lang.Exception { org.springframework.integration.xml.source.DomSourceFactory . createSource ( new java.lang.Integer ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( javax.xml.transform.Source javax.xml.transform.Source ) throws java.lang.Exception { javax.xml.transform.Transformer javax.xml.transform.Transformer = javax.xml.transform.TransformerFactory . javax.xml.transform.TransformerFactory ( ) . javax.xml.transform.Transformer ( ) ; StringResult org.springframework.integration.xml.source.StringResult = new StringResult ( ) ; javax.xml.transform.Transformer . void ( javax.xml.transform.Source , org.springframework.integration.xml.source.StringResult ) ; return org.springframework.integration.xml.source.StringResult . toString ( ) ; }  <METHOD_END>