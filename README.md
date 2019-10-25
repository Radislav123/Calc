# for successful build
specify in build.gradle
compileJava.options.forkOptions.executable = "path\\to\\javac.exe\\in\\jdk"
compileTestJava.options.forkOptions.executable = "path\\to\\javac.exe\\in\\jdk"

# to assemble and test project (from project root)
gradlew.bat build

# to test project
gradlew.bat clean test

# to assemble project
gradlew.bat assemble

# to start assembled .jar file
java -jar build\libs\Calc-1.0.2.jar

# gradle test report place
test report is index.html in build\reports\tests\test

# display allure test report (by local server)
allure serve path\to\project\allure-results
