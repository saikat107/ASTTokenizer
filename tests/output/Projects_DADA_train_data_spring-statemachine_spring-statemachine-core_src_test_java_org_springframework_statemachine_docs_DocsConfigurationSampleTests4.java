<METHOD_START> @ OnTransition public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( ) {		}  <METHOD_END>
<METHOD_START> public static org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> ( BeanFactory org.springframework.statemachine.docs.BeanFactory ) throws java.lang.Exception { Builder < java.lang.String , java.lang.String > org.springframework.statemachine.docs.Builder<java.lang.String,java.lang.String> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.docs.Builder<java.lang.String,java.lang.String> . configureConfiguration ( ) . withConfiguration ( ) . machineId ( STRING ) . beanFactory ( org.springframework.statemachine.docs.BeanFactory ) ; org.springframework.statemachine.docs.Builder<java.lang.String,java.lang.String> . configureStates ( ) . withStates ( ) . initial ( STRING ) . state ( STRING ) ; org.springframework.statemachine.docs.Builder<java.lang.String,java.lang.String> . configureTransitions ( ) . withExternal ( ) . source ( STRING ) . target ( STRING ) . event ( STRING ) ; return org.springframework.statemachine.docs.Builder<java.lang.String,java.lang.String> . build ( ) ; }  <METHOD_END>
<METHOD_START> @ OnStateChanged public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( StateContext < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateContext<java.lang.String,java.lang.String> ) {		}  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( @ EventHeaders java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , ExtendedState org.springframework.statemachine.docs.ExtendedState , StateMachine < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachine<java.lang.String,java.lang.String> , Message < java.lang.String > org.springframework.statemachine.docs.Message<java.lang.String> , java.lang.Exception java.lang.Exception ) {		}  <METHOD_END>
<METHOD_START> @ OnTransition ( source = STRING , target = STRING ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnTransition public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.docs.DocsConfigurationSampleTests4.StatesOnTransition ( org.springframework.statemachine.docs.States[] = States . S1 , org.springframework.statemachine.docs.States[] = States . S2 ) public void void ( @ EventHeaders java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , ExtendedState org.springframework.statemachine.docs.ExtendedState ) {		}  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.docs.DocsConfigurationSampleTests4.StatesOnTransition ( org.springframework.statemachine.docs.States[] = States . S1 , org.springframework.statemachine.docs.States[] = States . S2 ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateChanged public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateChanged ( source = STRING , target = STRING ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ org.springframework.statemachine.docs.DocsConfigurationSampleTests4.StatesOnStates ( org.springframework.statemachine.docs.States[] = States . S1 , org.springframework.statemachine.docs.States[] = States . S2 ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateEntry public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateExit public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnEventNotAccepted public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnEventNotAccepted ( event = STRING ) public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateMachineStart public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateMachineStop public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnStateMachineError public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnExtendedStateChanged public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ OnExtendedStateChanged ( key = STRING ) public void void ( ) {		}  <METHOD_END>
