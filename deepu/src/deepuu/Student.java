package deepuu;


public class Student {
		String name;
		String id;
		float price;
		int qnty;
		
		 Student(String sname,String sid,float sprice,int sqty)
		{
			this.name=sname;
			this.id=sid;
			this.price=sprice;
			this.qnty=sqty;
		}
		 void diaplay()
		 {
			 System.out.println( this.name+"\t"+this.id+"\t"+this.price+"\t"+this.qnty);
		 }
	public static void main(String[] args) {
		Student s1=new Student("pencil","kaf2943jc",5.7f,10);
		Student s2=new Student("pen","fdnd55h45",8.6f,30);
		s1.diaplay();
		s2.diaplay();

	
		
		}

}
