# GoBoots 2022

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2022.4.1`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2022.4.1
------------------------------------------------------------

Build time:   2023-08-29 14:10:42 UTC
Revision:     3049d43af90dd29f7e93b1293bfd6f445035c961

Spring Boot:  2.7.15
Gradle:       7.6.2
Groovy:       3.0.19
JVM:          11.0.20 (Azul Systems, Inc. 11.0.20+8-LTS)
OS:           Mac OS X 12.6.8 aarch64
```

### App environment

```bash
➜  goboots-2022-demo git:(main) ✗ grails about
| About your application's environment

Name:               goboots-2022-demo
Version:            0.1
Plugins:            [core:2022.4.1], [dataSource:2022.4.1], [i18n:2022.4.1], [codecs:2022.4.1], [restResponder:2022.4.1], [controllers:2022.4.1], [converters:2022.4.1], [urlMappings:2022.4.1], [interceptors:2022.4.1], [domainClass:2022.4.1], [groovyPages:2022.4.1], [hibernate:2022.4.1], [eventBus:5.4.1], [geb:5.4.1], [scaffolding:5.4.1], [assetPipeline:4.3.0], [databaseMigration:4.2.0], [fields:5.4.1], [controllersAsync:5.4.1], [services:2022.4.1], [cache:5.4.1]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo
Environment:        development

Grails:             2022.4.1
Groovy:             3.0.19
Gradle:             7.6.2
Spring Boot:        2.7.15
JVM:                11.0.20 (Azul Systems, Inc. 11.0.20+8-LTS)
OS:                 Mac OS X 12.6.8 aarch64

| EXECUTE SUCCESSFUL
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
|    1    |  Core                |  v2022.4.1                    |
|    2    |  DataSource          |  v2022.4.1                    |
|    3    |  I18n                |  v2022.4.1                    |
|    4    |  Codecs              |  v2022.4.1                    |
|    5    |  RestResponder       |  v2022.4.1                    |
|    6    |  Controllers         |  v2022.4.1                    |
|    7    |  Converters          |  v2022.4.1                    |
|    8    |  UrlMappings         |  v2022.4.1                    |
|    9    |  Interceptors        |  v2022.4.1                    |
|   10    |  DomainClass         |  v2022.4.1                    |
|   11    |  Services            |  v2022.4.1                    |
|   12    |  GroovyPages         |  v2022.4.1                    |
|   13    |  Hibernate           |  v2022.4.1                    |
|   14    |  AssetPipeline       |  4.3.0                        |
|   15    |  DatabaseMigration   |  4.2.0                        |
|   16    |  Geb                 |  5.4.1                        |
|   17    |  ControllersAsync    |  5.4.1                        |
|   18    |  EventBus            |  5.4.1                        |
|   19    |  Cache               |  5.4.1                        |
|   20    |  Fields              |  5.4.1                        |
|   21    |  Scaffolding         |  5.4.1                        |


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
 :: GoBoots ::                       (v2022.4.1)

2023-08-29 23:51:12.575  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.2.5.Final
2023-08-29 23:51:12.579  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 11.0.20 on Michaels-Mini with PID 70071 (/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo)
2023-08-29 23:51:12.579 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v2.7.15, Spring v5.3.29
2023-08-29 23:51:12.579  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-08-29 23:51:12.602  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-08-29 23:51:12.603  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-08-29 23:51:13.211  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 21 plugins loaded successfully, take in 154 ms
2023-08-29 23:51:13.818  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-08-29 23:51:13.822  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-08-29 23:51:13.823  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-08-29 23:51:13.823  INFO --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.79]
2023-08-29 23:51:13.860  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-08-29 23:51:13.860  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1257 ms
2023-08-29 23:51:14.026  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-08-29 23:51:14.323  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-08-29 23:51:14.415  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-08-29 23:51:14.454  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-08-29 23:51:14.906  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-08-29 23:51:15.307  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-08-29 23:51:15.591  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-08-29 23:51:15.606  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-08-29 23:51:15.606  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-08-29 23:51:15.607  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-08-29 23:51:15.607  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-08-29 23:51:15.725  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.616 seconds (JVM running for 4.094)
2023-08-29 23:51:15.731  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2022.4.1                                 Y
    2      DataSource                               2022.4.1                                 Y
    3      I18n                                     2022.4.1                                 Y
    4      Codecs                                   2022.4.1                                 Y
    5      RestResponder                            2022.4.1                                 Y
    6      Controllers                              2022.4.1                                 Y
    7      Converters                               2022.4.1                                 Y
    8      UrlMappings                              2022.4.1                                 Y
    9      Interceptors                             2022.4.1                                 Y
   10      DomainClass                              2022.4.1                                 Y
   11      GroovyPages                              2022.4.1                                 Y
   12      DatabaseMigration                        4.2.0                                    Y
   13      Scaffolding                              5.4.1                                    Y
   14      Fields                                   5.4.1                                    Y
   15      AssetPipeline                            4.3.0                                    Y
   16      Geb                                      5.4.1                                    Y
   17      ControllersAsync                         5.4.1                                    Y
   18      Hibernate                                2022.4.1                                 Y
   19      EventBus                                 5.4.1                                    Y
   20      Services                                 2022.4.1                                 Y
   21      Cache                                    5.4.1                                    Y
----------------------------------------------------------------------------------------------

2023-08-29 23:51:15.737  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2022-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.128:8080
----------------------------------------------------------------------------------------------
```
