import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class testvag 
{
    public void add(int budget)
    {
        // HashMap<String,ArrayList<Integer>> paperData = new HashMap<String,ArrayList<Integer>>();
        HashMap<String,Double> totalSum = new HashMap<String,Double>();
        // paperData.put("TOI",{3,3,3,3,3,5,6});
        // paperData.put("Hindu",{2.5,2.5,2.5,2.5,2.5,4,4});
        // paperData.put("ET",{4,4,4,4,4,4,10});
        // paperData.put("BM",{1.5,1.5,1.5,1.5,1.5,1.5,1.5});
        // paperData.put("HT",{2,2,2,2,2,4,4});
        
        totalSum.put("TOI",26.0);
         totalSum.put("Hindu",20.5);
        totalSum.put("ET",34.0);
        totalSum.put("BM",10.5);
        totalSum.put("HT",18.0);
        
        
        for (Map.Entry<String,Double> i : totalSum.entrySet())
        {
            for (Map.Entry<String,Double> j : totalSum.entrySet())
            {
                if(i!=j)
                {
                    if((i.getValue()+j.getValue())<=budget)
                    {
                        System.out.print("{"+i.getKey()+","+j.getKey()+"} ");
                    }
                }
            }
        }
        
        
    }

    public static void main(String[] args)
    {
        testvag g = new testvag();
        g.add(40);
    }
}
