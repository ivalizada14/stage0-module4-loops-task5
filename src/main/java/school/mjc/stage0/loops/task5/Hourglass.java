package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int mid = height/2;
        if(height%2==1)
            mid++;
        for(int x = 1; x<=height; x++)
        {
            for(int y = 1; y<=height; y++)
            {
                if(x<=mid)
                {
                    if(y>=x&&y<=height-x+1)
                        System.out.print(8);
                    else
                        System.out.print(' ');
                }
                else
                {
                    if(y>=height-x+1&&y<=x)
                        System.out.print(8);
                    else
                        System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }
}
