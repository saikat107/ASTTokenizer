<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { return java.util.LinkedList<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public void void ( ) { java.util.LinkedList<java.lang.String> . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < java.lang.String , java.lang.String > demo.ordershipping.StateContext<java.lang.String,java.lang.String> ) { if ( demo.ordershipping.StateContext<java.lang.String,java.lang.String> . getStage ( ) == Stage . STATE_ENTRY ) { java.util.LinkedList<java.lang.String> . void ( demo.ordershipping.StateContext<java.lang.String,java.lang.String> . getStateMachine ( ) . getId ( ) + STRING + demo.ordershipping.StateContext<java.lang.String,java.lang.String> . getTarget ( ) . getId ( ) ) ; } else if ( demo.ordershipping.StateContext<java.lang.String,java.lang.String> . getStage ( ) == Stage . STATE_EXIT ) { java.util.LinkedList<java.lang.String> . void ( demo.ordershipping.StateContext<java.lang.String,java.lang.String> . getStateMachine ( ) . getId ( ) + STRING + demo.ordershipping.StateContext<java.lang.String,java.lang.String> . getSource ( ) . getId ( ) ) ; } }  <METHOD_END>