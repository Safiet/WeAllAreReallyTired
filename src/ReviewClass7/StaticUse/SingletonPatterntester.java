package ReviewClass7.StaticUse;

public class SingletonPatterntester {
   // Singletonpattern Singletonpattern=new Singletonpattern();

    public static void main(String[] args) {

        Singletonpattern singletonpattern = Singletonpattern.getObj();
        Singletonpattern.getObj();
        Singletonpattern.getObj();
        Singletonpattern.getObj();
        System.out.println(Singletonpattern.sum);

    }

}
