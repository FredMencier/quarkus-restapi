# quarkus-restapi
Reproducer problem with implements 2 interfaces rest

Quarkus version : 3.7.4

Stack :
java.lang.RuntimeException: io.quarkus.builder.BuildException: Build failure: Build failed due to errors
[error]: Build step io.quarkus.resteasy.reactive.server.deployment.ResteasyReactiveProcessor#setupEndpoints threw an exception: jakarta.enterprise.inject.spi.DeploymentException: POST /admin/transaction/createpseudotransactions is declared by :
org.test.GreetingResource#pushForward consumes *, produces *
org.test.GreetingResource#createPseudoTransactions consumes *, produces *

