
import java.util.LinkedHashMap;
import java.util.Map;

public class RobotInAGrid {
    private int[][] grid;
    private Map<Cord,Block> map = new LinkedHashMap<>();

    RobotInAGrid(int[][] gr){

     grid=gr;

    }

    void findPath()
    {
        Cord curr =new Cord(0,0);
        Cord dest = new Cord(this.grid.length-1,this.grid[this.grid.length-1].length-1);
        findPathHelper(dest,dest,0,curr);
        System.out.println(curr.x+" "+curr.y);
        while (true)
        {
            Block parent = map.get(curr);
            System.out.println(parent.parent.x+" "+parent.parent.y+" "+parent.distance);
            if(parent.parent==dest)break;
            curr=parent.parent;
        }
    }
    private void findPathHelper(Cord curr,Cord parent,int dist,Cord source)
    {
        if(curr.x==0&&curr.y==0){
            if(!map.containsKey(source))
            map.put(source,new Block(dist,parent));
            return;
        };
        if(grid[curr.x][curr.y]==1)return;
        if(!map.containsKey(curr))
            map.put(curr,new Block(dist,parent));
        else if(map.get(curr).distance>dist)map.put(curr,new Block(dist,parent));

        if(curr.x>0)findPathHelper(new Cord(curr.x-1,curr.y),curr,dist+1,source);
        if(curr.y>0)findPathHelper(new Cord(curr.x,curr.y-1),curr,dist+1,source);
    }
    private class Block{
        int distance;
        Cord parent;

        Block(int distance,Cord curr)
        {
            this.distance=distance;
            parent = curr;
        }
    }
    private class Cord{
        int x;
        int y;

        Cord(int x,int y){this.x=x;this.y=y;}
    }
}

