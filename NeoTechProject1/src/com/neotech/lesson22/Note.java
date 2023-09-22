package com.neotech.lesson22;

//
//Recap: 
//	what is inheritance?
//	- the process when a child/sub/derived class inherits featuers or behaviors 
//	from a parent/super/base class
//
//	why is inheritance important?
//	- you can write more with less code (eleminate code redundancy)
//	- reusing code
//	
//	what types of inheritance are there?
//	- single
//	- hierarchical
//	- multilevel
//	- multiple inheritance
//	
//	What is the parent of all Java classes?
//	- Java OBJECT class
//	
//	
//	Be careful: 
//	1. private members are NOT inherited
//	2. default member of a super class is not reachable from a subclass in another package
//	
//	Are constructors inherited???
//	NO!
//	
//	
//	this ---> access parameters within the class
//	super --->  access parameters of the super class
//
//	this()	---> access a specific constructor of the same class
//	super()	----> access a specific constructor of the super class
//
//	if we do not use super() in the child classes, java itself makes a call to the 
//	default constructor of the super class (super() )
//	typically, we will use super() in case we want to call a parametrized constructor
//	of the parent class
//
//	
//	Method Overloading: 
//	A java feature that allows to have multiple methods with the same name within the same class.
//	
//	How can we achieve it?
//	1. Having a different number of parameters.
//	2. Having different types of parameters.
//	3. Having a different order of parameters.
//	**changing the return type does not differentiate the methods!!!
//	
//	What can we overload?
//		- methods()
//		- constructors()
//	
//
//
//How can you learn the execution flow better (Car.java - SportsCar.java)?
//1. create 2-3 classes with inheritance and with simple default constructors
//2. debug them step by step (to see which constructors are executed)
//3. add parametrized constructors 
//4. step 2 again
//5. make some changes in the constructor (using this, super, this(), super())
//6. step 2 again
//}
