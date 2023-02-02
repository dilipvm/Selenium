package project1;

public class Typecounter {

		public static void main(String[] args) {
	        String str = "Give me 20.0 ruppess or a 10";// char is a only and string are give me ruppes or 
	        String[] array = str.split("\\s", -1);
	        int chars = 0;
	        int strings = 0;
	        int ints = 0;
	        int doubles = 0;
	        for (int i=0; i<array.length; i++){
	            if(array[i].matches("[a-zA-Z]+")){
	                if(array[i].length() == 1){
	                    chars = chars + 1;
	                }
	                else{
	                    strings = strings + 1;
	                }
	            }
	            if(array[i].matches("[0-9]+")){
	                ints = ints + 1;
	            }
	            if(array[i].matches("[+-]?\\d+\\.?(\\d+)?")){
	                doubles = doubles + 1;
	            }
	        }
	        doubles = doubles - ints;
	        
	        System.out.println("chars: "+ String.valueOf(chars));
	        System.out.println("strings: "+  String.valueOf(strings));
	        System.out.println("ints: "+ String.valueOf(ints));
	        System.out.println("doubles: "+ String.valueOf(doubles));
	    }
	}


