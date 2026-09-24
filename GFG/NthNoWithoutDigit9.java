package GFG;
class NthNoWithoutDigit9 {
    boolean nth(int num) {
while (num > 0) {
    int digit = num % 10;
        if (digit == 9) {
        return true;
            }
            num = num / 10;
        }
        return false;
    }
    public String findNth(String n) {
        int target = Integer.parseInt(n);
        int count = 0;
        int num = 1;
        while (count < target) {
            if (!nth(num)) {
            count++;
            }
            if (count == target) {
            return String.valueOf(num);
            }
            num++;
        }
        return "";
    }
}