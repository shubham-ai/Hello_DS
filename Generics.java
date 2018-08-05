// A Simple Java program to show working of user defined
// Generic classes

class Generics<T>{
	T obj;
	Generics (T obj) {
		this.obj = obj;

	}// constructor
	public T getObject() { 
		return this.obj;
	}
	
}

class Main{
	public static void main(String[] args){
		Generics <Integer> myIntegerObj = new Generics<Integer>(15);
		System.out.println("obj "+ myIntegerObj.getObject());

		Generics <String> myStringObj = new Generics<String>("osm");

		System.out.println(myStringObj.getObject());
	}
}