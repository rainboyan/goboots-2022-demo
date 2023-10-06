# GoBoots 2022

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2022.4.3`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2022.4.3
------------------------------------------------------------

Build time:   2023-09-26 10:41:41 UTC
Revision:     6ff263b79e9f49168070e2d1513d0231df62c70f

Spring Boot:  2.7.16
Gradle:       7.6.2
Groovy:       3.0.19
JVM:          11.0.20 (Azul Systems, Inc. 11.0.20+8-LTS)
OS:           Mac OS X 12.6.9 aarch64
```

### App environment

```bash
➜  goboots-2022-demo git:(main) ✗ goboots about
| About your application's environment

Name:               goboots-2022-demo
Version:            0.1
Plugins:            [core:2022.4.3], [dataSource:2022.4.3], [i18n:2022.4.3], [codecs:2022.4.3], [restResponder:2022.4.3], [controllers:2022.4.3], [converters:2022.4.3], [urlMappings:2022.4.3], [interceptors:2022.4.3], [domainClass:2022.4.3], [services:2022.4.3], [groovyPages:2022.4.3], [fields:5.4.2], [assetPipeline:4.3.0], [scaffolding:5.4.2], [eventBus:5.4.2], [databaseMigration:4.2.0], [hibernate:2022.4.3], [cache:5.4.2], [geb:5.4.2], [controllersAsync:5.4.2]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo
Environment:        development

Grails:             2022.4.3
Groovy:             3.0.19
Gradle:             8.4
Spring Boot:        2.7.16
JVM:                11.0.20 (Azul Systems, Inc. 11.0.20+8-LTS)
OS:                 Mac OS X 12.6.9 aarch64

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
|    1    |  Core                |  2022.4.3                     |
|    2    |  DataSource          |  2022.4.3                     |
|    3    |  I18n                |  2022.4.3                     |
|    4    |  Codecs              |  2022.4.3                     |
|    5    |  RestResponder       |  2022.4.3                     |
|    6    |  Controllers         |  2022.4.3                     |
|    7    |  Converters          |  2022.4.3                     |
|    8    |  UrlMappings         |  2022.4.3                     |
|    9    |  Interceptors        |  2022.4.3                     |
|   10    |  DomainClass         |  2022.4.3                     |
|   11    |  Services            |  2022.4.3                     |
|   12    |  GroovyPages         |  2022.4.3                     |
|   13    |  Hibernate           |  2022.4.3                     |
|   14    |  AssetPipeline       |  4.3.0                        |
|   15    |  DatabaseMigration   |  4.2.0                        |
|   16    |  Geb                 |  5.4.2                        |
|   17    |  ControllersAsync    |  5.4.2                        |
|   18    |  EventBus            |  5.4.2                        |
|   19    |  Cache               |  5.4.2                        |
|   20    |  Fields              |  5.4.2                        |
|   21    |  Scaffolding         |  5.4.2                        |


### Running App

```bash
➜  goboots-2022-demo git:(main) ✗ ./gradlew bR

> Task :bootRun
          _____       ____              _
   _     / ____|     |  _ \            | |
  (o)   | |  __  ___ | |_) | ___   ___ | |_ ___
 //^\\  | | |_ |/ _ \|  _ < / _ \ / _ \| __/ __|
(> - <) | |__| | (_) | |_) | (_) | (_) | |_\__ \
\=====/  \_____|\___/|____/ \___/ \___/ \__|___/
 ______________________________________________
 :: GoBoots ::                       (v2022.4.3)

2023-10-06 17:20:59.462  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.2.5.Final
2023-10-06 17:20:59.467  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 11.0.20 on Michaels-Mini with PID 43331 (/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo)
2023-10-06 17:20:59.468 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v2.7.16, Spring v5.3.30
2023-10-06 17:20:59.468  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-10-06 17:20:59.489  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-10-06 17:20:59.489  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-10-06 17:21:00.043  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 21 plugins loaded successfully, take in 154 ms
2023-10-06 17:21:00.611  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-10-06 17:21:00.614  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-10-06 17:21:00.615  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-06 17:21:00.615  INFO --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.80]
2023-10-06 17:21:00.651  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-06 17:21:00.651  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1161 ms
2023-10-06 17:21:00.802  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-10-06 17:21:01.075  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-10-06 17:21:01.149  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-10-06 17:21:01.184  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-10-06 17:21:01.508  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-10-06 17:21:01.872  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-10-06 17:21:02.129  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-10-06 17:21:02.139  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-10-06 17:21:02.139  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-10-06 17:21:02.141  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 0 ms
2023-10-06 17:21:02.141  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-10-06 17:21:02.217  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.18 seconds (JVM running for 3.635)
2023-10-06 17:21:02.221  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2022.4.3                                 Y
    2      DataSource                               2022.4.3                                 Y
    3      I18n                                     2022.4.3                                 Y
    4      Codecs                                   2022.4.3                                 Y
    5      RestResponder                            2022.4.3                                 Y
    6      Controllers                              2022.4.3                                 Y
    7      Converters                               2022.4.3                                 Y
    8      UrlMappings                              2022.4.3                                 Y
    9      Interceptors                             2022.4.3                                 Y
   10      DomainClass                              2022.4.3                                 Y
   11      GroovyPages                              2022.4.3                                 Y
   12      Scaffolding                              5.4.2                                    Y
   13      DatabaseMigration                        4.2.0                                    Y
   14      AssetPipeline                            4.3.0                                    Y
   15      Fields                                   5.4.2                                    Y
   16      Hibernate                                2022.4.3                                 Y
   17      ControllersAsync                         5.4.2                                    Y
   18      Geb                                      5.4.2                                    Y
   19      EventBus                                 5.4.2                                    Y
   20      Services                                 2022.4.3                                 Y
   21      Cache                                    5.4.2                                    Y
----------------------------------------------------------------------------------------------

2023-10-06 17:21:02.224  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2022-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.127:8080
----------------------------------------------------------------------------------------------
```
