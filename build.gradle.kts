plugins {
    java
    jacoco
    idea
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.12.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    finalizedBy(tasks.named("jacocoTestReport"))
    useJUnitPlatform {
        testLogging {
            showStandardStreams = true
            showStackTraces = true
            exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
            displayGranularity = 1
        }
    }
}

tasks.withType<JacocoReport> {
    dependsOn(tasks.named("test"))
    reports {
        html.required = true
        xml.required = true
        csv.required = true
    }
}

group = "com.huhu.algorithm"
version = "0.0.1"
