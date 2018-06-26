import java.util.HashMap;

public class TripleStep {

    int hops[];
    int totalStairSteps;
    HashMap<Integer,Integer> map = new HashMap<>();
    public void setStep(int[] hops)
    {
        this.hops = hops;
    }

    public int countWays(int stairSteps)
    {
        this.totalStairSteps = stairSteps;
        for(int i=1;i<=stairSteps;i++)
        map.put(i,0);

        map.put(stairSteps,1);
        countWaysHelper(stairSteps-1);
        return map.get(1);
    }

    private void countWaysHelper(int currStep)
    {
        if(currStep==0)return;
        int currTotalSteps = 0;
        for(int i:hops)
        {
            if(i+currStep<=totalStairSteps)currTotalSteps+=map.get(currStep+i);
        }
        map.put(currStep,currTotalSteps);

        countWaysHelper(currStep-1);
    }
}
