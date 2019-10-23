:: for successful build
specify in build.gradle
compileJava.options.forkOptions.executable = "path\\to\\jdk"
compileTestJava.options.forkOptions.executable = "path\\to\\jdk"

:: to assemble and test project (from project root)
gradlew.bat build

:: to test project
gradlew.bat test

:: to assemble project
gradlew.bat assemble

:: to start assembled .jar file
java -jar build\libs\Calc-1.0.1.jar

:: test report place
test report is index.html in build\reports\tests\test
