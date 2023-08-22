class hotel{
    int idli;
    int chutni;
    int dosa;
}

public class class_Methods {
    public static void main(String[]args){
        hotel ramesh=new hotel();
        hotel suresh=new hotel();

        ramesh.chutni=10;
        ramesh.dosa=20;
        suresh.dosa=20;

        System.out.println(ramesh.dosa);
        System.out.println(suresh.idli);
    }
}