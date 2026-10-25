# Essentials Mod

Простой и чистый мод для **Minecraft Forge 1.21.1**.

Содержит базовую структуру + несколько полезных вещей, чтобы можно было сразу начать разработку.

## Что есть в моде

- Кастомная креатив-вкладка
- Пример предмета (**Copper Coin**)
- Пример блока (**Compact Copper Block**)
- Правильная структура проекта под Forge 1.21.1

## Требования

- Java 21
- Minecraft 1.21.1
- Forge 52.1.x

## Как запустить

1. Склонируй репозиторий
2. Открой проект в IntelliJ IDEA
3. Дождись индексации Gradle
4. Запусти конфигурацию `runClient`

Или через терминал:

```bash
./gradlew runClient
```

## Сборка мода

```bash
./gradlew build
```

Готовый `.jar` появится в папке `build/libs/`.

## Структура

```
src/main/java/com/fima/essentials/
├── EssentialsMod.java          — главный класс мода
├── item/ModItems.java          — регистрация предметов
├── block/ModBlocks.java        — регистрация блоков
└── creative/ModCreativeTabs.java

src/main/resources/
├── META-INF/mods.toml
├── assets/essentials/...
└── data/essentials/...
```

---

Можно свободно использовать как основу для своего мода.
