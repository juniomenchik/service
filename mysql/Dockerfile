# docker build -t meu-mysql-custom .

# Usa a imagem oficial do MySQL como base
FROM mysql:8.0

# Define variáveis de ambiente (senha do root, nome do banco, etc.)
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=restaurante
ENV MYSQL_USER=admin
ENV MYSQL_PASSWORD=admin

# Copia scripts SQL para serem executados na inicialização (opcional)
# COPY ./scripts/ /docker-entrypoint-initdb.d/

# Expõe a porta padrão do MySQL
EXPOSE 3306

# Mantém o comando padrão da imagem oficial
CMD ["mysqld"]