<METHOD_START> @ java.lang.Override public void void ( Project org.springframework.boot.gradle.plugin.Project ) { org.springframework.boot.gradle.plugin.Project . getExtensions ( ) . findByType ( DependencyManagementExtension .class ) . imports ( importsHandler -> importsHandler . mavenBom ( SPRING_BOOT_BOM ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends org.springframework.boot.gradle.plugin.Plugin<org.springframework.boot.gradle.plugin.Project>> < ? extends Plugin < Project > > java.lang.Class<? extends org.springframework.boot.gradle.plugin.Plugin<org.springframework.boot.gradle.plugin.Project>> ( ) { return DependencyManagementPlugin .class ; }  <METHOD_END>