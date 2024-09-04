package deepuu;

public class Buffer {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer();

		System.out.println(s1.capacity());
		s1.append(" Java & Python are my fav ");
		s2.append(" But python is alot easier ");
		System.out.println(s1.capacity());
		s1.insert(0, ":)");
		System.out.println(s1.toString());
		
		System.out.println(s2.reverse());
		s1.delete(0, 9);
		System.out.println(s1.toString());
		System.out.println(s1.reverse());
		

	}

}
