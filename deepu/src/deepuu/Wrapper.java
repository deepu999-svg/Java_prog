package deepuu;

public class Wrapper {

	public static void main(String[] args) {
		int num=10;
		Integer i=new Integer(num); //old method boxing
		Integer i1=num;// auto boxing
		int num2=i.intValue();//unboxing
		int num3=i1;//auto unboxing
		}
}
