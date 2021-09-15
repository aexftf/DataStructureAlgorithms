package leetcode;

/**
 * @author Administrator
 */
 class Test {


     static class Singleton{
        private Singleton() {
        }
        private final static Singleton instance=new Singleton();
        public static Singleton getInstance(){
            return instance;
        }




    }

    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton S2=Singleton.getInstance();
        System.out.println(s1==S2);
    }
}
