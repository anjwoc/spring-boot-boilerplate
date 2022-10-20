## Tech Stacks

- Spring Boot
- Spring Security
- Spring Data JPA
- Querydsl
- Lombok
- Mapstruct
- Postgresql

## Project Structure

```shell
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── boilerplate
│   │   │           └── blog
│   │   │               ├── common          # 공통 컴포넌트 패키지
│   │   │               │   ├── dto         # 공통 Dto 클래스
│   │   │               │   ├── entity      # 공통 엔티티
│   │   │               │   └── repository  # 공통 레파지토리
│   │   │               ├── config          # 각종 전역 설정(querydsl, cors, securitym ...) 등
│   │   │               ├── domain          # 도메인 패키지
│   │   │               │   ├── comment     # 댓글 도메인
│   │   │               │   │   ├── dto     # 댓글 도메인 Dto 클래스
│   │   │               │   │   └── mapper  # 댓글 도메인 Mapper 클래스
│   │   │               │   └── post        # 게시글 도메인
│   │   │               │       ├── dto     # 게시글 도메인 Dto 클래스
│   │   │               │       └── mapper  # 게시글 도메인 Mapper 클래스
│   │   │               └── exception       # Exception 클래스
│   │   └── resources
│   │       ├── static
│   │       └── templates
│   └── test
└── target
    ├── classes
    ├── generated-sources                   # 빌드된 매퍼 클래스들(Mapstruct)
    ├── generated-test-sources
    ├── maven-status
    ├── surefire-reports
    └── test-classes
```
