package object_related;

class rectangle{
int l,b;
	void area() {
System.out.println("Area of rectangle = "+ l*b );
		
	}
}



public class Object_clone_method {

	public static void main(String[] args ) throws CloneNotSupportedException
	{


		rectangle r1 = new rectangle();//object created 

r1.l=10;
r1.b=15;
r1.area();

rectangle r2=r1; // shallow copy 
	r2.l=20;
	r2.b=40;
	r2.area();
	r1.area();
	
// so here in shallow copy their is only one object and that
//  object have two references one is "r1" and second is "r2"
// these both are pointing to same object . if any reference
// will change it's value will change automatically to the other reference.
	
	
	rectangle r3=new rectangle(); // object created
	r3.l=r1.l;// Deep copy
	r3.b=r1.b;
	r3.area();
	rec r5=new rec();
	rec r4=(rec)r5.clone();
	
// So, here we are creating a new  object "r3" and passing values 
// passing values of "r1" to it . so their re two different objects 
// having different memory space in the(heap).
	

	
	
	}

}
// Here i'm showing how cloning works

class rec implements Cloneable{ //  implements the Cloneable interface.
	int l,b;
	void area() {
System.out.println("Area of rectangle = "+ l*b );
	}
		
protected Object clone()throws CloneNotSupportedException
{  
return super.clone();  
}  

	}
	

 
