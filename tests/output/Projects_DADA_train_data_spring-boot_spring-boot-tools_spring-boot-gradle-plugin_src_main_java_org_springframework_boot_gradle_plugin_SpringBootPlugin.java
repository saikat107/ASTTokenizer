<METHOD_START> @ java.lang.Override public void void ( Project org.springframework.boot.gradle.plugin.Project ) { void ( ) ; void ( org.springframework.boot.gradle.plugin.Project ) ; Configuration org.springframework.boot.gradle.plugin.Configuration = org.springframework.boot.gradle.plugin.Configuration ( org.springframework.boot.gradle.plugin.Project ) ; void ( org.springframework.boot.gradle.plugin.Project , org.springframework.boot.gradle.plugin.Configuration ) ; void ( org.springframework.boot.gradle.plugin.Project ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { if ( GradleVersion . current ( ) . compareTo ( GradleVersion . version ( STRING ) ) < NUMBER ) { throw new GradleException ( STRING + STRING + GradleVersion . current ( ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Project org.springframework.boot.gradle.plugin.Project ) { org.springframework.boot.gradle.plugin.Project . getExtensions ( ) . create ( STRING , SpringBootExtension .class , org.springframework.boot.gradle.plugin.Project ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.gradle.plugin.Configuration org.springframework.boot.gradle.plugin.Configuration ( Project org.springframework.boot.gradle.plugin.Project ) { Configuration org.springframework.boot.gradle.plugin.Configuration = org.springframework.boot.gradle.plugin.Project . getConfigurations ( ) . create ( java.lang.String ) ; return org.springframework.boot.gradle.plugin.Configuration ; }  <METHOD_END>
<METHOD_START> private void void ( Project org.springframework.boot.gradle.plugin.Project , Configuration org.springframework.boot.gradle.plugin.Configuration ) { SinglePublishedArtifact org.springframework.boot.gradle.plugin.SinglePublishedArtifact = new SinglePublishedArtifact ( org.springframework.boot.gradle.plugin.Configuration . getArtifacts ( ) ) ; java.util.List<org.springframework.boot.gradle.plugin.PluginApplicationAction> < PluginApplicationAction > java.util.List<org.springframework.boot.gradle.plugin.PluginApplicationAction> = java.util.Arrays . java.util.List ( new JavaPluginAction ( org.springframework.boot.gradle.plugin.SinglePublishedArtifact ) , new WarPluginAction ( org.springframework.boot.gradle.plugin.SinglePublishedArtifact ) , new MavenPluginAction ( org.springframework.boot.gradle.plugin.Configuration . getUploadTaskName ( ) ) , new DependencyManagementPluginAction ( ) , new ApplicationPluginAction ( ) ) ; for ( PluginApplicationAction org.springframework.boot.gradle.plugin.PluginApplicationAction : java.util.List<org.springframework.boot.gradle.plugin.PluginApplicationAction> ) { org.springframework.boot.gradle.plugin.Project . getPlugins ( ) . withType ( org.springframework.boot.gradle.plugin.PluginApplicationAction . getPluginClass ( ) , plugin -> action . execute ( project ) ) ; } }  <METHOD_END>
<METHOD_START> private void void ( Project org.springframework.boot.gradle.plugin.Project ) { UnresolvedDependenciesAnalyzer org.springframework.boot.gradle.plugin.UnresolvedDependenciesAnalyzer = new UnresolvedDependenciesAnalyzer ( ) ; org.springframework.boot.gradle.plugin.Project . getConfigurations ( ) . all ( configuration -> configuration . getIncoming ( ) . afterResolve ( resolvableDependencies -> unresolvedDependenciesAnalyzer . analyze ( configuration . getResolvedConfiguration ( ) . getLenientConfiguration ( ) . getUnresolvedModuleDependencies ( ) ) ) ) ; org.springframework.boot.gradle.plugin.Project . getGradle ( ) . buildFinished ( buildResult -> unresolvedDependenciesAnalyzer . buildFinished ( project ) ) ; }  <METHOD_END>