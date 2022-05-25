package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyClassTest {
    /*
      1) подготовка исходных данных
      2) Вызов тестируемого метода
      3) Сравнение результата с ожиданиями

     */


    @Test
    public void isYearLeap_WhenYearDivBy4_shouldBeTrue() {
        int value=2004;
        MyClass myClass=new MyClass();
        boolean result=myClass.isYearLeap(value);
        Assertions.assertTrue(result);
    }

    @Test
    public void isYearLeap_WhenYearNotDivBy4_shouldBeFalse() {
        MyClass myClass=new MyClass();
        int value=2015;
        boolean result=myClass.isYearLeap(value);
        Assertions.assertFalse(result);
    }

    @Test
    public void isYearLeap_WhenYear1900_shouldBeFalse() {
        MyClass myClass=new MyClass();
        int value=1900;
        boolean result=myClass.isYearLeap(value);
        Assertions.assertFalse(result);
    }

    @Test
    public void isYearLeap_WhenYear2000_shouldBeTrue() {
        Assertions.assertTrue(new MyClass().isYearLeap(2000));
    }

}