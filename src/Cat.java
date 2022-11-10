public class Cat {
    private String name;
    private static int m=0;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }


    public static void main(String[] args) throws Throwable {
        for (int i = 0 ; i < 1000000; i++) {

            Cat cat = new Cat();
            //cat = null;//вот здесь первый объект становится доступен сборщику мусора
        }
        System.out.println("m="+m);
    }

    @Override
    protected void finalize() throws Throwable {
        m-=1;
        System.out.println("Объект "+name +" уничтожен!"+m);
    }

}
