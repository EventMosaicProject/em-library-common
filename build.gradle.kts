plugins {
	`java-library`
}

group = "com.neighbor.eventmosaic.library"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {

	// Lombok
	compileOnly(libs.lombok)
	annotationProcessor(libs.lombok)
}
