import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        int last = num%10;
        for (int i=10; i<num*10; i = i*10){
            String numStr = ""+num;
        }
    }
    public boolean isStrictlyIncreasing()
    {
        //implemented in part (b)
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
