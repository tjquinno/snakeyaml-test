# snakeyaml-test
Some tests related to SnakeYAML.

## `BigDecimalTest` 
(SnakeYAML 1.25)
If a field of type `BigDecimal` has a value that can be formatted as an integer (such as 10.0), SnakeYAML outputs 
the value surrounded by single quotes: `'10'`. Other values are output _without_ being quoted.

```console
mvn test -Dtest=BigDecimalTest
``` 

The test shows that the `10` is single-quoted while a non-integer value is not:
```
Expected unquoted 10 but was quoted: !!io.helidon.example.snakeyamltest.DataImpl 
{a: !!float '10', b: 10.199999999999999289457264239899814128875732421875}
```