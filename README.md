# Install library jar locally
```
mvn install:install-file \
   -Dfile=<path-to-jar-file> \
   -DgroupId=io.corp.calculator \
   -DartifactId=tracer \
   -Dversion=1.0.0 \
   -Dpackaging=jar \
   -DgeneratePom=true

```

# Build jar
```sh
$ mvn clean package
```

# Run Jar
```sh
$ java -jar target/calculadora-0.0.1-SNAPSHOT.jar
```

# uri path to get sum
> http://localhost:8080/sum/{param1}/{param2}

## Example
> http://localhost:8080/sum/1/2

