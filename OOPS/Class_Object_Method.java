package com.OOPS;
// Class_Object program slight variation
class Box {
    static int countBox;   // static variable for count the boxes
    static{
        countBox=0;
    }
    static void displayBox(){
        System.out.println("Box count is "+countBox);
    }

    private int length;
    private int breath;
    private int height;
    Box(int l, int b, int h) {   // creating constructor
        length = l;
        breath = b;
        height = h;
        countBox++;
    }
    Box(Box b1){                // for object passing
        this.length=b1.length;
        this.breath=b1.breath;
        this.height=b1.height;
        countBox++;
    }
    void setVal(int l, int b, int h) {
        this.length = l;   //this pointer using  (it is not necessary)
        breath = b;
        height = h;
    }
    int showLen(){
        return length;
    }
    int showBrea(){
        return breath;
    }
    int showHei(){
        return height;
    }
    int volume() {
        int vol= length * breath * height;
        return vol;
    }

    Boolean isEqual(Box b){
        if(length==b.length && breath==b.breath && height== b.height)
            return true;
        return false;
    }

    Box doubleBox(){       // return object
        Box temp=new Box(2*length,2*breath,2*height);
        return temp; // object
    }
}


public class Class_Object_Method{
    public static void main(String[]args){
        Box box1=new Box(1,2,3);
        System.out.println("voulme of box1 is " + box1.volume());
        box1.setVal(10,20,30);      // values pass through invoking methods (for change values)
        System.out.println("voulme of box1 is (after change) " + box1.volume());

        Box box2=new Box(4,5,7);
        box2.setVal(10,6,20);
        System.out.println("voulme of box2 is " + box2.volume());

        Box box3=new Box(5,10,7);  // passing arguments in (using) constructor (for storing)
        System.out.println("voulme of box3 is " + box3.volume());
        System.out.println("breath of box3 is  "+box3.showLen());


        Box box4=new Box(box1);    // passing constructor as a argument
        System.out.println("copied values : "+box4.showLen()+" "+box4.showBrea()+" "+box4.showHei());
        System.out.println("check Eqaul :"+ box4.isEqual(box3));

        Box box5;  // box5 object is created
        box5=box1.doubleBox();                  // box1 doubled and returned

        System.out.println("doubleTheBox : "+box5.showLen()+" "+box5.showBrea()+" "+box5.showHei());

        System.out.println(Box.countBox); //print box count call static variable

        Box.displayBox();       // by calling static method



    }
}