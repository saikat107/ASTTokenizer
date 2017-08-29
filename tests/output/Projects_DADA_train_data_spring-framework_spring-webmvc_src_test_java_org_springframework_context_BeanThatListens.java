<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( BeanThatBroadcasts org.springframework.context.BeanThatBroadcasts ) { this . org.springframework.context.BeanThatBroadcasts = org.springframework.context.BeanThatBroadcasts ; java.util.Map java.util.Map = beanThatBroadcasts . applicationContext . getBeansOfType ( org.springframework.context.BeanThatListens .class ) ; if ( ! java.util.Map . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEvent org.springframework.context.ApplicationEvent ) { int ++ ; if ( org.springframework.context.BeanThatBroadcasts != null ) { org.springframework.context.BeanThatBroadcasts . receivedCount ++ ; } }  <METHOD_END>
<METHOD_START> public int int ( ) { return int ; }  <METHOD_END>
<METHOD_START> public void void ( ) { int = NUMBER ; }  <METHOD_END>
