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
    otherAtributes="Other Attributes below" />
```

**NOTE:** It is generally best practice to add strings/ colors/ etc that
won't be accessed by Kotlin as it's own resource in the corresponding XML
file.

## Connecting Elements To Kotlin
There's a couple of different ways to connect your Android elements to
Kotlin.

Given an element with an id value, then you can use the below:
```kt
    val showCountTextView = findViewById<TextView>(R.id.counterView)
```

Where we tell Kotlin that we're selecting a TextView, and the element we
want to select is `R.id.counterView` where `R` is a dynamically generated
class that dynamically identifies assets. It basically compiles all your
XML files in`app/src/main/res`.

This functions similarly to `document.getElementById()` in JavaScript

The other way is to build event handlers and directly attach them to the
desired element.

Given this function that adds a toast when called:
```kt
  fun toastMe(view: View) {
    // val myToast = Toast.makeText(this, message, duration);
    val myToast = Toast.makeText(this@MainActivity, "Hello Toast!", Toast.LENGTH_SHORT)
    myToast.show()
  }
```

To attach it to an element we'd need to add an `android:onClick` attribute
like so:
```xml
<Button
  android:id="@+id/toast"
  android:text="@string/toast_btn"
  android:onClick="toastMe" />
```

## Switching Activities
Switching between activities requires some Kotlin scripting. So if we
wanted to switch between activities, our Kotlin would look like this:
```kt
fun switchActivity(view: View) {
  // declare an intent
  val intent = Intent(this, MyActivity::java)
  
  // start the activity identified by the above
  startActivity(intent)
}
```

Then you'd need to link that to your UI somehow. The most basic example
would be with an onClick handler for a button. This would be done in the
corresponding XML element like so:
```xml
<Button
  android:onClick="switchActivity" />
```
