package Lab4InheritanceAndPackaging.Package1;

public class Package11 {
    public void sum(){
        int a=20,b=30;
        int c=a+b;
        System.out.println("Addiction :"+c);
    }
    public static void main(String[] args){
        Package11 obj=new Package11();
        obj.sum();
    }
}
