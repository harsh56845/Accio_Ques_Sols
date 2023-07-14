// Ques Link :- https://course.acciojob.com/idle?question=22a60f29-973c-49c9-b1d4-358964ea886c
import java.util.*; 

// write your code here
class MyBook{
	private String title;
	void setTitle(String title){
		this.title = title;
	}
	String getTitle(){
		return title;
	}
}

public class Main{

    public static void main(String []args){
      
        //Book new_novel=new Book();  Abstract cass cannot be instantiated like this
        Scanner sc = new Scanner(System.in);
        MyBook new_novel=new MyBook();
        new_novel.setTitle("Hanuman Chalisa");
        System.out.println("The Title is: "+new_novel.getTitle());

    }
}
