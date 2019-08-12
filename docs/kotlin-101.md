# Kotlin 101
## Overview
Kotlin's based off of Java, but syntactically it has multiple differences.

## Basic Syntax
First in comparison to Java, Kotlin saves in a lot of verbosity with type
inferences. This way you don't have to explicitly type out every single
variable.

On top of that, Kotlin gives general types of variables:
```kt
var myVar = 3;
val myVal = 'Hello';
const val myConst = 'TOGGLE_VISIBILITY';
```

Here, `var` is a *mutable* variable, `val` is a *read-only* or *assign-once*
variable.

If a read only variable is truly a constant, then you use the `const`
modifier with `val` to indicate so.

And if you need to explicitly type something, Kotlin lets you do that as
well. This works in a similar way that TypeScript does it, which is nice.
```kt
var myVar: myStrings = 'Hello'
```