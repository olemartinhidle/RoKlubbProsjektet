package main.classes;


public class Athlete {
    int AthleteID;
    String Name;
    String Last_Name;
    String PhoneNumber;


    public void setId(int AthleteID) {
    }
    public int getID() {

        return AthleteID;
    }
    public void setName(String Name) {
    }

    public String getName() {

        return Name;
    }


    public void setLastName(String Last_Name) {
    }

        public String getLast_Name() {

        return Last_Name;
        }

    public void setNumber(String PhoneNumber) {
    }

        public String getNumber() {

        return PhoneNumber;
        }

    public void add(Athlete athlete) {
    }

    public String toString() {

        return String.format("AthleteID %s, Name %s, Last_name %s, Phonenumber %s", AthleteID, Name, Last_Name, PhoneNumber);

}
}