# java-8

Lambda
	- Anonymous Function
	- Not having any name
	- Not having any return type
	- Not having any modifiers
	- Only applicable on Functional Interface 
Lambda Vs Anonymous Inner Class

Functional interface
	- Only Single Abstract Method (SAM)
	- Might have any number of default method
	- Might have any number of static method

Default Method

Static Method

Interface Vs Abstract class

Predefined FI (java.util.function)
	1. Predicate<T>
	- To implement conditional check, we should go for Predicate
	- SAM = boolean test(T t);
	- Default method = and, or, negate
	- Input any type but output(return) type boolean always
	
	2. Function<R,T>
	- To perform certain operation and to return some result, we should go for Function 
	- Input any type but output(return) also any type
	- SAM = R apply(T t)
	
	3. Consumer<T>
	- Input any type but no output(return)
	- SAM =  void accept(T t)
	
	4. Supplier<R>
	- No Input but output any type(return)
	- SAM = R get()

 
