# javaGenerics
Java Generics
1. Why use Generics
2. Generics with primitive type
3. What does "parameterized type" means?
4. Creating custom generics types
5. Inheritance/polymorphism implications
6. Wildcards,upper bound and lower bound
7. Working with static methods

``Simple Generics Implementation``

List<String> list = new ArrayList<>()

``Complex Generics Implementation``

static <T,U extends Comparable<? super U>>
Comparator<T>

# Open Items 
## Type Erasure 
   [Oracle Doc for Type Erasure](https://docs.oracle.com/javase/tutorial/java/generics/erasure.html)
   
## Class file is not bytecode
   [Look Inside Compiled Code with Java Bytecode Decompiler](https://blog.jetbrains.com/idea/2020/03/java-bytecode-decompiler/#:~:text=Open%20the%20necessary%20.,Bytecode%20Viewer%20plugin%20is%20enabled.)

<img width="1440" alt="ByteCode" src="https://user-images.githubusercontent.com/26598629/213910120-24f9ac38-019b-47cd-89c1-dfddbf31265b.png">

