<METHOD_START> @ java.lang.Override public boolean boolean ( TypeDescriptor org.springframework.data.neo4j.integration.conversion.TypeDescriptor , TypeDescriptor org.springframework.data.neo4j.integration.conversion.TypeDescriptor ) { return MonetaryAmount .class . boolean ( org.springframework.data.neo4j.integration.conversion.TypeDescriptor . getType ( ) ) && java.lang.Number .class . boolean ( org.springframework.data.neo4j.integration.conversion.TypeDescriptor . getType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ java.lang.Override public < T extends java.lang.Number > org.springframework.data.neo4j.integration.conversion.Converter<org.springframework.data.neo4j.integration.conversion.MonetaryAmount,T> < MonetaryAmount , T > org.springframework.data.neo4j.integration.conversion.Converter<org.springframework.data.neo4j.integration.conversion.MonetaryAmount,T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return ( Converter < MonetaryAmount , T > ) this . org.springframework.data.neo4j.integration.conversion.SpringMonetaryAmountToIntegerConverter ; }  <METHOD_END>