public class inc_dec {
    public static void main (String[] args){
        int x=10;
        System.out.println("original: "+x);
        System.out.println("post-increment: "+(x++));
        System.out.println("After post increment: "+x);
        System.out.println("Pre-increment: "+(++x));
        System.out.println("Post-decrement: "+(x--));
        System.out.println("Pre-decrement: "+(--x));
    }
}
