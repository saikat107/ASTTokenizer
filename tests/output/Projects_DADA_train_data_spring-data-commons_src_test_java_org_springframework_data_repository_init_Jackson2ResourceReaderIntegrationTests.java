<METHOD_START> @ Test public void void ( ) java.lang.Exception { ResourceReader org.springframework.data.repository.init.ResourceReader = new Jackson2ResourceReader ( ) ; java.lang.Object java.lang.Object = org.springframework.data.repository.init.ResourceReader . readFrom ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.data.repository.init.Jackson2ResourceReaderIntegrationTests> ( ) ) , null ) ; assertThat ( java.lang.Object ) . isInstanceOf ( java.util.Collection .class ) ; assertThat ( ( java.util.Collection<?> < ? > ) java.lang.Object ) . hasSize ( NUMBER ) ; }  <METHOD_END>