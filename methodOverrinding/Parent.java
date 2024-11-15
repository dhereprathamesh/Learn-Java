
//for override method this condition should be necessary
//argument same 
//method name same
// return type same 
// co-varient return are allowed


class Parent {

public void m1(){

//overriden method
System.out.println("I am m1() of parent");
}

class child extends Parent {

//overriding method
public void m1(){
System.out.println("I am m1 of child");
};
}

public static void main(String[] args) {
	Parent newObject = new Parent();
	
	newObject.m1();
 }
} 