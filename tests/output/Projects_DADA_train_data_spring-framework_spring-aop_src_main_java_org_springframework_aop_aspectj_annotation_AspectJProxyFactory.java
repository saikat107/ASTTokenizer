<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object ) { Assert . notNull ( java.lang.Object , STRING ) ; setInterfaces ( ClassUtils . getAllInterfaces ( java.lang.Object ) ) ; setTarget ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Class<?> < ? > ... java.lang.Class<?>[] ) { setInterfaces ( java.lang.Class<?>[] ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) ; AspectMetadata org.springframework.aop.aspectj.annotation.AspectMetadata = org.springframework.aop.aspectj.annotation.AspectMetadata ( java.lang.Class<> , java.lang.String ) ; if ( org.springframework.aop.aspectj.annotation.AspectMetadata . getAjType ( ) . getPerClause ( ) . getKind ( ) != PerClauseKind . SINGLETON ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } void ( new SingletonMetadataAwareAspectInstanceFactory ( java.lang.Object , java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.String java.lang.String = java.lang.Class<> . java.lang.String ( ) ; AspectMetadata org.springframework.aop.aspectj.annotation.AspectMetadata = org.springframework.aop.aspectj.annotation.AspectMetadata ( java.lang.Class<> , java.lang.String ) ; MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory = org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ( org.springframework.aop.aspectj.annotation.AspectMetadata , java.lang.Class<> , java.lang.String ) ; void ( org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ; }  <METHOD_END>
<METHOD_START> private void void ( MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) { java.util.List<org.springframework.aop.aspectj.annotation.Advisor> < Advisor > java.util.List<org.springframework.aop.aspectj.annotation.Advisor> = this . org.springframework.aop.aspectj.annotation.AspectJAdvisorFactory . getAdvisors ( org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ) ; java.util.List<org.springframework.aop.aspectj.annotation.Advisor> = AopUtils . findAdvisorsThatCanApply ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> , getTargetClass ( ) ) ; AspectJProxyUtils . makeAdvisorChainAspectJCapableIfNecessary ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ) ; AnnotationAwareOrderComparator . sort ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ) ; addAdvisors ( java.util.List<org.springframework.aop.aspectj.annotation.Advisor> ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.annotation.AspectMetadata org.springframework.aop.aspectj.annotation.AspectMetadata ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { AspectMetadata org.springframework.aop.aspectj.annotation.AspectMetadata = new AspectMetadata ( java.lang.Class<> , java.lang.String ) ; if ( ! org.springframework.aop.aspectj.annotation.AspectMetadata . getAjType ( ) . isAspect ( ) ) { throw new java.lang.IllegalArgumentException ( STRING + java.lang.Class<> . java.lang.String ( ) + STRING ) ; } return org.springframework.aop.aspectj.annotation.AspectMetadata ; }  <METHOD_END>
<METHOD_START> private org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ( AspectMetadata org.springframework.aop.aspectj.annotation.AspectMetadata , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String ) { MetadataAwareAspectInstanceFactory org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ; if ( org.springframework.aop.aspectj.annotation.AspectMetadata . getAjType ( ) . getPerClause ( ) . getKind ( ) == PerClauseKind . SINGLETON ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.Class<> ) ; org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory = new SingletonMetadataAwareAspectInstanceFactory ( java.lang.Object , java.lang.String ) ; } else { org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory = new SimpleMetadataAwareAspectInstanceFactory ( java.lang.Class<> , java.lang.String ) ; } return org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.Object java.lang.Object = java.util.Map<java.lang.Class<?>,java.lang.Object> . java.lang.Object ( java.lang.Class<> ) ; if ( java.lang.Object == null ) { synchronized ( java.util.Map<java.lang.Class<?>,java.lang.Object> ) { java.lang.Object = java.util.Map<java.lang.Class<?>,java.lang.Object> . java.lang.Object ( java.lang.Class<> ) ; if ( java.lang.Object != null ) { return java.lang.Object ; } java.lang.Object = new SimpleAspectInstanceFactory ( java.lang.Class<> ) . getAspectInstance ( ) ; java.util.Map<java.lang.Class<?>,java.lang.Object> . java.lang.Object ( java.lang.Class<> , java.lang.Object ) ; } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > T T ( ) { return ( T ) createAopProxy ( ) . getProxy ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > T T ( java.lang.ClassLoader java.lang.ClassLoader ) { return ( T ) createAopProxy ( ) . getProxy ( java.lang.ClassLoader ) ; }  <METHOD_END>