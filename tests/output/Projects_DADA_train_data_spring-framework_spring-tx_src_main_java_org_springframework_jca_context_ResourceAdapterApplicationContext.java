<METHOD_START> public void ( BootstrapContext org.springframework.jca.context.BootstrapContext ) { Assert . notNull ( org.springframework.jca.context.BootstrapContext , STRING ) ; this . org.springframework.jca.context.BootstrapContext = org.springframework.jca.context.BootstrapContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ConfigurableListableBeanFactory org.springframework.jca.context.ConfigurableListableBeanFactory ) throws org.springframework.jca.context.BeansException { org.springframework.jca.context.ConfigurableListableBeanFactory . addBeanPostProcessor ( new BootstrapContextAwareProcessor ( this . org.springframework.jca.context.BootstrapContext ) ) ; org.springframework.jca.context.ConfigurableListableBeanFactory . ignoreDependencyInterface ( BootstrapContextAware .class ) ; org.springframework.jca.context.ConfigurableListableBeanFactory . registerResolvableDependency ( BootstrapContext .class , this . org.springframework.jca.context.BootstrapContext ) ; org.springframework.jca.context.ConfigurableListableBeanFactory . registerResolvableDependency ( WorkManager .class , new ObjectFactory < WorkManager > ( ) { @ java.lang.Override public org.springframework.jca.context.WorkManager org.springframework.jca.context.WorkManager ( ) { return org.springframework.jca.context.BootstrapContext . getWorkManager ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.jca.context.WorkManager org.springframework.jca.context.WorkManager ( ) { return org.springframework.jca.context.BootstrapContext . getWorkManager ( ) ; }  <METHOD_END>