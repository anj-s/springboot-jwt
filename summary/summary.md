<a id="top"></a>

<p style="font-size: 24px;"><img src="./qct-icons/transform-logo.svg" style="margin-right: 15px; vertical-align: middle;"></img><b>Code Transformation Summary by Amazon Q </b></p>
<p><img src="./qct-icons/transform-variables-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Lines of code in your application: 417 <p>
<p><img src="./qct-icons/transform-clock-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Transformation duration: 26 min(s) <p>
<p><img src="./qct-icons/transform-dependencies-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned dependencies replaced: 3 of 9 <p>
<p><img src="./qct-icons/transform-dependencyAnalyzer-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Additional dependencies added: 5 <p>
<p><img src="./qct-icons/transform-smartStepInto-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Planned deprecated code instances replaced: 0 of 0 <p>
<p><img src="./qct-icons/transform-listFiles-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Files changed: 9 <p>
<p><img src="./qct-icons/transform-build-dark.svg" style="margin-bottom: 1px; vertical-align: middle;"></img> Build status in Java 17: <span style="color: #CCCC00">PARTIALLY_SUCCEEDED</span> <p>

### Table of Contents

1. <a href="#build-log-summary">Build log summary</a> 
1. <a href="#planned-dependencies-replaced">Planned dependencies replaced</a> 
1. <a href="#additional-dependencies-added">Additional dependencies added</a> 
1. <a href="#deprecated-code-replaced">Deprecated code replaced</a> 
1. <a href="#other-changes">Other changes</a> 
1. <a href="#all-files-changed">All files changed</a> 
1. <a href="#next-steps">Next steps</a> 


### Build log summary <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="build-log-summary"></a>

Amazon Q could not build the upgraded code in Java 17. The following build log snippet that shows the errors Amazon Q encountered during the build log. To view the full build log, open [`buildCommandOutput.log`](./buildCommandOutput.log)

```
The Maven build failed because the maven-compiler-plugin requires Maven version 3.6.3 or higher, but a lower version was used. It failed during the compile phase after downloading dependencies. No private application details are revealed.
```


### Planned dependencies replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="planned-dependencies-replaced"></a>

Amazon Q updated the following dependencies that it identified in the transformation plan

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `jakarta.persistence:jakarta.persistence-api` | Added | - | 3.2.0 |
| `jakarta.servlet:jakarta.servlet-api` | Added | - | 6.1.0 |
| `org.springframework.boot:spring-boot-starter-parent` | Updated | 2.0.4.RELEASE | 3.3.3 |

### Additional dependencies added <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="additional-dependencies-added"></a>

Amazon Q updated the following additional dependencies during the upgrade

| Dependency | Action | Previous version in Java 8 | Current version in Java 17 |
|--------------|--------|--------|--------|
| `com.fasterxml.jackson.core:jackson-databind` | Updated | 2.9.10.8 | - |
| `org.apache.maven.plugins:maven-compiler-plugin` | Updated | 3.8.1 | - |
| `org.projectlombok:lombok` | Updated | 1.18.10 | - |
| `org.springframework.security.oauth:spring-security-oauth2` | Updated | 2.1.0.RELEASE | 2.5.2.RELEASE |
| `org.springframework.security:spring-security-jwt` | Updated | 1.0.7.RELEASE | 1.1.1.RELEASE |

### Deprecated code replaced <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="deprecated-code-replaced"></a>

Amazon Q replaced the following instances of deprecated code. An instance with 0 files
changed indicates Amazon Q wasn't able to replace the deprecated code.

| Deprecated code | Files changed |
|----------------|----------------|


### Other changes <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="other-changes"></a>



### All files changed <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="all-files-changed"></a>

| File | Action |
|----------------|--------|
| [pom.xml](../pom.xml) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/config/DatasourceConfig.java](../src/main/java/com/nouhoun/springboot/jwt/integration/config/DatasourceConfig.java) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/config/ResourceServerConfig.java](../src/main/java/com/nouhoun/springboot/jwt/integration/config/ResourceServerConfig.java) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/config/SecurityConfig.java](../src/main/java/com/nouhoun/springboot/jwt/integration/config/SecurityConfig.java) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/domain/RandomCity.java](../src/main/java/com/nouhoun/springboot/jwt/integration/domain/RandomCity.java) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/domain/Role.java](../src/main/java/com/nouhoun/springboot/jwt/integration/domain/Role.java) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/domain/User.java](../src/main/java/com/nouhoun/springboot/jwt/integration/domain/User.java) | Updated |
| [src/main/java/com/nouhoun/springboot/jwt/integration/service/impl/AppUserDetailsService.java](../src/main/java/com/nouhoun/springboot/jwt/integration/service/impl/AppUserDetailsService.java) | Updated |
| [src/test/java/com/nouhoun/springboot/jwt/integration/SpringbootJwtApplicationTests.java](../src/test/java/com/nouhoun/springboot/jwt/integration/SpringbootJwtApplicationTests.java) | Updated |

### Next steps <a style="float:right; font-size: 14px;" href="#top">Scroll to top</a><a id="next-steps"></a>

1. Please review and accept the code changes using the diff viewer.If you are using a Private Repository, please ensure that updated dependencies are available.
1. 
1. In order to successfully verify these changes on your machine, you will need to change your project to Java 17. We verified the changes using [Amazon Corretto Java 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/what-is-corretto-17.html
) build environment.
1. If this project uses Maven CheckStyle, Enforcer, FindBugs or SpotBugs plugins, Q Code Transformation will disable those plugins when we build the project to verify proposed upgrades.