<METHOD_START> @ Before public void void ( ) { org.springframework.integration.xml.transformer.ResultToDocumentTransformer = new ResultToDocumentTransformer ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { javax.xml.transform.dom.DOMResult javax.xml.transform.dom.DOMResult = XmlTestUtil . getDomResultForString ( java.lang.String ) ; java.lang.Object java.lang.Object = org.springframework.integration.xml.transformer.ResultToDocumentTransformer . transformResult ( javax.xml.transform.dom.DOMResult ) ; assertTrue ( STRING , java.lang.Object instanceof org.w3c.dom.Document ) ; org.w3c.dom.Document org.w3c.dom.Document = ( org.w3c.dom.Document ) java.lang.Object ; assertEquals ( STRING , STRING , org.w3c.dom.Document . org.w3c.dom.Element ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StringResult org.springframework.integration.xml.transformer.StringResult = XmlTestUtil . getStringResultForString ( java.lang.String ) ; java.lang.Object java.lang.Object = org.springframework.integration.xml.transformer.ResultToDocumentTransformer . transformResult ( org.springframework.integration.xml.transformer.StringResult ) ; assertTrue ( STRING , java.lang.Object instanceof org.w3c.dom.Document ) ; org.w3c.dom.Document org.w3c.dom.Document = ( org.w3c.dom.Document ) java.lang.Object ; assertEquals ( STRING , STRING , org.w3c.dom.Document . org.w3c.dom.Element ( ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = MessagingException .class ) public void void ( ) java.lang.Exception { javax.xml.transform.sax.SAXResult javax.xml.transform.sax.SAXResult = new javax.xml.transform.sax.SAXResult ( ) ; org.springframework.integration.xml.transformer.ResultToDocumentTransformer . transformResult ( javax.xml.transform.sax.SAXResult ) ; }  <METHOD_END>