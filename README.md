# SpringWebflowInGrailsApp
Rendering .gsp pages in grails app using Spring Webflow directly. (Grails 3.x.x version is not supporting grails-webflow plugin, which used to fullfill the objective of this small POC)

This small project is outcome of broken grails-webflow plugin. To play with
this
```
grailsw run-app

// and then on the browser hit
http://localhost:8082/learning/hitMeToInvokeThisFlow
```

This shall invoke the flow defined in `src/main/webapp/WEB-INF/flows/install-repository.xml` which 
is loaded by `com.akhilesh.learning.DummyWebFlowConfiguration`
