package JV2_Assignment2;

import java.util.ArrayList;

public class PersonModel<T> {
    public ArrayList<T> arrayList= new ArrayList<>();

    public void addInfo(T person){
        if (person instanceof Student){
            arrayList.add(person);
        }
        if (person instanceof Employee){
            arrayList.add(person);
        }
    }
    public void showInfo(){
        for (T obj: arrayList){
            if (obj instanceof Student){
                System.out.println(obj.toString());
            }
            else if (obj instanceof Employee){
                System.out.println(obj.toString());
            }
        }
    }
}
