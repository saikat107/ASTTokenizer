<METHOD_START> @ Test public void void ( ) { byte [] byte[] = new byte [] { NUMBER , NUMBER , NUMBER } ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( byte[] ) ; ByteStreamReadingMessageSource org.springframework.integration.stream.ByteStreamReadingMessageSource = new ByteStreamReadingMessageSource ( java.io.ByteArrayInputStream ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; byte [] byte[] = ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ; assertEquals ( NUMBER , byte[] . int ) ; assertEquals ( NUMBER , byte[] [ NUMBER ] ) ; assertEquals ( NUMBER , byte[] [ NUMBER ] ) ; assertEquals ( NUMBER , byte[] [ NUMBER ] ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertNull ( org.springframework.integration.stream.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { byte [] byte[] = new byte [] { NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER } ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( byte[] ) ; ByteStreamReadingMessageSource org.springframework.integration.stream.ByteStreamReadingMessageSource = new ByteStreamReadingMessageSource ( java.io.ByteArrayInputStream ) ; org.springframework.integration.stream.ByteStreamReadingMessageSource . setBytesPerMessage ( NUMBER ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) . int ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) . int ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertNull ( org.springframework.integration.stream.Message<> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { byte [] byte[] = new byte [] { NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER } ; java.io.ByteArrayInputStream java.io.ByteArrayInputStream = new java.io.ByteArrayInputStream ( byte[] ) ; ByteStreamReadingMessageSource org.springframework.integration.stream.ByteStreamReadingMessageSource = new ByteStreamReadingMessageSource ( java.io.ByteArrayInputStream ) ; org.springframework.integration.stream.ByteStreamReadingMessageSource . setBytesPerMessage ( NUMBER ) ; org.springframework.integration.stream.ByteStreamReadingMessageSource . setShouldTruncate ( false ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) . int ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) . int ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) [ NUMBER ] ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) [ NUMBER ] ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) [ NUMBER ] ) ; assertEquals ( NUMBER , ( ( byte [] ) org.springframework.integration.stream.Message<> . getPayload ( ) ) [ NUMBER ] ) ; Message < ? > org.springframework.integration.stream.Message<?> = org.springframework.integration.stream.ByteStreamReadingMessageSource . receive ( ) ; assertNull ( org.springframework.integration.stream.Message<> ) ; }  <METHOD_END>