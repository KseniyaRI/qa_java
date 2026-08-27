# Проект 5 спринта

## Тестовый проект на Java с использованием JUnit 5, Mockito и Jacoco

## Описание проекта

Проект содержит unit-тесты для классов `Feline`, `Cat` и `Lion` с использованием:

- **JUnit 5** — для написания тестов
- **Mockito** — для создания моков и проверки взаимодействий между объектами
- **Jacoco** — для измерения покрытия кода тестами

## Технологии

- Java 11
- Maven

## Структура тестов

- `src/test/java/com/example/FelineTest.java` — тесты класса `Feline`
- `src/test/java/com/example/CatTest.java` — тесты класса `Cat` (с использованием моков)
- `src/test/java/com/example/LionTest.java` — тесты класса `Lion` (моки и проверка исключения)
- `src/test/java/com/example/LionParameterizedTest.java` — параметризованные тесты

## Запуск тестов

```bash
mvn clean test
```

## Покрытие кода

Отчёт Jacoco генерируется автоматически при запуске тестов и сохраняется в файл `target/site/jacoco/index.html`