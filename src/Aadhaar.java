import java.util.Date;

public class Aadhaar{
    int id;
    Date dob;
    String name;
    public Aadhaar(long id, Date dob, String name){
        this.id= (int) id;
        this.dob=dob;
        this.name=name;
    }

}