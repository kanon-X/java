class AddNum{
    int a,b;
    public AddNum(int x, int y){
        a=x;    
        b=y;
    }
    public void sum(){
        int c = a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        AddNum obj = new AddNum(10,20);
        obj.sum();
    }
}