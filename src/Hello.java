public class Hello {
    public static void main(String[] args) {
        SubClass f = new SubClass();
        f.printMethod();

        /*
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(maxValue)); // 31 characters of 1
        System.out.println(Integer.toBinaryString(minValue)); // 32 characters
        // overflow and underflow
        System.out.println(maxValue + 1);
        System.out.println(minValue - 1);

        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);

        // 1 byte = 8 bits
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
        System.out.println(Integer.toBinaryString(myMinByteValue-1));

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);
        System.out.println(Integer.toBinaryString(myMinShortValue));


        long myLongValue = 112341232132100L;//force java to treat it as long
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        byte test = (byte)(myMaxShortValue+100);
        System.out.println(test);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float)5 / 3;
        float myFloatValue1 = 5f / 3;
        double myDoubleValue = 5.00 / 3;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myFloatValue1);
        System.out.println(myDoubleValue);

        // BigDecimal overcomes this precise calculations


        char myChar = '$';
        char myUnicodeChar = '\u0088';
        System.out.println(myUnicodeChar);

        boolean t = true;
        boolean f = false;
        System.out.println(t);
        System.out.println(f);


        int switchValue = 3;

        switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3, 4, 5");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char charValue = 'A';
        switch(charValue)  {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            default:
                System.out.println("was not A OR B");
                break;
        }

        for(;;) {
           // endlessly
        }

        while(true) {
           // endlessly
        }

        do {
           // endlessly
        } while(true);

        String numberAsString = "2018";
        int number = Integer.parseInt(numberAsString);

        double numberd = Double.parseDouble(numberAsString);

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("enter your name");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;
            if (age >= 0 && age <= 100) {
                System.out.println(name + " " + age);
            } else {
                System.out.println("invalid year of birth");
            }
            System.out.println("your name is " + name);
            scanner.close();
        } else {
            System.out.println("cannot parse year of birth");
        }


        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true) {
            int order = counter + 1;
            System.out.println("enter number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();

         int min = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
         Scanner scanner = new Scanner(System.in);
         while (true) {
             System.out.println("enter the number: ");
             boolean isAnInt = scanner.hasNextInt();
             if (isAnInt) {
                 int number = scanner.nextInt();
                 if (number > max) {
                    max = number;
                 }
                 if (number < min) {
                    min = number;
                 }
             }
             System.out.println(max);
             System.out.println(min);
         }
*/
    }
}
