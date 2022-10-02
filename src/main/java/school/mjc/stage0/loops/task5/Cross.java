package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int crossingPoint = sideLength/2;
        if(sideLength%2==1)
            crossingPoint++;
        for(int x = 1; x<=sideLength; x++)
        {
            for(int y = 1; y<=sideLength; y++)
            {
                if(x == crossingPoint)
                    System.out.print(8);
                else if(y == crossingPoint)
                    System.out.print(8);
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
