# Reason for a custom openapi implementation
Because we want to add a property "etag" in a given interface, when related EP has the header "ETag" in the response.

# How to run
to run the current code I suggest running

```./run-in-docker.sh generate -i http://host.docker.internal:8080/customer/swagger -g typescript-angular --log-to-stderr --minimal-update --global-property models```


this will generate all the interfaces for the customer domain. 

**Important note: you'll need wawi backend running**

**Important note: between all those interfaces, it supposed to generate a "CustomerResponse.ts", which has the property "etag" in it.**

# How to build
If you made some changes to the generator, and want to build the jar, run

```./run-in-docker.sh mvn package -DskipTests```

After completition, you'll find the jar in:

```modules/openapi-generator-cli/target/openapi-generator-cli.jar```

copy and replace the one in the FE repository.

# How to make some changes in the code
Remeber that you always need to rebuild after a change in the code!

Usually what you should do, after a change is:

```./run-in-docker.sh mvn package -DskipTests```

and to test your fresh build:

```./run-in-docker.sh generate -i http://host.docker.internal:8080/customer/swagger -g typescript-angular --log-to-stderr --minimal-update --global-property models```

If maven is having errors at any point, cleaning its local cache may help:

```./run-in-docker.sh mvn clean install -U -DskipTests```


# How to debug

read the comments in
`run-in-docker.sh`

You'll need a remote JVM debug, to connect to port 5005. It's pretty easy with intellij IDEA commuinity edition.