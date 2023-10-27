# GoBoots 2022

This is a GoBoots demo app, build with [GoBoots](https://github.com/rainboyan/GoBoots) `2022.4.4`.

### GoBoots Version

```bash
➜  ~ goboots -v

------------------------------------------------------------
GoBoots 2022.4.4
------------------------------------------------------------

Build time:   2023-10-27 16:00:18 UTC
Revision:     6b21065136da77ece70448400b6630c7f4526b7e

Spring Boot:  2.7.17
Gradle:       7.6.3
Groovy:       3.0.19
JVM:          17.0.8 (Azul Systems, Inc. 17.0.8+7-LTS)
OS:           Mac OS X 12.7 aarch64
```

### App environment

```bash
➜  goboots-2022-demo git:(main) ✗ goboots about
| About your application's environment

Name:               goboots-2022-demo
Version:            0.1
Plugins:            [core:2022.4.4], [dataSource:2022.4.4], [i18n:2022.4.4], [codecs:2022.4.4], [restResponder:2022.4.4], [controllers:2022.4.4], [converters:2022.4.4], [urlMappings:2022.4.4], [interceptors:2022.4.4], [domainClass:2022.4.4], [services:2022.4.4], [groovyPages:2022.4.4], [scaffolding:5.4.2], [geb:5.4.2], [cache:5.4.2], [fields:5.4.2], [hibernate:2022.4.4], [eventBus:5.4.2], [assetPipeline:4.3.0], [controllersAsync:5.4.2], [databaseMigration:4.2.0]
Application root:   /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo
Environment:        development

Grails:             2022.4.4
Groovy:             3.0.19
Gradle:             8.4
Spring Boot:        2.7.17
JVM:                17.0.8 (Azul Systems, Inc. 17.0.8+7-LTS)
OS:                 Mac OS X 12.7 aarch64

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
|    1    |  Core                |  2022.4.4                     |
|    2    |  DataSource          |  2022.4.4                     |
|    3    |  I18n                |  2022.4.4                     |
|    4    |  Codecs              |  2022.4.4                     |
|    5    |  RestResponder       |  2022.4.4                     |
|    6    |  Controllers         |  2022.4.4                     |
|    7    |  Converters          |  2022.4.4                     |
|    8    |  UrlMappings         |  2022.4.4                     |
|    9    |  Interceptors        |  2022.4.4                     |
|   10    |  DomainClass         |  2022.4.4                     |
|   11    |  Services            |  2022.4.4                     |
|   12    |  GroovyPages         |  2022.4.4                     |
|   13    |  Hibernate           |  2022.4.4                     |
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
 :: GoBoots ::                       (v2022.4.4)

2023-10-28 00:28:20.216  INFO --- [kground-preinit] o.h.validator.internal.util.Version      : HV000001: Hibernate Validator 6.2.5.Final
2023-10-28 00:28:20.222  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Starting Application using Java 11.0.20 on Michaels-Mini with PID 90267 (/Users/rain/Development/github/grails/grails-demos/goboots-2022-demo/build/classes/groovy/main started by rain in /Users/rain/Development/github/grails/grails-demos/goboots-2022-demo)
2023-10-28 00:28:20.223 DEBUG --- [  restartedMain] org.rainboyan.demo.Application           : Running with Spring Boot v2.7.17, Spring v5.3.30
2023-10-28 00:28:20.223  INFO --- [  restartedMain] org.rainboyan.demo.Application           : The following 1 profile is active: "development"
2023-10-28 00:28:20.248  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2023-10-28 00:28:20.248  INFO --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2023-10-28 00:28:20.927  INFO --- [  restartedMain] g.plugins.DefaultGrailsPluginManager     : Total 21 plugins loaded successfully, take in 188 ms
2023-10-28 00:28:21.619  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-10-28 00:28:21.623  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Initializing ProtocolHandler ["http-nio-8080"]
2023-10-28 00:28:21.624  INFO --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-10-28 00:28:21.625  INFO --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.82]
2023-10-28 00:28:21.669  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-10-28 00:28:21.669  INFO --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1420 ms
2023-10-28 00:28:21.853  INFO --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:devDb'
2023-10-28 00:28:22.183  INFO --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.6.15.Final
2023-10-28 00:28:22.284  INFO --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2023-10-28 00:28:22.324  INFO --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2023-10-28 00:28:22.710  INFO --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-10-28 00:28:23.112  INFO --- [  restartedMain] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 15 endpoint(s) beneath base path '/actuator'
2023-10-28 00:28:23.392  INFO --- [  restartedMain] o.a.coyote.http11.Http11NioProtocol      : Starting ProtocolHandler ["http-nio-8080"]
2023-10-28 00:28:23.404  INFO --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring GrailsDispatcherServlet 'dispatcherServlet'
2023-10-28 00:28:23.405  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Initializing Servlet 'dispatcherServlet'
2023-10-28 00:28:23.406  INFO --- [  restartedMain] o.g.w.s.mvc.GrailsDispatcherServlet      : Completed initialization in 1 ms
2023-10-28 00:28:23.406  INFO --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-10-28 00:28:23.495  INFO --- [  restartedMain] org.rainboyan.demo.Application           : Started Application in 3.783 seconds (JVM running for 4.373)
2023-10-28 00:28:23.500  INFO --- [  restartedMain] PluginsInfoApplicationContextInitializer :
----------------------------------------------------------------------------------------------
Order      Plugin Name                              Plugin Version                     Enabled
----------------------------------------------------------------------------------------------
    1      Core                                     2022.4.4                                 Y
    2      DataSource                               2022.4.4                                 Y
    3      I18n                                     2022.4.4                                 Y
    4      Codecs                                   2022.4.4                                 Y
    5      RestResponder                            2022.4.4                                 Y
    6      Controllers                              2022.4.4                                 Y
    7      Converters                               2022.4.4                                 Y
    8      UrlMappings                              2022.4.4                                 Y
    9      Interceptors                             2022.4.4                                 Y
   10      DomainClass                              2022.4.4                                 Y
   11      GroovyPages                              2022.4.4                                 Y
   12      Fields                                   5.4.2                                    Y
   13      AssetPipeline                            4.3.0                                    Y
   14      ControllersAsync                         5.4.2                                    Y
   15      DatabaseMigration                        4.2.0                                    Y
   16      Scaffolding                              5.4.2                                    Y
   17      Geb                                      5.4.2                                    Y
   18      Hibernate                                2022.4.4                                 Y
   19      EventBus                                 5.4.2                                    Y
   20      Services                                 2022.4.4                                 Y
   21      Cache                                    5.4.2                                    Y
----------------------------------------------------------------------------------------------

2023-10-28 00:28:23.503  INFO --- [  restartedMain] org.rainboyan.demo.Application           :
----------------------------------------------------------------------------------------------
        Application:   goboots-2022-demo
        Version:       0.1
        Environment:   development
        Local:         http://localhost:8080
        External:      http://192.168.31.127:8080
----------------------------------------------------------------------------------------------
```

### Links

* [GoBoots 2022 Demo](https://github.com/rainboyan/goboots-2022-demo)
* [GoBoots 2023 Demo](https://github.com/rainboyan/goboots-2023-demo)
* [GoBoots 2024 Demo](https://github.com/rainboyan/goboots-2024-demo)
