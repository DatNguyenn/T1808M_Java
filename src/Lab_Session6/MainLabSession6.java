package Lab_Session6;

public class MainLabSession6 {
    public static void main(String[] args){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.insertPhone("dat","0165344993");
        phoneBook.insertPhone("dat1","0984531079");
        phoneBook.removePhone("abc");
        phoneBook.updatePhone("dat","0375344993");
        phoneBook.searchPhone("dat");
        phoneBook.sort();
    }
}
