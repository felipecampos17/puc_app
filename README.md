# PUC - PAS: Trabalho 4 - Aplicativo Java/Android com MVVM (Back-end)

Back-end do **Trabalho 4 - Aplicativo Java/Android com MVVM** da matéria **Projeto Aplicado de Software**.

## Deploy no Heroku

1. [Instalar o CLI do Heroku](https://devcenter.heroku.com/articles/heroku-cli)
2. Fazer login no CLI
    ```bash
    heroku login
    ```
3. Criar um projeto
    ```bash
    heroku create
    ```
4. Criar o Banco de Dados
    ```bash
    heroku addons:create heroku-postgresql:hobby-dev
    ```
5. Fazer deploy através do GIT
    ```bash
    git push heroku main
    ```

### Links úteis
- https://www.heroku.com/java
- https://devcenter.heroku.com/articles/git
- https://devcenter.heroku.com/categories/java-support
- https://devcenter.heroku.com/articles/connecting-to-relational-databases-on-heroku-with-java
