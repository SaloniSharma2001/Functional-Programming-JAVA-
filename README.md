# Functional-Programming-JAVA-

**Why Lambda functions ?**

- Enables functional programming 
- Readable and concise code
- Easier-to-use APIs and libraries
- Enables support for parallel processing

  Inline values we used to assign before java 8 but in java 8 we can assign function as value

`aBlockOfCode = public void perform(){
                System.out.pritnln("Hello World!");
                }`

  But lamda doedn't need methods return type or public or the name. It's smart enough for understanding those, it just uses -> expression and line of code

`aBlockOfCode =() -> {
                System.out.pritnln("Hello World!");
                }`

A function without access modifier, name and return type can be representes as lambda expression and can be assigned to a variable as given above.
Now for one line of code we don't need parentheses and hence the above code can be written as 

`aBlockOfCode =() -> System.out.pritnln("Hello World!");`

`geetingFunction = () -> System.out.println("Hello World!");`

Since we have assigned the method to a variable, we can now pass this variable anywhere.

`greets("greetingFunction");`
We can pass lambda function as an inline arguments as well
`greets(() v-> System.out.println("Hello World!"));`

`doubleNumberFunction = public int double(int a) { return a * 2;}`

Getting rid of modifier
`doubleNumberFunction =  int double(int a) { return a * 2;}`

Getting rid of name because we shall be reffring it with the variable name
`doubleNumberFunction =  int (int a) { return a * 2;}`

Getting rid of return type because compiler will understand it with return statement as well as removing parentheses as we don't need parenteses for single line statement adding lambda ->
`doubleNumberFunction = (int a)  ->  return a * 2;`

We can now remove return statement here as well
`doubleNumberFunction = (int a)  ->  a * 2;`

It is actually invalid to specidy the return keyword when you have a one-liner lambda expression without {}!

`addFunction = int(int a , int b) -> a + b;`

`safeDivideFunction = (int a, int b) -> { 
if(b==0) return 0;
    return a/b;
};`

`stringLengthCountFunction = (String s) -> s.length();`

Watch lec 8 for lambda basics

Greeting with lambda function:
`Greeting lambdaGreeting = () -> System.out.println("Hello World");`

Greeting with anonymous class

`Greeting innerClassGreeting = new Greeting(){
public void perform(){
System.out.println("Hello World!");
}};
innerClassGreeting.perform();`

`public class greet(Greeting greeting){
greeting.perform();
}`
`greeter.greet(lambdaGreeting);
greeter.greet(innerClassGreeting);
`

Lambda do use anonymous way to use a class.

_What is a functional interface?_

In Java 8, we can have methods implemented in interface itself. Now we can have an interface which jave 3 methods out which two of them will have default implementation and one abstract method. Still that interface will have one abstract method
 


