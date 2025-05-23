
plugins {
    application
    id("java")
}

group = "com.test"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.github.tomakehurst:wiremock-jre8:2.35.0")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("com.test.WiremockServerApp")
}

// ✅ Correct way to set args
tasks.named<JavaExec>("run") {
    args = listOf("8080")
}