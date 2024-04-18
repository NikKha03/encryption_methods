package org.example.methods;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class EncryptionByPermutationTest {
    @Test
    public void ciphering1() throws Exception {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "panama";
        String text = "DEARDADPLEASESENDMONEYASSOONASPOSSIBLETOM";

        EncryptionByPermutation encryptionByPermutation = new EncryptionByPermutation();

        String actual = encryptionByPermutation.ciphering(symbols, key, text);
        String expected = "EPSNOOERENYNSOASMSSBDADAAIMALEEOSTDDEOSPL";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering1() throws Exception {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "panama";
        String text = "EPSNOOERENYNSOASMSSBDADAAIMALEEOSTDDEOSPL";

        EncryptionByPermutation encryptionByPermutation = new EncryptionByPermutation();

        String actual = encryptionByPermutation.deciphering(symbols, key, text);
        String expected = "DEARDADPLEASESENDMONEYASSOONASPOSSIBLETOM";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ciphering2() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Халимендик.";
        String text = "После обеда господин выкушал чашку кофею и сел на диван, подложивши себе за спину подушку, которую в русских трактирах вместо эластической шерсти набивают чем-то чрезвычайно похожим на кирпич и булыжник. Тут начал он зевать и приказал отвести себя в свой нумер, где, прилегши, заснул два часа. Отдохнувши, он написал на лоскутке бумажки, по просьбе трактирного слуги, чин, имя и фамилию.";

        EncryptionByPermutation encryptionByPermutation = new EncryptionByPermutation();

        String actual = encryptionByPermutation.ciphering(symbols, key, text);
        String expected = "ООУОД ЖАШВА СЕИЕЧ ИИУЕА ИНИУТ НЛМСР ЧИЕНШ ЕОЕПО ИХСЕА ЕОРНЛ ПВСДЗ АВАКО АЛИОД ЧИНИН ОСРЛЙ ИЧОКЫ ЧЬОЯР ШАНИУ ИТОМЛ ПАЕВВ ПУУТО КАТЙН УНААЕ МЕДОА СЖБОН ИДВКЛ ДБОРХ ВТРЮЗ ХПИОР ЕВЕАС ШЛЕПК УФАЫУ НЛЕДУ ТМИСТ ВОИКН ИСОПС АИНБР ТГАСС ШФИИС КРКТС НМАМБ ТВЗСУ ЛЛДНО АЬНИЛ ЕОЛЮА ШИКСИ ЭОБОН АЛАТЛ БЕГВХ ПККЕГ ИЮБИА СПСУТ КААШВ РПИЖА ИТВГИ ЧУСТП РСЯПГ ККАОЗ УЮРЕЧ ТЧЫЖЧ ТЗКТЙ РНООА УОИИМ".replaceAll(" ", "");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering2() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Халимендик.";
        String text = "ООУОД ЖАШВА СЕИЕЧ ИИУЕА ИНИУТ НЛМСР ЧИЕНШ ЕОЕПО ИХСЕА ЕОРНЛ ПВСДЗ АВАКО АЛИОД ЧИНИН ОСРЛЙ ИЧОКЫ ЧЬОЯР ШАНИУ ИТОМЛ ПАЕВВ ПУУТО КАТЙН УНААЕ МЕДОА СЖБОН ИДВКЛ ДБОРХ ВТРЮЗ ХПИОР ЕВЕАС ШЛЕПК УФАЫУ НЛЕДУ ТМИСТ ВОИКН ИСОПС АИНБР ТГАСС ШФИИС КРКТС НМАМБ ТВЗСУ ЛЛДНО АЬНИЛ ЕОЛЮА ШИКСИ ЭОБОН АЛАТЛ БЕГВХ ПККЕГ ИЮБИА СПСУТ КААШВ РПИЖА ИТВГИ ЧУСТП РСЯПГ ККАОЗ УЮРЕЧ ТЧЫЖЧ ТЗКТЙ РНООА УОИИМ".replaceAll(" ", "");

        EncryptionByPermutation encryptionByPermutation = new EncryptionByPermutation();

        String actual = encryptionByPermutation.deciphering(symbols, key, text);
        String expected = "ПОСЛЕ ОБЕДА ГОСПО ДИНВЫ КУШАЛ ЧАШКУ КОФЕЮ ИСЕЛН АДИВА НПОДЛ ОЖИВШ ИСЕБЕ ЗАСПИ НУПОД УШКУК ОТОРУ ЮВРУС СКИХТ РАКТИ РАХВМ ЕСТОЭ ЛАСТИ ЧЕСКО ЙШЕРС ТИНАБ ИВАЮТ ЧЕМТО ЧРЕЗВ ЫЧАЙН ОПОХО ЖИМНА КИРПИ ЧИБУЛ ЫЖНИК ТУТНА ЧАЛОН ЗЕВАТ ЬИПРИ КАЗАЛ ОТВЕС ТИСЕБ ЯВСВО ЙНУМЕ РГДЕП РИЛЕГ ШИЗАС НУЛДВ АЧАСА ОТДОХ НУВШИ ОННАП ИСАЛН АЛОСК УТКЕБ УМАЖК ИПОПР ОСЬБЕ ТРАКТ ИРНОГ ОСЛУГ ИЧИНИ МЯИФА МИЛИЮ".replaceAll(" ", "");

        Assert.assertEquals(expected, actual);
    }
}
