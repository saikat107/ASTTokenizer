<METHOD_START> @ Test @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) { assertInTransaction ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test ( timeout = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) { assertInTransaction ( true ) ; }  <METHOD_END>
<METHOD_START> @ Test @ Transactional ( propagation = Propagation . NOT_SUPPORTED ) @ Timed ( millis = NUMBER ) @ Repeat ( NUMBER ) public void void ( ) { assertInTransaction ( false ) ; }  <METHOD_END>
<METHOD_START> @ Test ( timeout = NUMBER ) @ Transactional ( propagation = Propagation . NOT_SUPPORTED ) @ Repeat ( NUMBER ) public void void ( ) { assertInTransaction ( false ) ; }  <METHOD_END>
