public class MyCalc {

    public static void main(String[] args) {
        System.out.println(add(32.08,43.07));
        System.out.println(sub(15.42, 17.57));
        System.out.println(mul(482.12, 10.5));
        System.out.println(div(7856.15, 547.09));
        System.out.println(mod(5527.55,42.23));
        System.out.println(avg(6515.12, 12.85));
        System.out.println(pow(156.27));
        System.out.println(percent(165482.49, 10));
    }



    public static double add (double val1, double val2){
        double result = val1 + val2;
        return result;
    }
    public static double sub (double val1, double val2){
        double result = val1 - val2;
        return result;
    }
    public static double mul (double val1, double val2){
        double result = val1 * val2;
        return result;
    }
    public static double div (double val1, double val2){
        double result = val1 / val2;
        return result;
    }
    public static double mod (double val1, double val2){
        double result = val1 % val2;
        return result;
    }
    public static double avg (double val1, double val2){
        double result = (val1 + val2) / 2;
        return result;
    }
    public static double pow (double val){
        double result = val * val;
        return result;
    }
    public static double percent (double val1, double percent){
        double result = val1 * percent / 100;
        return result;
    }
}
