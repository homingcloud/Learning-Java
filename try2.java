class try2{
    static int x=5;

    public static Integer getx(){
        return x;
    }
    public static void setx(int x){
        try2.x=x;
    }
    public static void main(String[] args){
        try2 completed=new try2();
        System.out.println(completed.x);
        System.out.println(5+completed.x);
        

        
        
        try1 second=new try1();
        System.out.println(second.getx());
        try1 third=new try1();
        third.setx(try2.x);
        second.setx(1);
    }
}
