<METHOD_START> @ Test public void void ( ) { this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; JacksonTester . initFields ( null , new ObjectMapper ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . thrown . expect ( java.lang.IllegalArgumentException .class ) ; this . thrown . expectMessage ( STRING ) ; JacksonTester . initFields ( new org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass ( ) , ( ObjectMapper ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass = new org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass ( ) ; assertThat ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.JacksonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> ) . isNull ( ) ; assertThat ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsBaseClass . org.springframework.boot.test.json.JacksonTester<org.springframework.boot.test.json.ExampleObject> ) . isNull ( ) ; JacksonTester . initFields ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass , new ObjectMapper ( ) ) ; assertThat ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.JacksonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> ) . isNotNull ( ) ; assertThat ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsBaseClass . org.springframework.boot.test.json.JacksonTester<org.springframework.boot.test.json.ExampleObject> ) . isNotNull ( ) ; assertThat ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.JacksonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> . getType ( ) . resolve ( ) ) . isEqualTo ( java.util.List .class ) ; assertThat ( org.springframework.boot.test.json.JacksonTesterTests.InitFieldsTestClass . org.springframework.boot.test.json.JacksonTester<java.util.List<org.springframework.boot.test.json.ExampleObject>> . getType ( ) . resolveGeneric ( ) ) . isEqualTo ( ExampleObject .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> < java.lang.Object > org.springframework.boot.test.json.AbstractJsonMarshalTester<java.lang.Object> ( java.lang.Class<?> < ? > java.lang.Class<?> , ResolvableType org.springframework.boot.test.json.ResolvableType ) { return new JacksonTester <> ( java.lang.Class<> , org.springframework.boot.test.json.ResolvableType , new ObjectMapper ( ) ) ; }  <METHOD_END>