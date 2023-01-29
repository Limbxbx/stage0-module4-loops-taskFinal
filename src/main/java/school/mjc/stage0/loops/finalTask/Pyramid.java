package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            for(int j = 1; j <= cathetusLength-i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for(int k = i-1; k >= 1; k--){
                System.out.print(i-k+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
