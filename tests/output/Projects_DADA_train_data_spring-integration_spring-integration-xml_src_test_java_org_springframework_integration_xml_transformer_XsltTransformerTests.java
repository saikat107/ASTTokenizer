<METHOD_START> @ Test public void void ( ) { MessageChannel org.springframework.integration.xml.transformer.MessageChannel = org.springframework.integration.xml.transformer.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = MessageBuilder . withPayload ( this . java.lang.String ) . setHeader ( STRING , STRING ) . setHeader ( STRING , STRING ) . build ( ) ; org.springframework.integration.xml.transformer.MessageChannel . send ( org.springframework.integration.xml.transformer.Message<> ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = org.springframework.integration.xml.transformer.QueueChannel . receive ( ) ; MessageHistory org.springframework.integration.xml.transformer.MessageHistory = MessageHistory . read ( org.springframework.integration.xml.transformer.Message<> ) ; assertNotNull ( org.springframework.integration.xml.transformer.MessageHistory ) ; java.util.Properties java.util.Properties = TestUtils . locateComponentInHistory ( org.springframework.integration.xml.transformer.MessageHistory , STRING , NUMBER ) ; assertNotNull ( java.util.Properties ) ; assertEquals ( STRING , java.util.Properties . java.lang.Object ( STRING ) ) ; assertEquals ( STRING , java.lang.String .class , org.springframework.integration.xml.transformer.Message<> . getPayload ( ) . getClass ( ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; assertFalse ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageChannel org.springframework.integration.xml.transformer.MessageChannel = org.springframework.integration.xml.transformer.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = MessageBuilder . withPayload ( this . java.lang.String ) . setHeader ( STRING , STRING ) . setHeader ( STRING , STRING ) . build ( ) ; org.springframework.integration.xml.transformer.MessageChannel . send ( org.springframework.integration.xml.transformer.Message<> ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = org.springframework.integration.xml.transformer.QueueChannel . receive ( ) ; assertEquals ( STRING , java.lang.String .class , org.springframework.integration.xml.transformer.Message<> . getPayload ( ) . getClass ( ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageChannel org.springframework.integration.xml.transformer.MessageChannel = org.springframework.integration.xml.transformer.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = MessageBuilder . withPayload ( this . java.lang.String ) . setHeader ( STRING , STRING ) . setHeader ( STRING , STRING ) . build ( ) ; org.springframework.integration.xml.transformer.MessageChannel . send ( org.springframework.integration.xml.transformer.Message<> ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = org.springframework.integration.xml.transformer.QueueChannel . receive ( ) ; assertEquals ( STRING , java.lang.String .class , org.springframework.integration.xml.transformer.Message<> . getPayload ( ) . getClass ( ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageChannel org.springframework.integration.xml.transformer.MessageChannel = org.springframework.integration.xml.transformer.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = MessageBuilder . withPayload ( this . java.lang.String ) . setHeader ( STRING , STRING ) . setHeader ( STRING , STRING ) . build ( ) ; org.springframework.integration.xml.transformer.MessageChannel . send ( org.springframework.integration.xml.transformer.Message<> ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = org.springframework.integration.xml.transformer.QueueChannel . receive ( ) ; assertEquals ( STRING , java.lang.String .class , org.springframework.integration.xml.transformer.Message<> . getPayload ( ) . getClass ( ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; assertTrue ( ( ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ) . boolean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { MessageChannel org.springframework.integration.xml.transformer.MessageChannel = org.springframework.integration.xml.transformer.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = MessageBuilder . withPayload ( this . java.lang.String ) . build ( ) ; org.springframework.integration.xml.transformer.MessageChannel . send ( org.springframework.integration.xml.transformer.Message<> ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = org.springframework.integration.xml.transformer.QueueChannel . receive ( ) ; assertEquals ( STRING , java.lang.String .class , org.springframework.integration.xml.transformer.Message<> . getPayload ( ) . getClass ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ; assertEquals ( STRING , STRING , java.lang.String . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { MessageChannel org.springframework.integration.xml.transformer.MessageChannel = org.springframework.integration.xml.transformer.ApplicationContext . getBean ( STRING , MessageChannel .class ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = MessageBuilder . withPayload ( new ClassPathResource ( STRING ) . getFile ( ) ) . build ( ) ; org.springframework.integration.xml.transformer.MessageChannel . send ( org.springframework.integration.xml.transformer.Message<> ) ; Message < ? > org.springframework.integration.xml.transformer.Message<?> = org.springframework.integration.xml.transformer.QueueChannel . receive ( ) ; assertEquals ( STRING , java.lang.String .class , org.springframework.integration.xml.transformer.Message<> . getPayload ( ) . getClass ( ) ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.xml.transformer.Message<> . getPayload ( ) ; assertEquals ( STRING , STRING , java.lang.String . java.lang.String ( ) ) ; }  <METHOD_END>