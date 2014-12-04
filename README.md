d4m_api_java
============

Java connector between Accumulo and D4M Matlab library 

Master: 
[![Build Status](https://travis-ci.org/Accla/d4m_api_java.svg?branch=master)](https://travis-ci.org/Accla/d4m_api_java)
[![Build Status](https://api.shippable.com/projects/5430748880088cee586d4466/badge?branchName=master)](https://app.shippable.com/projects/5430748880088cee586d4466/builds/latest)

Branch to1.6: 
[![Build Status](https://travis-ci.org/Accla/d4m_api_java.svg?branch=to1.6)](https://travis-ci.org/Accla/d4m_api_java)
[![Build Status](https://api.shippable.com/projects/5430748880088cee586d4466/badge?branchName=to1.6)](https://app.shippable.com/projects/5430748880088cee586d4466/builds/latest)

`mvn package -DskipTests=true` to compile and build JARs.

`mvn test -Dtest=SomeTest#mini` to run a test on [MiniAccumulo](https://accumulo.apache.org/1.6/accumulo_user_manual.html#_mini_accumulo_cluster).

`post-test.bash` is a utility script to output test results to the console.
