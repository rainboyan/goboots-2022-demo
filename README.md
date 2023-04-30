# GoBoots 2022

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2022.2.1`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2022.2.1
------------------------------------------------------------

Build time:   2023-04-26 13:08:19 UTC
Revision:     c8fa60b36f5e892aee71f547a7d7b06d07518315

Spring Boot:  2.7.11
Gradle:       7.6.1
Groovy:       3.0.17
JVM:          17.0.6 (Azul Systems, Inc. 17.0.6+10-LTS)
OS:           Mac OS X 12.6.5 aarch64
```

### Compatible Plugins

| Order   |   Plugin Name        |  Plugin Version               |
|---------|----------------------|-------------------------------|
|    1    |  Core                |  v2022.2.1                    |
|    2    |  DataSource          |  v2022.2.1                    |
|    3    |  I18n                |  v2022.2.1                    |
|    4    |  Codecs              |  v2022.2.1                    |
|    5    |  RestResponder       |  v2022.2.1                    |
|    6    |  Controllers         |  v2022.2.1                    |
|    7    |  Converters          |  v2022.2.1                    |
|    8    |  UrlMappings         |  v2022.2.1                    |
|    9    |  Interceptors        |  v2022.2.1                    |
|   10    |  DomainClass         |  v2022.2.1                    |
|   11    |  Services            |  v2022.2.1                    |
|   12    |  GroovyPages         |  v2022.2.1                    |
|   13    |  Hibernate           |  v2022.2.1                    |
|   14    |  AssetPipeline       |  4.0.0                        |
|   15    |  Geb                 |  3.0.0                        |
|   16    |  ControllersAsync    |  5.2.1                        |
|   17    |  EventBus            |  5.2.1                        |
|   18    |  Cache               |  5.2.1                        |
|   19    |  Fields              |  5.2.1                        |
|   20    |  Scaffolding         |  5.2.1                        |


### Running App

```bash
➜  goboots-2022-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
2023-04-30 20:40:10.238  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.2.5.Final
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                      (v2022.2.1)

2023-04-30 20:40:10.278  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 17.0.6 on Michaels-Mini with PID 94874 (/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo)
2023-04-30 20:40:10.278 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v2.7.11, Spring v5.3.27
2023-04-30 20:40:10.278  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-04-30 20:40:10.299  INFO --- [  restartedMain] o.s.b.devtools.restart.ChangeableUrls    : The Class-Path manifest attribute in /Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/jaxb-impl-2.3.1.jar referenced one or more files that do not exist: file:/Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/jaxb-runtime-2.3.1.jar,file:/Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/txw2-2.3.1.jar,file:/Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/istack-commons-runtime-3.0.7.jar,file:/Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/stax-ex-1.8.jar,file:/Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/FastInfoset-1.2.15.jar,file:/Users/rain/.m2/repository/com/sun/xml/bind/jaxb-impl/2.3.1/javax.activation-api-1.2.0.jar
2023-04-30 20:40:10.299  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-04-30 20:40:10.299  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-04-30 20:40:10.819  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 20 plugins loaded successfully, take in 127 ms
2023-04-30 20:40:11.535  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-04-30 20:40:11.540  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-04-30 20:40:11.540  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-30 20:40:11.540  INFO --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.74]
2023-04-30 20:40:11.571  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-30 20:40:11.571  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1272 ms
2023-04-30 20:40:11.703  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-04-30 20:40:11.934  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-04-30 20:40:12.046  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-04-30 20:40:12.086  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-04-30 20:40:12.197  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-04-30 20:40:12.492  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-04-30 20:40:12.708  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-04-30 20:40:12.714  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-04-30 20:40:12.714  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-04-30 20:40:12.714  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 0 ms
2023-04-30 20:40:12.715  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-04-30 20:40:12.786  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 2.729 seconds (JVM running for 3.15)
2023-04-30 20:40:12.789  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2022.2.1                                 Y
    2      DataSource                               2022.2.1                                 Y
    3      I18n                                     2022.2.1                                 Y
    4      Codecs                                   2022.2.1                                 Y
    5      RestResponder                            2022.2.1                                 Y
    6      Controllers                              2022.2.1                                 Y
    7      Converters                               2022.2.1                                 Y
    8      UrlMappings                              2022.2.1                                 Y
    9      Interceptors                             2022.2.1                                 Y
   10      DomainClass                              2022.2.1                                 Y
   11      GroovyPages                              2022.2.1                                 Y
   12      EventBus                                 5.2.1                                    Y
   13      Fields                                   5.2.1                                    Y
   14      AssetPipeline                            4.0.0                                    Y
   15      Geb                                      3.0.0                                    Y
   16      Hibernate                                2022.2.1                                 Y
   17      Scaffolding                              5.2.1                                    Y
   18      ControllersAsync                         5.2.1                                    Y
   19      Services                                 2022.2.1                                 Y
   20      Cache                                    5.2.1                                    Y
----------------------------------------------------------------------------------------------

2023-04-30 20:40:12.791 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Application directory discovered as: /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo
2023-04-30 20:40:12.791 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Current base directory is [.]. Reloading base directory is [/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo]
2023-04-30 20:40:12.791 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Reloading status: true
2023-04-30 20:40:12.791  WARN --- [  restartedMain] org.grails.io.watch.DirectoryWatcher     : Error Initializing Native OS X File Event Watcher. Add JNA to classpath for Faster File Watching performance.
2023-04-30 20:40:12.800  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2022-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.128:8080
----------------------------------------------------------------------------------------------
```
