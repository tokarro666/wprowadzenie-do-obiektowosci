import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 /*/       Car audi = new Car("Red", 5, "A4", false);
        System.out.println(audi.getAutomaticGearbox());
        audi.setAutomaticGearbox(true);
        System.out.println(audi.getAutomaticGearbox());


        Car suzuki = new Car("Black", 3, "1500", false);
        System.out.println(suzuki.getcolour());
        suzuki.setcolour("Black");
        System.out.println(suzuki.getcolour());
/*/

/*/        int a;
        int b;
        a = 10;
        b = 2;
        int c;
        c = a - b;
        System.out.println(c);

        Kalkulator calc = new Kalkulator();
        int a;
        int b;
        calc.add(5, 2);
        System.out.println(calc.add(5, 2));


        Kalkulator liczydlo = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę odać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int secondVariable = scanner.nextInt();
        System.out.println("Twój wynik dodawania to: " + liczydlo.add(firstVariable, secondVariable));

        Kalkulator liczydlo = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę odać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int secondVariable = scanner.nextInt();
        System.out.println("Twój wynik odejmowania to: " + liczydlo.sub(firstVariable, secondVariable));


        Kalkulator liczydlo = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę odać pierwszą liczbę");
        int firstVariable = scanner.nextInt();
        System.out.println("Proszę podać drugą liczbę");
        int secondVariable = scanner.nextInt();
        System.out.println("Twój wynik mnożenia to: " + liczydlo.multiply(firstVariable, secondVariable));
/*/
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int x = scanner.nextInt();
        System.out.println("Podaj jaką operację chcesz wykonać wpisując + - * /");
        String znak = scanner.next();
        System.out.println("Podaj drugą liczbę");
        int y = scanner.nextInt();
        switch (znak){
            case "+":
                System.out.println(kalkulator.add(x, y));


        }

    }
}
