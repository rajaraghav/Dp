import java.util.*;

public class StringPermWithoutDups {
    private Queue<String> queue= new LinkedList();
    int stringSize;
    String str;
    void updateSetWithPermutations(String s){
        str = s;
        stringSize = str.length();
        queue.add(Character.toString(str.charAt(0)));
        updateSetWithPermutationsHelper(1,str.charAt(1));
    }

    private void updateSetWithPermutationsHelper(int currentPos, char currChar)
    {


        int i=0;
        int currQueueSize = queue.size();
        while(i<currQueueSize)
        {
            String currStr = queue.poll();
            int j=0;
            while(j<=currentPos)
            {
                StringBuilder newPerm = new StringBuilder(currStr);
                newPerm.insert(j,currChar);
                queue.add(newPerm.toString());
                j++;
            }
            i++;
        }
        if(currentPos+1==stringSize)return;
        updateSetWithPermutationsHelper(currentPos+1,str.charAt(currentPos+1));
    }

    void printSet()
    {
        for(String s:queue)
            System.out.println(s);
    }
}
