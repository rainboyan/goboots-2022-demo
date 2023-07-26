# GoBoots 2022

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2022.3.0`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2022.3.0
------------------------------------------------------------

Build time:   2023-07-24 05:23:44 UTC
Revision:     3d5b87b3c645f889e21d913bf454fb8ad383419f

Spring Boot:  2.7.13
Gradle:       7.6.2
Groovy:       3.0.18
JVM:          17.0.7 (Azul Systems, Inc. 17.0.7+7-LTS)
OS:           Mac OS X 12.6.7 aarch64
```

### App Directory

```bash
.
├── app
│   ├── assets
│   ├── conf
│   ├── controllers
│   ├── domain
│   ├── i18n
│   ├── init
│   ├── services
│   ├── taglib
│   ├── utils
│   └── views
├── gradle
│   └── wrapper
├── src
│   ├── integration-test
│   ├── main
│   └── test
├── README.md
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

### Compatible Plugins

| Order   |   Plugin Name        |  Plugin Version               |
|---------|----------------------|-------------------------------|
|    1    |  Core                |  v2022.3.0                    |
|    2    |  DataSource          |  v2022.3.0                    |
|    3    |  I18n                |  v2022.3.0                    |
|    4    |  Codecs              |  v2022.3.0                    |
|    5    |  RestResponder       |  v2022.3.0                    |
|    6    |  Controllers         |  v2022.3.0                    |
|    7    |  Converters          |  v2022.3.0                    |
|    8    |  UrlMappings         |  v2022.3.0                    |
|    9    |  Interceptors        |  v2022.3.0                    |
|   10    |  DomainClass         |  v2022.3.0                    |
|   11    |  Services            |  v2022.3.0                    |
|   12    |  GroovyPages         |  v2022.3.0                    |
|   13    |  Hibernate           |  v2022.3.0                    |
|   14    |  AssetPipeline       |  4.3.0                        |
|   15    |  DatabaseMigration   |  4.2.0                        |
|   16    |  Geb                 |  5.3.0                        |
|   17    |  ControllersAsync    |  5.3.0                        |
|   18    |  EventBus            |  5.3.0                        |
|   19    |  Cache               |  5.3.0                        |
|   20    |  Fields              |  5.3.0                        |
|   21    |  Scaffolding         |  5.3.0                        |


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
 :: GoBoots ::                       (v2022.3.0)

2023-07-26 23:19:58.767  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.2.5.Final
2023-07-26 23:19:58.772  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 17.0.7 on Michaels-Mini with PID 4224 (/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo)
2023-07-26 23:19:58.772 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v2.7.13, Spring v5.3.28
2023-07-26 23:19:58.772  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-07-26 23:19:58.793  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-07-26 23:19:58.793  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-07-26 23:19:59.337  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 21 plugins loaded successfully, take in 140 ms
2023-07-26 23:19:59.918  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-07-26 23:19:59.922  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-07-26 23:19:59.923  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-07-26 23:19:59.923  INFO --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.76]
2023-07-26 23:19:59.957  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-07-26 23:19:59.957  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1164 ms
2023-07-26 23:20:00.090  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-07-26 23:20:00.375  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-07-26 23:20:00.466  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-07-26 23:20:00.507  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-07-26 23:20:00.902  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-07-26 23:20:01.199  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-07-26 23:20:01.433  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-07-26 23:20:01.439  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-07-26 23:20:01.439  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-07-26 23:20:01.440  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-07-26 23:20:01.441  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-07-26 23:20:01.563  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.205 seconds (JVM running for 3.597)
2023-07-26 23:20:01.566  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2022.3.0                                 Y
    2      DataSource                               2022.3.0                                 Y
    3      I18n                                     2022.3.0                                 Y
    4      Codecs                                   2022.3.0                                 Y
    5      RestResponder                            2022.3.0                                 Y
    6      Controllers                              2022.3.0                                 Y
    7      Converters                               2022.3.0                                 Y
    8      UrlMappings                              2022.3.0                                 Y
    9      Interceptors                             2022.3.0                                 Y
   10      DomainClass                              2022.3.0                                 Y
   11      GroovyPages                              2022.3.0                                 Y
   12      AssetPipeline                            4.3.0                                    Y
   13      Scaffolding                              5.3.0                                    Y
   14      DatabaseMigration                        4.2.0                                    Y
   15      Geb                                      5.3.0                                    Y
   16      EventBus                                 5.3.0                                    Y
   17      ControllersAsync                         5.3.0                                    Y
   18      Fields                                   5.3.0                                    Y
   19      Hibernate                                2022.3.0                                 Y
   20      Services                                 2022.3.0                                 Y
   21      Cache                                    5.3.0                                    Y
----------------------------------------------------------------------------------------------

2023-07-26 23:20:01.569  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2022-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.128:8080
----------------------------------------------------------------------------------------------
```
