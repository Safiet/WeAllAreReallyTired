package reviewclass4;

public class Recap {

	public static void main(String[] args) {
		

		int i=10;
		System.out.println("int i=10; \n"+i);
		i=i+20;
		System.out.println("int i=10; \n"+i);
		i+=10;
		System.out.println("int i=10; \n"+i);
		i++;
		System.out.println("int i=10; \n"+i);
        ++i;
        System.out.println("int i=10; \n"+i);
        
        System.out.println("int i=10; \t"+i);
        //10 30 40 41 42
        
        i=10;
        System.out.println("++i "+(++i+(++i))); // (10+1)+(11+1)=11+12=23  / first increment the value then use it
        System.out.println("i++ "+(i+++i++)); //23+1+1=25   /first use the value then increment
        System.out.println("i "+i);//in the next line updated value will reflect in i
	}

}
