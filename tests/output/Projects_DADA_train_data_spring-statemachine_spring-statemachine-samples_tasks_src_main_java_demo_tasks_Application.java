<METHOD_START> @ java.lang.Override public void void ( StateMachineStateConfigurer < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateMachineStateConfigurer<demo.tasks.Application.States,demo.tasks.Application.Events> )				throws java.lang.Exception { demo.tasks.StateMachineStateConfigurer<demo.tasks.Application.States,demo.tasks.Application.Events> . withStates ( ) . initial ( demo.tasks.Application.States . demo.tasks.Application.States ) . fork ( demo.tasks.Application.States . demo.tasks.Application.States ) . state ( demo.tasks.Application.States . demo.tasks.Application.States ) . join ( demo.tasks.Application.States . demo.tasks.Application.States ) . choice ( demo.tasks.Application.States . demo.tasks.Application.States ) . state ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withStates ( ) . parent ( demo.tasks.Application.States . demo.tasks.Application.States ) . initial ( demo.tasks.Application.States . demo.tasks.Application.States ) . end ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withStates ( ) . parent ( demo.tasks.Application.States . demo.tasks.Application.States ) . initial ( demo.tasks.Application.States . demo.tasks.Application.States ) . end ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withStates ( ) . parent ( demo.tasks.Application.States . demo.tasks.Application.States ) . initial ( demo.tasks.Application.States . demo.tasks.Application.States ) . end ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withStates ( ) . parent ( demo.tasks.Application.States . demo.tasks.Application.States ) . initial ( demo.tasks.Application.States . demo.tasks.Application.States ) . state ( demo.tasks.Application.States . demo.tasks.Application.States , demo.tasks.Action<demo.tasks.Application.States,demo.tasks.Application.Events> ( ) , null ) . state ( demo.tasks.Application.States . demo.tasks.Application.States ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateMachineTransitionConfigurer < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateMachineTransitionConfigurer<demo.tasks.Application.States,demo.tasks.Application.Events> )				throws java.lang.Exception { demo.tasks.StateMachineTransitionConfigurer<demo.tasks.Application.States,demo.tasks.Application.Events> . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . event ( demo.tasks.Application.Events . demo.tasks.Application.Events ) . and ( ) . withFork ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withJoin ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withChoice ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . first ( demo.tasks.Application.States . demo.tasks.Application.States , demo.tasks.Guard<demo.tasks.Application.States,demo.tasks.Application.Events> ( ) ) . last ( demo.tasks.Application.States . demo.tasks.Application.States ) . and ( ) . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . event ( demo.tasks.Application.Events . demo.tasks.Application.Events ) . and ( ) . withExternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . target ( demo.tasks.Application.States . demo.tasks.Application.States ) . event ( demo.tasks.Application.Events . demo.tasks.Application.Events ) . and ( ) . withInternal ( ) . source ( demo.tasks.Application.States . demo.tasks.Application.States ) . action ( demo.tasks.Action<demo.tasks.Application.States,demo.tasks.Application.Events> ( ) ) . event ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.tasks.Guard<demo.tasks.Application.States,demo.tasks.Application.Events> < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.Guard<demo.tasks.Application.States,demo.tasks.Application.Events> ( ) { return new Guard < demo.tasks.Application.States , demo.tasks.Application.Events > ( ) { @ java.lang.Override public boolean boolean ( StateContext < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getExtendedState ( ) . getVariables ( ) ; return ! ( ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( StateContext < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getExtendedState ( ) . getVariables ( ) ; return ! ( ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.tasks.Action<demo.tasks.Application.States,demo.tasks.Application.Events> < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.Action<demo.tasks.Application.States,demo.tasks.Application.Events> ( ) { return new Action < demo.tasks.Application.States , demo.tasks.Application.Events > ( ) { @ java.lang.Override public void void ( StateContext < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getExtendedState ( ) . getVariables ( ) ; if ( ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) ) { demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getStateMachine ( ) . sendEvent ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; } else { demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getStateMachine ( ) . sendEvent ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getExtendedState ( ) . getVariables ( ) ; if ( ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) && ObjectUtils . nullSafeEquals ( java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING ) , true ) ) { demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getStateMachine ( ) . sendEvent ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; } else { demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getStateMachine ( ) . sendEvent ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; } }  <METHOD_END>
<METHOD_START> @ Bean public demo.tasks.Action<demo.tasks.Application.States,demo.tasks.Application.Events> < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.Action<demo.tasks.Application.States,demo.tasks.Application.Events> ( ) { return new Action < demo.tasks.Application.States , demo.tasks.Application.Events > ( ) { @ java.lang.Override public void void ( StateContext < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getExtendedState ( ) . getVariables ( ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING , true ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING , true ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING , true ) ; demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getStateMachine ( ) . sendEvent ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( StateContext < demo.tasks.Application.States , demo.tasks.Application.Events > demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getExtendedState ( ) . getVariables ( ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING , true ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING , true ) ; java.util.Map<java.lang.Object,java.lang.Object> . java.lang.Object ( STRING , true ) ; demo.tasks.StateContext<demo.tasks.Application.States,demo.tasks.Application.Events> . getStateMachine ( ) . sendEvent ( demo.tasks.Application.Events . demo.tasks.Application.Events ) ; }  <METHOD_END>
<METHOD_START> @ Bean public demo.tasks.Tasks demo.tasks.Tasks ( ) { return new Tasks ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = StateMachineSystemConstants . TASK_EXECUTOR_BEAN_NAME ) public demo.tasks.TaskExecutor demo.tasks.TaskExecutor ( ) { ThreadPoolTaskExecutor demo.tasks.ThreadPoolTaskExecutor = new ThreadPoolTaskExecutor ( ) ; demo.tasks.ThreadPoolTaskExecutor . setCorePoolSize ( NUMBER ) ; return demo.tasks.ThreadPoolTaskExecutor ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { Bootstrap . main ( java.lang.String[] ) ; }  <METHOD_END>