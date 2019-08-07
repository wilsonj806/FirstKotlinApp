# Mobil Dev 101

## References used

- [Android docs, creating a project](https://developer.android.com/training/basics/firstapp/creating-project)

## Overview

Mobile dev has it's own workflow, which may seem similar to development
for browsers, but it's got several differences.

## Initial File Structure

When you configure your Android project with a default activity selected
you end up with the below file structure:
```
~
|- .gradle
|- .idea
|- app
|  |- build
|  |- libs
|  |_ src
|     |- androidTest
|     |- main
|     |  |- java
|     |  |- res
|     |  |_ AndroidManifest.xml
|     |- test
|- build
|_ gradle
```

The most important files are listed and described below:

**app > java > com.example.wilson.firstkotlinapp > MainActivity(.kt | .java)**

This is the main activity (the entry point for your app, similar to
index.js in NPM/ Node).
When you build and run the app, the system launches an instance of this 
Activity and loads its layout.

**app > res > layout > activity_main.xml**

This XML file defines the layout for the activity's UI. It contains a
button and a toolbar, and right now is based on one of the Android
activity templates.


**app > manifests > AndroidManifest.xml**

The manifest file describes the fundamental characteristics of the app
and defines each of its components.

**Gradle Scripts > build.gradle**

You'll see two files with this name: one for the project
("Project: FirstKotlinApp") and one for the "app" module ("Module: app").
Each module has its own build.gradle file, but this project currently
has just one module. You'll mostly work with the module's build.gradle
file to configure how the Gradle tools compile and build your app.

## Global Resources
Mobile dev lets you use XML files to declare global values that can be
imported into any layout/ view and used.

In this project, resources are in the `app/res/values` directory.


The global resources have the below format:
```xml
<!-- For Strings -->
<root>
<resources>
  <string name="init_text_view">Hello World!</string>
</resources>

<!-- For Strings -->
<resources>
  <color name="colorNiceGrey">#696969</string>
</resources>
</root>
```

To access them you'd use something the below:
```xml
  <TextView
    android:text="@string/init_text_view"
    android:textColor="@color/colorNiceGrey"
    otherProps="Other props below" />
```