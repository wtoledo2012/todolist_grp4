Las Apps no están dockerizadas, solo la Base de Datos

**Para subir el proyecto del Frontend "todolist_grp4/to-do-list":**

```bash
node -v
npm -v
npm install -g npm@latest
npm install -g @vue/cli
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
npm install vue-router
npm install vuex@next
npm install axios
npm install @fortawesome/vue-fontawesome @fortawesome/free-solid-svg-icons @fortawesome/fontawesome-svg-core
npm run serve

  
**para subir el pry del BE "todolist_grp4/qrks-todolist-grp4"**
./mvnw clean install quarkus:dev -DskipTests

**para subir la Base de Datos, levantar el docker compose**
todolist_grp4/docker-compose.yml
