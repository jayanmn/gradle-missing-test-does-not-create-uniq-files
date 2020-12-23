## Bug report: Gradle  does not create TEST-<testclassname>.xml file  when testclass actually does not have any test. 
  
We are migrating from ant to gradle.  When a testclass does not have testmethod, ant creates TEST-<testclass>.xml correctly.
Gradle creates "one" file with name `TEST-junit.framework.TestSuite$1.xml` . When there are multiple classes this causes details lost. Only the last one is now seen.  
  
### content has testsuite name incorrect
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

### Impact on older tools
The behavior affects tools that now depends on the convention established by ant  (affects migration to gradle). Jenkins for example sees only one file for missing test. It fails to report the offending testclass.

### Problem demo 
./gradlew sampletest


#then check content of files in build/
#Only one file will be present
build/test-results/test/TEST-junit.framework.TestSuite$1.xml



