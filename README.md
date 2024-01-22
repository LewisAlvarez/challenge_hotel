# Documentation
### Running PostgresDB in docker steps:
1. docker pull postgres
2. docker run --name db-postgres -p 5432:5432 -e POSTGRES_PASSWORD=4dmin123 -e POSTGRES_USER=postgres -e POSTGRES_DB=db_hotels -d postgres