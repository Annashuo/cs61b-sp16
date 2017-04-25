#### file name = public class name
#### public static void main(String[] args)
#### INPUT tip

---
	import java.util.*;
	Scanner reader = new Scanner(System.in);
	int y = reader.nextInt();
	float x = reader.nextfloat();
---

#### input by command line

---
	public static void main(String[] args){
		int y = Integer.parseInt(args[0]);
	}
	
#### **non-static vs. static**: 
	- Static methods are invoked using the class name
	- Non-static methods are invoked using the instance name, not the class name
	- Static methods cannot access instance variables directly. It must access instance variables via a specific instance
	
	If the method is going to be invoked by an instance of the class(类实例), then it should be non-static. If you need to use any instance variables(实例变量), the method should be non-static.
	
#### Array of Objects(use "new" twice)

---
	Dog[] dogs = new Dog[2];
	dogs[0] = new Dog(8);
	dogs[1] = new Dog(20);

#### primitive types and reference type

8 primitibe types in java: byte, short, int, long, float, double, boolean, char
reference types: class, array

#### declaration and instantiation and assignment of arrays
- declaration: int[] a;
- instantiation: new int[]{0,2,1,9,4};
- assignment: int[] a = new int{0,2,1,9,4};

#### null
java allows null references. Null references do not have instance variables.

