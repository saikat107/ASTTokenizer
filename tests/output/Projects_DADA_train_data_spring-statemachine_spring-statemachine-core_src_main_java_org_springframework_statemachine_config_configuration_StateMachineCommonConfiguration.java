<METHOD_START> @ Bean ( name = StateMachineSystemConstants . TASK_EXECUTOR_BEAN_NAME ) public org.springframework.statemachine.config.configuration.TaskExecutor org.springframework.statemachine.config.configuration.TaskExecutor ( ) { return new SyncTaskExecutor ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.statemachine.config.configuration.TaskScheduler org.springframework.statemachine.config.configuration.TaskScheduler ( ) { return new ConcurrentTaskScheduler ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean ( name = StateMachineHandlerApplicationListener . BEAN_NAME ) public org.springframework.statemachine.config.configuration.StateMachineHandlerApplicationListener org.springframework.statemachine.config.configuration.StateMachineHandlerApplicationListener ( ) { return new StateMachineHandlerApplicationListener ( ) ; }  <METHOD_END>