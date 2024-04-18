package org.example.methods;

import org.junit.jupiter.api.Test;
import org.testng.Assert;


class MonoAlphabeticReplacementTest {
    @Test
    public void ciphering() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Всевышней волею Зевеса Наследник всех своих родных.";
        String text = "После обеда господин выкушал чашку кофею и сел на диван, подложивши себе за спину подушку, которую в русских трактирах вместо эластической шерсти набивают чем-то чрезвычайно похожим на кирпич и булыжник. Тут начал он зевать и приказал отвести себя в свой нумер, где, прилегши, заснул два часа. Отдохнувши, он написал на лоскутке бумажки, по просьбе трактирного слуги, чин, имя и фамилию.";

        MonoAlphabeticReplacement monoAlphabeticReplacement = new MonoAlphabeticReplacement();

        String actual = monoAlphabeticReplacement.ciphering(symbols, key, text);
        String expected = "РХГДНХСНШВЫХГРХШЮКЕЩАЖФВДУВФАЖАХМНЭЮГНДКВШЮЕВКРХШДХОЮЕФЮГНСНЛВГРЮКЖРХШЖФАЖАХЁХБЖЭЕБЖГГАЮПЁБВАЁЮБВПЕИНГЁХЬДВГЁЮУНГАХЗФНБГЁЮКВСЮЕВЭЁУНИЁХУБНЛЕЩУВЗКХРХПХОЮИКВАЮБРЮУЮСЖДЩОКЮАЁЖЁКВУВДХКЛНЕВЁЪЮРБЮАВЛВДХЁЕНГЁЮГНСЯЕГЕХЗКЖИНБЫШНРБЮДНЫФЮЛВГКЖДШЕВУВГВХЁШХПКЖЕФЮХККВРЮГВДКВДХГАЖЁАНСЖИВОАЮРХРБХГЪСНЁБВАЁЮБКХЫХГДЖЫЮУЮКЮИЯЮМВИЮДЮЭ";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deciphering() throws Exception {
        String symbols = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String key = "Всевышней волею Зевеса Наследник всех своих родных.";
        String text = "РХГДНХСНШВЫХГРХШЮКЕЩАЖФВДУВФАЖАХМНЭЮГНДКВШЮЕВКРХШДХОЮЕФЮГНСНЛВГРЮКЖРХШЖФАЖАХЁХБЖЭЕБЖГГАЮПЁБВАЁЮБВПЕИНГЁХЬДВГЁЮУНГАХЗФНБГЁЮКВСЮЕВЭЁУНИЁХУБНЛЕЩУВЗКХРХПХОЮИКВАЮБРЮУЮСЖДЩОКЮАЁЖЁКВУВДХКЛНЕВЁЪЮРБЮАВЛВДХЁЕНГЁЮГНСЯЕГЕХЗКЖИНБЫШНРБЮДНЫФЮЛВГКЖДШЕВУВГВХЁШХПКЖЕФЮХККВРЮГВДКВДХГАЖЁАНСЖИВОАЮРХРБХГЪСНЁБВАЁЮБКХЫХГДЖЫЮУЮКЮИЯЮМВИЮДЮЭ";

        MonoAlphabeticReplacement monoAlphabeticReplacement = new MonoAlphabeticReplacement();

        String actual = monoAlphabeticReplacement.deciphering(symbols, key, text);
        String expected = "ПОСЛЕОБЕДАГОСПОДИНВЫКУШАЛЧАШКУКОФЕЮИСЕЛНАДИВАНПОДЛОЖИВШИСЕБЕЗАСПИНУПОДУШКУКОТОРУЮВРУССКИХТРАКТИРАХВМЕСТОЭЛАСТИЧЕСКОЙШЕРСТИНАБИВАЮТЧЕМТОЧРЕЗВЫЧАЙНОПОХОЖИМНАКИРПИЧИБУЛЫЖНИКТУТНАЧАЛОНЗЕВАТЬИПРИКАЗАЛОТВЕСТИСЕБЯВСВОЙНУМЕРГДЕПРИЛЕГШИЗАСНУЛДВАЧАСАОТДОХНУВШИОННАПИСАЛНАЛОСКУТКЕБУМАЖКИПОПРОСЬБЕТРАКТИРНОГОСЛУГИЧИНИМЯИФАМИЛИЮ";

        Assert.assertEquals(expected, actual);
    }
}
