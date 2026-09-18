# 1. Experience & Project Deep Dive

* [ ] Tell me about the system you're currently working on. What does it do?
* [ ] What parts of that system have you personally implemented?
* [ ] Walk me through a feature you developed from requirement to production.
* [ ] What is the most technically difficult problem you've solved recently?
* [ ] What was the hardest bug you've encountered in your current project?
* [ ] Tell me about a production incident you were involved in. What did you do?
* [ ] What is one part of your current system that you think is poorly designed?
* [ ] If you could redesign one part of your current application, what would you change?
* [ ] What technical decision have you made that you're particularly proud of?
* [ ] Tell me about a technical decision you made that turned out to be wrong.
* [ ] How do you normally approach a feature you've never implemented before?
* [ ] How do you learn an unfamiliar codebase?
* [ ] What is the largest codebase you've worked on?
* [ ] How do you determine where to make a change in a large codebase?
* [ ] Tell me about something you automated.
* [ ] What engineering task have you done repeatedly that you eventually automated?
* [ ] Tell me about a performance problem you've personally investigated.
* [ ] Tell me about a situation where you had to work with poorly documented code.
* [ ] Tell me about a time you disagreed with another engineer's technical approach.
* [ ] Tell me about a time you disagreed with your team lead or architect.
* [ ] Have you ever pushed back on a product requirement? Why?
* [ ] Tell me about a time when requirements changed significantly while you were implementing something.
* [ ] How do you decide when a feature is actually finished?
* [ ] Tell me about a time you had to deliver something under significant time pressure.
* [ ] How do you balance technical debt against delivering new functionality?
* [ ] What part of software engineering do you think you are strongest at?
* [ ] What part do you think you need to improve?
* [ ] What is something you understand today that you didn't understand two years ago?
* [ ] If I gave you your current project tomorrow with no documentation, how would you start?
* [ ] If you left your current team tomorrow, what knowledge would be hardest for them to replace?

---

# 2. Coding & Problem Solving

* [ ] Implement a method that removes duplicates from a list while preserving order.
* [ ] Given a list of transactions, return the top 10 customers by total transaction value.
* [ ] How would you change your solution if the input contained 100 million records?
* [ ] Given a string, determine whether it contains balanced parentheses.
* [ ] Implement a simple LRU cache.
* [ ] Implement a method that groups objects by a particular property.
* [ ] Given a list of objects, find duplicates according to a business key.
* [ ] Implement pagination over a large dataset.
* [ ] Given a stream of events, detect duplicate events.
* [ ] Design a method that is safe to call concurrently.
* [ ] Here's some code. Find the bug.
* [ ] Here's some code. What happens when this code executes?
* [ ] Here's some code. How would you improve its readability?
* [ ] Here's working code. How would you make it more efficient?
* [ ] What edge cases would you test for this implementation?
* [ ] What tests would you write before implementing this?
* [ ] How would you handle invalid input?
* [ ] What assumptions are you making about the input?
* [ ] What's the time complexity of your solution?
* [ ] What's the space complexity?
* [ ] Can you think of an alternative implementation?
* [ ] What would change if this method were called by 1,000 threads simultaneously?
* [ ] What would change if the data no longer fit into memory?
* [ ] What would change if the operation needed to be distributed across multiple machines?
* [ ] The requirements changed. We now need to support X. How would you modify your solution?
* [ ] Your implementation passes the tests but is very slow. How would you investigate?
* [ ] Your implementation occasionally produces incorrect results. How would you debug it?
* [ ] You inherit this method and don't understand it. How would you safely modify it?
* [ ] How do you decide whether to optimize code or keep it simple?
* [ ] When you're stuck on a coding problem, what do you do?

---

# 3. Java

