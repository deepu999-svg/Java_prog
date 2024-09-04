package deepuu;

public class Decoder {
    
    public static void main(String[] args) {
        String h = "45g-87k-25zw";
 	 h = h.replaceAll("[abc]", "2")
                     .replaceAll("[def]", "3")
                     .replaceAll("[ghi]", "4")
                     .replaceAll("[jkl]", "5")
                     .replaceAll("[mno]", "6")
                     .replaceAll("[pqrs]", "7")
                     .replaceAll("[tuv]", "8")
                     .replaceAll("[wxyz]", "9");
	
		 System.out.println(h);
        }}