<METHOD_START> @ After public void void ( ) { if ( org.springframework.context.annotation.AnnotationConfigApplicationContext != null ) { org.springframework.context.annotation.AnnotationConfigApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.Spr12278Tests.BaseConfiguration .class , org.springframework.context.annotation.Spr12278Tests.SingleConstructorComponent .class ) ; assertThat ( this . org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.Spr12278Tests.SingleConstructorComponent .class ) . autowiredName , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( org.springframework.context.annotation.Spr12278Tests.BaseConfiguration .class , org.springframework.context.annotation.Spr12278Tests.TwoConstructorsComponent .class ) ; assertThat ( this . org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.Spr12278Tests.TwoConstructorsComponent .class ) . name , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.context.annotation.ExpectedException . expect ( BeanCreationException .class ) ; org.springframework.context.annotation.ExpectedException . expectMessage ( java.lang.NoSuchMethodException .class . java.lang.String ( ) ) ; new AnnotationConfigApplicationContext ( org.springframework.context.annotation.Spr12278Tests.BaseConfiguration .class , org.springframework.context.annotation.Spr12278Tests.TwoSpecificConstructorsComponent .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void ( ) { this( STRING ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.Integer java.lang.Integer ) { this . java.lang.Integer = java.lang.Integer ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { this( java.lang.Integer . java.lang.Integer ( java.lang.String ) ); }  <METHOD_END>