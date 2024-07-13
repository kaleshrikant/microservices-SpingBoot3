**: To convert the Mono-Repo project to executable modules :**

1. Create Mono-Repo project, e.g. micro-services[]()
2. Create module, e.g. [Api-Gateway](Api-Gateway) 
3. To make this module active follow below steps to import as module.
   1. File --> New --> Module From Existing Source
   2. Under micro-services[]() 
   3. Select `build.gradle` or `POM.xml` of [Api-Gateway](Api-Gateway)
   4. Select `Open` and Setup-JDK
4. Follow same above steps for all other forthcoming modules.