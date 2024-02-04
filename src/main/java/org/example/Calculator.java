package org.example;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> list){
        double res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i).doubleValue();
        }
        return res;
    }
    public  Double multi(List<? extends Number> list){
        double res = 1.0;
        for (int i = 0; i < list.size(); i++) {
            res *= list.get(i).doubleValue();
        }
        return res;
    }
    public Double div(Double num1, Double num2){
        return num1 / num2;
    }

    public Integer binToDec(Integer num){
        String temp = String.format("%d", num);
        int res = 0;
        for (int i = 0; i < temp.length(); i++) {
            if(temp.charAt(i) == '1') {
                res += (int) Math.pow(2, temp.length() - 1 - i);
            }
        }
        return  res;
    }
    public Integer binToDec(String num){
        int res = 0;
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') {
                res += (int) Math.pow(2, num.length() - 1 - i);
            }
        }
        return  res;
    }

    public Double BinareNum(Double number)
    {
        Double wholeNumDec = Math.floor(number);
        Double fractionDec = number - wholeNumDec;
        Double wholeNumBin = 0.0;
        int countWhole = 1;
        while(wholeNumDec >= 1)
        {
            wholeNumBin = wholeNumBin + wholeNumDec % 2 * countWhole;
            countWhole *= 10;
            wholeNumDec /= 2;
        }

        Double fractionBin = 0.0;
        Double countFract = 0.1;
        while (fractionDec < 1 && fractionDec != 0){
            fractionDec *= 2;
            if(fractionDec >= 1){
                fractionBin += countFract;
                fractionDec -= 1.0;
            }
            countFract /= 10;
            if(Double.toString(fractionBin).length() > 4){
                break;
            }

        }

        return wholeNumBin + fractionBin;
    }

}