* [ ] Here's a Java class. What problems do you see in it?
* [ ] When would you use an interface versus an abstract class?
* [ ] Here's code using inheritance. Would you keep the inheritance or use composition?
* [ ] What can go wrong if `equals()` and `hashCode()` are implemented incorrectly?
* [ ] Here's a class used as a `HashMap` key. What could go wrong?
* [ ] Why might modifying an object after putting it into a `HashMap` cause problems?
* [ ] When would you use `ArrayList` versus `LinkedList`?
* [ ] You're processing millions of objects. Which Java collection would you choose and why?
* [ ] Here's a Stream pipeline. What does it do?
* [ ] Here's a Stream pipeline that is slow. How would you investigate it?
* [ ] When would you avoid using Streams?
* [ ] How would you handle `null` values in this piece of Java code?
* [ ] When is `Optional` useful, and when does it make code worse?
* [ ] Here's an exception-handling implementation. What would you change?
* [ ] How would you design exception handling in a REST application?
* [ ] Here's a piece of code using `synchronized`. Is it thread-safe?
* [ ] Here's a piece of code using `volatile`. Is it thread-safe?
* [ ] What happens if two threads execute this method simultaneously?
* [ ] How would you make this class thread-safe?
* [ ] How would you implement a thread-safe cache?
* [ ] How would you investigate a Java application consuming excessive memory?
* [ ] What would you look at when investigating an `OutOfMemoryError`?
* [ ] How would you investigate excessive garbage collection?
* [ ] What would you look at if a Java application suddenly became much slower?
* [ ] When would you use `CompletableFuture`?
* [ ] How would you handle exceptions in a `CompletableFuture` chain?
* [ ] What problems can occur when creating too many threads?
* [ ] How would you choose between creating threads manually and using an `ExecutorService`?
* [ ] Here's some Java code that occasionally deadlocks. How would you investigate it?
* [ ] What's a Java feature you've used recently that significantly improved your code?

---

# 4. Spring / Spring Boot

* [ ] A Spring application fails during startup because of a circular dependency. How would you investigate it?
* [ ] You have two beans implementing the same interface. How does Spring decide which one to inject?
* [ ] How would you solve the multiple-bean problem?
* [ ] What would you use `@Qualifier` for?
* [ ] You add `@Transactional`, but the transaction isn't behaving as expected. How would you investigate?
* [ ] What could cause a Spring transaction not to roll back?
* [ ] When would you use `REQUIRES_NEW`?
* [ ] What problems can occur with `@Transactional` and method calls within the same class?
* [ ] An application has hundreds of Spring beans and takes 90 seconds to start. How would you investigate?
* [ ] A bean isn't being injected. What would you check?
* [ ] A Spring bean is unexpectedly `null`. What could be happening?
* [ ] What is the practical difference between `@Bean` and `@Component`?
* [ ] You need different implementations of an interface for different environments. How would you configure that?
* [ ] How would you manage configuration across development, testing and production?
* [ ] An API is returning 500 for invalid input. How would you design proper error handling?
* [ ] How would you implement global exception handling in Spring Boot?
* [ ] How would you validate incoming REST requests?
* [ ] How would you secure a Spring Boot REST API?
* [ ] How would you implement authorization for different user roles?
* [ ] A Spring endpoint is becoming slow. How would you investigate it?
* [ ] A JPA query is causing hundreds of database queries. How would you identify and fix the problem?
* [ ] How would you investigate an N+1 query problem?
* [ ] When would you use `@SpringBootTest` versus a narrower test?
* [ ] How would you test a controller?
* [ ] How would you test a service that has several external dependencies?
* [ ] How would you implement caching in Spring?
* [ ] A cached value is stale. How would you investigate?
* [ ] How would you execute background work in Spring Boot?
* [ ] What could go wrong with `@Async`?
* [ ] Describe the Spring architecture of a system you've actually worked on.

---

# 5. Databases & Persistence

* [ ] Here's a slow SQL query. How would you investigate it?
* [ ] How do you use an execution plan to investigate query performance?
* [ ] When would adding an index actually make performance worse?
* [ ] Given this query, what index would you create and why?
* [ ] A table has 100 million rows and queries are becoming slow. What would you investigate?
* [ ] How would you paginate millions of records?
* [ ] When would you use offset pagination versus cursor pagination?
* [ ] Two users update the same record simultaneously. What could happen?
* [ ] How would you prevent lost updates?
* [ ] When would you use optimistic locking?
* [ ] When would you use pessimistic locking?
* [ ] A production database is experiencing deadlocks. How would you investigate?
* [ ] What transaction isolation level would you choose for a particular scenario and why?
* [ ] What could happen if you use a transaction that is too large?
* [ ] How would you handle a transaction involving several tables?
* [ ] How would you migrate a large production table without significant downtime?
* [ ] How would you add a non-null column to a huge production table?
* [ ] How do you safely roll out database schema changes?
* [ ] An application is exhausting its database connection pool. How would you investigate?
* [ ] What could cause a connection pool to become exhausted?
* [ ] How would you investigate an N+1 problem in JPA/Hibernate?
* [ ] When would you use JPA versus writing SQL directly?
* [ ] What problems can Hibernate's lazy loading cause?
* [ ] What problems can Hibernate's first-level cache cause?
* [ ] How would you design a schema for orders and order items?
* [ ] How would you model a many-to-many relationship?
* [ ] When would you intentionally denormalize a database?
* [ ] How would you handle database replication and read replicas?
* [ ] A query works quickly in development but is extremely slow in production. What would you investigate?
* [ ] Describe the most difficult database problem you've personally solved.

