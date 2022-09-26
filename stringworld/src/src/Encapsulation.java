public class Encapsulation {


        private String name;
        public int age;
        public int getage() {
            return age;
        }
            public  void setage(int a){
                this.age=a;
            }
            public String getname(){
            return name;
        }
               public void setname(String n){
            this.name=n;
        }
    public static void main(String[] args){
            Encapsulation obj=new Encapsulation();
            obj.setage(22);
            obj.setname("Arunim");
            System.out.println(obj.getname()+" "+obj.getage());
    }
}
