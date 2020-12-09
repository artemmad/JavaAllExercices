# Задание к Практической №29 и №30

# 1) Учимся использовать Stream API.

Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и в конце выводящую 10 наиболее часто встречающихся слов.

Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например, в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".

Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово. Выводите слова в нижнем регистре.

Если в тексте меньше 10 уникальных слов, то выводите сколько есть.

Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте, то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.

Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.

Sample Input 1:

    Мама мыла-мыла-мыла раму!

Sample Output 1:

    мыла
    мама
    раму


Sample Input 2:

    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.

Sample Output 2:

    consectetur
    faucibus
    ipsum
    lorem
    adipiscing
    amet
    dolor
    eget
    elit
    mi



## Рекомендации

- Для ознакомления со Stream API рекомендую следующий [ресурс](https://metanit.com/java/tutorial/10.1.php);
- В целом на youtube так же много материала по Stream Api. Мне больше всего нравится [этот](https://www.youtube.com/watch?v=WmMavkXMXDg&ab_channel=SourceCode)

