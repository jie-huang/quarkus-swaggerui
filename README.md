# quarkus-swaggerui

This is to demo how to handle regex @Path annotation.

The problem is, swaggerui cannot handle the regex which covers "/" or empty.

`./gradlew test` passed so the @Path annotation is correct.

But in /q/swagger-ui, without `@PathParam`, there is no way to control how to select which path to use.

Without `@PathParam`, there is no way to input the correct path because "empty" is not accept and "/" is escaped always.
