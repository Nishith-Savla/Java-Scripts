public class HybridInheritanceExample extends MultipleInheritanceExample {

    public static void main(String[] args) {
        HybridInheritanceExample hybridInheritanceExample1 = new HybridInheritanceExample();
        hybridInheritanceExample1.MainInterfaceMethod();
        hybridInheritanceExample1.FirstInterfaceMethod();
        hybridInheritanceExample1.SecondInterfaceMethod();
    }

}

interface FirstInterface {
    public void FirstInterfaceMethod();
}

interface SecondInterface{
    public void SecondInterfaceMethod(); 
}

interface MainInterface extends FirstInterface , SecondInterface {
    public void MainInterfaceMethod();

}

class MultipleInheritanceExample implements MainInterface{
    public void MainInterfaceMethod(){
        System.out.println("Main Interface Method");
    }

    public void FirstInterfaceMethod(){
        System.out.println("FirstInterface Method");
    }

    public void SecondInterfaceMethod(){
        System.out.println("SecondInterface Method");
    }
}
