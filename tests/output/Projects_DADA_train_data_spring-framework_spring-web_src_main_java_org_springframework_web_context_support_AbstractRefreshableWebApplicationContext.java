<METHOD_START> public void ( ) { setDisplayName ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletContext org.springframework.web.context.support.ServletContext ) { this . org.springframework.web.context.support.ServletContext = org.springframework.web.context.support.ServletContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.context.support.ServletContext org.springframework.web.context.support.ServletContext ( ) { return this . org.springframework.web.context.support.ServletContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ServletConfig org.springframework.web.context.support.ServletConfig ) { this . org.springframework.web.context.support.ServletConfig = org.springframework.web.context.support.ServletConfig ; if ( org.springframework.web.context.support.ServletConfig != null && this . org.springframework.web.context.support.ServletContext == null ) { void ( org.springframework.web.context.support.ServletConfig . getServletContext ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.context.support.ServletConfig org.springframework.web.context.support.ServletConfig ( ) { return this . org.springframework.web.context.support.ServletConfig ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; if ( java.lang.String != null ) { setDisplayName ( STRING + java.lang.String + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String [] java.lang.String[] ( ) { return super. getConfigLocations ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return ( this . org.springframework.web.context.support.ServletContext != null ? this . org.springframework.web.context.support.ServletContext . getContextPath ( ) : STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.context.support.ConfigurableEnvironment org.springframework.web.context.support.ConfigurableEnvironment ( ) { return new StandardServletEnvironment ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ConfigurableListableBeanFactory org.springframework.web.context.support.ConfigurableListableBeanFactory ) { org.springframework.web.context.support.ConfigurableListableBeanFactory . addBeanPostProcessor ( new ServletContextAwareProcessor ( this . org.springframework.web.context.support.ServletContext , this . org.springframework.web.context.support.ServletConfig ) ) ; org.springframework.web.context.support.ConfigurableListableBeanFactory . ignoreDependencyInterface ( ServletContextAware .class ) ; org.springframework.web.context.support.ConfigurableListableBeanFactory . ignoreDependencyInterface ( ServletConfigAware .class ) ; WebApplicationContextUtils . registerWebApplicationScopes ( org.springframework.web.context.support.ConfigurableListableBeanFactory , this . org.springframework.web.context.support.ServletContext ) ; WebApplicationContextUtils . registerEnvironmentBeans ( org.springframework.web.context.support.ConfigurableListableBeanFactory , this . org.springframework.web.context.support.ServletContext , this . org.springframework.web.context.support.ServletConfig ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.context.support.Resource org.springframework.web.context.support.Resource ( java.lang.String java.lang.String ) { return new ServletContextResource ( this . org.springframework.web.context.support.ServletContext , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.context.support.ResourcePatternResolver org.springframework.web.context.support.ResourcePatternResolver ( ) { return new ServletContextResourcePatternResolver ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . org.springframework.web.context.support.ThemeSource = UiApplicationContextUtils . initThemeSource ( this ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { ConfigurableEnvironment org.springframework.web.context.support.ConfigurableEnvironment = getEnvironment ( ) ; if ( org.springframework.web.context.support.ConfigurableEnvironment instanceof ConfigurableWebEnvironment ) { ( ( ConfigurableWebEnvironment ) org.springframework.web.context.support.ConfigurableEnvironment ) . initPropertySources ( this . org.springframework.web.context.support.ServletContext , this . org.springframework.web.context.support.ServletConfig ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.web.context.support.Theme org.springframework.web.context.support.Theme ( java.lang.String java.lang.String ) { return this . org.springframework.web.context.support.ThemeSource . getTheme ( java.lang.String ) ; }  <METHOD_END>