---

# 6. APIs & Integration

* [ ] Design a REST API for creating an order.
* [ ] How would you design the API for retrieving orders with pagination?
* [ ] What HTTP status would you return for different failure scenarios?
* [ ] How would you validate an incoming request?
* [ ] How would you design API error responses?
* [ ] A client sends the same POST request three times because of network retries. How do you prevent duplicate orders?
* [ ] How would you make an API operation idempotent?
* [ ] How would you version an API?
* [ ] How would you introduce a breaking API change without breaking existing clients?
* [ ] How would you authenticate API clients?
* [ ] How would you authorize access to individual resources?
* [ ] How would you protect an API from excessive traffic?
* [ ] How would you handle rate limiting?
* [ ] An external API is intermittently returning 500 errors. How should your application react?
* [ ] An external API is slow. How do you prevent it from making your entire application slow?
* [ ] When would you retry an external API call?
* [ ] When should you **not** retry?
* [ ] How would you implement timeout handling?
* [ ] How would you handle an external API that doesn't support idempotency?
* [ ] How would you deal with an API whose response format changes unexpectedly?
* [ ] How would you integrate with an external system that is only available asynchronously?
* [ ] When would you choose messaging instead of REST?
* [ ] When would you choose synchronous communication?
* [ ] How would you authenticate service-to-service communication?
* [ ] How would you handle partial failure when calling three external services?
* [ ] How would you design an API that needs to support mobile clients for five years?
* [ ] What information should you log when calling an external service?
* [ ] How would you test an integration with an external API?
* [ ] How would you handle an external service being unavailable during deployment?
* [ ] Describe the most difficult integration you've implemented.

---

# 7. Distributed Systems & Microservices

* [ ] You have three services involved in processing an order. One service fails halfway through. What happens?
* [ ] How would you design this process to recover from partial failure?
* [ ] Service A calls Service B, which becomes slow. What can happen to Service A?
* [ ] How would you prevent cascading failures?
* [ ] When would you use a circuit breaker?
* [ ] When would you use retries?
* [ ] Why can retries sometimes make an outage worse?
* [ ] How would you choose retry delays?
* [ ] How would you handle duplicate messages?
* [ ] How would you make message processing idempotent?
* [ ] How would you handle messages arriving out of order?
* [ ] What happens if a consumer crashes after processing a message but before acknowledging it?
* [ ] How would you design a reliable event-processing system?
* [ ] When would you use the Outbox pattern?
* [ ] How would you ensure a database update and event publication remain consistent?
* [ ] When would you use synchronous versus asynchronous communication?
* [ ] How would you decide where one microservice ends and another begins?
* [ ] When would you **not** use microservices?
* [ ] What is a distributed monolith, and how might you recognize one?
* [ ] How would you investigate a failure involving five microservices?
* [ ] How would you trace one user request across multiple services?
* [ ] What would you put in logs for a distributed application?
* [ ] How would you monitor a microservices system?
* [ ] How would you handle service discovery?
* [ ] How would you handle configuration across many services?
* [ ] How would you secure communication between services?
* [ ] How would you handle database ownership between microservices?
* [ ] How would you deploy a breaking change between two services?
* [ ] How would you scale only one service in a microservices architecture?
* [ ] Describe a distributed-system problem you've personally encountered and how you solved it.

---

# 8. Testing & Quality

