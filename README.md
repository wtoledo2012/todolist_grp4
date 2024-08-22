Las Apps no están dockerizadas, solo la Base de Datos

1. **Para subir el proyecto del Frontend "todolist_grp4/to-do-list":**
    ```bash
    node -v
    npm -v
    npm install -g npm@latest
    npm install -g @vue/cli
    En un cmd (Win) ejecutar esta línea: Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
    npm install vue-router
    npm install vuex@next
    npm install axios
    npm install @fortawesome/vue-fontawesome @fortawesome/free-solid-svg-icons @fortawesome/fontawesome-svg-core
    npm run serve
    ```

2. **Para subir el proyecto del Backend "todolist_grp4/qrks-todolist-grp4":**
    ```bash
    ./mvnw clean install quarkus:dev -DskipTests
    ```

3. **Para subir la Base de Datos, levantar el Docker Compose:**
    ```bash
    todolist_grp4/docker-compose.yml
    ```
