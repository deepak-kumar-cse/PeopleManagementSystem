package people;

import java.util.HashMap;

public class CEO extends People{
    public static CEO currentCEO;
    ///since there will be only one CEO, so we can use static field
    public  static HashMap<Integer, Manager> allManager=new HashMap<>();

    public CEO(String name, String gender, String  DOB,String address) {
        super(name, gender, DOB, address);

    }
    public static boolean createCEO(String name, String gender, String DOB, String address){
        if(CEO.currentCEO==null){
            currentCEO=new CEO(name, gender, DOB, address);
            return true;
        }
        else return false;
    }
    public static boolean isCEOAssigned(){
        return CEO.currentCEO!=null;
    }
    public static Manager createManager(String name, String gender, String DOB, String address){
        return createManager(new Manager(name, gender, DOB, address));
    }
    public static Manager createManager(Manager manager){
        People.allPeople.put(manager.getId(), manager);
        CEO.allManager.put(manager.getId(), manager);
        return manager;
    }
    public static boolean removeManager(int id){
        ///TODO: to decide the return type of this function
        /////return false if id is not present, else it will be deleted and returned true;
        return CEO.allManager.remove(id)!=null &&
        People.allPeople.remove(id)!=null;
    }

}
