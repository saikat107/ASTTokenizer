<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new BucketAutoOperation ( ( Field ) null , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new BucketAutoOperation ( Fields . field ( STRING ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketAutoOperation org.springframework.data.mongodb.core.aggregation.BucketAutoOperation = Aggregation . bucketAuto ( STRING , NUMBER ) . andOutputExpression ( STRING , NUMBER ) . as ( STRING ) . andOutput ( STRING ) . push ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketAutoOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) { bucket ( STRING ) . andOutput ( STRING ) . as ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketAutoOperation org.springframework.data.mongodb.core.aggregation.BucketAutoOperation = Aggregation . bucketAuto ( STRING , NUMBER ) . andOutputCount ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketAutoOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.aggregation.Document = bucketAuto ( STRING , NUMBER ) . withBuckets ( NUMBER ) . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Document org.springframework.data.mongodb.core.aggregation.Document = bucketAuto ( STRING , NUMBER ) . withGranularity ( Granularities . E24 ) . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketAutoOperation org.springframework.data.mongodb.core.aggregation.BucketAutoOperation = bucketAuto ( STRING , NUMBER ) . andOutput ( STRING ) . sum ( ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketAutoOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BucketAutoOperation org.springframework.data.mongodb.core.aggregation.BucketAutoOperation = bucketAuto ( STRING , NUMBER ) . andOutputExpression ( STRING ) . apply ( STRING , NUMBER ) . as ( STRING ) ; Document org.springframework.data.mongodb.core.aggregation.Document = org.springframework.data.mongodb.core.aggregation.BucketAutoOperation . toDocument ( Aggregation . DEFAULT_CONTEXT ) ; assertThat ( org.springframework.data.mongodb.core.aggregation.Document ( org.springframework.data.mongodb.core.aggregation.Document ) , is ( Document . parse ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.data.mongodb.core.aggregation.Document org.springframework.data.mongodb.core.aggregation.Document ( Document org.springframework.data.mongodb.core.aggregation.Document ) { return getAsDocument ( getAsDocument ( org.springframework.data.mongodb.core.aggregation.Document , STRING ) , STRING ) ; }  <METHOD_END>