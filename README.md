# Отчет о тестировании приложения: "Получи рубль за каждые 100!"
## Краткое описание
24.08.2020 было проведено было проведено функциональное тестирование приложения: "Получи рубль за каждые 100!"

На тестирование затрачено: 3 часа

В результате тестирования дефетов не выявлено.

## Описание процесса тестирования
В процессе тестирования использовались следующие артефакты:

- #### Сумма пополнения позитивные
- #### Сумма пополнения негативные

#### Предусловия 
Установить IntelliJ IDEA согласно 
[Руководство по установке IntelliJ IDEA](https://github.com/netology-code/javaqa-homeworks/blob/master/intro/idea.md)

#### Шаги
1. запустить IntelliJ IDEA
1. в IntelliJ IDEA открыть папку с проектом
1. в папке src открыть класс Main
1. нажать Ctrl+Shift+F10

В качестве тестовых данных использовались данные :

- текущий баланс = 1000; сумма пополнения = 30;
- текущий баланс = 999.99; сумма пополнения = 20;
- текущий баланс = 0; сумма пополнения = 50;
- текущий баланс = 1100.25; сумма пополнения = 100;
- текущий баланс = 10089.05; сумма пополения = -5;
- текущий баланс = -10.29; сумма пополнения = 66;
- текущий баланс = 100.975454654; сумма пополнения = 1.7e+308;

Тестирование производилось в следующем окружении:

- ОС Windows 10 x64
- IntelliJ IDEA 2020.2 (Community edition) Runtume version 11.0.7+10-b944.20 amd64
