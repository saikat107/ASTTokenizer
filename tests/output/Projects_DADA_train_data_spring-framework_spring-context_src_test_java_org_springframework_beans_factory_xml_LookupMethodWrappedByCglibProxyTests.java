<METHOD_START> @ Before public void void ( ) { this . org.springframework.beans.factory.xml.ApplicationContext = new ClassPathXmlApplicationContext ( java.lang.String , java.lang.Class<> ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.beans.factory.xml.OverloadLookup org.springframework.beans.factory.xml.OverloadLookup = ( org.springframework.beans.factory.xml.OverloadLookup ) org.springframework.beans.factory.xml.ApplicationContext . getBean ( STRING ) ; ITestBean org.springframework.beans.factory.xml.ITestBean = org.springframework.beans.factory.xml.OverloadLookup . org.springframework.beans.factory.xml.ITestBean ( ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.ITestBean . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.OverloadLookup . java.lang.String ( ) ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.beans.factory.xml.OverloadLookup org.springframework.beans.factory.xml.OverloadLookup = ( org.springframework.beans.factory.xml.OverloadLookup ) org.springframework.beans.factory.xml.ApplicationContext . getBean ( STRING ) ; ITestBean org.springframework.beans.factory.xml.ITestBean = org.springframework.beans.factory.xml.OverloadLookup . org.springframework.beans.factory.xml.ITestBean ( ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.ITestBean . getName ( ) ) ; assertEquals ( STRING , org.springframework.beans.factory.xml.OverloadLookup . java.lang.String ( ) ) ; void ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> private void void ( int int ) { DebugInterceptor org.springframework.beans.factory.xml.DebugInterceptor = org.springframework.beans.factory.xml.DebugInterceptor ( ) ; assertEquals ( STRING , int , org.springframework.beans.factory.xml.DebugInterceptor . getCount ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { DebugInterceptor org.springframework.beans.factory.xml.DebugInterceptor = org.springframework.beans.factory.xml.DebugInterceptor ( ) ; org.springframework.beans.factory.xml.DebugInterceptor . resetCount ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.beans.factory.xml.DebugInterceptor org.springframework.beans.factory.xml.DebugInterceptor ( ) { return ( DebugInterceptor ) org.springframework.beans.factory.xml.ApplicationContext . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> public abstract org.springframework.beans.factory.xml.ITestBean org.springframework.beans.factory.xml.ITestBean ( )  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>