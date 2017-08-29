<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ResourceRegion ( null , NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ResourceRegion ( mock ( Resource .class ) , - NUMBER , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ResourceRegion ( mock ( Resource .class ) , NUMBER , - NUMBER ) ; }  <METHOD_END>
