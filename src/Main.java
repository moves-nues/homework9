public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i = i + 1) {
            System.out.println(i);
        }


        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосным год будет " + i + " год"); }


        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }


        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        int savings = 29000;
        int totalMonth = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            totalMonth = savings + totalMonth;
            System.out.println("В " + i + " месяце будет накоплено " + totalMonth + " рублей");
        }


        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(2 + "*" + i + "=" + (i * 2));
        }
    }
}