<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.util.List<javax.xml.stream.events.XMLEvent> < javax.xml.stream.events.XMLEvent > java.util.List<javax.xml.stream.events.XMLEvent> = java.util.List<javax.xml.stream.events.XMLEvent> ( java.lang.String ) ; ListBasedXMLEventReader org.springframework.util.xml.ListBasedXMLEventReader = new ListBasedXMLEventReader ( java.util.List<javax.xml.stream.events.XMLEvent> ) ; java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; javax.xml.stream.XMLEventWriter javax.xml.stream.XMLEventWriter = this . javax.xml.stream.XMLOutputFactory . javax.xml.stream.XMLEventWriter ( java.io.StringWriter ) ; javax.xml.stream.XMLEventWriter . void ( org.springframework.util.xml.ListBasedXMLEventReader ) ; assertThat ( java.io.StringWriter . java.lang.String ( ) , isSimilarTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<javax.xml.stream.events.XMLEvent> < javax.xml.stream.events.XMLEvent > java.util.List<javax.xml.stream.events.XMLEvent> ( java.lang.String java.lang.String ) throws javax.xml.stream.XMLStreamException { javax.xml.stream.XMLEventReader javax.xml.stream.XMLEventReader = this . javax.xml.stream.XMLInputFactory . javax.xml.stream.XMLEventReader ( new java.io.StringReader ( java.lang.String ) ) ; java.util.List<javax.xml.stream.events.XMLEvent> < javax.xml.stream.events.XMLEvent > java.util.List<javax.xml.stream.events.XMLEvent> = new java.util.ArrayList<javax.xml.stream.events.XMLEvent> <> ( ) ; while ( javax.xml.stream.XMLEventReader . boolean ( ) ) { java.util.List<javax.xml.stream.events.XMLEvent> . boolean ( javax.xml.stream.XMLEventReader . javax.xml.stream.events.XMLEvent ( ) ) ; } return java.util.List<javax.xml.stream.events.XMLEvent> ; }  <METHOD_END>