<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new InvertibleComparator <> ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new InvertibleComparator <> ( null , true ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { InvertibleComparator < java.lang.Integer > org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> = new InvertibleComparator <> ( java.util.Comparator<java.lang.Integer> ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . isAscending ( ) , is ( true ) ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . compare ( NUMBER , NUMBER ) , is ( - NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { InvertibleComparator < java.lang.Integer > org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> = new InvertibleComparator <> ( java.util.Comparator<java.lang.Integer> ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . isAscending ( ) , is ( true ) ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . compare ( NUMBER , NUMBER ) , is ( - NUMBER ) ) ; org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . invertOrder ( ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . isAscending ( ) , is ( false ) ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . compare ( NUMBER , NUMBER ) , is ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { InvertibleComparator < java.lang.Integer > org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> = new InvertibleComparator <> ( java.util.Comparator<java.lang.Integer> , true ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . compare ( NUMBER , NUMBER ) , is ( - NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { InvertibleComparator < java.lang.Integer > org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> = new InvertibleComparator <> ( java.util.Comparator<java.lang.Integer> , false ) ; assertThat ( org.springframework.util.comparator.InvertibleComparator<java.lang.Integer> . compare ( NUMBER , NUMBER ) , is ( NUMBER ) ) ; }  <METHOD_END>