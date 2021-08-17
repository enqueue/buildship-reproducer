# Buildship Gradle Test Dependencies Reproducer

Reproducer project to show broken test dependencies in Eclipse / Buildship

The tests in project `bar` depend on a common base test class in project `foo`.
It is a common pattern found in projects that are not using
[testFixture](https://docs.gradle.org/current/userguide/java_testing.html#sec:java_test_fixtures)
yet, see
[Software Noise Blog](https://softnoise.wordpress.com/2014/09/07/gradle-sub-project-test-dependencies-in-multi-project-builds)
and related StackOverflow posts.

## Usage

### Running from the command line

Run `./gradlew :bar:test`.

You see two successful tests.

### Running in Eclipse

Import the project in Eclipse.

You see that in the class `BarEntityTest` the dependency on `BaseTestCase`
cannot be resolved.

## Discussion

I suspect that setting the `without_test_code` flag to `true` universally
might cause this error.
