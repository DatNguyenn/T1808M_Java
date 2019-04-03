package Exam;


public class ArrayHotel {
    public String Name;
    public String Location;
    public String OwnerName;

    public ArrayHotel() {
    }

    public ArrayHotel(String name, String location, String ownerName) {
        Name = name;
        Location = location;
        OwnerName = ownerName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
