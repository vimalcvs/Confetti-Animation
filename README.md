# Confetti-Animation

Confetti-Animation is a library for creating delightful confetti animations in Android apps. It provides an easy way to add colorful confetti effects to your app's UI.

## Installation

To use Confetti-Animation in your project, follow these steps:

1. Add the repository URL to your root `build.gradle` file:

    ```groovy
    allprojects {
        repositories {
            // Existing repositories
            maven { url 'https://jitpack.io' }
        }
    }
    ```

2. Add the library dependency to your app's `build.gradle` file:

    ```groovy
    dependencies {
        // Existing dependencies
        implementation 'com.github.vimalcvs:Confetti-Animation:0.0.1'
    }
    ```

## Usage

To create a confetti animation in your app, you can use the `ConfettiAnimation` class provided by the library. Here's an example of how to use it:

```java
// Instantiate the ConfettiAnimation
ConfettiAnimation confettiAnimation = new ConfettiAnimation.Builder()
        .setContext(context)
        .setContainer(containerView)
        .setColors(Color.RED, Color.GREEN, Color.BLUE)
        .setDuration(3000)
        .setConfettiCount(100)
        .build();

// Start the animation
confettiAnimation.start();
