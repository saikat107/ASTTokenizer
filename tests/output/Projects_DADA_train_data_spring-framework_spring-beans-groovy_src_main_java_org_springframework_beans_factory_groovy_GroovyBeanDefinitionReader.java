<METHOD_START> public void ( BeanDefinitionRegistry org.springframework.beans.factory.groovy.BeanDefinitionRegistry ) { super( org.springframework.beans.factory.groovy.BeanDefinitionRegistry ); this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.groovy.BeanDefinitionRegistry ) ; this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.groovy.BeanDefinitionRegistry ) ; this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader . setValidating ( false ) ; }  <METHOD_END>
<METHOD_START> public void ( XmlBeanDefinitionReader org.springframework.beans.factory.groovy.XmlBeanDefinitionReader ) { super( org.springframework.beans.factory.groovy.XmlBeanDefinitionReader . getRegistry ( ) ); this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader = new XmlBeanDefinitionReader ( org.springframework.beans.factory.groovy.XmlBeanDefinitionReader . getRegistry ( ) ) ; this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader = org.springframework.beans.factory.groovy.XmlBeanDefinitionReader ; }  <METHOD_END>
<METHOD_START> public void void ( MetaClass org.springframework.beans.factory.groovy.MetaClass ) { this . org.springframework.beans.factory.groovy.MetaClass = org.springframework.beans.factory.groovy.MetaClass ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.groovy.MetaClass org.springframework.beans.factory.groovy.MetaClass ( ) { return this . org.springframework.beans.factory.groovy.MetaClass ; }  <METHOD_END>
<METHOD_START> public void void ( Binding org.springframework.beans.factory.groovy.Binding ) { this . org.springframework.beans.factory.groovy.Binding = org.springframework.beans.factory.groovy.Binding ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.groovy.Binding org.springframework.beans.factory.groovy.Binding ( ) { return this . org.springframework.beans.factory.groovy.Binding ; }  <METHOD_END>
<METHOD_START> public int int ( Resource org.springframework.beans.factory.groovy.Resource ) throws org.springframework.beans.factory.groovy.BeanDefinitionStoreException { return int ( new EncodedResource ( org.springframework.beans.factory.groovy.Resource ) ) ; }  <METHOD_END>
<METHOD_START> public int int ( EncodedResource org.springframework.beans.factory.groovy.EncodedResource ) throws org.springframework.beans.factory.groovy.BeanDefinitionStoreException { java.lang.String java.lang.String = org.springframework.beans.factory.groovy.EncodedResource . getResource ( ) . getFilename ( ) ; if ( StringUtils . endsWithIgnoreCase ( java.lang.String , STRING ) ) { return this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader . loadBeanDefinitions ( org.springframework.beans.factory.groovy.EncodedResource ) ; } Closure org.springframework.beans.factory.groovy.Closure = new Closure ( this ) { public java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader ( ( Closure ) java.lang.Object[] [ NUMBER ] ) ; return null ; } } ; Binding org.springframework.beans.factory.groovy.Binding = new Binding ( ) { @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) { void ( java.lang.String , java.lang.Object ) ; } else { super. setVariable ( java.lang.String , java.lang.Object ) ; } } } ; org.springframework.beans.factory.groovy.Binding . setVariable ( STRING , org.springframework.beans.factory.groovy.Closure ) ; int int = getRegistry ( ) . getBeanDefinitionCount ( ) ; try { GroovyShell org.springframework.beans.factory.groovy.GroovyShell = new GroovyShell ( getResourceLoader ( ) . getClassLoader ( ) , org.springframework.beans.factory.groovy.Binding ) ; org.springframework.beans.factory.groovy.GroovyShell . evaluate ( org.springframework.beans.factory.groovy.EncodedResource . getReader ( ) , STRING ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new BeanDefinitionParsingException ( new Problem ( STRING + java.lang.Throwable . java.lang.String ( ) , new Location ( org.springframework.beans.factory.groovy.EncodedResource . getResource ( ) ) , null , java.lang.Throwable ) ) ; } return getRegistry ( ) . getBeanDefinitionCount ( ) - int ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.Object [] java.lang.Object[] ) { org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader ( ( Closure ) java.lang.Object[] [ NUMBER ] ) ; return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) { void ( java.lang.String , java.lang.Object ) ; } else { super. setVariable ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader ( Closure org.springframework.beans.factory.groovy.Closure ) { return org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader ( org.springframework.beans.factory.groovy.Closure ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.groovy.GenericBeanDefinition org.springframework.beans.factory.groovy.GenericBeanDefinition ( java.lang.Class<?> < ? > java.lang.Class<?> ) { GenericBeanDefinition org.springframework.beans.factory.groovy.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.beans.factory.groovy.GenericBeanDefinition . setBeanClass ( java.lang.Class<> ) ; return org.springframework.beans.factory.groovy.GenericBeanDefinition ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.groovy.AbstractBeanDefinition org.springframework.beans.factory.groovy.AbstractBeanDefinition ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Object ... java.lang.Object[] ) { GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; try { Closure org.springframework.beans.factory.groovy.Closure = null ; java.util.Collection java.util.Collection = null ; if ( ! ObjectUtils . isEmpty ( java.lang.Object[] ) ) { int int = java.lang.Object[] . int ; java.lang.Object java.lang.Object = java.lang.Object[] [ int - NUMBER ] ; if ( java.lang.Object instanceof Closure ) { org.springframework.beans.factory.groovy.Closure = ( Closure ) java.lang.Object ; int -- ; } if ( int > - NUMBER ) { java.util.Collection = java.util.List<java.lang.Object> ( java.lang.Object[] , NUMBER , int ) ; } } this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( null , java.lang.Class<> , java.util.Collection ) ; if ( org.springframework.beans.factory.groovy.Closure != null ) { org.springframework.beans.factory.groovy.Closure . call ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ) ; } return this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) ; } finally { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; } }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> ) { if ( ! java.util.Map<java.lang.String,java.lang.String> . boolean ( ) ) { for ( java.util.Map . java.util.Map.Entry<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map.Entry<java.lang.String,java.lang.String> : java.util.Map<java.lang.String,java.lang.String> . java.util.Set<java.util.Map.Entry<java.lang.String,java.lang.String>> ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) ; java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,java.lang.String> . java.lang.String ( ) ; if ( java.lang.String == null ) { throw new java.lang.IllegalArgumentException ( STRING ) ; } NamespaceHandler org.springframework.beans.factory.groovy.NamespaceHandler = this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader . getNamespaceHandlerResolver ( ) . resolve ( java.lang.String ) ; if ( org.springframework.beans.factory.groovy.NamespaceHandler == null ) { throw new BeanDefinitionParsingException ( new Problem ( STRING + java.lang.String , new Location ( new DescriptiveResource ( ( STRING ) ) ) ) ) ; } this . java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) throws java.io.IOException { int ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { java.lang.Object [] java.lang.Object[] = ( java.lang.Object [] ) java.lang.Object ; if ( STRING . boolean ( java.lang.String ) && java.lang.Object[] . int == NUMBER && java.lang.Object[] [ NUMBER ] instanceof Closure ) { return org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader ( ( Closure ) java.lang.Object[] [ NUMBER ] ) ; } else if ( STRING . boolean ( java.lang.String ) ) { java.lang.String java.lang.String ; if ( java.lang.Object[] [ NUMBER ] == null ) throw new java.lang.IllegalArgumentException ( STRING ) ; if ( java.lang.Object[] [ NUMBER ] instanceof RuntimeBeanReference ) { java.lang.String = ( ( RuntimeBeanReference ) java.lang.Object[] [ NUMBER ] ) . getBeanName ( ) ; } else { java.lang.String = java.lang.Object[] [ NUMBER ] . java.lang.String ( ) ; } boolean boolean = false ; if ( java.lang.Object[] . int > NUMBER ) { if ( java.lang.Object[] [ NUMBER ] instanceof java.lang.Boolean ) { boolean = ( java.lang.Boolean ) java.lang.Object[] [ NUMBER ] ; } } return new RuntimeBeanReference ( java.lang.String , boolean ) ; } else if ( this . java.util.Map<java.lang.String,java.lang.String> . boolean ( java.lang.String ) && java.lang.Object[] . int > NUMBER && java.lang.Object[] [ NUMBER ] instanceof Closure ) { GroovyDynamicElementReader org.springframework.beans.factory.groovy.GroovyDynamicElementReader = org.springframework.beans.factory.groovy.GroovyDynamicElementReader ( java.lang.String ) ; org.springframework.beans.factory.groovy.GroovyDynamicElementReader . invokeMethod ( STRING , java.lang.Object[] ) ; } else if ( java.lang.Object[] . int > NUMBER && java.lang.Object[] [ NUMBER ] instanceof Closure ) { return org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ( java.lang.String , java.lang.Object[] ) ; } else if ( java.lang.Object[] . int > NUMBER && ( java.lang.Object[] [ NUMBER ] instanceof java.lang.Class || java.lang.Object[] [ NUMBER ] instanceof RuntimeBeanReference || java.lang.Object[] [ NUMBER ] instanceof java.util.Map ) ) { return org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ( java.lang.String , java.lang.Object[] ) ; } else if ( java.lang.Object[] . int > NUMBER && java.lang.Object[] [ java.lang.Object[] . int - NUMBER ] instanceof Closure ) { return org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ( java.lang.String , java.lang.Object[] ) ; } MetaClass org.springframework.beans.factory.groovy.MetaClass = DefaultGroovyMethods . getMetaClass ( getRegistry ( ) ) ; if ( ! org.springframework.beans.factory.groovy.MetaClass . respondsTo ( getRegistry ( ) , java.lang.String , java.lang.Object[] ) . isEmpty ( ) ) { return org.springframework.beans.factory.groovy.MetaClass . invokeMethod ( getRegistry ( ) , java.lang.String , java.lang.Object[] ) ; } return this ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof java.util.List ) { this . java.util.Map<java.lang.String,org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> . org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanName ( ) + '.' + java.lang.String , new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , java.lang.String , java.lang.Object ) ) ; return true ; } else if ( java.lang.Object instanceof java.util.Map ) { this . java.util.Map<java.lang.String,org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> . org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanName ( ) + '.' + java.lang.String , new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , java.lang.String , java.lang.Object ) ) ; return true ; } return false ; }  <METHOD_END>
<METHOD_START> private void void ( ) { for ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty : this . java.util.Map<java.lang.String,org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> . java.util.Collection<org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> ( ) ) { if ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object instanceof java.util.List ) { org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object = java.lang.Object ( ( java.util.List ) org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object ) ; } else if ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object instanceof java.util.Map ) { org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object = java.lang.Object ( ( java.util.Map ) org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object ) ; } org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . void ( ) ; } this . java.util.Map<java.lang.String,org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> . void ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader ( Closure org.springframework.beans.factory.groovy.Closure ) { org.springframework.beans.factory.groovy.Closure . setDelegate ( this ) ; org.springframework.beans.factory.groovy.Closure . call ( ) ; void ( ) ; return this ; }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ( java.lang.String java.lang.String , java.lang.Object [] java.lang.Object[] ) { boolean boolean = ( java.lang.Object[] [ java.lang.Object[] . int - NUMBER ] instanceof Closure ) ; if ( java.lang.Object[] [ NUMBER ] instanceof java.lang.Class ) { java.lang.Class<?> < ? > java.lang.Class<?> = ( java.lang.Class<?> < ? > ) java.lang.Object[] [ NUMBER ] ; if ( java.lang.Object[] . int >= NUMBER ) { if ( boolean ) { if ( java.lang.Object[] . int - NUMBER != NUMBER ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String , java.lang.Class<> , java.util.List<java.lang.Object> ( java.lang.Object[] , NUMBER , java.lang.Object[] . int - NUMBER ) ) ; } else { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String , java.lang.Class<> ) ; } } else { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String , java.lang.Class<> , java.util.List<java.lang.Object> ( java.lang.Object[] , NUMBER , java.lang.Object[] . int ) ) ; } } } else if ( java.lang.Object[] [ NUMBER ] instanceof RuntimeBeanReference ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String ) ; this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . setFactoryBeanName ( ( ( RuntimeBeanReference ) java.lang.Object[] [ NUMBER ] ) . getBeanName ( ) ) ; } else if ( java.lang.Object[] [ NUMBER ] instanceof java.util.Map ) { if ( java.lang.Object[] . int > NUMBER && java.lang.Object[] [ NUMBER ] instanceof java.lang.Class ) { java.util.List java.util.List = java.util.List<java.lang.Object> ( java.lang.Object[] , NUMBER , boolean ? java.lang.Object[] . int - NUMBER : java.lang.Object[] . int ) ; this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String , ( java.lang.Class ) java.lang.Object[] [ NUMBER ] , java.util.List ) ; java.util.Map java.util.Map = ( java.util.Map ) java.lang.Object[] [ NUMBER ] ; for ( java.lang.Object java.lang.Object : java.util.Map . java.util.Set ( ) ) { java.lang.String java.lang.String = ( java.lang.String ) java.lang.Object ; void ( java.lang.String , java.util.Map . java.lang.Object ( java.lang.String ) ) ; } } else { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String ) ; java.util.Map . java.util.Map.Entry java.util.Map.Entry = ( java.util.Map . java.util.Map.Entry ) ( ( java.util.Map ) java.lang.Object[] [ NUMBER ] ) . java.util.Set ( ) . java.util.Iterator ( ) . java.lang.Object ( ) ; int int = boolean ? NUMBER : NUMBER ; if ( java.lang.Object[] . int > int ) { int int = ( boolean ? java.lang.Object[] . int - NUMBER : java.lang.Object[] . int ) ; this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String , null , java.util.List<java.lang.Object> ( java.lang.Object[] , NUMBER , int ) ) ; } else { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String ) ; } this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . setFactoryBeanName ( java.util.Map.Entry . java.lang.Object ( ) . java.lang.String ( ) ) ; this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . setFactoryMethodName ( java.util.Map.Entry . java.lang.Object ( ) . java.lang.String ( ) ) ; } } else if ( java.lang.Object[] [ NUMBER ] instanceof Closure ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String ) ; this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . setAbstract ( true ) ; } else { java.util.List java.util.List = java.util.List<java.lang.Object> ( java.lang.Object[] , NUMBER , boolean ? java.lang.Object[] . int - NUMBER : java.lang.Object[] . int ) ; org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String , null , java.util.List ) ; } if ( boolean ) { Closure org.springframework.beans.factory.groovy.Closure = ( Closure ) java.lang.Object[] [ java.lang.Object[] . int - NUMBER ] ; org.springframework.beans.factory.groovy.Closure . setDelegate ( this ) ; org.springframework.beans.factory.groovy.Closure . setResolveStrategy ( Closure . DELEGATE_FIRST ) ; org.springframework.beans.factory.groovy.Closure . call ( new java.lang.Object [] { org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper } ) ; } GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = null ; org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . setAttribute ( GroovyBeanDefinitionWrapper .class . java.lang.String ( ) , org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ) ; getRegistry ( ) . registerBeanDefinition ( java.lang.String , org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) ) ; return org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; }  <METHOD_END>
<METHOD_START> protected java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> ( java.lang.Object [] java.lang.Object[] , int int , int int ) { java.lang.Object [] java.lang.Object[] = java.util.Arrays . java.lang.Object[] ( java.lang.Object[] , int , int ) ; for ( int int = NUMBER ; int < java.lang.Object[] . int ; int ++ ) { if ( java.lang.Object[] [ int ] instanceof GString ) { java.lang.Object[] [ int ] = java.lang.Object[] [ int ] . java.lang.String ( ) ; } else if ( java.lang.Object[] [ int ] instanceof java.util.List ) { java.lang.Object[] [ int ] = java.lang.Object ( ( java.util.List ) java.lang.Object[] [ int ] ) ; } else if ( java.lang.Object[] [ int ] instanceof java.util.Map ) { java.lang.Object[] [ int ] = java.lang.Object ( ( java.util.Map ) java.lang.Object[] [ int ] ) ; } } return java.util.Arrays . java.util.List<java.lang.Object> ( java.lang.Object[] ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) { boolean boolean = false ; for ( java.lang.Object java.lang.Object : java.util.Map<,> . java.util.Collection<> ( ) ) { if ( java.lang.Object instanceof RuntimeBeanReference ) { boolean = true ; break; } } if ( boolean ) { java.util.Map<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > java.util.Map<java.lang.Object,java.lang.Object> = new ManagedMap <> ( ) ; java.util.Map<java.lang.Object,java.lang.Object> . void ( java.util.Map<,> ) ; return java.util.Map<java.lang.Object,java.lang.Object> ; } return java.util.Map<,> ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.util.List<?> < ? > java.util.List<?> ) { boolean boolean = false ; for ( java.lang.Object java.lang.Object : java.util.List<> ) { if ( java.lang.Object instanceof RuntimeBeanReference ) { boolean = true ; break; } } if ( boolean ) { java.util.List<java.lang.Object> < java.lang.Object > java.util.List<java.lang.Object> = new ManagedList <> ( ) ; java.util.List<java.lang.Object> . boolean ( java.util.List<> ) ; return java.util.List<java.lang.Object> ; } return java.util.List<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) { void ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof GString ) { java.lang.Object = java.lang.Object . java.lang.String ( ) ; } if ( boolean ( java.lang.String , java.lang.Object ) ) { return; } else if ( java.lang.Object instanceof Closure ) { GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; try { Closure org.springframework.beans.factory.groovy.Closure = ( Closure ) java.lang.Object ; java.lang.Class<?> < ? > java.lang.Class<?> = org.springframework.beans.factory.groovy.Closure . getParameterTypes ( ) [ NUMBER ] ; if ( java.lang.Object .class == java.lang.Class<> ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( STRING ) ; org.springframework.beans.factory.groovy.Closure . call ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ) ; } else { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( null , java.lang.Class<> ) ; org.springframework.beans.factory.groovy.Closure . call ( ( java.lang.Object ) null ) ; } java.lang.Object = this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) ; } finally { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; } } this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . addProperty ( java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { Binding org.springframework.beans.factory.groovy.Binding = org.springframework.beans.factory.groovy.Binding ( ) ; if ( org.springframework.beans.factory.groovy.Binding != null && org.springframework.beans.factory.groovy.Binding . hasVariable ( java.lang.String ) ) { return org.springframework.beans.factory.groovy.Binding . getVariable ( java.lang.String ) ; } else { if ( this . java.util.Map<java.lang.String,java.lang.String> . boolean ( java.lang.String ) ) { return org.springframework.beans.factory.groovy.GroovyDynamicElementReader ( java.lang.String ) ; } if ( getRegistry ( ) . containsBeanDefinition ( java.lang.String ) ) { GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = ( GroovyBeanDefinitionWrapper ) getRegistry ( ) . getBeanDefinition ( java.lang.String ) . getAttribute ( GroovyBeanDefinitionWrapper .class . java.lang.String ( ) ) ; if ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) { return new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.GroovyRuntimeBeanReference ( java.lang.String , org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , false ) ; } else { return new RuntimeBeanReference ( java.lang.String , false ) ; } } else if ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) { MutablePropertyValues org.springframework.beans.factory.groovy.MutablePropertyValues = this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . getPropertyValues ( ) ; if ( org.springframework.beans.factory.groovy.MutablePropertyValues . contains ( java.lang.String ) ) { return org.springframework.beans.factory.groovy.MutablePropertyValues . get ( java.lang.String ) ; } else { org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty = this . java.util.Map<java.lang.String,org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> . org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanName ( ) + java.lang.String ) ; if ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty != null ) { return org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty . java.lang.Object ; } else { return org.springframework.beans.factory.groovy.MetaClass ( ) . getProperty ( this , java.lang.String ) ; } } } else { return org.springframework.beans.factory.groovy.MetaClass ( ) . getProperty ( this , java.lang.String ) ; } } }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.groovy.GroovyDynamicElementReader org.springframework.beans.factory.groovy.GroovyDynamicElementReader ( java.lang.String java.lang.String ) { XmlReaderContext org.springframework.beans.factory.groovy.XmlReaderContext = this . org.springframework.beans.factory.groovy.XmlBeanDefinitionReader . createReaderContext ( new DescriptiveResource ( STRING ) ) ; BeanDefinitionParserDelegate org.springframework.beans.factory.groovy.BeanDefinitionParserDelegate = new BeanDefinitionParserDelegate ( org.springframework.beans.factory.groovy.XmlReaderContext ) ; boolean boolean = ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) ; if ( ! boolean ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = new GroovyBeanDefinitionWrapper ( java.lang.String ) ; } return new GroovyDynamicElementReader ( java.lang.String , this . java.util.Map<java.lang.String,java.lang.String> , org.springframework.beans.factory.groovy.BeanDefinitionParserDelegate , this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , boolean ) { @ java.lang.Override protected void void ( ) { if ( ! this . decorating ) { org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = null ; } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { if ( ! this . decorating ) { org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = null ; } }  <METHOD_END>
<METHOD_START> public void ( GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; this . java.lang.String = java.lang.String ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . addProperty ( this . java.lang.String , this . java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , GroovyBeanDefinitionWrapper org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , boolean boolean ) { super( java.lang.String , boolean ); this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper = org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper ; this . org.springframework.beans.factory.groovy.MetaClass = InvokerHelper . getMetaClass ( this ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.beans.factory.groovy.MetaClass org.springframework.beans.factory.groovy.MetaClass ( ) { return this . org.springframework.beans.factory.groovy.MetaClass ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { if ( java.lang.String . boolean ( STRING ) ) { return getBeanName ( ) ; } else if ( java.lang.String . boolean ( STRING ) ) { return getSource ( ) ; } else if ( this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper != null ) { return new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.GroovyRuntimeBeanReference.GroovyPropertyValue ( java.lang.String , this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . getPropertyValues ( ) . get ( java.lang.String ) ) ; } else { return this . org.springframework.beans.factory.groovy.MetaClass . getProperty ( this , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return this . org.springframework.beans.factory.groovy.MetaClass . invokeMethod ( this , java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( MetaClass org.springframework.beans.factory.groovy.MetaClass ) { this . org.springframework.beans.factory.groovy.MetaClass = org.springframework.beans.factory.groovy.MetaClass ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { if ( ! boolean ( java.lang.String , java.lang.Object ) ) { this . org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanDefinition ( ) . getPropertyValues ( ) . add ( java.lang.String , java.lang.Object ) ; } }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { this . java.lang.String = java.lang.String ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { InvokerHelper . invokeMethod ( this . java.lang.Object , STRING , java.lang.Object ) ; void ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.lang.Object java.lang.Object ) { boolean boolean = ( java.lang.Boolean ) InvokerHelper . invokeMethod ( this . java.lang.Object , STRING , java.lang.Object ) ; void ( java.lang.Object ) ; return boolean ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( java.util.Collection java.util.Collection ) { boolean boolean = ( java.lang.Boolean ) InvokerHelper . invokeMethod ( this . java.lang.Object , STRING , java.util.Collection ) ; for ( java.lang.Object java.lang.Object : java.util.Collection ) { void ( java.lang.Object ) ; } return boolean ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return InvokerHelper . invokeMethod ( this . java.lang.Object , java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { return InvokerHelper . getProperty ( this . java.lang.Object , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { InvokerHelper . setProperty ( this . java.lang.Object , java.lang.String , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object ) { if ( java.lang.Object instanceof RuntimeBeanReference ) { java.util.Map<java.lang.String,org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty> . org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper . getBeanName ( ) , new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader.DeferredProperty ( org.springframework.beans.factory.groovy.GroovyBeanDefinitionWrapper , this . java.lang.String , this . java.lang.Object ) ) ; } }  <METHOD_END>
