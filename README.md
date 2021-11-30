### Java SWE Interview Prep

[Credits/Disclaimer] Most of the codes are from JavaTechie channel's awesome playlist, with comments/notes of my own, check it out
[here.](https://www.youtube.com/playlist?list=PLVz2XdJiJQxzrdrpglCv_nWIO5CDIqOVj)
- Java 8 updates
- Functional Interfaces and Lambda Expressions
- Consumer/Predicate/Supplier function interfaces in SE 1.8
- Stream API & functional programming in Java
- Sorting a list/map via lambdas => various approaches
- map & flatmap =>
  - Key take away: 
    - If the parameter in the stream returns a Scalar(eg: customer.getEmail() single email id) then use Map. If the parameter returns a Vector(eg: customer.getPhoneNumbers(), customer.getProductsOrdered() which returns a list) then use FlatMap.
    - Stream of Stream for FlatMap is one more key point to note. 
  - Differences between Java 8 Map() Vs flatMap() :

map() | flatMap() | 
--- | --- |  
It processes stream of values. | It processes stream of stream of values.
It does only mapping. | It performs mapping as well as flattening.
It’s mapper function produces single value for each input value. | It’s mapper function produces multiple values for each input value.
It is a One-To-One mapping. | It is a One-To-Many mapping.
Data Transformation : From Stream<T> to Stream<R> | Data Transformation : From Stream<Stream<T> to Stream<R>
Use this method when the mapper function is producing a single value for each input value. | Use this method when the mapper function is producing multiple values for each input value. 
- Optional Class


