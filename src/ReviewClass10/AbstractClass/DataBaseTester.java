package ReviewClass10.AbstractClass;

import ReviewClass10.AbstractClass.DataBase;
import ReviewClass10.AbstractClass.MicrosoftDataBase;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MicrosoftDataBase();
        dataBase.readFromDataBase("Database1");
        dataBase.writeFromDataBase("Database1");
        dataBase.modifyFromDataBase("Database1");
        // DataBase dataBase1=new DataBase(); cant create the object of abstract class
    }
}
