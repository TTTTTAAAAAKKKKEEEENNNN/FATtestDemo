# FATtestDemo
This is a sample project demonstrating how to implement FAT(Feature Acceptance Test) with Dubbo 2.7.0

Please start the project in the following sequence:

SvcC -> SvcB -> SvcA

since Service A depends on Service B, and Service B depends on Service C.


For each service, to enable feature test, please activate profile fat1 by adding the parameter below to VM:
--spring.profiles.active=fat1

svcA is the frontend(web) for the whole project, by default,
the web server will be started in local with port 8088(default feature) and 8089(tagged as fat1)

The feature tag's name can be changed via 'featuretest' in application-fat1.properties

If the project with fat1 tag is started, SvcA with no fat tag will not be affected, SvcA with fat1 profile activated will be affected.
The impact will be able to see by comparing:
http://127.0.0.1:8088/userinfo/a
http://127.0.0.1:8089/userinfo/a
