<METHOD_START> @ Before public void void ( ) { ClassPathXmlApplicationContext org.springframework.aop.aspectj.ClassPathXmlApplicationContext = new ClassPathXmlApplicationContext ( java.lang.Class<? extends org.springframework.aop.aspectj.SubtypeSensitiveMatchingTests> ( ) . java.lang.String ( ) + STRING , java.lang.Class<? extends org.springframework.aop.aspectj.SubtypeSensitiveMatchingTests> ( ) ) ; org.springframework.aop.aspectj.NonSerializableFoo = ( org.springframework.aop.aspectj.NonSerializableFoo ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; org.springframework.aop.aspectj.SerializableFoo = ( org.springframework.aop.aspectj.SerializableFoo ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; org.springframework.aop.aspectj.Bar = ( org.springframework.aop.aspectj.Bar ) org.springframework.aop.aspectj.ClassPathXmlApplicationContext . getBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( STRING , this . org.springframework.aop.aspectj.SerializableFoo instanceof Advised ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( STRING , this . org.springframework.aop.aspectj.NonSerializableFoo instanceof Advised ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( STRING , this . org.springframework.aop.aspectj.Bar instanceof Advised ) ; }  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> void void ( )  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {}  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) {}  <METHOD_END>
<METHOD_START> void void ( java.lang.Object java.lang.Object );  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.Object java.lang.Object ) {}  <METHOD_END>
