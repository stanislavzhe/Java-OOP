package com.stas.JavsStart.Techcup2017;

import java.util.Objects;

/**
 * Created by stanislavz on 24-Apr-17.
 * Поликарп взял у Олега интервью и записал его себе в блокнот без знаков препинания и пробелов, чтобы сэкономить время и успеть все записать.
 * В итоге, интервью представляет собой строку s, состоящую из n строчных букв латинского алфавита.
 * В речи Олега есть слово-паразит ogo, а также все слова, которые получаются из слова ogo приписыванием справа к нему слога go.
 * Например, слова ogo, ogogo, ogogogo являются паразитами, а слова go, og, ogog, ogogog и oggo — не являются.
 * Слова-паразиты имеют максимальный возможный размер, то есть, например, в речи ogogoo нельзя считать, что слово-паразит это ogo,
 * а goo является частью обыкновенной фразы интервью. В данном случае словом-паразитом является подстрока ogogo.
 * До печати Поликарпу необходимо заменить каждое слово-паразит на последовательность из трёх звездочек.
 * Обратите внимание, что независимо от длины слова-паразита оно заменяется ровно на три звёздочки.
 * Поликарп быстро справился с этой задачей. А сможете ли это сделать вы? Время пошло!
 */
public class AdverseWords {
    public static void main(String[] args) {
        String interviewText = "123ogo456og7ogogogogogogog9ogo0ogogo";
        System.out.println(interviewText);
        String interviewTextEdited = "";
        for (int i = 0; i < interviewText.length(); i++) {

            // ogo text start
            boolean ogo = ((i <= interviewText.length() - 3) &&
                    Objects.equals(interviewText.charAt(i), 'o') &&
                    Objects.equals(interviewText.charAt(i + 1), 'g') &&
                    Objects.equals(interviewText.charAt(i + 2), 'o'));

            if (ogo) {
                interviewTextEdited += "***";
                i = i + 3;

                // next go delete
                while ((i <= interviewText.length() - 2)) {
                    if (Objects.equals(interviewText.charAt(i), 'g') && Objects.equals(interviewText.charAt(i + 1), 'o')) {
                        i = i + 2;
                        continue;
                    }
                    break;
                }
            }
            if (i != interviewText.length()) {
                interviewTextEdited += interviewText.charAt(i);
            }
        }
        System.out.println(interviewTextEdited);
    }
}

