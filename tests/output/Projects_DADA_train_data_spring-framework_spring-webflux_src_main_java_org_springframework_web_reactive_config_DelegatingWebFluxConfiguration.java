<METHOD_START> @ Autowired ( required = false ) public void void ( java.util.List<org.springframework.web.reactive.config.WebFluxConfigurer> < WebFluxConfigurer > java.util.List<org.springframework.web.reactive.config.WebFluxConfigurer> ) { if ( ! CollectionUtils . isEmpty ( java.util.List<org.springframework.web.reactive.config.WebFluxConfigurer> ) ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . addWebFluxConfigurers ( java.util.List<org.springframework.web.reactive.config.WebFluxConfigurer> ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( RequestedContentTypeResolverBuilder org.springframework.web.reactive.config.RequestedContentTypeResolverBuilder ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . configureContentTypeResolver ( org.springframework.web.reactive.config.RequestedContentTypeResolverBuilder ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( CorsRegistry org.springframework.web.reactive.config.CorsRegistry ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . addCorsMappings ( org.springframework.web.reactive.config.CorsRegistry ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( PathMatchConfigurer org.springframework.web.reactive.config.PathMatchConfigurer ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . configurePathMatching ( org.springframework.web.reactive.config.PathMatchConfigurer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ResourceHandlerRegistry org.springframework.web.reactive.config.ResourceHandlerRegistry ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . addResourceHandlers ( org.springframework.web.reactive.config.ResourceHandlerRegistry ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ArgumentResolverConfigurer org.springframework.web.reactive.config.ArgumentResolverConfigurer ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . configureArgumentResolvers ( org.springframework.web.reactive.config.ArgumentResolverConfigurer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ServerCodecConfigurer org.springframework.web.reactive.config.ServerCodecConfigurer ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . configureHttpMessageCodecs ( org.springframework.web.reactive.config.ServerCodecConfigurer ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( FormatterRegistry org.springframework.web.reactive.config.FormatterRegistry ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . addFormatters ( org.springframework.web.reactive.config.FormatterRegistry ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.config.Validator org.springframework.web.reactive.config.Validator ( ) { return this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . getValidator ( ) . orElse ( super. getValidator ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.config.MessageCodesResolver org.springframework.web.reactive.config.MessageCodesResolver ( ) { return this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . getMessageCodesResolver ( ) . orElse ( super. getMessageCodesResolver ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ViewResolverRegistry org.springframework.web.reactive.config.ViewResolverRegistry ) { this . org.springframework.web.reactive.config.WebFluxConfigurerComposite . configureViewResolvers ( org.springframework.web.reactive.config.ViewResolverRegistry ) ; }  <METHOD_END>