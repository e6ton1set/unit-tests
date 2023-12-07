Задание №1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

__Ответ__

    Тестовые заглушки позволяют тестировать компоненты, изолируя их от внутренних и внешних зависимостей (классическая школа). Это даёт нам гибкость, меньшее потребление ресурсов, безопасность, автономность. С помощью них можно протестировать компонент как на исходящие команды, так и отследить реакцию на входящие запросы.


2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?

__Ответ__

    Следует использовать mock, т.к. такой вид заглушки умеет записывать все вызовы, проходящие через неё. 

3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?

__Ответ__

    Следует использовать stub - они умеют возвращать определённые данные в ответ на вызов своих методов.

4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?

__Ответ__

    Следует использовать fake - например, тестовую коллекцию для имитации работы базы данных.