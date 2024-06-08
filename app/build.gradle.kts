plugins {
    id("com.android.application")
}

android {
    namespace = "it.fermi.Musibebe"
    compileSdk = 34

    defaultConfig {
        applicationId = "it.fermi.Musibebe"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    packagingOptions {
        exclude("META-INF/DEPENDENCIES")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation(files("libs/json-simple-1.1.jar"))
    implementation("com.github.bumptech.glide:glide:5.0.0-rc01")
    implementation("androidx.activity:activity:1.9.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("org.json:json:20240303")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    implementation("org.apache.httpcomponents:httpmime:4.5.6")
    implementation("org.apache.httpcomponents:httpcore:4.4.16")
}