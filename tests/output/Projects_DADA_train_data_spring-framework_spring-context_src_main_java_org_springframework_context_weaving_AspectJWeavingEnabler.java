<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( LoadTimeWeaver org.springframework.context.weaving.LoadTimeWeaver ) { this . org.springframework.context.weaving.LoadTimeWeaver = org.springframework.context.weaving.LoadTimeWeaver ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return HIGHEST_PRECEDENCE ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableListableBeanFactory org.springframework.context.weaving.ConfigurableListableBeanFactory ) throws org.springframework.context.weaving.BeansException { void ( this . org.springframework.context.weaving.LoadTimeWeaver , this . java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> public static void void ( LoadTimeWeaver org.springframework.context.weaving.LoadTimeWeaver , java.lang.ClassLoader java.lang.ClassLoader ) { if ( org.springframework.context.weaving.LoadTimeWeaver == null ) { if ( InstrumentationLoadTimeWeaver . isInstrumentationAvailable ( ) ) { org.springframework.context.weaving.LoadTimeWeaver = new InstrumentationLoadTimeWeaver ( java.lang.ClassLoader ) ; } else { throw new java.lang.IllegalStateException ( STRING ) ; } } org.springframework.context.weaving.LoadTimeWeaver . addTransformer ( new org.springframework.context.weaving.AspectJWeavingEnabler.AspectJClassBypassingClassFileTransformer ( new ClassPreProcessorAgentAdapter ( ) ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.instrument.ClassFileTransformer java.lang.instrument.ClassFileTransformer ) { this . java.lang.instrument.ClassFileTransformer = java.lang.instrument.ClassFileTransformer ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public byte [] byte[] ( java.lang.ClassLoader java.lang.ClassLoader , java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> , java.security.ProtectionDomain java.security.ProtectionDomain , byte [] byte[] ) throws java.lang.instrument.IllegalClassFormatException { if ( java.lang.String . boolean ( STRING ) || java.lang.String . boolean ( STRING ) ) { return byte[] ; } return this . java.lang.instrument.ClassFileTransformer . byte[] ( java.lang.ClassLoader , java.lang.String , java.lang.Class<> , java.security.ProtectionDomain , byte[] ) ; }  <METHOD_END>