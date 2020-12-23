# Gradle  does not create TEST-<testclassname>.xml file  when testclass actually does not have any test. Instead file with name
# TEST-junit.framework.TestSuite$1.xml is created.
# content has testsuite name incorrect
...
<?xml version="1.0" encoding="UTF-8"?>
<testsuite name="junit.framework.TestSuite$1" tests="3" skipped="0" failures="3" errors="0" timestamp="2020-12-23T03:58:13" hostname="INH-JNAMBOOD-LT" time="0.01">
  <properties/>
  <testcase name="warning" classname="junit.framework.TestSuite$1" time="0.002">
    <failure message="junit.framework.AssertionFailedError: No tests found in org.sample.numberutils.TestNumbers1AEmptyTest" type="junit.framework.AssertionFailedError">junit.framework.AssertionFailedError: No tests found in org.sample.numberutils.TestNumbers1AEmptyTest
        at junit.framework.Assert.fail(Assert.java:57)
        at junit.framework.TestCase.fail(TestCase.java:227)
        at junit.framework.TestSuite$1.runTest(TestSuite.java:97)
        at junit.framework.TestCase.runBare(TestCase.java:141)
        at junit.framework.TestResult$1.protect(TestResult.java:122)
        at junit.framework.TestResult.runProtected(TestResult.java:142)
        at junit.framework.TestResult.run(TestResult.java:125)
...		

# The behavior affects tools that now depends on the convention established by ant  (affects migration to gradle)

## Problem demo 
./gradlew sampletest


#then check content of files in build/
#Only one file will be present
build/test-results/test/TEST-junit.framework.TestSuite$1.xml
