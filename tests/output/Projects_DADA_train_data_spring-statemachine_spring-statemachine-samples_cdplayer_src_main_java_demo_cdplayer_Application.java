<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateMachineStateConfigurer<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> )				throws java.lang.Exception { demo.cdplayer.StateMachineStateConfigurer<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . withStates ( ) . initial ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . state ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . and ( ) . withStates ( ) . parent ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . initial ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . state ( demo.cdplayer.Application.States . demo.cdplayer.Application.States , demo.cdplayer.Application.ClosedEntryAction ( ) , null ) . state ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . and ( ) . withStates ( ) . state ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . and ( ) . withStates ( ) . parent ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . initial ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . state ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . state ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateMachineTransitionConfigurer<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> )				throws java.lang.Exception { demo.cdplayer.StateMachineTransitionConfigurer<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . and ( ) . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . and ( ) . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . and ( ) . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . and ( ) . withInternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . action ( demo.cdplayer.Application.PlayingAction ( ) ) . timer ( NUMBER ) . and ( ) . withInternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . action ( demo.cdplayer.Application.TrackAction ( ) ) . and ( ) . withInternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . action ( demo.cdplayer.Application.TrackAction ( ) ) . and ( ) . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . and ( ) . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . and ( ) . withExternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . target ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . action ( demo.cdplayer.Application.PlayAction ( ) ) . guard ( demo.cdplayer.Application.PlayGuard ( ) ) . and ( ) . withInternal ( ) . source ( demo.cdplayer.Application.States . demo.cdplayer.Application.States ) . event ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . action ( demo.cdplayer.Application.LoadAction ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Application.ClosedEntryAction demo.cdplayer.Application.ClosedEntryAction ( ) { return new demo.cdplayer.Application.ClosedEntryAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Application.LoadAction demo.cdplayer.Application.LoadAction ( ) { return new demo.cdplayer.Application.LoadAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Application.TrackAction demo.cdplayer.Application.TrackAction ( ) { return new demo.cdplayer.Application.TrackAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Application.PlayAction demo.cdplayer.Application.PlayAction ( ) { return new demo.cdplayer.Application.PlayAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Application.PlayingAction demo.cdplayer.Application.PlayingAction ( ) { return new demo.cdplayer.Application.PlayingAction ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Application.PlayGuard demo.cdplayer.Application.PlayGuard ( ) { return new demo.cdplayer.Application.PlayGuard ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.CdPlayer demo.cdplayer.CdPlayer ( ) { return new CdPlayer ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.cdplayer.Library demo.cdplayer.Library ( ) { return Library . buildSampleLibrary ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> ) { if ( demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getTransition ( ) != null && demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getEvent ( ) == demo.cdplayer.Application.Events . demo.cdplayer.Application.Events && demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getTransition ( ) . getTarget ( ) . getId ( ) == demo.cdplayer.Application.States . demo.cdplayer.Application.States && demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) . getVariables ( ) . get ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) != null ) { demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getStateMachine ( ) . sendEvent ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> ) { java.lang.Object java.lang.Object = demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getMessageHeader ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) ; demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) . getVariables ( ) . put ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> ) { demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) . getVariables ( ) . put ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables , NUMBER ) ; demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) . getVariables ( ) . put ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( StateContext < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> ) { ExtendedState demo.cdplayer.ExtendedState = demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) ; return demo.cdplayer.ExtendedState . getVariables ( ) . get ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) != null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) . getVariables ( ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) ; if ( java.lang.Object instanceof java.lang.Long ) { long long = ( ( java.lang.Long ) java.lang.Object ) + NUMBER ; if ( long > ( ( Cd ) java.lang.Object ) . getTracks ( ) [ ( ( java.lang.Integer ) java.lang.Object ) ] . getLength ( ) * NUMBER ) { demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getStateMachine ( ) . sendEvent ( MessageBuilder . withPayload ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) . setHeader ( demo.cdplayer.Application.Headers . demo.cdplayer.Application.Headers . java.lang.String ( ) , NUMBER ) . build ( ) ) ; } else { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables , long ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.cdplayer.Application.States , demo.cdplayer.Application.Events > demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getExtendedState ( ) . getVariables ( ) ; java.lang.Object java.lang.Object = demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getMessageHeader ( demo.cdplayer.Application.Headers . demo.cdplayer.Application.Headers . java.lang.String ( ) ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) ; java.lang.Object java.lang.Object = java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables ) ; if ( java.lang.Object instanceof java.lang.Integer && java.lang.Object instanceof java.lang.Integer && java.lang.Object instanceof Cd ) { int int = ( ( java.lang.Integer ) java.lang.Object ) + ( ( java.lang.Integer ) java.lang.Object ) ; if ( int >= NUMBER && ( ( Cd ) java.lang.Object ) . getTracks ( ) . length > int ) { java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables , NUMBER ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( demo.cdplayer.Application.Variables . demo.cdplayer.Application.Variables , int ) ; } else if ( ( ( Cd ) java.lang.Object ) . getTracks ( ) . length <= int ) { demo.cdplayer.StateContext<demo.cdplayer.Application.States,demo.cdplayer.Application.Events> . getStateMachine ( ) . sendEvent ( demo.cdplayer.Application.Events . demo.cdplayer.Application.Events ) ; } } }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { Bootstrap . main ( java.lang.String[] ) ; }  <METHOD_END>