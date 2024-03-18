# Functional interface
------------------------------------------
	- Only Single Abstract Method (SAM)
	- Might have any number of default method
	- Might have any number of static method

# Predefined Functional Interface

Stream	- Processing & filtering data over different data sources
    - support aggregate operations
FI - Predicate	input = Yes, output = Yes but only Boolean    || method - test()   || e.g. filter(predicate)
FI - Function	input = Yes, output = yes                     || method - apply()  || e.g. list.stream().map(function)
FI - Consumer	input = Yes, output = No                      || method - accept() || e.g. list.stream().forEach(consumer)
FI - Supplier	input = No,  output = Yes                     || method - get()    || e.g. list.stream().findAny().get()
    
------------------------------------------
# FI - Predicate

Example: filter(predicate)
    list.stream().filter(e -> e > 5 ).collect(Collectors.toList());

------------------------------------------
# FI - Function

Example: map(Function)
Function<Customer, String> func = e ->  e.getName();
    list.stream().map(func).collect(Collectors.toList()).forEach(e -> System.out.println(e));

------------------------------------------
# FI - Consumer

Example: forEach(Consumer)
    list.stream().forEach(e -> sout(e));
    
------------------------------------------
# FI - Supplier

Example: get()
    list.map(e -> e).reduce((a,c) -> a+c).get();
