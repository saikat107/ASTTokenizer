<METHOD_START> @ java.lang.Override public abstract void void ( StateMachine < S , E > org.springframework.statemachine.ensemble.StateMachine<S,E> );  <METHOD_END>
<METHOD_START> @ java.lang.Override public abstract void void ( StateMachine < S , E > org.springframework.statemachine.ensemble.StateMachine<S,E> );  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EnsembleListener < S , E > org.springframework.statemachine.ensemble.EnsembleListener<S,E> ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . register ( org.springframework.statemachine.ensemble.EnsembleListener<S,E> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( EnsembleListener < S , E > org.springframework.statemachine.ensemble.EnsembleListener<S,E> ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . unregister ( org.springframework.statemachine.ensemble.EnsembleListener<S,E> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( StateMachine < S , E > org.springframework.statemachine.ensemble.StateMachine<S,E> , StateMachineContext < S , E > org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . stateMachineJoined ( org.springframework.statemachine.ensemble.StateMachine<S,E> , org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( StateMachine < S , E > org.springframework.statemachine.ensemble.StateMachine<S,E> , StateMachineContext < S , E > org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . stateMachineLeft ( org.springframework.statemachine.ensemble.StateMachine<S,E> , org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( StateMachineEnsembleException org.springframework.statemachine.ensemble.StateMachineEnsembleException ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . ensembleError ( org.springframework.statemachine.ensemble.StateMachineEnsembleException ) ; }  <METHOD_END>
<METHOD_START> protected void void ( StateMachine < S , E > org.springframework.statemachine.ensemble.StateMachine<S,E> ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . ensembleLeaderGranted ( org.springframework.statemachine.ensemble.StateMachine<S,E> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( StateMachine < S , E > org.springframework.statemachine.ensemble.StateMachine<S,E> ) { org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . ensembleLeaderRevoked ( org.springframework.statemachine.ensemble.StateMachine<S,E> ) ; }  <METHOD_END>
<METHOD_START> protected void void ( StateMachineContext < S , E > org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) { if ( org.springframework.statemachine.ensemble.Log . isTraceEnabled ( ) ) { org.springframework.statemachine.ensemble.Log . trace ( STRING + org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) ; } org.springframework.statemachine.ensemble.CompositeEnsembleListener<S,E> . stateChanged ( org.springframework.statemachine.ensemble.StateMachineContext<S,E> ) ; }  <METHOD_END>