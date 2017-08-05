package com.stas.JavsStart.Techcup2017;

import java.util.Objects;

/**
 * Created by stanislavz on 12-Apr-17.
 * Василий вышел из магазина, и ему стало интересно пересчитать сумму в чеке.
 * Чек представляет собой строку, в которой названия покупок и их цены записаны подряд без пробелов.
 * Чек имеет вид «name1price1name2price2…namenpricen», где namei (название i-го продукта) —
 * это непустая строка длины не более 10, состоящая из строчных букв латинского алфавита,
 * а pricei (цена i-го продукта) — это непустая строка, состоящая из точек и цифр. Продукты с одинаковым названием могут иметь разные цены.
 *  Цена каждого продукта записана в следующем формате. Если продукт стоит целое количество рублей, то копейки не пишутся.
 *  Иначе, после записи количества рублей к цене приписывается точка, за которой следом ровно двумя цифрами записаны копейки (если копеек менее 10, то используется лидирующий ноль).
 *  Также, каждые три разряда (от менее значимых к более значимым) в записи рублей разделяются точками. Лишние лидирующие нули недопустимы, запись цены всегда начинается с цифры и заканчивается цифрой.
 *  Например, записи цен:
 *  «234», «1.544», «149.431.10», «0.99» и «123.05» являются корректными,
 *  «.333», «3.33.11», «12.00», «.33», «0.1234» и «1.2» не являются корректными.
 *  Напишите программу, которая по содержимому чека найдет суммарную цену всех покупок.
 */
public class InvoiceSum {
    public static void main(String[] args) {
        String invoice = "name123.01namea23.123.99nameb22.12namec22.606.0";
        System.out.println(invoice);
        double result = 0;

        for (int i = 0; i < invoice.length(); i++) {
            String resultString = "";
                while (i != invoice.length() && String.valueOf(invoice.charAt(i)).matches("[0-9.]")) {

                    if (String.valueOf(invoice.charAt(i)).matches("[.]")) {
                        boolean threeNextElementsNumbers = (i != invoice.length() - 3 &&
                                String.valueOf(invoice.charAt(i + 1)).matches("[0-9]") &&
                                String.valueOf(invoice.charAt(i + 2)).matches("[0-9]") &&
                                String.valueOf(invoice.charAt(i + 3)).matches("[0-9]"));
                        if (threeNextElementsNumbers) {
                            i++;
                        }
                    }
                    resultString += invoice.charAt(i);
                    i++;
                }
                if (!Objects.equals(resultString,"")) {
                    System.out.println(resultString);
                    result += Double.valueOf(resultString);
                }
        }
        System.out.println("Sum at voice = " + result);
    }
}
