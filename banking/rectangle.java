public class rectangle {
    public float width;
    public float height;
    public void area(float height,float width){
        double s= height*width;
        System.out.println(s);
    }
    public float perameter(int base){
        return(height+width+base);
    }
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.height=74;
        r.width=45;
        r.area(41,74);
        System.out.println(r.perameter(21));
    }
}
