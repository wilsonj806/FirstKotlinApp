# Android Studio Design Editor

## Overview
This doc overview's what's possible in the Design Editor in Android Studio.
There's a lot of stuff, it's pretty intense.

## The Design Editor
There are 4 components to the Design Editor, broadly speaking.
- The Palette Tab
- The Component Tree Tab
- The Attributes Tab
- The Design Preview panel

The Palette Tab includes the various components that you can drag and drop
into the Design Preview Panel.

The Component Tree Tab shows the component tree. It's a representation of
`activity_main.xml` but in tree form.
- Note that the Google Codelabs tutorial for building your first Kotlin App
refers to a `ConstraintLayout`  component, but in the current version of
  ... but here it's the `CoordinatorLayout`
  - Note that the `CoordinatorLayout` component is the ROOT component
- Note that you do want to have a `ConstraintLayout` though because your
  ... components won't be located properly otherwise

The Attributes Tab gives you a list of the various attributes that you can
modify for a selected element. It should feel familiar if you've ever messed
with something like Blender or the modding pack for a game even if they do
completely different things.