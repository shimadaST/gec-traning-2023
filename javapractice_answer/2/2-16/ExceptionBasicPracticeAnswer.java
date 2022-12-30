// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    例外に関する基本問題の解答例

*/
public class ExceptionBasicPracticeAnswer{

    public static void main(String[] args){

        // 分子変数
        int numerator = 4200;

        // 分母変数
        int denominator;

        try{

            // コマンドライン引数を整数値に変換する
            denominator = Integer.parseInt(args[0]);

            // 割り算結果変数に代入
            int result = numerator / denominator;

            // 計算結果の表示
            System.out.println("割り算の結果は" + result + "です");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("コマンドライン引数を指定してください");
        }
        catch(NumberFormatException e){
            System.out.println("コマンドライン引数には整数を指定してください");
        }
        catch(ArithmeticException e){
            System.out.println("コマンドライン引数には0以外の整数を指定してください");
        }
        finally{
            System.out.println("プログラムを終了します");
        }

    }

}
