# ⚽ ScoutVision API

ScoutVision é uma API REST desenvolvida para análise de jogadores de futebol, permitindo cadastro, consulta e geração de
métricas inteligentes para apoiar decisões esportivas.

O projeto foi criado para simular cenários reais de análise de desempenho, utilizando conceitos modernos de
desenvolvimento backend com Java, persistência em banco relacional e boas práticas de arquitetura.


> Plataforma de análise esportiva desenvolvida com Java, Spring Boot e PostgreSQL.

🚧 Status: Backend v1.0 concluído | Frontend em desenvolvimento
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

## ⭐ Diferenciais

- Arquitetura em camadas (Controller, Service, Repository)
- Persistência com PostgreSQL
- Integração com Docker
- Tratamento global de exceções
- Documentação automática com Swagger
- Estratégia de Upsert para evitar duplicidade de jogadores
- Roadmap evolutivo para Analytics e Academy

---

## 💡 Visão do Produto

O ScoutVision nasceu como um projeto de estudos para aprofundar conhecimentos em Java, Spring Boot, PostgreSQL e Docker.

Com a evolução do projeto, surgiu uma visão mais ampla: transformar a aplicação em uma plataforma de análise esportiva
capaz de atender diferentes públicos.

### Academy

Voltado para:

- Categorias de base
- Escolinhas de futebol
- Projetos sociais
- Clubes amadores
- Pais e treinadores

Permitindo acompanhar a evolução de atletas através de métricas e avaliações ao longo do tempo.

### Professional Analytics

Voltado para:

- Grandes ligas
- Seleções nacionais
- Competições profissionais

Consumindo APIs externas para gerar análises, comparações, rankings e acompanhamento de desempenho de atletas
profissionais.

### Objetivo

Unir análise de dados, tecnologia e futebol em uma única plataforma, permitindo acompanhar desde atletas em formação até
jogadores profissionais.

---

## 🚀 Roadmap

### ✅ Fase 1 - Backend Foundation

- [x] Spring Boot
- [x] PostgreSQL
- [x] Docker
- [x] Swagger
- [x] Analytics de jogadores
- [x] Fantasy Team
- [x] Exception Handler
- [x] Variáveis de ambiente

### 🔄 Fase 2 - Frontend

- [ ] Dashboard Angular
- [ ] Lista de jogadores
- [ ] Tela de detalhes
- [ ] Rankings visuais
- [ ] Fantasy Team visual
- [ ] Responsividade
- [ ] Integração com API Spring Boot
- [ ] Cards de métricas

### 📊 Fase 3 - Analytics

- [ ] Comparação entre jogadores
- [ ] ScoutVision Score
- [ ] Histórico de desempenho
- [ ] Evolução temporal
- [ ] Relatórios

### 🌎 Fase 4 - Integrações

- [ ] Consumo de API externa de futebol
- [ ] Importação automática de jogadores
- [ ] Atualização periódica de estatísticas
- [ ] Sincronização de dados

### 🏆 Fase 5 - Academy

- [ ] Cadastro de atletas de base
- [ ] Controle de evolução
- [ ] Relatórios para pais e treinadores
- [ ] Comparação entre atletas
- [ ] Histórico de avaliações

---

## 👩‍💻 Desenvolvido por

Beatriz França

Software Engineer | Full Stack Developer

LinkedIn: https://www.linkedin.com/in/beafran%C3%A7a/
GitHub: https://github.com/afbeah
