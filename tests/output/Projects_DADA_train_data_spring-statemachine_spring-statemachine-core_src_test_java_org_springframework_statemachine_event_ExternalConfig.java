<METHOD_START> @ Bean public org.springframework.statemachine.event.StateMachine<org.springframework.statemachine.event.TestStates,org.springframework.statemachine.event.TestEvents> < TestStates , TestEvents > org.springframework.statemachine.event.StateMachine<org.springframework.statemachine.event.TestStates,org.springframework.statemachine.event.TestEvents> ( ) java.lang.Exception { Builder < TestStates , TestEvents > org.springframework.statemachine.event.Builder<org.springframework.statemachine.event.TestStates,org.springframework.statemachine.event.TestEvents> = StateMachineBuilder . builder ( ) ; org.springframework.statemachine.event.Builder<org.springframework.statemachine.event.TestStates,org.springframework.statemachine.event.TestEvents> . configureStates ( ) . withStates ( ) . initial ( TestStates . S1 ) . state ( TestStates . S2 ) ; org.springframework.statemachine.event.Builder<org.springframework.statemachine.event.TestStates,org.springframework.statemachine.event.TestEvents> . configureTransitions ( ) . withExternal ( ) . source ( TestStates . S1 ) . target ( TestStates . S2 ) . event ( TestEvents . E1 ) ; return org.springframework.statemachine.event.Builder<org.springframework.statemachine.event.TestStates,org.springframework.statemachine.event.TestEvents> . build ( ) ; }  <METHOD_END>