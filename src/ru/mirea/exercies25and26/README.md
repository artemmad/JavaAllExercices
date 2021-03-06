# Задание к Практической №25 и №26

# 1) Получение данных из HTML-страницы, создания и чтения JSON-файлы.
Получает HTML-код страницы «Список станций Московского метрополитена» https://www.moscowmap.ru/metro.html#lines с помощью библиотеки jsoup.

Парсит полученную страницу и получает из неё:
- Линии московского метро (получаете имя линии, номер линии).
- Станции московского метро (получаете имя станции, номер линии).

Создаёт и записывает на диск JSON-файл со списком станций по линиям и списком линий по формату:
![](https://github.com/artemmad/JavaAllExercices/blob/master/src/ru/mirea/exercies25and26/1.png?raw=true)
Читает файл и выводит в консоль количество станций на каждой линии.

## Рекомендации

- По умолчанию Jsoup читает 2 Мб данных с запрашиваемой страницы. Чтобы снять это ограничение, необходимо добавить вызов метода maxBodySize(0), устанавливающий максимальное значение получаемых данных: Document doc = Jsoup.connect(URL).maxBodySize(0).get(); значение 0 означает, что нет ограничений на принимаемый объём данных.
- При изучении кода страницы удобно использовать консоль разработчика в браузере. Для этого нажмите F12, перейдите во вкладку Elements и найдите тег <div id="metrodata">. В нём содержатся таблицы с линиями, станциями и пересадками. Обращайте внимание на классы, напишите селекторы на основе найденных классов. Посмотрите, как получать элементы по селекторам в [документации JSoup](https://jsoup.org/cookbook/extracting-data/selector-syntax).
- Для более быстрого поиска нужных селекторов используйте онлайн-сервис jsoup https://try.jsoup.org/
- Ссылка на библиотеку Gson для работы с Json форматом: https://github.com/google/gson#download