* [ ] You inherit a service with almost no tests. Where would you start?
* [ ] How do you decide what should be unit tested?
* [ ] When would you write an integration test instead?
* [ ] When is an end-to-end test appropriate?
* [ ] What makes a good unit test?
* [ ] What makes a bad unit test?
* [ ] When does mocking become excessive?
* [ ] How would you test a service with five external dependencies?
* [ ] How would you test a REST API?
* [ ] How would you test database behavior?
* [ ] How would you test transaction behavior?
* [ ] How would you test code involving concurrency?
* [ ] How would you test retry logic?
* [ ] How would you test a circuit breaker?
* [ ] How would you test failure scenarios?
* [ ] How would you test an external API without actually calling it?
* [ ] How would you prevent tests from becoming flaky?
* [ ] A test passes locally but fails intermittently in CI. What do you investigate?
* [ ] A test suite takes 30 minutes. How would you improve it?
* [ ] How do you decide whether a bug needs a regression test?
* [ ] A production bug cannot be reproduced locally. How would you test the eventual fix?
* [ ] How do you measure whether your tests provide useful coverage?
* [ ] Would you aim for 100% code coverage? Why or why not?
* [ ] How do you test legacy code that is difficult to change?
* [ ] How would you introduce tests into a large existing application?
* [ ] What should happen to tests during a large refactoring?
* [ ] How do you ensure tests remain maintainable?
* [ ] What testing practices have improved your team's quality?
* [ ] Tell me about a bug that your tests failed to catch.
* [ ] What would make you decide that a piece of software isn't ready for production?

---

# 9. Debugging & Production

* [ ] Production latency suddenly increases. What do you do first?
* [ ] Production CPU suddenly reaches 100%. How do you investigate?
* [ ] Memory usage continuously increases. What do you investigate?
* [ ] The application suddenly starts throwing `OutOfMemoryError`. What do you do?
* [ ] Requests are timing out, but CPU is low. What could be happening?
* [ ] Database connections are exhausted. How would you investigate?
* [ ] One endpoint becomes extremely slow while others remain normal. What do you check?
* [ ] An application works locally but fails in production. How do you approach it?
* [ ] An application works locally but crashes inside Docker. What do you investigate?
* [ ] One Kubernetes pod keeps restarting. Walk me through your investigation.
* [ ] A deployment succeeds but users receive HTTP 503. What do you check?
* [ ] One microservice cannot communicate with another. How do you troubleshoot it?
* [ ] Logs show no obvious errors, but users report failures. What do you do?
* [ ] A problem occurs once every few hours and cannot be reproduced locally. How do you investigate?
* [ ] A customer reports that an order was processed twice. How do you investigate?
* [ ] A customer reports that their data disappeared. What do you do first?
* [ ] A database query suddenly becomes slow after a deployment. How do you investigate?
* [ ] A service becomes slower as traffic increases. What metrics would you look at?
* [ ] How would you distinguish a CPU problem from an I/O problem?
* [ ] How would you determine whether a problem is inside your service or a downstream service?
* [ ] What information should you collect during a production incident?
* [ ] How do you decide whether to rollback or fix forward?
* [ ] What makes a good production log?
* [ ] What metrics would you monitor for a Spring Boot service?
* [ ] What would you put in an alert?
* [ ] How do you investigate a memory leak in Java?
* [ ] How would you investigate a thread pool exhaustion problem?
* [ ] Tell me about the hardest production incident you've handled.
* [ ] What did you learn from a production incident that changed how you develop software?
* [ ] After fixing a production incident, what do you do to prevent it happening again?

---

# 10. Software Design & Architecture

* [ ] Here's a 1,500-line service class. How would you approach improving it?
* [ ] How do you decide where a piece of functionality belongs?
* [ ] When would you use composition instead of inheritance?
* [ ] How do you recognize excessive coupling?
* [ ] How do you recognize poor cohesion?
* [ ] When does applying SOLID principles become counterproductive?
* [ ] How do you decide whether an abstraction is useful?
* [ ] How do you know when you're over-engineering something?
* [ ] How do you approach designing a new component?
* [ ] How do you decide between two possible designs?
* [ ] What trade-offs do you consider when designing software?
* [ ] How do you design for maintainability?
* [ ] How do you design for testability?
* [ ] How do you handle technical debt in architecture?
* [ ] When would you refactor instead of adding another feature?
* [ ] When would you rewrite a component rather than refactor it?
* [ ] How would you improve a legacy application without stopping feature development?
* [ ] How would you introduce a new abstraction into an existing codebase?
* [ ] How would you design a system that needs to scale significantly?
* [ ] How would you design for failure?
* [ ] How would you design a system that needs high availability?
* [ ] How would you decide whether something belongs in a shared library?
* [ ] What are the risks of creating a shared library used by 30 services?
* [ ] How would you design boundaries between components?
* [ ] When would you choose a monolith?
* [ ] When would you choose microservices?
* [ ] How would you break apart a monolith?
* [ ] How do you evaluate whether an architecture is successful?
* [ ] Tell me about an architectural decision you disagreed with.
* [ ] What's the best architectural decision you've made, and why?

