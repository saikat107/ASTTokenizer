<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { java.lang.Class<org.springframework.integration.store.SimpleMessageGroup> < SimpleMessageGroup > java.lang.Class<org.springframework.integration.store.SimpleMessageGroup> = ( java.lang.Class<org.springframework.integration.store.SimpleMessageGroup> < SimpleMessageGroup > ) java.lang.Class . java.lang.Class<?> ( STRING ) ; java.lang.reflect.Constructor<org.springframework.integration.store.SimpleMessageGroup> < SimpleMessageGroup > java.lang.reflect.Constructor<org.springframework.integration.store.SimpleMessageGroup> = java.lang.Class<org.springframework.integration.store.SimpleMessageGroup> . getDeclaredConstructor ( MessageGroup .class ) ; java.lang.reflect.Constructor<org.springframework.integration.store.SimpleMessageGroup> . setAccessible ( true ) ; this . org.springframework.integration.store.MessageGroup = java.lang.reflect.Constructor<org.springframework.integration.store.SimpleMessageGroup> . newInstance ( this . org.springframework.integration.store.SimpleMessageGroup ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( ) ; final Message < ? > org.springframework.integration.store.Message<?> = MessageBuilder . withPayload ( STRING ) . setSequenceNumber ( NUMBER ) . build ( ) ; final Message < ? > org.springframework.integration.store.Message<?> = MessageBuilder . fromMessage ( org.springframework.integration.store.Message<> ) . setSequenceNumber ( NUMBER ) . build ( ) ; assertThat ( this . org.springframework.integration.store.MessageGroup . canAdd ( org.springframework.integration.store.Message<> ) , is ( true ) ) ; this . org.springframework.integration.store.SimpleMessageGroup . add ( org.springframework.integration.store.Message<> ) ; this . org.springframework.integration.store.SimpleMessageGroup . add ( org.springframework.integration.store.Message<> ) ; void ( ) ; assertThat ( this . org.springframework.integration.store.MessageGroup . canAdd ( org.springframework.integration.store.Message<> ) , is ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( ) ; final Message < ? > org.springframework.integration.store.Message<?> = MessageBuilder . withPayload ( STRING ) . build ( ) ; final Message < ? > org.springframework.integration.store.Message<?> = MessageBuilder . fromMessage ( org.springframework.integration.store.Message<> ) . build ( ) ; assertThat ( this . org.springframework.integration.store.MessageGroup . canAdd ( org.springframework.integration.store.Message<> ) , is ( true ) ) ; this . org.springframework.integration.store.SimpleMessageGroup . add ( org.springframework.integration.store.Message<> ) ; this . org.springframework.integration.store.SimpleMessageGroup . add ( org.springframework.integration.store.Message<> ) ; void ( ) ; assertThat ( this . org.springframework.integration.store.MessageGroup . canAdd ( org.springframework.integration.store.Message<> ) , is ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) java.lang.Exception { Message < ? > org.springframework.integration.store.Message<?> = mock ( Message .class ) ; willReturn ( new MessageHeaders ( mock ( java.util.Map .class ) ) ) . given ( org.springframework.integration.store.Message<> ) . getHeaders ( ) ; Message < ? > org.springframework.integration.store.Message<?> = mock ( Message .class ) ; willReturn ( new MessageHeaders ( mock ( java.util.Map .class ) ) ) . given ( org.springframework.integration.store.Message<> ) . getHeaders ( ) ; final java.util.List<org.springframework.integration.store.Message<?>> < Message < ? > > java.util.List<org.springframework.integration.store.Message<?>> = new java.util.ArrayList<org.springframework.integration.store.Message<?>> < Message < ? > > ( ) ; java.util.List<org.springframework.integration.store.Message<?>> . add ( org.springframework.integration.store.Message<> ) ; java.util.List<org.springframework.integration.store.Message<?>> . add ( null ) ; java.util.List<org.springframework.integration.store.Message<?>> . add ( org.springframework.integration.store.Message<> ) ; SimpleMessageGroup org.springframework.integration.store.SimpleMessageGroup = new SimpleMessageGroup ( java.util.List<org.springframework.integration.store.Message<?>> , NUMBER ) ; assertEquals ( NUMBER , org.springframework.integration.store.SimpleMessageGroup . getMessages ( ) . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Collection<org.springframework.integration.store.Message<?>> < Message < ? > > java.util.Collection<org.springframework.integration.store.Message<?>> = new java.util.ArrayList<org.springframework.integration.store.Message<?>> <> ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.Collection<org.springframework.integration.store.Message<?>> . add ( new GenericMessage < java.lang.Object > ( STRING ) ) ; } SimpleMessageGroup org.springframework.integration.store.SimpleMessageGroup = new SimpleMessageGroup ( java.util.Collection<org.springframework.integration.store.Message<?>> , this . java.lang.Object ) ; StopWatch org.springframework.integration.store.StopWatch = new StopWatch ( ) ; org.springframework.integration.store.StopWatch . start ( ) ; for ( Message < ? > org.springframework.integration.store.Message<?> : java.util.Collection<org.springframework.integration.store.Message<?>> ) { org.springframework.integration.store.SimpleMessageGroup . getMessages ( ) . contains ( org.springframework.integration.store.Message<> ) ; } org.springframework.integration.store.StopWatch . stop ( ) ; assertTrue ( org.springframework.integration.store.StopWatch . getTotalTimeMillis ( ) < NUMBER ) ; }  <METHOD_END>