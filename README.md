# PiTest/JUnit compatibility tester

Simplest way to run

```shell
./gradlew pitest
```

To change the version of the junit dependency

```shell
./gradlew pitest -PjunitVersion=5.10.0
```

To change the version of the pitest junit plugin

```shell
./gradlew pitest -PpiTestJUnitVersion=1.0.0
```

To change the version of the pitest gradle plugin

```shell
./gradlew pitest -PpiTestPluginVersion=1.9.0
```

To change the version of the pitest dependency

```shell
./gradlew pitest -PpiTestVersion=1.14.1
```

You can mix and match too

```shell
./gradlew pitest -PpiTestPluginVersion=1.9.0 -PpiTestVersion=1.14.1 -PjunitVersion=5.10.0
```
