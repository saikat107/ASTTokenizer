<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { if ( java.lang.Class<> == null || ! java.lang.Class<?> ( ) . boolean ( java.lang.Class<> ) ) { java.lang.String java.lang.String = ( java.lang.Class<> != null ? java.lang.Class<> . java.lang.String ( ) : null ) ; throw new java.lang.IllegalArgumentException ( STRING + java.lang.String + STRING + STRING + java.lang.Class<?> ( ) . java.lang.String ( ) + STRING ) ; } this . java.lang.Class<?> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return this . java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return AbstractUrlBasedView .class ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> protected java.lang.String [] java.lang.String[] ( ) { return this . java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.function.Function<java.lang.String,org.springframework.web.reactive.result.view.RedirectView> < java.lang.String , RedirectView > java.util.function.Function<java.lang.String,org.springframework.web.reactive.result.view.RedirectView> ) { this . java.util.function.Function<java.lang.String,org.springframework.web.reactive.result.view.RedirectView> = java.util.function.Function<java.lang.String,org.springframework.web.reactive.result.view.RedirectView> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( java.lang.Class<?> ( ) == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.View> < View > org.springframework.web.reactive.result.view.Mono<org.springframework.web.reactive.result.view.View> ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) { if ( ! boolean ( java.lang.String , java.util.Locale ) ) { return Mono . empty ( ) ; } AbstractUrlBasedView org.springframework.web.reactive.result.view.AbstractUrlBasedView ; if ( java.lang.String . boolean ( java.lang.String ) ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( java.lang.String . int ( ) ) ; org.springframework.web.reactive.result.view.AbstractUrlBasedView = this . java.util.function.Function<java.lang.String,org.springframework.web.reactive.result.view.RedirectView> . apply ( java.lang.String ) ; } else { org.springframework.web.reactive.result.view.AbstractUrlBasedView = org.springframework.web.reactive.result.view.AbstractUrlBasedView ( java.lang.String ) ; } View org.springframework.web.reactive.result.view.View = org.springframework.web.reactive.result.view.View ( java.lang.String , org.springframework.web.reactive.result.view.AbstractUrlBasedView ) ; try { return ( org.springframework.web.reactive.result.view.AbstractUrlBasedView . checkResourceExists ( java.util.Locale ) ? Mono . just ( org.springframework.web.reactive.result.view.View ) : Mono . empty ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { return Mono . error ( java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) { java.lang.String [] java.lang.String[] = java.lang.String[] ( ) ; return ( java.lang.String[] == null || PatternMatchUtils . simpleMatch ( java.lang.String[] , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.AbstractUrlBasedView org.springframework.web.reactive.result.view.AbstractUrlBasedView ( java.lang.String java.lang.String ) { AbstractUrlBasedView org.springframework.web.reactive.result.view.AbstractUrlBasedView = ( AbstractUrlBasedView ) BeanUtils . instantiateClass ( java.lang.Class<?> ( ) ) ; org.springframework.web.reactive.result.view.AbstractUrlBasedView . setSupportedMediaTypes ( getSupportedMediaTypes ( ) ) ; org.springframework.web.reactive.result.view.AbstractUrlBasedView . setRequestContextAttribute ( java.lang.String ( ) ) ; org.springframework.web.reactive.result.view.AbstractUrlBasedView . setDefaultCharset ( getDefaultCharset ( ) ) ; org.springframework.web.reactive.result.view.AbstractUrlBasedView . setUrl ( java.lang.String ( ) + java.lang.String + java.lang.String ( ) ) ; return org.springframework.web.reactive.result.view.AbstractUrlBasedView ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.reactive.result.view.View org.springframework.web.reactive.result.view.View ( java.lang.String java.lang.String , AbstractView org.springframework.web.reactive.result.view.AbstractView ) { return ( View ) getApplicationContext ( ) . getAutowireCapableBeanFactory ( ) . initializeBean ( org.springframework.web.reactive.result.view.AbstractView , java.lang.String ) ; }  <METHOD_END>