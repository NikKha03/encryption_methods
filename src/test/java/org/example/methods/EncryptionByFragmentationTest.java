package org.example.methods;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class EncryptionByFragmentationTest {
    @Test
    public void ciphering1() throws Exception {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "UNITED STATES OF AMERICA";
        String text = "DEARDADPLEASESENDMOREMONEY";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.ciphering(symbols, key, text);
        String expected = "DASOHSNUAAIDEERITGRWWUKVKY";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering1() throws Exception {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "UNITED STATES OF AMERICA";
        String text = "DASOHSNUAAIDEERITGRWWUKVKY";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.deciphering(symbols, key, text);
        String expected = "DEARDADPLEASESENDMOREMONEY";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ciphering2() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Халимендик.";
        String text = "После обеда господин выкушал чашку кофею и сел на диван, подложивши себе за спину подушку, которую в русских трактирах вместо эластической шерсти набивают чем-то чрезвычайно похожим на кирпич и булыжник. Тут начал он зевать и приказал отвести себя в свой нумер, где, прилегши, заснул два часа. Отдохнувши, он написал на лоскутке бумажки, по просьбе трактирного слуги, чин, имя и фамилию.";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.ciphering(symbols, key, text);
        String expected = "ЙСЛННКУЗАВБШИМБКСШСААААЙНЙАШСНЖУАУЗЦБКУОЩОФНИЖБЛХНИУШИССТЙШОСНННЬСИОЖЗЬЛКЙЛЖААЛЖСБМЗАФТИХЗЖНЦЛЖНЖЛТИССГБКЗСЛДЛЖХВЛИБАНССОКАТШЗНЖСАХОБТАСЛНЙЙОЩИЖБЛККСТИАХЯСХХЭСРФГСЬБМЙЖКЛЙФ\u0004С\u0001АБЩМТОИШС\u0002НЬЛЬКЛЙТЧРЮЖЛСГКБМЮАЦЗАЧЯОЖ\u0004АСБЦГГ\u0003Б\u0004ЫЖЦССЦАО\u0003ЧФЙЖИЗЗАОА\u0003ДФЮУДКТЮАС\u0002ММУЛЮ\u0004ГЮУ\u0004ИДХЙВГНБДСЛШФХВСКАОЛЗРУЩЛЦЦ\u0002ИЧГКБЯЧСЙ\u0002\u0002ИШФВУЧ";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering2() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Халимендик.";
        String text = "ЙСЛННКУЗАВБШИМБКСШСААААЙНЙАШСНЖУАУЗЦБКУОЩОФНИЖБЛХНИУШИССТЙШОСНННЬСИОЖЗЬЛКЙЛЖААЛЖСБМЗАФТИХЗЖНЦЛЖНЖЛТИССГБКЗСЛДЛЖХВЛИБАНССОКАТШЗНЖСАХОБТАСЛНЙЙОЩИЖБЛККСТИАХЯСХХЭСРФГСЬБМЙЖКЛЙФ\u0004С\u0001АБЩМТОИШС\u0002НЬЛЬКЛЙТЧРЮЖЛСГКБМЮАЦЗАЧЯОЖ\u0004АСБЦГГ\u0003Б\u0004ЫЖЦССЦАО\u0003ЧФЙЖИЗЗАОА\u0003ДФЮУДКТЮАС\u0002ММУЛЮ\u0004ГЮУ\u0004ИДХЙВГНБДСЛШФХВСКАОЛЗРУЩЛЦЦ\u0002ИЧГКБЯЧСЙ\u0002\u0002ИШФВУЧ";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.deciphering(symbols, key, text);
        String expected = "ПОСЛЕ ОБЕДА ГОСПО ДИНВЫ КУШАЛ ЧАШКУ КОФЕЮ ИСЕЛН АДИВА НПОДЛ ОЖИВШ ИСЕБЕ ЗАСПИ НУПОД УШКУК ОТОРУ ЮВРУС СКИХТ РАКТИ РАХВМ ЕСТОЭ ЛАСТИ ЧЕСКО ЙШЕРС ТИНАБ ИВАЮТ ЧЕМТО ЧРЕЗВ ЫЧАЙН ОПОХО ЖИМНА КИРПИ ЧИБУЛ ЫЖНИК ТУТНА ЧАЛОН ЗЕВАТ ЬИПРИ КАЗАЛ ОТВЕС ТИСЕБ ЯВСВО ЙНУМЕ РГДЕП РИЛЕГ ШИЗАС НУЛДВ АЧАСА ОТДОХ НУВШИ ОННАП ИСАЛН АЛОСК УТКЕБ УМАЖК ИПОПР ОСЬБЕ ТРАКТ ИРНОГ ОСЛУГ ИЧИНИ МЯИФА МИЛИЮ".replaceAll(" ", "");

        Assert.assertEquals(expected, actual);
    }
}
