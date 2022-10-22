Getting following error during native   build
./mvnw native:compile -Pnative


`Fatal error: java.lang.TypeNotPresentException: Type kotlinx.serialization.StringFormat not present`


It goes away if i manually add the following dependency:
```
        <dependency>
            <groupId>org.jetbrains.kotlinx</groupId>
            <artifactId>kotlinx-serialization-core-jvm</artifactId>
            <version>1.4.1</version>
        </dependency>
```

Error detail:
``` 
:~/Downloads/demo$  ./mvnw native:compile -Pnative
...
...
Processing of field org.springframework.web.servlet.support.RequestContext#jstlPresent skipped due the following error : org/graalvm/nativeimage/hosted/FieldValueTransformer
[2/7] Performing analysis...  [**]                                                                      (20.5s @ 3.92GB)
  15,145 (93.28%) of 16,236 classes reachable
  24,813 (68.24%) of 36,362 fields reachable
  71,654 (68.76%) of 104,206 methods reachable
     781 classes,   145 fields, and 2,703 methods registered for reflection

Fatal error: java.lang.TypeNotPresentException: Type kotlinx.serialization.StringFormat not present
        at java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:117)
        at java.base/sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:125)
        at java.base/sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
        at java.base/sun.reflect.generics.reflectiveObjects.LazyReflectiveObjectGenerator.reifyBounds(LazyReflectiveObjectGenerator.java:65)
        at java.base/sun.reflect.generics.reflectiveObjects.TypeVariableImpl.getBounds(TypeVariableImpl.java:125)
        at org.graalvm.nativeimage.builder/com.oracle.svm.reflect.hosted.ReflectionDataBuilder.makeTypeReachable(ReflectionDataBuilder.java:521)
        at org.graalvm.nativeimage.builder/com.oracle.svm.reflect.hosted.ReflectionDataBuilder.makeTypeReachable(ReflectionDataBuilder.java:529)
        at org.graalvm.nativeimage.builder/com.oracle.svm.reflect.hosted.ReflectionDataBuilder.registerTypesForClass(ReflectionDataBuilder.java:412)
        at org.graalvm.nativeimage.builder/com.oracle.svm.reflect.hosted.ReflectionDataBuilder.processMethodMetadata(ReflectionDataBuilder.java:267)
        at org.graalvm.nativeimage.builder/com.oracle.svm.reflect.hosted.ReflectionDataBuilder.duringAnalysis(ReflectionDataBuilder.java:187)
        at org.graalvm.nativeimage.builder/com.oracle.svm.reflect.hosted.ReflectionFeature.duringAnalysis(ReflectionFeature.java:238)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.lambda$runPointsToAnalysis$10(NativeImageGenerator.java:734)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.FeatureHandler.forEachFeature(FeatureHandler.java:78)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.lambda$runPointsToAnalysis$11(NativeImageGenerator.java:734)
        at org.graalvm.nativeimage.pointsto/com.oracle.graal.pointsto.PointsToAnalysis.runAnalysis(PointsToAnalysis.java:755)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.runPointsToAnalysis(NativeImageGenerator.java:731)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.doRun(NativeImageGenerator.java:564)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGenerator.run(NativeImageGenerator.java:521)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.buildImage(NativeImageGeneratorRunner.java:407)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.build(NativeImageGeneratorRunner.java:585)
        at org.graalvm.nativeimage.builder/com.oracle.svm.hosted.NativeImageGeneratorRunner.main(NativeImageGeneratorRunner.java:128)
Caused by: java.lang.ClassNotFoundException: kotlinx.serialization.StringFormat
        at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:445)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:587)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
        at java.base/java.lang.Class.forName0(Native Method)
        at java.base/java.lang.Class.forName(Class.java:467)
        at java.base/sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:114)
        ... 20 more
------------------------------------------------------------------------------------------------------------------------
                        1.4s (5.3% of total time) in 24 GCs | Peak RSS: 4.99GB | CPU load: 10.33
========================================================================================================================
Failed generating 'demo' after 25.8s.
Error: Image build request failed with exit status 1
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  32.835 s
[INFO] Finished at: 2022-10-22T11:31:52-05:00
[INFO] ------------------------------------------------------------------------
[WARNING] The requested profile "dev" could not be activated because it does not exist.
[ERROR] Failed to execute goal org.graalvm.buildtools:native-maven-plugin:0.9.16:compile (default-cli) on project demo: Execution of /home/gbuntu/.sdkman/candidates/java/22.2.r17-grl/bin/native-image -cp /home/gbuntu/Downloads/demo(1)/demo/target/classes:/home/gbuntu/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.14.0-rc2/jackson-core-2.14.0-rc2.jar:/home/gbuntu/.m2/repository/io/micrometer/micrometer-commons/1.10.0-RC1/micrometer-commons-1.10.0-RC1.jar:/home/gbuntu/.m2/repository/org/springframework/spring-webmvc/6.0.0-RC2/spring-webmvc-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/3.0.0-RC1/spring-boot-starter-tomcat-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.0.0-RC1/spring-boot-autoconfigure-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot-starter-json/3.0.0-RC1/spring-boot-starter-json-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.14.0-rc2/jackson-datatype-jsr310-2.14.0-rc2.jar:/home/gbuntu/.m2/repository/org/springframework/spring-context/6.0.0-RC2/spring-context-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/org/springframework/spring-core/6.0.0-RC2/spring-core-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.0.27/tomcat-embed-websocket-10.0.27.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot/3.0.0-RC1/spring-boot-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot-starter-web/3.0.0-RC1/spring-boot-starter-web-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/jakarta/annotation/jakarta.annotation-api/2.0.0/jakarta.annotation-api-2.0.0.jar:/home/gbuntu/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.14.0-rc2/jackson-datatype-jdk8-2.14.0-rc2.jar:/home/gbuntu/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.14.0-rc2/jackson-databind-2.14.0-rc2.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot-starter/3.0.0-RC1/spring-boot-starter-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/org/springframework/boot/spring-boot-starter-logging/3.0.0-RC1/spring-boot-starter-logging-3.0.0-RC1.jar:/home/gbuntu/.m2/repository/io/micrometer/micrometer-observation/1.10.0-RC1/micrometer-observation-1.10.0-RC1.jar:/home/gbuntu/.m2/repository/org/apache/logging/log4j/log4j-api/2.19.0/log4j-api-2.19.0.jar:/home/gbuntu/.m2/repository/org/springframework/spring-aop/6.0.0-RC2/spring-aop-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/org/slf4j/jul-to-slf4j/2.0.3/jul-to-slf4j-2.0.3.jar:/home/gbuntu/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.19.0/log4j-to-slf4j-2.19.0.jar:/home/gbuntu/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.14.0-rc2/jackson-annotations-2.14.0-rc2.jar:/home/gbuntu/.m2/repository/org/slf4j/slf4j-api/2.0.3/slf4j-api-2.0.3.jar:/home/gbuntu/.m2/repository/ch/qos/logback/logback-classic/1.4.4/logback-classic-1.4.4.jar:/home/gbuntu/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.0.27/tomcat-embed-core-10.0.27.jar:/home/gbuntu/.m2/repository/org/springframework/spring-expression/6.0.0-RC2/spring-expression-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.0-rc2/jackson-module-parameter-names-2.14.0-rc2.jar:/home/gbuntu/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.0.27/tomcat-embed-el-10.0.27.jar:/home/gbuntu/.m2/repository/ch/qos/logback/logback-core/1.4.4/logback-core-1.4.4.jar:/home/gbuntu/.m2/repository/org/yaml/snakeyaml/1.33/snakeyaml-1.33.jar:/home/gbuntu/.m2/repository/org/springframework/spring-web/6.0.0-RC2/spring-web-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/org/springframework/spring-beans/6.0.0-RC2/spring-beans-6.0.0-RC2.jar:/home/gbuntu/.m2/repository/org/springframework/spring-jcl/6.0.0-RC2/spring-jcl-6.0.0-RC2.jar --no-fallback -H:Path=/home/gbuntu/Downloads/demo(1)/demo/target -H:Name=demo -H:ConfigurationFileDirectories=/home/gbuntu/Downloads/demo(1)/demo/target/graalvm-reachability-metadata/43c268fc84dea0cd567d789edca6d3e5616be59b/ch.qos.logback/logback-classic/1.4.1,/home/gbuntu/Downloads/demo(1)/demo/target/graalvm-reachability-metadata/43c268fc84dea0cd567d789edca6d3e5616be59b/org.apache.tomcat.embed/tomcat-embed-core/10.0.20 returned non-zero result -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException



```