// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    if文の基本問題
    
    int型の変数valueが宣言してあります。変数valueは任意の整数を表しています。
    
    ※注意
    Integer.parseInt(System.console().readLine())の記述は、キーボードから
    文字列の入力を受け付け、それをint型に変換するプログラムです。
    これはそのまま利用してください。ただし、キーボードから「ABC」のような
    入力を行うと、int型に変換できずに例外をスローします。

    まずは変数valueの値が偶数か奇数かを判定します。偶数の場合は「偶数です」と
    表示し、奇数の場合は「奇数です」と表示します。
    
    負の数値でもきちんと偶数・奇数判定してください。

    次に、変数valueの値が３の倍数、４の倍数、５の倍数であるかの判定を行います。
    ３の倍数の場合は「３の倍数です」と表示します。４の倍数の場合は「４の倍数です」
    と表示します。５の倍数の場合は「５の倍数です」と表示します。
    
    ３の倍数かつ４の倍数の数値もあることに注意してください。
    
    今回の演習はif文だけを使用し、繰り返し構文は使わないでください。
    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

    【実行結果】
    整数を入力してください
    16
    偶数です
    ４の倍数です

    【実行結果】
    整数を入力してください
    -15
    奇数です
    ３の倍数です
    ５の倍数です

    【実行結果】
    整数を入力してください
    60
    偶数です
    ３の倍数です
    ４の倍数です
    ５の倍数です

*/
public class IfBasicPractice{

    public static void main(String[] args){

        System.out.println("整数を入力してください");

        // 整数変数の宣言と初期化
        int value = Integer.parseInt(System.console().readLine());

        // if文の開始


    }

}