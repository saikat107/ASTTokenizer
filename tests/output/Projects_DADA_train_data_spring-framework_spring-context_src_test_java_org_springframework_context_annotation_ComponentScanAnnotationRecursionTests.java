<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( Level1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( Level1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( Level2Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( Level3Component .class ) ; assertThat ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) , sameInstance ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ) ) ; assertThat ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) , sameInstance ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( LeftConfig .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; }  <METHOD_END>