---

# 11. DevOps & Delivery

* [ ] Your code works locally but fails in CI. How do you investigate?
* [ ] A Maven build suddenly fails because of dependency resolution. What do you check?
* [ ] How would you investigate a dependency conflict?
* [ ] Your Docker image is 1.5 GB. How would you reduce it?
* [ ] Your Docker container immediately exits after starting. How do you investigate?
* [ ] A Docker container works locally but fails in Kubernetes. What do you check?
* [ ] A Kubernetes pod is in `CrashLoopBackOff`. Walk me through your investigation.
* [ ] A Kubernetes deployment is healthy but users cannot reach the application. What do you investigate?
* [ ] How would you perform a zero-downtime deployment?
* [ ] How would you rollback a failed deployment?
* [ ] How would you implement a canary deployment?
* [ ] How would you know whether a deployment is safe?
* [ ] What should a production CI/CD pipeline contain?
* [ ] Where should automated tests run in the pipeline?
* [ ] How would you handle database migrations in CI/CD?
* [ ] How would you manage secrets in a CI/CD pipeline?
* [ ] Your pipeline takes 30 minutes. How would you optimize it?
* [ ] How would you prevent a broken build from reaching production?
* [ ] How would you handle different configurations across environments?
* [ ] How would you version Docker images?
* [ ] How would you version application releases?
* [ ] A developer accidentally commits a secret. What do you do?
* [ ] A deployment succeeds but the health check fails. What do you investigate?
* [ ] How would you make a deployment automatically rollback?
* [ ] How would you debug a Kubernetes networking problem?
* [ ] How would you determine whether an application needs more pods?
* [ ] How would you decide between horizontal and vertical scaling?
* [ ] What should be included in a production readiness checklist?
* [ ] Describe the CI/CD pipeline of a system you've actually worked on.
* [ ] What is the most difficult deployment problem you've personally encountered?

---

# 12. Engineering Practices & Collaboration

* [ ] How do you approach a code review?
* [ ] What makes you request changes during a code review?
* [ ] Tell me about a code review where you disagreed with the author.
* [ ] How do you respond when someone criticizes your code?
* [ ] Tell me about a technical disagreement you've had.
* [ ] How do you resolve disagreements between engineers?
* [ ] What do you do when your team lead disagrees with your approach?
* [ ] When do you escalate a technical disagreement?
* [ ] How do you decide when to ask for help?
* [ ] How long do you investigate something before asking for help?
* [ ] What do you do when requirements are ambiguous?
* [ ] How do you handle requirements that change halfway through development?
* [ ] How do you estimate a task you haven't done before?
* [ ] How do you break a large feature into smaller tasks?
* [ ] How do you communicate that a task is going to miss its deadline?
* [ ] What do you do when several things are simultaneously marked as urgent?
* [ ] How do you communicate technical risk to a product manager?
* [ ] How do you explain a complicated technical problem to a non-technical person?
* [ ] Tell me about a time you received difficult feedback.
* [ ] Tell me about a time you gave difficult feedback to another engineer.
* [ ] How do you help junior engineers?
* [ ] How do you share knowledge within your team?
* [ ] Tell me about something you taught another engineer.
* [ ] Tell me about a mistake you made and what you learned from it.
* [ ] Tell me about a technical decision you would make differently today.
* [ ] What do you do when you inherit code you strongly dislike?
* [ ] How do you balance engineering quality with business deadlines?
* [ ] How do you decide whether technical debt is worth addressing?
* [ ] What engineering practice has made you significantly more effective?
* [ ] What distinguishes a senior engineer from a mid-level engineer?
