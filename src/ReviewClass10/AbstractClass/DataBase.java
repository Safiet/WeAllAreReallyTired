package ReviewClass10.AbstractClass;
public abstract  class DataBase {
 public abstract void readFromDataBase(String databaseName);
    public abstract void writeFromDataBase(String databaseName);
    public abstract void modifyFromDataBase(String databaseName);
}
class OracleDatabase extends DataBase{

    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are Oracle experts we have provided the implementation"+ " Reading data from OracleDataBase");
    }
    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("we are Oracle experts we have provided the implementation"+ " Write data from OracleDataBase");
    }
    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("we are Oracle experts we have provided the implementation"+ " Modify data from OracleDataBase");
    }
}
class MicrosoftDataBase extends DataBase{
    @Override
    public void readFromDataBase(String databaseName) {
        System.out.println("we are Microsoft experts we have provided the implementation"+ " Reading data from OracleDataBase");
    }
    @Override
    public void writeFromDataBase(String databaseName) {
        System.out.println("we are Microsoft experts we have provided the implementation"+ " Write data from OracleDataBase");
    }
    @Override
    public void modifyFromDataBase(String databaseName) {
        System.out.println("we are Microsoft experts we have provided the implementation"+ " Modify data from OracleDataBase");
    }
}
abstract class IBMDataBase extends DataBase{

}