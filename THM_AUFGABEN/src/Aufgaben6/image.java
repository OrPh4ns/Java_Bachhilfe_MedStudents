package Aufgaben6;
public class image {

    int h;
    int b;
    int[][] xiny;
    public image(){
        this.h = 10;
        this.b = 10;
        xiny = new int[this.h][this.b];
    }
    public image(int h, int b){
        this.b = b;
        this.h = h;
        xiny = new int[this.h][this.b];
    }
    public void setH(int h){
        this.h = h;
    }
    public  void setB(int b){
        this.b = b;
    }
    public int getH(){
        return this.h;
    }
    public int getB(){
        return this.b;
    }
    public void setXiny(String what) {
        for (int i = 0; i < this.h && i < this.b; i++) {
            for (int j = 0; j < this.h; j++) {
                if (what.equals("cross")) {
                    if (j == 4 || j == 5 || i == 2 || i == 3) {
                        this.xiny[i][j] = 1;
                    }
                } else {
                    this.xiny[i][j] = 1;
                }
            }
        }


    }

    public void getXiny() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(this.xiny[i][j]);
            }
            System.out.println();
        }
    }

}
