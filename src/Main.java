public class Main {
        public static void main(String[] args) {
            //Завдання1:
            int n = 100;
            if (n>=50 && n<=100){
                System.out.println("Число " + n + " міститься в проміжку (50;100)");
            }else{
                System.out.println("Число " + n + " не міститься в проміжку (50;100)");
            }


            //Завдання2:
            int n1 = 736;
            int number1=n1/100;
            int number2=(n1/10)%10;
            int number3=n1%10;
            int maxN=number1;
            if (number2>maxN){
                maxN=number2;
            }
            if(number3>maxN) {
                maxN = number3;
            }
            System.out.println("Найбільша цифра у числі: " + maxN);


            //Завдання4:
            String opt="Погодитись";
            String text= "Так";
            switch (opt){
            case "Погодитись":
                switch(text){
                    case "Так":
                    case "ОК":
                    case "Yes":
                    case "Y":
                    case "+":
                    case "Ok":
                        System.out.println("Я погоджуюсь!");
                        break;
                    default:
                        System.out.println("Ви вказали неіснуюче!");
                }
                    break;
            case "Відмовитись":
                switch (text) {
                    case "Ні":
                    case "NO":
                    case "N":
                    case "-":
                    case "No":
                        System.out.println("Я відмовляюсь!");
                        break;
                    default:
                        System.out.println("Ви вказали неіснуюче!");
                }
            }
            //Завдання3:
            int floor=4;
            String direction="До низу";
            if (direction=="До низу") {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if(direction=="До гори")
                System.out.println("Ви піднялись на "+floor+" поверх");

        }
}











