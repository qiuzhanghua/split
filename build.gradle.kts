plugins {
    application
    antlr
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.commons:commons-csv:1.9.0")
    antlr("org.antlr:antlr4:4.11.1")
}

application {
    mainClass.set("cn.com.taiji.App")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}



tasks.generateGrammarSource {
    maxHeapSize = "512m"
    arguments = arguments + listOf("-visitor", "-long-messages")
}

