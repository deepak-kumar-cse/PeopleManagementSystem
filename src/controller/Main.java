package controller;

import people.CEO;
import people.Manager;

public class Main {
    public static void main(String[] args) {

//        Controller controller=new Controller();
        /*System.out.println(Manager.class.toString());
        System.out.println(Manager.class.getName());
        Manager m=CEO.createManager("deepak", "d", "d", "d");

        System.out.println(m.getClass().toString());*/
        uploadInitialData();
        new Controller().mainMenu();;


    }

    public static void uploadInitialData(){
        CEO.createCEO("Deepak kumar", "Male", "07.08.2000", "Bihar");
        CEO.createManager("fahim", "Male", "11.11.2006", "Pondicherry");
        CEO.createManager("Mauli", "Male", "12.11.2006", "Chennai");
        CEO.getCEO().getAllManager().get(2).addFTEmployee("ashish", "Male", "4.5.34", "kashmir");
        CEO.getCEO().getAllManager().get(2).addFTEmployee("matriarchal arun", "Male", "4.5.34", "tamilNadu");
        CEO.getCEO().getAllManager().get(2).addIntern("owis", "Male", "4.5.34", "kashmir");
        CEO.getCEO().getAllManager().get(3).addFTEmployee("harish", "Male", "4.5.34", "tamilNadu");
        CEO.getCEO().getAllManager().get(3).addIntern("Bhuvana", "Female", "6.3.34", "kerala");
        CEO.getCEO().getAllManager().get(3).addIntern("akash", "Female", "4.5.34", "andhra");

    }
}
