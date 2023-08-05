# Nexus
Java database module compatible with multiple databases

## About
Nexus allows you to connect to multiple types of databases, such as firebase and mysql,
and use the same interfaces to interact with them.

## Installation

Add `jitpack.io` to your repositories:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

Then, add `nexus-core` as a dependency:

```gradle
dependencies {
    implementation 'com.github.StellarNow.Nexus:nexus-core:-SNAPSHOT'
}
```
```xml
<dependency>
    <groupId>com.github.StellarNow.Nexus</groupId>
    <artifactId>nexus-core</artifactId>
    <version>-SNAPSHOT</version>
</dependency>
```

Instead of using `-SNAPSHOT` for a version, you can specify a commit hash.

## NOTICE ABOUT BELOW

The documentation below is documenting unfinished elements of Nexus. Don't expect this to
be 100% accurate yet. You'll see notes saying weather or not code is finished.

## Usage

First, you'll need to find an implementation to use. The following are available:

- Memory (built-in, `MemoryImplementation`)
- Files (built-in, `FilesImplementation`)
- JDBC (`nexus-jdbc`, `JDBCImplementation`)
- Firebase (`nexus-firebase`, `FirebaseImplementation`)

Then, set up your `Nexus` instance:

```java
NexusImplementation impl = ...;
Nexus nexus = Nexus
        .init(impl)
        .build();
```