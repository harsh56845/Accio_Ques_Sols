// Ques Link :- https://course.acciojob.com/idle?question=a8bd2e09-77d2-4a8c-950a-d474a4cc853a
import java.util.*; 

abstract class Animal{
 
    public String name;
    public int numLegs;
    public abstract void speak();
    public abstract void eat();
}

class Dog extends Animal{
	@Override
	public void speak(){
		System.out.println("woof");
	}
	@Override
	public void eat(){
		System.out.println("nom nom");
	}
}


public class Main {
     
      public static void main(String[] args){
            Dog myDog = new Dog();
            myDog.speak();
            myDog.eat();
      }
}
