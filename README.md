# CRUD_on_Kubernetes

Обычное CRUD приложение с WEB-интерфейсом. Созданное с целью попрактиковаться в деплое приложений в Kubernetes.


# Установка и настройка на локальной машине разработчика (dev).
На локальной машине разработчика потребуется наличие запущенной PostgreSQL, а так же JDK 11.

1. Клонируйте репозиторий на свой локальный компьютер
2. С помошью maven соберите проект. (ВАЖНО! Соберите с использованием профиля сборки <b>dev</b> )
3. Запускайте <b>target/crud.jar</b> любым удобным сопсобом



# Установка и настройка в Kubernetes (prod).

Для запуска потребуется наличие упрощенного поставщика Kubernetes (minikube).

1. Клонируйте репозиторий на свой локальный компьютер
2. Выполните запустите манифесты из директории <b>.kube</b>.
3. Затем получите url для обращений к приложению выполнив команду <b> minikube service crud-service --url </b>
