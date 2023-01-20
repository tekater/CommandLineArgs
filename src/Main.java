public class Main {
    public static void main(String[] args) {
        //int i = Integer.parseInt(args[0]);
        //System.out.println(i);

        // Ограниченное число аргументов

        // Вариант 1
        //System.out.println(args[0] + " = " + args[1]);
        //System.out.println(args[2] + " = " + args[3]);

        // Вариант 2
        //System.out.printf("%s=%s%n%s = %s%n%s=%s",args[0],args[1]);

        //Бесконечное число аргументов

        // Вариант 1
        /*for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + " = " + args[i + 1]);
        }*/

        // Вариант 2 (более правильный)
        for (int n = 0, j =1; j < args.length; n+=2, j+= 2) {
            System.out.println(args[n] + " = " + args[j]);
        }
        }
    /*   
         C:\Users\user\IdeaProjects\CommandLineArgs2\src> 
         javac .\Main.java    
         java Main hello world
         java Main con fig ma in hel lo how are 
         */

    public static void main() {
        System.out.println("No arguments: ");

    }
}
