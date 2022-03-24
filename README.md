## Git branch 전략

---

| 브랜치 | 역할 | 규칙 |
| --- | --- | --- |
| main | 운영 환경 |  |
| dev | 개발 환경 | 최신 main 브랜치에서 만든다. main 브랜치에 머지하면 최신 코드를 유지 한다. |
| feat/14/기능 | 신규 기능 개발 | - 최신 dev 브랜치에서 만든다.


- dev 브랜치에서 머지하면 삭제한다.
- issue 번호로 브랜치를 생성한다. |
  | fix/15/기능 | 개발 환경 버그 수정 | - 최신 dev 브랜치에서 만든다.
- dev 브랜치에서 머지하면 삭제한다.
- issue 번호로 브랜치를 생성한다. |
- 네이밍 규칙
    - **EX) fix/10/login**

### Allowed <type>
- feat (feature)
- fix (bug fix)
- docs (documentation)
- style (formatting, missing semi colons, …)
- refactor
- test (when adding missing tests)
- chore (maintain)
