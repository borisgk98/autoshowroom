apply plugin: 'java'
apply plugin: 'idea'
apply plugin: 'org.springframework.boot'
apply plugin: 'io.spring.dependency-management'
apply plugin: 'space.borisgk.crudgeneration'

group 'com.mera.borisgk98'
version '0.1'

sourceCompatibility = 1.8

buildscript {
    ext {
        xjcVersion= '3.0.5'
        jaxbOutputDir = "$buildDir/generated/cxf"
        jaxb2BasicsVersion = '0.11.0'
        cxfVersion = '3.3.1'
    }
    repositories {
        mavenCentral()
        maven {
            url 'https://raw.github.com/borisgk98/crudrepositorygenerator/mvn-repo'
        }
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.1.3.RELEASE")
        classpath 'space.borisgk:crudgeneration:0.2'
        classpath 'org.antlr:stringtemplate:3.2'
    }
}

configurations {
    cxf
    all {
        exclude group: 'org.springframework.boot', module: 'spring-boot-starter-logging'
    }
}

repositories {
    mavenCentral()
    maven {
        url 'https://repo.spring.io/libs-snapshot'
    }
}

sourceSets {
    main {
        java {
            srcDirs += "$jaxbOutputDir"
        }
    }
}

task wsdl2java(type: JavaExec) {
    ext {
        outputDir = file("$jaxbOutputDir")
        wsdllist = "src/main/resources/services.txt"
    }
    systemProperties  = ['javax.xml.accessExternalSchema': 'file' , 'file.encoding':'UTF8']
    outputs.upToDateWhen { false }
    outputs.dir "/home/boris/progs/autoshowroom/soap_client/src/main/java"
    main = 'org.apache.cxf.tools.wsdlto.WSDLToJava'
    classpath = project.configurations.cxf
    args '-d', "/home/boris/progs/autoshowroom/soap_client/src/main/java"
    args '-fe', 'jaxws21'
    args '-client'
    args '-verbose'
    args '-validate'
    args '-mark-generated'
//  args '-xjc-X'
    args '-xjc-Xfluent-api'
    args '-xjc-Xts'
    args '-xjc-XhashCode'
    args '-xjc-Xequals'
    args '-wsdlList', wsdllist
    doLast {
        println "----- cxf jaxb2 files generated -----"
    }
}

dependencies {
    implementation 'org.springframework.shell:spring-shell-starter:2.0.1.RELEASE'
//    testImplementation 'org.springframework.boot:spring-boot-starter-test'
    compile("io.springfox:springfox-swagger2:2.9.2")

    cxf "org.apache.cxf:cxf-tools-wsdlto-core:$cxfVersion"
    cxf "org.apache.cxf:cxf-tools-wsdlto-frontend-jaxws:$cxfVersion"
    cxf "org.apache.cxf:cxf-tools-wsdlto-databinding-jaxb:$cxfVersion"
    cxf "org.jvnet.jaxb2_commons:jaxb2-fluent-api:3.0"
    cxf "org.apache.cxf.xjcplugins:cxf-xjc-ts:$xjcVersion"
    cxf "org.jvnet.jaxb2_commons:jaxb2-basics:$jaxb2BasicsVersion"
    compile "org.apache.cxf.xjc-utils:cxf-xjc-runtime:$xjcVersion"
    compile "org.jvnet.jaxb2_commons:jaxb2-basics-runtime:$jaxb2BasicsVersion"
    compile 'commons-lang:commons-lang:2.6'
}

//compileJava.dependsOn wsdl2java

crudGenerationSetting {
    srcRoot = "$projectDir/src/main/java"
    modelPackage = "$projectDir/src/main/java/com/mera/borisgk98/autoshowroom/soapclient/model"
    generationRoot = "$projectDir/src/main/java"
    generationPackages = [
//            "com.mera.borisgk98.autoshowroom.soapclient.services"
            "com.mera.borisgk98.autoshowroom.soapclient.services.impldefault"
    ]
    generationTemplates = [
//            "$projectDir/src/main/resources/templates/Service".toString()
            "$projectDir/src/main/resources/templates/DefaultImpl".toString()
    ]
    generationConcatOuts = [
    ]
    generationConcatTemplates = [
    ]
    excludeModels = [
            "OrderStatus",
            "HasId"
    ]
}

springBoot {
    mainClassName = 'com.mera.borisgk98.autoshowroom.soapclient.Application'
}