# Общие принципы использование репозитория

Добрый день дорогие студнеты и начинающие Java девелоперы. У нас с вами пройдет по плану 32 практические работы по Java.
Основные правила использования курса следующие:
- Fork привествуется;
- общаться по заданиям между собой и обсуждать приветствуется;
- Отправка заданий производится либо на почту artemmakarevich1997@gmail.com или при помощи pull request в мой репозиторий(аккаунт artemmad).

# Структура проекта

Предлагаю вам разбивать один репозиторий внутри на пакеты. По итогу у вас каждая практическая работа будет представлена пакетом внутрив вашего решения в Intelij Idea. Внутри каждого пакеты вы должны создать свой исполняемый класс Main.java по стандарту чтобы можно было организовать точку входа в программую

```java
package ru.mirea;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
```

Так вы сможете разделить кажду вашу работу внутри решения и подтягивать классы созданные в предыдущих работах из других пакетов.

# Доставка решения и его верефикация

Для отправки решения преподавателю предлагаются :
- почта куда вы можете отправлять решения в формате: тема письма "Практическая работа №1 Фамилия И.О. Группа", в теле письма ссылка на git репозиторий. Отвечать на выполненную работу буду через почту ;
- pull request через github. Отвечать зачтена работа или нет я буду в комментариях к Pull Request.

# Выкачивание к себе изменений

Выкачивание из данного репозитория изменений предусмотре добавлением данного репозитория к вам в remote и получение изменений с него через fetch. По факту для получения изменений вам небходимо воспользлваться опцией pull и вытянуть изменения с текущего репозитория. Обращаю внимание что могут возникать конфликты. Если они у вас возникают и вы не знаете что делать, напишите мне в вк или еще куда угодно где я доступен с запросом о помощи в получении изенений отсюда.

# Расположение заданий

В каждом пакете в папке Src размещен Readme файл, в котором будет описана текущая работа, задане на выполнение практической и возможно полезные ресурсы которым можно было бы воспользоваться в теме данного задания.

# Задание на автомат по практическим
В случае выполнения данного задания все практические проставляются автоматом. Это не означает получения автомата по всему предмету, но вы получаете допуск к экзамену без сдачи всех **32 лабораторных** работ.

**Необходимо предложить тему преподавателю**

Задание можно выполнять командой не более 3-х человек. Если решение показывает команда, будут заданы вопросы о том кто какую часть работы выполнил, и дана задача защитить свою часть преподавателю. В случае успешной защиты команда получает зачет по всем 32 практикам.
