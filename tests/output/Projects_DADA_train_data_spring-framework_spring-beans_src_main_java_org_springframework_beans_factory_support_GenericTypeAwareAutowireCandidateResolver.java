<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.beans.factory.support.BeanFactory ) { this . org.springframework.beans.factory.support.BeanFactory = org.springframework.beans.factory.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> protected final org.springframework.beans.factory.support.BeanFactory org.springframework.beans.factory.support.BeanFactory ( ) { return this . org.springframework.beans.factory.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( BeanDefinitionHolder org.springframework.beans.factory.support.BeanDefinitionHolder , DependencyDescriptor org.springframework.beans.factory.support.DependencyDescriptor ) { if ( ! org.springframework.beans.factory.support.BeanDefinitionHolder . getBeanDefinition ( ) . isAutowireCandidate ( ) ) { return false ; } return ( org.springframework.beans.factory.support.DependencyDescriptor == null || boolean ( org.springframework.beans.factory.support.BeanDefinitionHolder , org.springframework.beans.factory.support.DependencyDescriptor ) ) ; }  <METHOD_END>
<METHOD_START> protected boolean boolean ( BeanDefinitionHolder org.springframework.beans.factory.support.BeanDefinitionHolder , DependencyDescriptor org.springframework.beans.factory.support.DependencyDescriptor ) { ResolvableType org.springframework.beans.factory.support.ResolvableType = org.springframework.beans.factory.support.DependencyDescriptor . getResolvableType ( ) ; if ( org.springframework.beans.factory.support.ResolvableType . getType ( ) instanceof java.lang.Class ) { return true ; } ResolvableType org.springframework.beans.factory.support.ResolvableType = null ; boolean boolean = false ; RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition = null ; if ( org.springframework.beans.factory.support.BeanDefinitionHolder . getBeanDefinition ( ) instanceof RootBeanDefinition ) { org.springframework.beans.factory.support.RootBeanDefinition = ( RootBeanDefinition ) org.springframework.beans.factory.support.BeanDefinitionHolder . getBeanDefinition ( ) ; } if ( org.springframework.beans.factory.support.RootBeanDefinition != null ) { org.springframework.beans.factory.support.ResolvableType = rbd . targetType ; if ( org.springframework.beans.factory.support.ResolvableType == null ) { boolean = true ; org.springframework.beans.factory.support.ResolvableType = org.springframework.beans.factory.support.ResolvableType ( org.springframework.beans.factory.support.RootBeanDefinition , org.springframework.beans.factory.support.DependencyDescriptor ) ; if ( org.springframework.beans.factory.support.ResolvableType == null ) { RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition = org.springframework.beans.factory.support.RootBeanDefinition ( org.springframework.beans.factory.support.RootBeanDefinition ) ; if ( org.springframework.beans.factory.support.RootBeanDefinition != null ) { org.springframework.beans.factory.support.ResolvableType = dbd . targetType ; if ( org.springframework.beans.factory.support.ResolvableType == null ) { org.springframework.beans.factory.support.ResolvableType = org.springframework.beans.factory.support.ResolvableType ( org.springframework.beans.factory.support.RootBeanDefinition , org.springframework.beans.factory.support.DependencyDescriptor ) ; } } } } } if ( org.springframework.beans.factory.support.ResolvableType == null ) { if ( this . org.springframework.beans.factory.support.BeanFactory != null ) { java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.beans.factory.support.BeanFactory . getType ( org.springframework.beans.factory.support.BeanDefinitionHolder . getBeanName ( ) ) ; if ( java.lang.Class<> != null ) { org.springframework.beans.factory.support.ResolvableType = ResolvableType . forClass ( ClassUtils . getUserClass ( java.lang.Class<> ) ) ; } } if ( org.springframework.beans.factory.support.ResolvableType == null && org.springframework.beans.factory.support.RootBeanDefinition != null && org.springframework.beans.factory.support.RootBeanDefinition . hasBeanClass ( ) && org.springframework.beans.factory.support.RootBeanDefinition . getFactoryMethodName ( ) == null ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.beans.factory.support.RootBeanDefinition . getBeanClass ( ) ; if ( ! FactoryBean .class . boolean ( java.lang.Class<> ) ) { org.springframework.beans.factory.support.ResolvableType = ResolvableType . forClass ( ClassUtils . getUserClass ( java.lang.Class<> ) ) ; } } } if ( org.springframework.beans.factory.support.ResolvableType == null ) { return true ; } if ( boolean ) { rbd . targetType = org.springframework.beans.factory.support.ResolvableType ; } if ( org.springframework.beans.factory.support.DependencyDescriptor . fallbackMatchAllowed ( ) && org.springframework.beans.factory.support.ResolvableType . hasUnresolvableGenerics ( ) ) { return true ; } return org.springframework.beans.factory.support.ResolvableType . isAssignableFrom ( org.springframework.beans.factory.support.ResolvableType ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.beans.factory.support.RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition ) { BeanDefinitionHolder org.springframework.beans.factory.support.BeanDefinitionHolder = org.springframework.beans.factory.support.RootBeanDefinition . getDecoratedDefinition ( ) ; if ( org.springframework.beans.factory.support.BeanDefinitionHolder != null && this . org.springframework.beans.factory.support.BeanFactory instanceof ConfigurableListableBeanFactory ) { ConfigurableListableBeanFactory org.springframework.beans.factory.support.ConfigurableListableBeanFactory = ( ConfigurableListableBeanFactory ) this . org.springframework.beans.factory.support.BeanFactory ; if ( org.springframework.beans.factory.support.ConfigurableListableBeanFactory . containsBeanDefinition ( org.springframework.beans.factory.support.BeanDefinitionHolder . getBeanName ( ) ) ) { BeanDefinition org.springframework.beans.factory.support.BeanDefinition = org.springframework.beans.factory.support.ConfigurableListableBeanFactory . getMergedBeanDefinition ( org.springframework.beans.factory.support.BeanDefinitionHolder . getBeanName ( ) ) ; if ( org.springframework.beans.factory.support.BeanDefinition instanceof RootBeanDefinition ) { return ( RootBeanDefinition ) org.springframework.beans.factory.support.BeanDefinition ; } } } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.beans.factory.support.ResolvableType org.springframework.beans.factory.support.ResolvableType ( RootBeanDefinition org.springframework.beans.factory.support.RootBeanDefinition , DependencyDescriptor org.springframework.beans.factory.support.DependencyDescriptor ) { ResolvableType org.springframework.beans.factory.support.ResolvableType = rbd . factoryMethodReturnType ; if ( org.springframework.beans.factory.support.ResolvableType == null ) { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.beans.factory.support.RootBeanDefinition . getResolvedFactoryMethod ( ) ; if ( java.lang.reflect.Method != null ) { org.springframework.beans.factory.support.ResolvableType = ResolvableType . forMethodReturnType ( java.lang.reflect.Method ) ; } } if ( org.springframework.beans.factory.support.ResolvableType != null ) { java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.beans.factory.support.ResolvableType . resolve ( ) ; if ( java.lang.Class<> != null && org.springframework.beans.factory.support.DependencyDescriptor . getDependencyType ( ) . isAssignableFrom ( java.lang.Class<> ) ) { return org.springframework.beans.factory.support.ResolvableType ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( DependencyDescriptor org.springframework.beans.factory.support.DependencyDescriptor ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( DependencyDescriptor org.springframework.beans.factory.support.DependencyDescriptor , java.lang.String java.lang.String ) { return null ; }  <METHOD_END>