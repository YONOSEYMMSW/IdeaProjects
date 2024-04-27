import java.util.ArrayList;
public class StringArrayClass {

   private ArrayList<String> myarraylist = new ArrayList<>();


public void addAsante( String Asante){
    myarraylist.add(Asante);
}
    public void removeDaija( String Daija){
        myarraylist.remove(Daija);
    }

    public int getSizeOfmyarraylist(){
        return myarraylist.size();
    }

    public void getElementOfmyarraylist(){
        for(String x : myarraylist){
            System.out.printf("%s\n", myarraylist);
        }

    }}









