<METHOD_START> public static void void ( ) { java.lang.ThreadLocal<org.springframework.messaging.simp.SimpAttributes> . remove ( ) ; }  <METHOD_END>
<METHOD_START> public static void void ( SimpAttributes org.springframework.messaging.simp.SimpAttributes ) { if ( org.springframework.messaging.simp.SimpAttributes != null ) { java.lang.ThreadLocal<org.springframework.messaging.simp.SimpAttributes> . set ( org.springframework.messaging.simp.SimpAttributes ) ; } else { void ( ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( Message < ? > org.springframework.messaging.simp.Message<?> ) { void ( SimpAttributes . fromMessage ( org.springframework.messaging.simp.Message<> ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.simp.SimpAttributes org.springframework.messaging.simp.SimpAttributes ( ) { return java.lang.ThreadLocal<org.springframework.messaging.simp.SimpAttributes> . get ( ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.messaging.simp.SimpAttributes org.springframework.messaging.simp.SimpAttributes ( ) java.lang.IllegalStateException { SimpAttributes org.springframework.messaging.simp.SimpAttributes = org.springframework.messaging.simp.SimpAttributes ( ) ; if ( org.springframework.messaging.simp.SimpAttributes == null ) { throw new java.lang.IllegalStateException ( STRING + STRING + STRING ) ; } return org.springframework.messaging.simp.SimpAttributes ; }  <METHOD_END>