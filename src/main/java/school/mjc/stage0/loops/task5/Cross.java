package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int crossingPointX = sideLength/2, crossingPointY = sideLength/2;
        if(sideLength%2==1)
            crossingPointY++;
        for(int x = 1; x<=sideLength; x++)
        {
            for(int y = 1; y<=sideLength; y++)
            {
                if(x == crossingPointX)
                    System.out.print(8);
                else if(y == crossingPointY)
                    System.out.print(8);
                else
                    System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
