Absolutely. For a **5-year experienced Full-Stack + Angular developer**, I’d use questions that test practical experience rather than trivia.

### 10 interview questions

1. **Angular architecture**

   > “You’re starting a large Angular application with multiple features and teams. How would you structure the application, and how would you decide what belongs in components, services, shared modules, and state management?”

   **Look for:** modularity, standalone components, services, dependency injection, lazy loading, separation of concerns.

2. **Angular performance**

   > “An Angular page has become noticeably slow as the amount of data increases. How would you investigate and improve its performance?”

   **Look for:** `OnPush`, `trackBy`/`@for`, lazy loading, avoiding unnecessary subscriptions/change detection, profiling, virtual scrolling.

3. **RxJS**

   > “What is the difference between `switchMap`, `mergeMap`, `concatMap`, and `exhaustMap`? Give me a real-world example where you would use each.”

   **Look for:** understanding cancellation, concurrency, ordering, and duplicate-request handling—not just memorized definitions.

4. **State management**

   > “Suppose several unrelated Angular components need to share user/session data and application state. How would you manage that state?”

   **Look for:** services/signals, RxJS, NgRx or another state-management approach, and knowing when *not* to introduce NgRx.

5. **API design**

   > “You need to build an Angular frontend that communicates with a REST API you are also responsible for. How would you design the API and handle validation, errors, pagination, authentication, and versioning?”

   **Look for:** REST principles, consistent error contracts, DTOs, HTTP status codes, pagination, auth, validation.

6. **Backend architecture**

   > “Tell me how you would design a backend endpoint that receives an order containing multiple items, validates it, saves everything atomically, and returns the created order.”

   **Look for:** transactions, validation, service/repository separation, database constraints, concurrency, error handling.

7. **Authentication & security**

   > “How would you implement authentication between an Angular SPA and a backend API? What security issues would you consider?”

   **Look for:** access/refresh tokens or secure cookie approaches, XSS, CSRF, CORS, token storage, authorization, password handling.

8. **Database**

   > “An API endpoint has become slow because it queries a database containing millions of records. How would you diagnose and fix the problem?”

   **Look for:** execution plans, indexes, query optimization, pagination, N+1 queries, joins, caching, measuring before optimizing.

9. **Debugging / production scenario**

   > “A production Angular application intermittently shows stale or incorrect data, but you cannot reproduce the problem locally. Walk me through how you would investigate it.”

   **Look for:** logs, network inspection, correlation IDs, race conditions, caching, RxJS behavior, browser/device differences, monitoring, reproducing with production-like data.

10. **Full-stack design challenge**

> “Design a small application where users can search, filter, and edit a large list of customers. Describe the Angular frontend, API endpoints, backend architecture, database design, authentication, and how you would make the system performant.”

**Look for:** whether they can connect frontend + backend + database decisions into one coherent design.

### One useful follow-up for almost every question

After they answer, ask:

> **“Can you give me an example from a real project where you actually did this?”**

For a **5-year candidate**, this is particularly useful because it separates someone who understands the concepts from someone who has actually dealt with production systems.
