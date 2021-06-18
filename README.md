# pb-learning

Building java package from proto file:

```sh
protoc -I=. --java_out=. ./book.proto
```

### Reference books

1. "Effective Java" by Joshua Bloch
    
    Highlights:

    > page 210
    >
    > ```java
    > // Uses the streams API but not the paradigm--Don't do this!
    > Map<String, Long> freq = new HashMap<>();
    > try (Stream<String> words = new Scanner(file).tokens()) {
    > words.forEach(word -> {
    > freq.merge(word.toLowerCase(), 1L, Long::sum);
    > });
    > }
    > ```
  
2. 
