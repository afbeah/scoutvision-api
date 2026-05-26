# ⚽ ScoutVision API

ScoutVision é uma API REST desenvolvida para análise de jogadores de futebol, permitindo cadastro, consulta e geração de métricas inteligentes para apoiar decisões esportivas.

O projeto foi criado para simular cenários reais de análise de desempenho, utilizando conceitos modernos de desenvolvimento backend com Java, persistência em banco relacional e boas práticas de arquitetura.

---

## 🚀 Funcionalidades

### Gestão de jogadores

- Cadastro de jogadores
- Consulta de jogadores
- Busca por posição
- Busca por seleção nacional
- Busca por jogadores convocados para a Copa
- Atualização automática para evitar duplicidade (Upsert)

### Analytics esportivo

- Ranking por ataque
- Ranking por defesa
- Média geral do time
- Melhor custo-benefício
- Geração automática de Fantasy Team

### Qualidade e infraestrutura

- Validação de dados
- Tratamento global de exceções
- Documentação com Swagger/OpenAPI
- Persistência com PostgreSQL
- Docker
- Variáveis de ambiente (.env)

---

## 🛠 Tecnologias utilizadas

### Backend

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

### Documentação

- Swagger/OpenAPI

### DevOps

- Docker
- Docker Compose

---

## 📂 Arquitetura do projeto

```
src
└── main
    ├── controller
    ├── service
    ├── repository
    ├── dto
    ├── entity
    ├── exception
    └── config
```

Projeto estruturado seguindo o padrão:

```text
Controller
↓
Service
↓
Repository
↓
Database
```

---

## ⚙️ Como executar localmente

### Clonar projeto

```bash
git clone https://github.com/afbeah/scoutvision-api.git
```

Entrar na pasta:

```bash
cd scoutvision-api
```

Criar arquivo:

```text
.env
```

Adicionar:

```env
DB_PASSWORD=suaSenha
```

Executar aplicação:

```bash
./mvnw spring-boot:run
```

---

## 🐳 Executando com Docker

Subir PostgreSQL:

```bash
docker compose up -d
```

Parar containers:

```bash
docker compose down
```

---

## 📘 Swagger

Após iniciar a aplicação:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## 📡 Principais endpoints

### Jogadores

```http
POST /players
GET /players
GET /players/position/{position}
GET /players/national-team/{nationalTeam}
GET /players/world-cup
```

### Analytics

```http
GET /players/top-attack
GET /players/top-defense
GET /players/team-average
GET /players/fantasy-team
GET /players/best-value
```

---

## 📈 Próximas melhorias

- Dashboard em Angular
- Gráficos de desempenho
- Estatísticas avançadas
- Autenticação com JWT
- Testes automatizados
- Deploy em nuvem

---

## 👩‍💻 Desenvolvido por

Beatriz França

Engenheira de Software | Full Stack Developer

LinkedIn: https://www.linkedin.com/in/beafran%C3%A7a/
GitHub: https://github.com/afbeah
