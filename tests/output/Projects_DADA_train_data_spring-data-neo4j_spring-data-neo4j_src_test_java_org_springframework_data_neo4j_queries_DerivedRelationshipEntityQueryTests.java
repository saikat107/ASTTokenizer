<METHOD_START> @ Before public void void ( ) { org.springframework.data.neo4j.queries.TransactionTemplate = new TransactionTemplate ( org.springframework.data.neo4j.queries.PlatformTransactionManager ) ; getGraphDatabaseService ( ) . execute ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { getGraphDatabaseService ( ) . execute ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.RatingRepository . findRatingByUserAndTempMovie ( org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.TempMovie . getId ( ) ) ; assertNotNull ( org.springframework.data.neo4j.queries.Rating ) ; assertNotNull ( STRING , org.springframework.data.neo4j.queries.Rating ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.Rating . getStars ( ) , org.springframework.data.neo4j.queries.Rating . getStars ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.TempMovie . getName ( ) , org.springframework.data.neo4j.queries.Rating . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.Rating . getUser ( ) . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStars ( NUMBER ) ; assertNotNull ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; Rating org.springframework.data.neo4j.queries.Rating = java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) ; assertNotNull ( STRING , org.springframework.data.neo4j.queries.Rating ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.Rating . getStars ( ) , org.springframework.data.neo4j.queries.Rating . getStars ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.TempMovie . getName ( ) , org.springframework.data.neo4j.queries.Rating . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.Rating . getUser ( ) . getId ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestamp ( NUMBER , NUMBER ) ; assertNotNull ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; Rating org.springframework.data.neo4j.queries.Rating = java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) ; assertNotNull ( STRING , org.springframework.data.neo4j.queries.Rating ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.Rating . getStars ( ) , org.springframework.data.neo4j.queries.Rating . getStars ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.TempMovie . getName ( ) , org.springframework.data.neo4j.queries.Rating . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.Rating . getUser ( ) . getId ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestamp ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsOrRatingTimestamp ( NUMBER , NUMBER ) ; assertNotNull ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; Rating org.springframework.data.neo4j.queries.Rating = java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) ; assertNotNull ( STRING , org.springframework.data.neo4j.queries.Rating ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.Rating . getStars ( ) , org.springframework.data.neo4j.queries.Rating . getStars ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.TempMovie . getName ( ) , org.springframework.data.neo4j.queries.Rating . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.Rating . getUser ( ) . getId ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestamp ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestampLessThan ( NUMBER , NUMBER ) ; assertNotNull ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; Rating org.springframework.data.neo4j.queries.Rating = java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) ; assertNotNull ( STRING , org.springframework.data.neo4j.queries.Rating ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.Rating . getStars ( ) , org.springframework.data.neo4j.queries.Rating . getStars ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.TempMovie . getName ( ) , org.springframework.data.neo4j.queries.Rating . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.Rating . getUser ( ) . getId ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestamp ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsOrRatingTimestampGreaterThan ( NUMBER , NUMBER ) ; assertNotNull ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; Rating org.springframework.data.neo4j.queries.Rating = java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) ; assertNotNull ( STRING , org.springframework.data.neo4j.queries.Rating ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.Rating . getStars ( ) , org.springframework.data.neo4j.queries.Rating . getStars ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.TempMovie . getName ( ) , org.springframework.data.neo4j.queries.Rating . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.neo4j.queries.User . getId ( ) , org.springframework.data.neo4j.queries.Rating . getUser ( ) . getId ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestamp ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserName ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserName ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByMovieName ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByMovieName ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByMovieName ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByMovieName ( STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndStars ( STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndStars ( STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndStars ( STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndStars ( STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.UnsupportedOperationException .class ) public void void ( ) { void ( STRING + STRING + STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsOrUserName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsOrUserName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsOrUserName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsOrUserName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING + STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndMovieName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndMovieName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndMovieName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndMovieName ( NUMBER , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieNameAndStars ( STRING , STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieNameAndStars ( STRING , STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieNameAndStars ( STRING , STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getStars ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndMovieNameAndStars ( STRING , STRING , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( STRING + STRING + STRING + STRING ) ; org.springframework.data.neo4j.queries.TransactionTemplate . execute ( new TransactionCallbackWithoutResult ( ) { @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndUserMiddleName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndUserMiddleName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( TransactionStatus org.springframework.data.neo4j.queries.TransactionStatus ) { java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndUserMiddleName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; java.util.Collections . void ( java.util.List<org.springframework.data.neo4j.queries.Rating> ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getUser ( ) . getName ( ) ) ; assertEquals ( STRING , java.util.List<org.springframework.data.neo4j.queries.Rating> . get ( NUMBER ) . getMovie ( ) . getName ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByUserNameAndUserMiddleName ( STRING , STRING ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<java.lang.Long> < java.lang.Long > java.util.List<java.lang.Long> = org.springframework.data.neo4j.queries.RatingRepository . deleteByStarsOrRatingTimestampGreaterThan ( NUMBER , NUMBER ) ; assertEquals ( org.springframework.data.neo4j.queries.Rating . getId ( ) , java.util.List<java.lang.Long> . java.lang.Long ( NUMBER ) ) ; assertEquals ( NUMBER , java.util.List<java.lang.Long> . int ( ) ) ; java.util.List<org.springframework.data.neo4j.queries.Rating> < Rating > java.util.List<org.springframework.data.neo4j.queries.Rating> = org.springframework.data.neo4j.queries.RatingRepository . findByStarsAndRatingTimestamp ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<org.springframework.data.neo4j.queries.Rating> . size ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; long long = org.springframework.data.neo4j.queries.RatingRepository . countByStars ( NUMBER ) ; assertEquals ( NUMBER , long ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; long long = org.springframework.data.neo4j.queries.RatingRepository . removeByUserName ( STRING ) ; assertEquals ( NUMBER , long ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; long long = org.springframework.data.neo4j.queries.RatingRepository . removeByUserName ( STRING ) ; assertEquals ( NUMBER , long ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional public void void ( ) { User org.springframework.data.neo4j.queries.User = new User ( STRING ) ; TempMovie org.springframework.data.neo4j.queries.TempMovie = new TempMovie ( STRING ) ; Rating org.springframework.data.neo4j.queries.Rating = org.springframework.data.neo4j.queries.User . rate ( org.springframework.data.neo4j.queries.TempMovie , NUMBER , STRING ) ; org.springframework.data.neo4j.queries.Rating . setRatingTimestamp ( NUMBER ) ; org.springframework.data.neo4j.queries.UserRepository . save ( org.springframework.data.neo4j.queries.User ) ; java.util.List<java.lang.Long> < java.lang.Long > java.util.List<java.lang.Long> = org.springframework.data.neo4j.queries.RatingRepository . deleteByStarsOrRatingTimestampGreaterThan ( NUMBER , NUMBER ) ; assertEquals ( NUMBER , java.util.List<java.lang.Long> . int ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.neo4j.queries.PlatformTransactionManager org.springframework.data.neo4j.queries.PlatformTransactionManager ( ) { return new Neo4jTransactionManager ( org.springframework.data.neo4j.queries.SessionFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.data.neo4j.queries.SessionFactory org.springframework.data.neo4j.queries.SessionFactory ( ) { return new SessionFactory ( getBaseConfiguration ( ) . build ( ) , STRING ) ; }  <METHOD_END>