package Assignment.Module1Basics;

public class EncapsulationPrivate {
    private String Name;
    private int Id;
    public void SetName(String Name) {
        this.Name = Name;
    }
    public void SetId(int Id) {
        this.Id = Id;
    }
    public String getName(){
        return this.Name;
    }
    public int getId(){
        return this.Id;
    }
}
