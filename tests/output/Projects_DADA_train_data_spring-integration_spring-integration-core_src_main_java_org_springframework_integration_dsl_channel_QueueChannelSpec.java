<METHOD_START> void ( ) { super(); }  <METHOD_END>
<METHOD_START> void ( java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> < Message < ? > > java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> ) { this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> = java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> ; }  <METHOD_END>
<METHOD_START> void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.dsl.channel.QueueChannel org.springframework.integration.dsl.channel.QueueChannel ( ) { if ( this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> != null ) { this . channel = new QueueChannel ( this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> ) ; } else if ( this . java.lang.Integer != null ) { this . channel = new QueueChannel ( this . java.lang.Integer ) ; } else { this . channel = new QueueChannel ( ) ; } return super. doGet ( ) ; }  <METHOD_END>
<METHOD_START> void ( ChannelMessageStore org.springframework.integration.dsl.channel.ChannelMessageStore , java.lang.Object java.lang.Object ) { super(); this . org.springframework.integration.dsl.channel.ChannelMessageStore = org.springframework.integration.dsl.channel.ChannelMessageStore ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec ( java.lang.String java.lang.String ) { return ( org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec ) super. id ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; return this ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec org.springframework.integration.dsl.channel.QueueChannelSpec.MessageStoreSpec ( java.util.concurrent.locks.Lock java.util.concurrent.locks.Lock ) { this . java.util.concurrent.locks.Lock = java.util.concurrent.locks.Lock ; return this ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.integration.dsl.channel.QueueChannel org.springframework.integration.dsl.channel.QueueChannel ( ) { if ( this . java.lang.Integer != null ) { if ( this . java.util.concurrent.locks.Lock != null ) { this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> = new MessageGroupQueue ( this . org.springframework.integration.dsl.channel.ChannelMessageStore , this . java.lang.Object , this . java.lang.Integer , this . java.util.concurrent.locks.Lock ) ; } else { this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> = new MessageGroupQueue ( this . org.springframework.integration.dsl.channel.ChannelMessageStore , this . java.lang.Object , this . java.lang.Integer ) ; } } else if ( this . java.util.concurrent.locks.Lock != null ) { this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> = new MessageGroupQueue ( this . org.springframework.integration.dsl.channel.ChannelMessageStore , this . java.lang.Object , this . java.util.concurrent.locks.Lock ) ; } else { this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> = new MessageGroupQueue ( this . org.springframework.integration.dsl.channel.ChannelMessageStore , this . java.lang.Object ) ; } ( ( MessageGroupQueue ) this . java.util.Queue<org.springframework.integration.dsl.channel.Message<?>> ) . setPriority ( this . org.springframework.integration.dsl.channel.ChannelMessageStore instanceof PriorityCapableChannelMessageStore ) ; return super. org.springframework.integration.dsl.channel.QueueChannel ( ) ; }  <METHOD_END>