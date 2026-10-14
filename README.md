# Лабораторна робота №1: Healthcheck API, Docker Compose та GitHub Actions CI

Веб-сервіс на базі **Java** та **Spring Boot**, який реалізує системні ендпоінти перевірки стану (`Liveness` та `Readiness`), мультистадійну контейнеризацію Docker та CI-пайплайн у GitHub Actions.

## Технологічний стек
* **Мова програмування:** Java 21
* **Фреймворк:** Spring Boot 4.1.1
* **Керування залежностями та збірка:** Apache Maven
* **Лінтер:** Maven Checkstyle Plugin
* **Контейнеризація:** Docker (Multi-stage build), Docker Compose
* **CI:** GitHub Actions

## Інструкція щодо локального запуску через Docker Compose

1. **Клонуйте репозиторій:**
   ```bash
   git clone https://github.com/DarynaBushma/SCLab1.git
   cd SCLab1
