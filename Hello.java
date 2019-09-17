public class Hello {

    public static boolean isLeapYear(int year){

        return((year%4 ==0) && (year%100!=0) || (year %400 == 0));


    }





    public static void main(String[] args){

	System.out.print("Hello World \n");


	for(int i=0; i<args.length; i++){

	    System.out.print(args[i] + "\n");

	}

	for(String s: args){

	    System.out.print(">" + s + "\n");

	}

    }

}
