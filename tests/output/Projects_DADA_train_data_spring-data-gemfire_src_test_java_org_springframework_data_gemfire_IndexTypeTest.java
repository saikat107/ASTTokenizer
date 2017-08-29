<METHOD_START> @ Test public void void ( ) { assertEquals ( org . apache . geode . cache . query . IndexType . FUNCTIONAL , IndexType . FUNCTIONAL . getGemfireIndexType ( ) ) ; assertEquals ( org . apache . geode . cache . query . IndexType . HASH , IndexType . HASH . getGemfireIndexType ( ) ) ; assertEquals ( org . apache . geode . cache . query . IndexType . PRIMARY_KEY , IndexType . KEY . getGemfireIndexType ( ) ) ; assertEquals ( org . apache . geode . cache . query . IndexType . PRIMARY_KEY , IndexType . PRIMARY_KEY . getGemfireIndexType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( IndexType . FUNCTIONAL , IndexType . valueOf ( org . apache . geode . cache . query . IndexType . FUNCTIONAL ) ) ; assertEquals ( IndexType . HASH , IndexType . valueOf ( org . apache . geode . cache . query . IndexType . HASH ) ) ; assertEquals ( IndexType . PRIMARY_KEY , IndexType . valueOf ( org . apache . geode . cache . query . IndexType . PRIMARY_KEY ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNull ( IndexType . valueOf ( ( org . org.apache . org.apache . org.apache . org.apache . org.apache ) null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertEquals ( IndexType . FUNCTIONAL , IndexType . valueOfIgnoreCase ( STRING ) ) ; assertEquals ( IndexType . HASH , IndexType . valueOfIgnoreCase ( STRING ) ) ; assertEquals ( IndexType . KEY , IndexType . valueOfIgnoreCase ( STRING ) ) ; assertEquals ( IndexType . PRIMARY_KEY , IndexType . valueOfIgnoreCase ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertNull ( IndexType . valueOfIgnoreCase ( STRING ) ) ; assertNull ( IndexType . valueOfIgnoreCase ( STRING ) ) ; assertNull ( IndexType . valueOfIgnoreCase ( STRING ) ) ; assertNull ( IndexType . valueOfIgnoreCase ( null ) ) ; assertNull ( IndexType . valueOfIgnoreCase ( STRING ) ) ; assertNull ( IndexType . valueOfIgnoreCase ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertTrue ( IndexType . FUNCTIONAL . isFunctional ( ) ) ; assertFalse ( IndexType . HASH . isFunctional ( ) ) ; assertFalse ( IndexType . KEY . isFunctional ( ) ) ; assertFalse ( IndexType . PRIMARY_KEY . isFunctional ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( IndexType . isFunctional ( null ) ) ; assertTrue ( IndexType . isFunctional ( IndexType . FUNCTIONAL ) ) ; assertFalse ( IndexType . isFunctional ( IndexType . HASH ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( IndexType . FUNCTIONAL . isHash ( ) ) ; assertTrue ( IndexType . HASH . isHash ( ) ) ; assertFalse ( IndexType . KEY . isHash ( ) ) ; assertFalse ( IndexType . PRIMARY_KEY . isHash ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( IndexType . isHash ( null ) ) ; assertTrue ( IndexType . isHash ( IndexType . HASH ) ) ; assertFalse ( IndexType . isHash ( IndexType . KEY ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( IndexType . FUNCTIONAL . isKey ( ) ) ; assertFalse ( IndexType . HASH . isKey ( ) ) ; assertTrue ( IndexType . KEY . isKey ( ) ) ; assertTrue ( IndexType . PRIMARY_KEY . isKey ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertFalse ( IndexType . isKey ( null ) ) ; assertFalse ( IndexType . isKey ( IndexType . FUNCTIONAL ) ) ; assertTrue ( IndexType . isKey ( IndexType . KEY ) ) ; assertTrue ( IndexType . isKey ( IndexType . PRIMARY_KEY ) ) ; }  <METHOD_END>