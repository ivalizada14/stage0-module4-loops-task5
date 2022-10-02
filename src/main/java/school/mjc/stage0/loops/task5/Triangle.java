package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        System.out.println(8);
        for(int x = 2; x<= cathetusLength; x++)
        {
            for(int y = 1; y<=x; y++)
            {
                if(x == cathetusLength)
                    System.out.print(8);
                else
                {
                    if (y==1 || y == x)
                        System.out.print(8);
                    else
                        System.out.print(' ');
                }
            }
            System.out.print('\n');

        }
    }
}
