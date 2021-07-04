package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is " + sumDigits(125));
        System.out.println(isPalindrome(-200002));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(getEvenDigitSum(22));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(getCommonDivisor(81, 153));
        printFactors(-1);
        System.out.println(isPerfectNumber(-1));
        numberToWords(150);
        numberToWords(100);
        System.out.println(reverse(123455));
        System.out.println(getDigitCount(0));

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        int sumDigits = 0;
        while (number > 0) {
            int lastDigits = number % 10;
            sumDigits += lastDigits;
            number = number / 10;

        }
        return sumDigits;
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int number1 = number;

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        if (number1 == reverse) {
            return true;
        } else {
            return false;
        }
    }


    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int last_digit = 0;
        last_digit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        sum = last_digit + number;
        return sum;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
        return sum;
    }

    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10) || (a > 99) || (b < 10) || (b > 99)) {
            return false;
        }
        int digit_1 = 0;
        int digit_2 = 0;

        digit_1 = a % 10;
        digit_2 = a / 10;
        int digit_3 = 0;
        int digit_4 = 0;

        digit_3 = b % 10;
        digit_4 = b / 10;

        if ((digit_1 == digit_3) || (digit_1 == digit_4) ||
                (digit_2 == digit_3) || (digit_2 == digit_4)) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 10) || (a > 1000) || (b < 10) || (b > 1000) || (c < 10) || (c > 1000)) {
            return false;
        }
        int lastDigit_a = a % 10;
        int lastDigit_b = b % 10;
        int lastDigit_c = c % 10;
        if (lastDigit_a == lastDigit_b) {
            return true;
        } else if (lastDigit_b == lastDigit_c) {
            return true;
        } else if (lastDigit_a == lastDigit_c) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int d) {
        if ((d < 10) || (d > 1000)) {
            return false;
        } else {
            return true;
        }
    }

    public static int getCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int i_count = 0;
        /*for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                i_count = i;
            }
        }*/
        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }

        return first;
    }

    static public void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    static public boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count += i;
            }
        }
        if (count == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverse_number = reverse(number);

        for (int i = 1; i <= getDigitCount(number); i++) {


            switch (reverse_number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                default:
                    System.out.println("Nine");
            }
            reverse_number /= 10;
        }
    }



    public static int reverse(int number) {
        int reverse = 0;
        int lastNumber = 0;
        while(number>0) {
            lastNumber = number % 10;
            reverse = (reverse * 10) + lastNumber;
            number /= 10;
        }
        return reverse;
    }

    static public int getDigitCount (int number) {
        if(number < 0) {
            return -1;
        }

        int count = 0;
        if(number == 0) {
            return 1;
        }
            while(number != 0) {
                number /= 10;
                count++;

            }
        return count;
    }
}






