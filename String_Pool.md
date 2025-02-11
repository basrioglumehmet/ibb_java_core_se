# String Pool in Java

## What is String Pool?
String Pool in Java is a special memory region in the heap that stores string literals. When a string literal is created, Java checks whether an identical string already exists in the pool. If it does, a reference to the existing string is returned instead of creating a new object, thereby optimizing memory usage.

## How String Pool Works
1. When a string literal is created, Java checks the String Pool for an existing instance.
2. If the string is found, the existing reference is returned.
3. If not, a new string object is created and added to the pool.
4. Strings created using the `new` keyword do not use the pool by default, but they can be added manually using the `intern()` method.

## Example
```java
public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = s3.intern();

        System.out.println(s1 == s2); // true (same reference from pool)
        System.out.println(s1 == s3); // false (different objects)
        System.out.println(s1 == s4); // true (s4 is interned, points to pool)
    }
}
```

## Benefits of String Pool
- **Memory Efficiency**: Reduces memory consumption by reusing immutable string objects.
- **Performance Optimization**: Reduces the number of objects created, improving efficiency.

## When to Use `intern()`
If a string is created using `new String()`, it resides in the heap and not in the pool. To store it in the pool and get its reference, use `intern()`:
```java
String s = new String("Java").intern();
```

## Conclusion
The String Pool mechanism in Java helps optimize memory usage by reusing immutable string literals. Understanding how it works is essential for efficient Java programming.
