<METHOD_START> public void ( HandlerMethod org.springframework.web.reactive.result.method.HandlerMethod ) { super( org.springframework.web.reactive.result.method.HandlerMethod ); this . org.springframework.web.reactive.result.method.InvocableHandlerMethod = new InvocableHandlerMethod ( org.springframework.web.reactive.result.method.HandlerMethod ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method ) { super( java.lang.Object , java.lang.reflect.Method ); this . org.springframework.web.reactive.result.method.InvocableHandlerMethod = new InvocableHandlerMethod ( java.lang.Object , java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.List<org.springframework.web.reactive.result.method.SyncHandlerMethodArgumentResolver> < SyncHandlerMethodArgumentResolver > java.util.List<org.springframework.web.reactive.result.method.SyncHandlerMethodArgumentResolver> ) { this . org.springframework.web.reactive.result.method.InvocableHandlerMethod . setArgumentResolvers ( new java.util.ArrayList <> ( java.util.List<org.springframework.web.reactive.result.method.SyncHandlerMethodArgumentResolver> ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.web.reactive.result.method.SyncHandlerMethodArgumentResolver> < SyncHandlerMethodArgumentResolver > java.util.List<org.springframework.web.reactive.result.method.SyncHandlerMethodArgumentResolver> ( ) { return this . org.springframework.web.reactive.result.method.InvocableHandlerMethod . getResolvers ( ) . stream ( ) . map ( resolver -> ( SyncHandlerMethodArgumentResolver ) resolver ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.Object,?,java.util.List<java.lang.Object>> ( ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ParameterNameDiscoverer org.springframework.web.reactive.result.method.ParameterNameDiscoverer ) { this . org.springframework.web.reactive.result.method.InvocableHandlerMethod . setParameterNameDiscoverer ( org.springframework.web.reactive.result.method.ParameterNameDiscoverer ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.result.method.ParameterNameDiscoverer org.springframework.web.reactive.result.method.ParameterNameDiscoverer ( ) { return this . org.springframework.web.reactive.result.method.InvocableHandlerMethod . getParameterNameDiscoverer ( ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.reactive.result.method.HandlerResult org.springframework.web.reactive.result.method.HandlerResult ( ServerWebExchange org.springframework.web.reactive.result.method.ServerWebExchange , BindingContext org.springframework.web.reactive.result.method.BindingContext , java.lang.Object ... java.lang.Object[] ) { return this . org.springframework.web.reactive.result.method.InvocableHandlerMethod . invoke ( org.springframework.web.reactive.result.method.ServerWebExchange , org.springframework.web.reactive.result.method.BindingContext , java.lang.Object[] ) . block ( ) ; }  <METHOD_END>