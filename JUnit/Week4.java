public class Week4 {
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    public static int minArray (int[] array) {
        int minn = array[0];
        for (int i = 1; i < array.length; i++) {
            minn = Math.min(minn, array[i]);
        }
        return minn;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        BMI = Math.round(BMI * 10.0) / 10.0;
        if (BMI < 18.5) return "Thiếu cân";
        else if (BMI >= 18.5 && BMI < 23) return "Bình thường";
        else if (BMI >= 23 && BMI < 25) return "Thừa cân";
        else return "Béo phì";
    }
}