# GoBoots 2022

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2022.2.4`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2022.2.4
------------------------------------------------------------

Build time:   2023-05-29 05:30:09 UTC
Revision:     0b7c9df06db2fecb96664554e06018e382cfc966

Spring Boot:  2.7.12
Gradle:       7.6.1
Groovy:       3.0.17
JVM:          17.0.6 (Azul Systems, Inc. 17.0.6+10-LTS)
OS:           Mac OS X 12.6.6 aarch64
```

### Compatible Plugins

| Order   |   Plugin Name        |  Plugin Version               |
|---------|----------------------|-------------------------------|
|    1    |  Core                |  v2022.2.4                    |
|    2    |  DataSource          |  v2022.2.4                    |
|    3    |  I18n                |  v2022.2.4                    |
|    4    |  Codecs              |  v2022.2.4                    |
|    5    |  RestResponder       |  v2022.2.4                    |
|    6    |  Controllers         |  v2022.2.4                    |
|    7    |  Converters          |  v2022.2.4                    |
|    8    |  UrlMappings         |  v2022.2.4                    |
|    9    |  Interceptors        |  v2022.2.4                    |
|   10    |  DomainClass         |  v2022.2.4                    |
|   11    |  Services            |  v2022.2.4                    |
|   12    |  GroovyPages         |  v2022.2.4                    |
|   13    |  Hibernate           |  v2022.2.4                    |
|   14    |  AssetPipeline       |  4.0.0                        |
|   15    |  DatabaseMigration   |  4.2.0                        |
|   16    |  Geb                 |  3.0.0                        |
|   17    |  ControllersAsync    |  5.2.4                        |
|   18    |  EventBus            |  5.2.4                        |
|   19    |  Cache               |  5.2.4                        |
|   20    |  Fields              |  5.2.4                        |
|   21    |  Scaffolding         |  5.2.4                        |


### Running App

```bash
➜  goboots-2022-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                       (v2022.2.4)

2023-06-03 11:24:05.663  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.2.5.Final
2023-06-03 11:24:05.671  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 17.0.6 on Michaels-Mini with PID 71427 (/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo)
2023-06-03 11:24:05.671 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v2.7.12, Spring v5.3.27
2023-06-03 11:24:05.671  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-06-03 11:24:05.691  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-06-03 11:24:05.691  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-06-03 11:24:06.195  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 21 plugins loaded successfully, take in 127 ms
2023-06-03 11:24:06.748  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-06-03 11:24:06.752  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-06-03 11:24:06.753  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-06-03 11:24:06.753  INFO --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.75]
2023-06-03 11:24:06.786  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-06-03 11:24:06.787  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1095 ms
2023-06-03 11:24:06.912  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-06-03 11:24:07.173  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-06-03 11:24:07.255  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-06-03 11:24:07.293  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-06-03 11:24:07.642  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-06-03 11:24:07.930  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-06-03 11:24:08.151  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-06-03 11:24:08.157  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-06-03 11:24:08.158  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-06-03 11:24:08.159  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-06-03 11:24:08.159  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-06-03 11:24:08.275  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.073 seconds (JVM running for 3.455)
2023-06-03 11:24:08.449  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2022.2.4                                 Y
    2      DataSource                               2022.2.4                                 Y
    3      I18n                                     2022.2.4                                 Y
    4      Codecs                                   2022.2.4                                 Y
    5      RestResponder                            2022.2.4                                 Y
    6      Controllers                              2022.2.4                                 Y
    7      Converters                               2022.2.4                                 Y
    8      UrlMappings                              2022.2.4                                 Y
    9      Interceptors                             2022.2.4                                 Y
   10      DomainClass                              2022.2.4                                 Y
   11      GroovyPages                              2022.2.4                                 Y
   12      Hibernate                                2022.2.4                                 Y
   13      EventBus                                 5.2.4                                    Y
   14      Fields                                   5.2.4                                    Y
   15      Geb                                      3.0.0                                    Y
   16      AssetPipeline                            4.0.0                                    Y
   17      ControllersAsync                         5.2.4                                    Y
   18      DatabaseMigration                        4.2.0                                    Y
   19      Scaffolding                              5.2.4                                    Y
   20      Services                                 2022.2.4                                 Y
   21      Cache                                    5.2.4                                    Y
----------------------------------------------------------------------------------------------

2023-06-03 11:24:08.452  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2022-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.128:8080
----------------------------------------------------------------------------------------------
```
