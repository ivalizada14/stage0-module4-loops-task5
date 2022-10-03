package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        System.out.println(8);
        for(int x = 2; x<= cathetusLength; x++)
        {
            for(int y = 1; y<=x; y++)
            {
                System.out.print(8);
            }
            System.out.print('\n');
        }
    }
}
