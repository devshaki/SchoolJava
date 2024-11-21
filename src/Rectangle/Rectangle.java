package Rectangle;

public class Rectangle {
    private int height,width;
    public Rectangle(int height,int width){
        setHeight(height);
        setWidth(width);
    }
    public Rectangle(){
        setHeight(10);
        setWidth(10);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    public void setWidth(int width) {
        if (width >0){
            this.width = width;
        }
    }

    public int scope(){
        return this.height*2+this.width*2;
    }

    public int area(){
        return height*width;
    }
    public void print(char tav){
        for (int i = 0;i <height;i++){
            for(int j = 0; j < width;j++){
                System.out.print(tav);
            }
            System.out.println();
        }
    }
    public void print(){
        print('*');
    }
}
