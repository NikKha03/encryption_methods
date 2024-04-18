package org.example.methods;

import org.example.utils.CipherUtils;
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
        String expected = "ЙСЛННКУЗАВБШИМБКСШСААААЙНЙАШСНЖУАУЗЦБКУОЩОФНИЖБЛХНИУШИССТЙШОСНННЬСИОЖЗЬЛКЙЛЖААЛЖСБМЗАФТИХЗЖНЦЛЖНЖЛТИССГБКЗСЛДЛЖХВЛИБАНССОКАТШЗНЖСАХОБТАСЛНЙЙОЩИЖБЛККСТИАХЯСХХЭСРФ\u0001ГСЬБМЙЖК\u0001ЛЙФ\u0005С\u0002АБЩМТОИШС\u0003\u0001НЬЛЬКЛЙТЧРЮЖЛСГКБ\u0001МЮАЦЗАЧЯОЖ\u0005АСБЦГГ\u0004Б\u0005\u0001Ы\u0001ЖЦССЦАО\u0004ЧФЙЖИЗЗА\u0001ОА\u0004ДФЮУДКТЮАС\u0003ММУЛЮ\u0005ГЮУ\u0005ИДХЙВГНБДСЛШФХВСКАОЛЗРУЩЛЦЦ\u0003ИЧГКБЯЧСЙ\u0003\u0003ИШФВУЧ";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering2() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Халимендик.";
        String text = "ЙСЛННКУЗАВБШИМБКСШСААААЙНЙАШСНЖУАУЗЦБКУОЩОФНИЖБЛХНИУШИССТЙШОСНННЬСИОЖЗЬЛКЙЛЖААЛЖСБМЗАФТИХЗЖНЦЛЖНЖЛТИССГБКЗСЛДЛЖХВЛИБАНССОКАТШЗНЖСАХОБТАСЛНЙЙОЩИЖБЛККСТИАХЯСХХЭСРФ\u0001ГСЬБМЙЖК\u0001ЛЙФ\u0005С\u0002АБЩМТОИШС\u0003\u0001НЬЛЬКЛЙТЧРЮЖЛСГКБ\u0001МЮАЦЗАЧЯОЖ\u0005АСБЦГГ\u0004Б\u0005\u0001Ы\u0001ЖЦССЦАО\u0004ЧФЙЖИЗЗА\u0001ОА\u0004ДФЮУДКТЮАС\u0003ММУЛЮ\u0005ГЮУ\u0005ИДХЙВГНБДСЛШФХВСКАОЛЗРУЩЛЦЦ\u0003ИЧГКБЯЧСЙ\u0003\u0003ИШФВУЧ";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.deciphering(symbols, key, text);
        String expected = "ПОСЛЕ ОБЕДА ГОСПО ДИНВЫ КУШАЛ ЧАШКУ КОФЕЮ ИСЕЛН АДИВА НПОДЛ ОЖИВШ ИСЕБЕ ЗАСПИ НУПОД УШКУК ОТОРУ ЮВРУС СКИХТ РАКТИ РАХВМ ЕСТОЭ ЛАСТИ ЧЕСКО ЙШЕРС ТИНАБ ИВАЮТ ЧЕМТО ЧРЕЗВ ЫЧАЙН ОПОХО ЖИМНА КИРПИ ЧИБУЛ ЫЖНИК ТУТНА ЧАЛОН ЗЕВАТ ЬИПРИ КАЗАЛ ОТВЕС ТИСЕБ ЯВСВО ЙНУМЕ РГДЕП РИЛЕГ ШИЗАС НУЛДВ АЧАСА ОТДОХ НУВШИ ОННАП ИСАЛН АЛОСК УТКЕБ УМАЖК ИПОПР ОСЬБЕ ТРАКТ ИРНОГ ОСЛУГ ИЧИНИ МЯИФА МИЛИЮ".replaceAll(" ", "");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ciphering3() throws Exception {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "UNITED STATES OF AMERICA";
        String text = "It was long, long ago when the Fox and the Crane were close friends. One fine day the Fox invited the Crane to dinner with her and said to him: Come, buddy! Come, my dear! I’ll treat you heartily!And so the Crane came to the Fox for the dinner party. The Fox had cooked semolina for the dinner and smeared it over the plate. Then she served it and treated her guest. Help yourself to tasty dinner, my dear godfather. That was me who cooked it!The Crane went peck-peck with his beak, knocked and knocked but couldn’t pick even a bit of fare.";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.ciphering(symbols, key, text);
        String expected = "UWODBDRRYUTNFDDHCDEIIKDAUNSUDUSVHSVEUNTIRUNDUIVTHRNSNNHCAINFRMGDATHMDWTNMTWNSTIRURMNTNFSMHDUIKMVHSYSRONDRHNSMHDUIDSMANUFITTKUTUONIVDNNINUOIMNTTQDRTDDSEDUIGDARSDHMKESMYASHDUHCDEUTIPIQUPNMOHAHSNHAHAURTDTIHVNMNSAIKRBFBFGKEOEYCDHXAFFFCKZAWNKZRVBHZLRIQTERRYHRFSBUWRNCTHMBEHULHVHXACKXPHERLBRNPERRXMYPEYGKHVRFORPHZLIIPFNVLRGKHVRFADDXFIPEOELBYESEFDVBRTFBVEFEOEBPNFGPLOHRFDHXFHXHWHBADWTBKVBHXAFFOQRQRAHIOXSORVRNORVHLHMOLRVWBBQXF";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering3() throws Exception {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key = "UNITED STATES OF AMERICA";
        String text = "UWODBDRRYUTNFDDHCDEIIKDAUNSUDUSVHSVEUNTIRUNDUIVTHRNSNNHCAINFRMGDATHMDWTNMTWNSTIRURMNTNFSMHDUIKMVHSYSRONDRHNSMHDUIDSMANUFITTKUTUONIVDNNINUOIMNTTQDRTDDSEDUIGDARSDHMKESMYASHDUHCDEUTIPIQUPNMOHAHSNHAHAURTDTIHVNMNSAIKRBFBFGKEOEYCDHXAFFFCKZAWNKZRVBHZLRIQTERRYHRFSBUWRNCTHMBEHULHVHXACKXPHERLBRNPERRXMYPEYGKHVRFORPHZLIIPFNVLRGKHVRFADDXFIPEOELBYESEFDVBRTFBVEFEOEBPNFGPLOHRFDHXFHXHWHBADWTBKVBHXAFFOQRQRAHIOXSORVRNORVHLHMOLRVWBBQXF";

        EncryptionByFragmentation encryptionByFragmentation = new EncryptionByFragmentation();

        String actual = encryptionByFragmentation.deciphering(symbols, key, text);
        String expected = CipherUtils.cipherPreparation("It was long, long ago when the Fox and the Crane were close friends. One fine day the Fox invited the Crane to dinner with her and said to him: Come, buddy! Come, my dear! I’ll treat you heartily!And so the Crane came to the Fox for the dinner party. The Fox had cooked semolina for the dinner and smeared it over the plate. Then she served it and treated her guest. Help yourself to tasty dinner, my dear godfather. That was me who cooked it!The Crane went peck-peck with his beak, knocked and knocked but couldn’t pick even a bit of fare.");

        Assert.assertEquals(expected, actual);
    }
}
