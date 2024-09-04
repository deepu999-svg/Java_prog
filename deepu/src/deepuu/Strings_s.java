package deepuu;

import java.util.Arrays;

public class Strings_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1="deepak";
			String s3 ="deeepak";
			String s4=new String("Deepak");
			String s2=new String("Farooq");
			//the above two are two methods of creating strigs
			String s11="deepak reddy";
			System.out.println(s11.length());//12
			System.out.println(s11.charAt(5));//k
			System.out.println(s11.isEmpty());//false
			System.out.println(s11.isBlank());//false
			//s.nextLine.charAt(0); gives the charector at run time
			System.out.println(s11.startsWith("deepak"));//true
			System.out.println(s11.startsWith("eep",1));//true
			//check a sub string starting from a certain index
			System.out.println(s11.endsWith("ddy"));//true
			System.out.println(s11.substring(7));//reddy
			System.out.println(s11.substring(3,9));//3 to 8 gives
			// pak re
			System.out.println(s11.concat(s2));//deepak reddy farooq
			System.out.println(s11.replace('e','a'));
			System.out.println(s11.contains("eep"));
			System.out.println(s11.replaceFirst("ee","gg"));//dggpak reddy
			System.out.println(s11.replaceAll("[ep]","gg"));//dggggggak rggddy
			
			String s33="hi:my:name:is:deepak";
			String[] s44=s33.split(":");
			System.out.println("the split string"+Arrays.toString(s44));
			System.out.println(s4);
			System.out.println(s4.toString());//deepak
			
			System.out.println(s33.toString());//giving adress
			for(String gg:s44)
			{
				System.out.println(gg);
			}
			String f= "Deepu".trim();
			System.out.println(f);
			System.out.println(s1.compareTo(s3));//11 gives positive value
			System.out.println(s1.compareToIgnoreCase(s3));//11 gives positive value
			System.out.println(s1.equals(s3));//false
			System.out.println(s1.equalsIgnoreCase(s3));//false
			
			
			
			
			
			
			
			
	}

	
}