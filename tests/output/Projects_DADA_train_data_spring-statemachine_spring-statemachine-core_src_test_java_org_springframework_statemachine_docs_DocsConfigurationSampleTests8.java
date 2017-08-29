<METHOD_START> @ java.lang.Override public void void ( StateMachineModelConfigurer < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineModelConfigurer<java.lang.String,java.lang.String> ) throws java.lang.Exception { org.springframework.statemachine.docs.StateMachineModelConfigurer<java.lang.String,java.lang.String> . withModel ( ) . factory ( org.springframework.statemachine.docs.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.docs.StateMachineModelFactory<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineModelFactory<java.lang.String,java.lang.String> ( ) { return new org.springframework.statemachine.docs.DocsConfigurationSampleTests8.CustomStateMachineModelFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> ( ) { ConfigurationData < java.lang.String , java.lang.String > org.springframework.statemachine.docs.ConfigurationData<java.lang.String,java.lang.String> = new ConfigurationData <> ( ) ; java.util.Collection<org.springframework.statemachine.docs.StateData<java.lang.String,java.lang.String>> < StateData < java.lang.String , java.lang.String > > java.util.Collection<org.springframework.statemachine.docs.StateData<java.lang.String,java.lang.String>> = new java.util.ArrayList<org.springframework.statemachine.docs.StateData<java.lang.String,java.lang.String>> <> ( ) ; java.util.Collection<org.springframework.statemachine.docs.StateData<java.lang.String,java.lang.String>> . add ( new StateData < java.lang.String , java.lang.String > ( STRING , true ) ) ; java.util.Collection<org.springframework.statemachine.docs.StateData<java.lang.String,java.lang.String>> . add ( new StateData < java.lang.String , java.lang.String > ( STRING ) ) ; StatesData < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StatesData<java.lang.String,java.lang.String> = new StatesData <> ( java.util.Collection<org.springframework.statemachine.docs.StateData<java.lang.String,java.lang.String>> ) ; java.util.Collection<org.springframework.statemachine.docs.TransitionData<java.lang.String,java.lang.String>> < TransitionData < java.lang.String , java.lang.String > > java.util.Collection<org.springframework.statemachine.docs.TransitionData<java.lang.String,java.lang.String>> = new java.util.ArrayList<org.springframework.statemachine.docs.TransitionData<java.lang.String,java.lang.String>> <> ( ) ; java.util.Collection<org.springframework.statemachine.docs.TransitionData<java.lang.String,java.lang.String>> . add ( new TransitionData < java.lang.String , java.lang.String > ( STRING , STRING , STRING ) ) ; TransitionsData < java.lang.String , java.lang.String > org.springframework.statemachine.docs.TransitionsData<java.lang.String,java.lang.String> = new TransitionsData <> ( java.util.Collection<org.springframework.statemachine.docs.TransitionData<java.lang.String,java.lang.String>> ) ; StateMachineModel < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> = new DefaultStateMachineModel < java.lang.String , java.lang.String > ( org.springframework.statemachine.docs.ConfigurationData<java.lang.String,java.lang.String> , org.springframework.statemachine.docs.StatesData<java.lang.String,java.lang.String> , org.springframework.statemachine.docs.TransitionsData<java.lang.String,java.lang.String> ) ; return org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> ( java.lang.String java.lang.String ) { return org.springframework.statemachine.docs.StateMachineModel<java.lang.String,java.lang.String> ( ) ; }  <METHOD_END>