<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.aop.support.ClassFilter . matches ( java.lang.RuntimeException .class ) ) ; assertFalse ( org.springframework.aop.support.ClassFilter . matches ( TestBean .class ) ) ; assertFalse ( org.springframework.aop.support.ClassFilter . matches ( java.lang.Exception .class ) ) ; assertTrue ( org.springframework.aop.support.ClassFilter . matches ( TestBean .class ) ) ; ClassFilter org.springframework.aop.support.ClassFilter = ClassFilters . union ( org.springframework.aop.support.ClassFilter , org.springframework.aop.support.ClassFilter ) ; assertTrue ( org.springframework.aop.support.ClassFilter . matches ( java.lang.RuntimeException .class ) ) ; assertTrue ( org.springframework.aop.support.ClassFilter . matches ( TestBean .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( org.springframework.aop.support.ClassFilter . matches ( java.lang.RuntimeException .class ) ) ; assertTrue ( org.springframework.aop.support.ClassFilter . matches ( NestedRuntimeException .class ) ) ; ClassFilter org.springframework.aop.support.ClassFilter = ClassFilters . intersection ( org.springframework.aop.support.ClassFilter , org.springframework.aop.support.ClassFilter ) ; assertFalse ( org.springframework.aop.support.ClassFilter . matches ( java.lang.RuntimeException .class ) ) ; assertFalse ( org.springframework.aop.support.ClassFilter . matches ( TestBean .class ) ) ; assertTrue ( org.springframework.aop.support.ClassFilter . matches ( NestedRuntimeException .class ) ) ; }  <METHOD_END>