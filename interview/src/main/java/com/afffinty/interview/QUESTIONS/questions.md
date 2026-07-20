# Affinity Questions

## Java
- JDK vs JRE
- What is JIT compilation?
- What is ahead of time Compilation
  What are the key features of Java?
  Explain the difference between JDK, JRE, and JVM.
  How does Java achieve platform independence?
  What is the difference between primitive data types and wrapper classes?
  What are autoboxing and unboxing?
  Explain pass-by-value in Java.
  What are the four pillars of Object-Oriented Programming?
  What is the difference between abstraction and encapsulation?
  What is the difference between an interface and an abstract class?
  Can an abstract class have constructors? Why?
  Can an interface have default and static methods?
  What is the difference between composition and inheritance?
  What is object cloning? Explain shallow copy and deep copy.
  What is serialization and deserialization?
  What is the purpose of the transient keyword?
  What is the difference between String, StringBuilder, and StringBuffer?
  Why is String immutable in Java?
  What is the String Constant Pool?
  What is the difference between == and equals()?
  Why should hashCode() be overridden when equals() is overridden?
  Explain the contract between equals() and hashCode().
  How does HashMap work internally?
  What happens when two keys have the same hash code?
  What is the difference between ArrayList and LinkedList?
  What is the difference between HashMap, LinkedHashMap, TreeMap, and ConcurrentHashMap?
  What is the difference between HashSet, LinkedHashSet, and TreeSet?
  What is the load factor in a HashMap?
  What is rehashing?
  What is fail-fast and fail-safe iteration?
  What causes a ConcurrentModificationException?
  What is the difference between checked and unchecked exceptions?
  What is the difference between throw and throws?
  What is try-with-resources, and why is it useful?
  Can the finally block be skipped? If yes, when?
  What is the difference between a process and a thread?
  What is the difference between Runnable and Callable?
  What is synchronization, and why is it needed?
  What is the volatile keyword?
  What is the difference between wait(), notify(), and notifyAll()?
  What is the difference between wait() and sleep()?
  What is a deadlock? How can it be prevented?
  Explain the Java thread lifecycle.
  What is ExecutorService?
  What is Future and CompletableFuture?
  What are lambda expressions?
  What is a functional interface?
  Explain method references with examples.
  What are Java Streams?
  What is the difference between map() and flatMap()?
  What is the difference between filter() and map()?
  What is lazy evaluation in Streams?
  What is Optional, and when would you use it?
  Explain the JVM memory model.
  What is the difference between heap memory and stack memory?
  What is garbage collection?
  What are strong, soft, weak, and phantom references?
  What causes an OutOfMemoryError?
  What is the difference between final, finally, and finalize()?
  What is the purpose of the static keyword?
  What is the difference between this and super?
  Can static methods be overridden?
  Can the main() method be overloaded?
  Can a class be both final and abstract? Why or why not?
  What is reflection, and where is it used?
  What are annotations in Java?
  What are marker interfaces? Give examples.
  What is serialVersionUID, and why is it important?
  Explain compile-time polymorphism and runtime polymorphism.
  How would you implement a thread-safe Singleton in Java?
  How do you go about creating modules in Java?
  Downsides of using Lombok


## Agnostic
Tell us about your current project and your role in it.
Walk us through a feature you designed and implemented end-to-end.
Describe a technically challenging problem you solved recently.
How do you approach debugging a production issue?
What steps do you take before declaring a bug resolved?
How do you prioritize tasks when multiple high-priority requests come in?
Describe a situation where you had conflicting priorities. How did you handle it?
How do you estimate the effort for a new feature?
What factors do you consider before making a design decision?
How do you ensure your code is maintainable?
What coding standards or best practices do you follow?
What is clean code, and what principles do you follow to achieve it?
How do you approach code reviews, both as a reviewer and as an author?
Describe a code review that significantly improved your solution.
How do you handle disagreements during code reviews?
What strategies do you use to improve application performance?
How do you identify performance bottlenecks?
Describe a time when you optimized a slow application.
How do you ensure your applications are scalable?
What is the difference between scalability and performance?
How do you design systems to be resilient to failures?
What techniques do you use to improve application reliability?
How do you approach logging and monitoring?
What information should always be included in application logs?
How do you investigate intermittent production issues?
What metrics do you monitor for application health?
What is technical debt, and how do you manage it?
Describe a situation where you had to balance speed of delivery with code quality.
How do you decide when to refactor existing code?
What is your approach to testing?
What types of testing have you worked with?
How do you determine what should be unit tested versus integration tested?
What characteristics make a good unit test?
How do you mock external dependencies during testing?
What is the purpose of regression testing?
Describe your experience working in Agile or Scrum teams.
How do you handle changing requirements during development?
How do you communicate technical concepts to non-technical stakeholders?
Describe a situation where you had to mentor another engineer.
How do you onboard yourself to a new codebase?
What would you do if you inherited a poorly documented application?
Describe a production incident you were involved in. What did you learn?
How do you approach root cause analysis after an incident?
How do you ensure backward compatibility when making changes?
What considerations do you make before exposing a new API?
What are the characteristics of a well-designed API?
How do you handle versioning in APIs?
What security considerations do you keep in mind during development?
What are common security vulnerabilities developers should prevent?
How do you protect sensitive information in an application?
How do you ensure your application is observable?
Describe a time when you had to make a trade-off between different design options.
How do you evaluate whether a solution is over-engineered?
What principles do you follow when designing software?
What is the SOLID principle? Can you explain each one?
What are common software design patterns you have used?
When would you choose composition over inheritance?
What is loose coupling, and why is it important?
How do you make a system easier to maintain over time?
If you were asked to improve an existing application, what areas would you evaluate first?
What do you consider the most important qualities of a senior software engineer?

## Concurrency
ScopedValues vs ThreadLocal
What is concurrency, and how is it different from parallelism?
What is the difference between a process and a thread?
What is thread safety?
What are race conditions, and how can they be prevented?
What is mutual exclusion (mutex), and why is it needed?
What is a critical section?
What are locks, and when should they be used?
What are the advantages and disadvantages of lock-based synchronization?
What is a deadlock? How can it be detected and prevented?
What is livelock, and how does it differ from deadlock?
What is thread starvation?
What is priority inversion?
What is the producer-consumer problem? How would you solve it?
What is the readers-writers problem?
What is the dining philosophers problem, and why is it important?
What is a semaphore, and how does it differ from a mutex?
What is a monitor?
What is a condition variable?
What is busy waiting (spin lock), and when is it appropriate?
What is lock contention, and how can it be minimized?
What are optimistic and pessimistic locking?
What are atomic operations?
What are compare-and-swap (CAS) operations?
What are lock-free and wait-free algorithms?
What is memory visibility in concurrent applications?
What is a memory barrier (memory fence)?
What is the happens-before relationship?
Why can instruction reordering cause concurrency issues?
What is false sharing?
What are thread-local variables, and when would you use them?
What is thread confinement?
What is a thread pool, and why is it beneficial?
How do you determine the appropriate size of a thread pool?
What are the risks of creating too many threads?
What is work stealing?
What is task scheduling in concurrent systems?
What are blocking and non-blocking operations?
What is asynchronous programming?
What is the difference between synchronous, asynchronous, blocking, and non-blocking execution?
What are futures and promises?
What are callbacks, and what challenges do they introduce?
What are common concurrency bugs you've encountered?
How do you debug concurrency issues?
What tools or techniques do you use to identify deadlocks?
How do you test concurrent applications?
How do you design a thread-safe cache?
How would you implement a producer-consumer system?
How would you prevent duplicate processing in a distributed system?
What considerations are important when designing concurrent applications?
What trade-offs do you consider between performance and thread safety?
How do you minimize synchronization overhead?
When would you choose immutable objects over synchronization?
What is backpressure in concurrent or distributed systems?
What is idempotency, and why is it important in concurrent systems?
How do you ensure consistency when multiple threads or processes update the same resource?
Describe a concurrency issue you faced in production and how you resolved it.
What are some common best practices for writing concurrent applications?


## Maven
Basic to Intermediate
What is Maven, and what problems does it solve in Java development?
Explain the structure of a pom.xml file.
What are the three standard Maven lifecycles?
What is the difference between mvn clean, mvn install, and mvn deploy?
What is the purpose of the Maven Super POM?
Explain the Maven project directory structure.
What is the difference between Maven coordinates: groupId, artifactId, and version?
How does Maven resolve project dependencies?
What is the difference between transitive dependencies and direct dependencies?
How do you exclude a transitive dependency?
Dependency Management
Explain the purpose of the <dependencyManagement> section.
What is the difference between <dependencies> and <dependencyManagement>?
What are the different Maven dependency scopes (compile, provided, runtime, test, system, import)?
What happens if two dependencies bring different versions of the same library?
How does Maven's "nearest definition" strategy work for dependency resolution?
How do you identify dependency conflicts in a Maven project?
What is the purpose of the Maven local repository, central repository, and remote repositories?
How can you force Maven to update dependencies from remote repositories?
Build Lifecycle & Plugins
Explain the Maven build lifecycle phases in detail.
What are Maven plugins, and why are they required?
What is the difference between a plugin and a dependency?
Name some commonly used Maven plugins and their purposes.
How do you execute a specific Maven plugin goal?
How can you create a custom Maven plugin?
Advanced Maven
Explain multi-module Maven projects. What are their advantages?
What is the difference between a parent POM and an aggregator POM?
What are Maven profiles, and when would you use them?
How do you manage different configurations for development, testing, and production using Maven?
How does Maven integrate with CI/CD tools like Jenkins, GitHub Actions, or Azure DevOps?
A Maven build suddenly starts failing with dependency resolution errors after working previously. How would you troubleshoot the issue?

## CI/CD, Docker, Kubernetes
Docker (10 Questions)
What is Docker, and how is it different from a virtual machine?
Explain the purpose of a Dockerfile and its common instructions (FROM, COPY, RUN, CMD, ENTRYPOINT).
What is the difference between CMD and ENTRYPOINT?
What is the difference between a Docker image and a Docker container?
How do you optimize a Docker image for a Spring Boot application?
What are multi-stage Docker builds, and why are they useful?
Explain Docker volumes and bind mounts. When would you use each?
How do Docker networks work? Explain bridge, host, and overlay networks.
A Docker container keeps restarting. How would you troubleshoot the issue?
What best practices do you follow while containerizing Java applications?
Kubernetes (10 Questions)
What is Kubernetes, and why is it used?
Explain the architecture of a Kubernetes cluster (Control Plane and Worker Nodes).
What is the difference between a Pod, Deployment, ReplicaSet, and StatefulSet?
What is the purpose of a Kubernetes Service? Explain ClusterIP, NodePort, and LoadBalancer.
What are ConfigMaps and Secrets? How do they differ?
Explain liveness, readiness, and startup probes with examples.
What are Ingress and Ingress Controllers?
How does Kubernetes perform rolling updates and rollbacks?
Your application Pod is in CrashLoopBackOff. How would you investigate and resolve it?
How do Horizontal Pod Autoscaler (HPA) and Vertical Pod Autoscaler (VPA) work?
CI/CD (10 Questions)
What is CI/CD, and what are its benefits?
Explain a typical CI/CD pipeline for a Spring Boot microservice.
How do Jenkins, GitHub Actions, GitLab CI, and Azure DevOps differ?
What stages would you include in a production-ready CI/CD pipeline?
How do you automate testing in a CI/CD pipeline?
What strategies can be used for application deployment (Blue-Green, Canary, Rolling)?
How do you securely manage secrets in a CI/CD pipeline?
How do you version Docker images and application artifacts?
What would you do if a deployment succeeds but the application fails health checks?
Describe an end-to-end deployment process from code commit to production using Git, Maven, Docker, Kubernetes, and Jenkins.
Your Docker image size is over 1 GB. How would you reduce it?
A Kubernetes deployment is running, but users cannot access the application. How would you debug it?
Jenkins pipeline fails during Maven build but succeeds locally. What could be the reasons?
One microservice cannot communicate with another inside Kubernetes. How would you troubleshoot?
Your application works locally but crashes in Docker. How do you investigate?
How do you perform zero-downtime deployments in Kubernetes?
How do you roll back a failed deployment in Kubernetes?
Your CI/CD pipeline takes 30 minutes to complete. How would you optimize it?
How would you handle database migrations in a CI/CD pipeline?
Describe the complete deployment process you followed in your current or previous project.

## GIT
What is Git, and how is it different from other version control systems?
What is the difference between Git and GitHub/GitLab/Bitbucket?
Explain the Git workflow from making changes to pushing code.
What is the difference between a Git repository and a working directory?
What is the purpose of the staging area (index)?
Explain the difference between git add, git commit, and git push.
What is the difference between git fetch and git pull?
What is the difference between git clone and git init?
How do you check the status of your working directory?
How do you view the commit history of a repository?
Branching and Merging
What is a Git branch, and why is branching important?
How do you create, switch, and delete branches?
What is the difference between git merge and git rebase?
When would you prefer rebase over merge?
What is a merge conflict, and how do you resolve it?
Explain the Git Flow branching strategy.
What is GitHub Flow, and how is it different from Git Flow?
What are fast-forward and non-fast-forward merges?
How do you squash multiple commits into one?
What is a pull request (PR), and what do you typically review before approving one?
Advanced Git
What is the difference between git reset, git revert, and git restore?
Explain the different modes of git reset (--soft, --mixed, --hard).
What is git stash, and when would you use it?
How do you recover a deleted branch or lost commit?
What is git reflog, and how is it useful?
How do Git tags differ from branches? What are annotated and lightweight tags?
How do you resolve conflicts during a rebase?
What are submodules in Git, and when would you use them?
How do you remove a file from Git history if it contains sensitive information?
What Git best practices do you follow when working in a team?
Scenario-Based Questions (Frequently Asked)

Interviewers often ask practical questions like these:

You accidentally committed directly to the main branch. What would you do?
You committed a secret (password/API key) to the repository. How would you fix it?
You have uncommitted changes but need to switch branches urgently. What would you do?
A teammate force-pushed to a shared branch. How would you recover your work?
Your local branch has diverged from the remote branch. How would you resolve it?
You need to undo your last commit without losing the code changes. Which Git command would you use?
Your git pull results in multiple merge conflicts. How would you resolve them?
You accidentally deleted a branch containing important work. How would you recover it?
During code review, you are asked to squash 10 commits into a single clean commit. How would you do it?
Describe the Git workflow you follow from creating a feature branch until deploying the code to production.

## Language Agnostic
What are the SOLID principles? Explain each with an example.
What is the difference between abstraction and encapsulation?
What is the difference between composition and inheritance? When would you choose one over the other?
What is coupling and cohesion? Why are they important?
What are design patterns? Name a few commonly used ones.
What is the difference between a framework and a library?
What is technical debt? How do you manage it?
What makes code maintainable?
What is defensive programming?
How do you approach code reviews?
System Design & Architecture
What is the difference between monolithic and microservices architectures?
What are the advantages and disadvantages of microservices?
What is REST, and what are the principles of RESTful APIs?
What is the difference between synchronous and asynchronous communication?
When would you use message queues instead of synchronous APIs?
What is eventual consistency?
Explain horizontal scaling vs vertical scaling.
What is load balancing, and why is it important?
What is caching? What are some common caching strategies?
What factors would you consider when designing a highly available system?
Databases
What is the difference between SQL and NoSQL databases?
What is database normalization, and when might you intentionally denormalize?
What is indexing, and how does it improve query performance?
What causes database deadlocks, and how can they be prevented?
What is the ACID property of transactions?
Testing & Quality
What is the testing pyramid?
What is the difference between unit, integration, system, and end-to-end testing?
What makes a good automated test?
How do you debug a production issue that you cannot reproduce locally?
What practices do you follow to improve application performance and reliability?

## Developer Workflow
Daily Development Workflow
Walk me through your typical day as a software developer.
How do you approach a new feature that you've never worked on before?
How do you estimate the effort required for a task?
How do you break down a large feature into smaller, manageable tasks?
What do you do before you start writing code?
How do you ensure your code is ready before opening a pull request?
How do you keep track of your work and priorities?
How do you decide when a feature is "done"?
How do you balance writing clean code with meeting deadlines?
What does your ideal development workflow look like?
Problem Solving & Debugging
Tell me about a difficult bug you solved. How did you approach it?
What is your debugging process when an issue is reported in production?
If you cannot reproduce a reported bug, what steps do you take?
When you get stuck on a problem, what do you do?
How do you identify the root cause instead of just fixing the symptoms?
How do you approach performance-related issues?
Have you ever made a mistake that caused a production issue? What happened, and what did you learn?
What tools do you typically use when troubleshooting an application?
How do you verify that your fix doesn't introduce new issues?
Describe a problem that took several days to solve. How did you stay organized?
Collaboration & Communication
How do you handle disagreements during code reviews?
Describe a time you received critical feedback on your code. How did you respond?
How do you explain technical concepts to non-technical stakeholders?
What do you do if you're blocked waiting for another team?
How do you help junior developers on your team?
How do you ensure knowledge is shared within your team?
Describe a situation where you had to collaborate with QA, DevOps, or Product to solve a problem.
Ownership & Decision Making
Tell me about a feature or project where you took ownership from start to finish.
If you notice a recurring problem in your team's development process, how would you address it?
Looking back over the last year, what engineering practice or habit has most improved your effectiveness as a developer?
Excellent Follow-up Questions

These are often the questions that separate strong candidates from average ones:

Tell me about a time you disagreed with your team's technical approach. What did you do?
Describe a production incident you were involved in. What was your role?
What's the most difficult technical decision you've had to make?
How do you know when to ask for help versus continuing to investigate on your own?
How do you handle ambiguous requirements?
Have you ever challenged a requirement from the product owner? Why?
Describe a time when your initial solution turned out to be wrong. What happened next?
How do you prioritize multiple urgent tasks?
What do you do when a sprint is at risk of not meeting its goal?
What's an example of something you automated that saved your team time?

## Distributed Computing
What is distributed computing?
What are the key challenges in distributed systems?
What are the benefits and drawbacks of distributed architectures?
What is the CAP theorem? Explain each component.
What is the difference between strong consistency and eventual consistency?
What are consistency, availability, and partition tolerance?
What is the PACELC theorem?
What is data replication, and why is it important?
What is the difference between synchronous and asynchronous replication?
What is data partitioning (sharding)?
What strategies can be used to partition data?
What is replication lag, and what problems can it cause?
What is quorum, and how is it used?
What is consensus in distributed systems?
What are common consensus algorithms (e.g., Raft, Paxos)?
What is leader election, and why is it needed?
What happens when a leader fails?
What is split-brain, and how can it be prevented?
What are distributed transactions?
What are the challenges of distributed transactions?
What is the Two-Phase Commit (2PC) protocol?
What are the limitations of Two-Phase Commit?
What is the Saga pattern?
What is compensating transaction?
What is idempotency, and why is it important in distributed systems?
What is eventual consistency, and where is it appropriate?
How do you handle duplicate requests?
How do you ensure exactly-once processing?
What is at-most-once, at-least-once, and exactly-once delivery?
What is distributed locking?
When should distributed locks be avoided?
What are common implementations of distributed locks?
What is service discovery?
What is an API Gateway, and what problems does it solve?
What is a service mesh?
What is load balancing?
What are the different load balancing strategies?
What is health checking in distributed systems?
What is circuit breaker pattern?
What is retry logic, and what are its pitfalls?
What is exponential backoff?
What is timeout management, and why is it important?
What is bulkheading?
What is backpressure?
What is fault tolerance?
What is graceful degradation?
What is eventual failure, and how should systems handle it?
What is distributed caching?
What are cache invalidation strategies?
What is cache-aside pattern?
What is write-through vs write-behind caching?
What is the difference between horizontal and vertical scaling?
What is elasticity in distributed systems?
How do you design a highly available system?
What is observability?
What are logs, metrics, and traces?
What is distributed tracing?
How do you troubleshoot failures across multiple services?
What are common causes of cascading failures?
What techniques can prevent cascading failures?
What security challenges are unique to distributed systems?
How do services authenticate and authorize each other?
What are the trade-offs between monolithic and microservices architectures?
Describe a distributed system you've designed or worked on.
How would you design a distributed URL shortener?
How would you design a distributed notification system?
How would you design a distributed rate limiter?
How would you handle network partitions in a distributed application?
What are the most important design principles for building reliable distributed systems?


## Open Ended Questinos

## Spring
What is the Spring Framework, and what problems does it solve?
What are the core modules of the Spring Framework?
What is Inversion of Control (IoC)?
What is Dependency Injection (DI)?
What are the different types of dependency injection?
What is the difference between constructor injection and field injection?
Why is constructor injection generally preferred?
What is a Spring Bean?
How are Spring Beans created and managed?
What are the different bean scopes in Spring?
What is the Spring Bean lifecycle?
What is the difference between @Component, @Service, @Repository, and @Controller?
What is component scanning, and how does it work?
What is the purpose of @Configuration and @Bean?
What is the difference between @Bean and @Component?
What is autowiring, and how does Spring resolve dependencies?
What is the purpose of @Qualifier and @Primary?
What happens when multiple beans of the same type exist?
What is lazy initialization?
What is eager initialization?
What is Aspect-Oriented Programming (AOP)?
What problems does AOP solve?
What are advice, pointcuts, and aspects?
What are common use cases for AOP?
What is Spring Boot, and how does it differ from Spring Framework?
What is auto-configuration in Spring Boot?
How does Spring Boot auto-configuration work?
What is the purpose of @SpringBootApplication?
What is Spring Boot Starter?
How do you create a custom Spring Boot Starter?
What is Spring Boot Actuator?
How do you expose custom Actuator endpoints?
What are Spring Boot profiles?
How do you manage configuration for different environments?
What is the purpose of application.properties and application.yml?
How do you externalize application configuration?
How do you inject configuration values into a Spring application?
What is the Environment abstraction in Spring?
What is Spring Expression Language (SpEL)?
What is Spring Data JPA?
What are the advantages of using Spring Data JPA?
What is the difference between CrudRepository, PagingAndSortingRepository, and JpaRepository?
What is the purpose of the @Transactional annotation?
How does transaction propagation work?
What are the different transaction propagation levels?
What are transaction isolation levels?
When would you use REQUIRES_NEW propagation?
What happens when an exception occurs inside a transaction?
What is rollback behavior in Spring transactions?
What is the difference between checked and unchecked exceptions in transaction rollback?
What is Spring MVC?
Explain the request lifecycle in Spring MVC.
What is the difference between @Controller and @RestController?
What is the purpose of @RequestMapping?
What is the difference between @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping?
How do you validate request payloads in Spring?
How do you implement global exception handling?
What is the purpose of @ControllerAdvice?
How do you customize error responses in Spring Boot?
What is content negotiation?
What is Spring Security?
How does Spring Security authentication work?
What is the difference between authentication and authorization?
How do you secure REST APIs with Spring Security?
What is JWT, and how is it integrated with Spring Security?
What is CSRF, and when should it be enabled or disabled?
What is CORS, and how do you configure it in Spring?
What is method-level security?
What is Spring Cache?
How do you implement caching in Spring?
What caching annotations are available in Spring?
How do you evict or refresh cached data?
What is asynchronous processing in Spring?
How do you execute methods asynchronously?
What is scheduling in Spring?
How do you schedule recurring tasks?
What is Spring Events?
How do you publish and consume application events?
What is Spring Cloud?
What problems does Spring Cloud solve?
What is Spring Cloud Config?
What is Spring Cloud Gateway?
What is service discovery, and how does Spring integrate with it?
How do you implement resilience using Spring?
What is circuit breaker support in Spring?
How do you test Spring applications?
What is the difference between unit tests and integration tests in Spring?
What is @SpringBootTest?
What is @WebMvcTest?
What is @DataJpaTest?
How do you mock dependencies in Spring tests?
How do you optimize the startup time of a Spring Boot application?
How do you troubleshoot bean creation or dependency injection issues?
What are some common Spring Boot performance optimizations?
Describe the Spring architecture you've used in your current or most recent project.

## Microservices
What are microservices, and how do they differ from a monolithic architecture?
What are the advantages and disadvantages of microservices?
When would you choose a monolith over microservices?
What characteristics define a well-designed microservice?
How do you determine service boundaries?
What is bounded context, and how does it relate to microservices?
How should data be managed across microservices?
Why should each microservice own its database?
What are the challenges of distributed data management?
What are the different communication patterns between microservices?
When would you use synchronous communication versus asynchronous communication?
What are the pros and cons of REST, gRPC, and messaging?
What is an API Gateway, and why is it used?
What is service discovery?
What is client-side versus server-side service discovery?
What is a service registry?
What is a service mesh, and when would you use one?
What are the responsibilities of a service mesh?
How do you implement authentication and authorization between services?
How do you propagate user identity across services?
What is JWT, and how is it used in microservices?
What are common patterns for securing service-to-service communication?
What is mutual TLS (mTLS)?
How do you handle configuration management across microservices?
What is centralized configuration?
How do you manage secrets in a microservices architecture?
What is distributed tracing?
What information should be included in logs for microservices?
How do you correlate requests across multiple services?
What are logs, metrics, and traces?
What tools have you used for monitoring and observability?
What is a circuit breaker pattern?
What is retry logic, and what are its risks?
What is exponential backoff?
What is timeout management, and why is it important?
What is bulkheading?
What is graceful degradation?
How do you prevent cascading failures?
What is backpressure?
What is idempotency, and why is it important?
How do you handle duplicate requests?
What is eventual consistency?
What are distributed transactions?
What is the Saga pattern?
What are compensating transactions?
What is the Outbox pattern?
What is the Inbox pattern?
How do you ensure reliable message delivery?
What is at-most-once, at-least-once, and exactly-once message delivery?
How do you handle message ordering?
What is event-driven architecture?
What is event sourcing?
What is CQRS, and when would you use it?
What is domain-driven design (DDD), and how does it apply to microservices?
What is database per service?
How do you version APIs in a microservices environment?
How do you maintain backward compatibility?
What strategies do you use for deploying microservices?
What is blue-green deployment?
What is canary deployment?
What is rolling deployment?
How do you perform zero-downtime deployments?
How do you scale individual microservices?
How do you identify bottlenecks in a microservices architecture?
What are common performance issues in microservices?
How do you cache data in a microservices architecture?
What are common anti-patterns in microservices?
What is a distributed monolith?
How do you troubleshoot failures across multiple services?
Describe a production issue involving multiple microservices and how you resolved it.
Describe a microservices architecture you've designed or worked on.
What lessons have you learned from building or maintaining microservices in production?

## Databases
What is the difference between SQL and NoSQL databases?
When would you choose a relational database over a NoSQL database?
What are the different types of NoSQL databases?
What are the ACID properties?
What is the CAP theorem, and how does it relate to databases?
What is eventual consistency?
What is normalization, and why is it important?
What are the different normal forms?
When would you choose to denormalize a database?
What is the difference between a primary key and a unique key?
What is the difference between a primary key and a foreign key?
What is a composite key?
What is an index, and how does it improve performance?
What are the different types of indexes?
What are the drawbacks of using indexes?
How do you identify missing or unused indexes?
What is a clustered index?
What is a non-clustered index?
What is the difference between a clustered and a non-clustered index?
What is a covering index?
What is the difference between WHERE and HAVING?
What is the difference between DELETE, TRUNCATE, and DROP?
What is the difference between UNION and UNION ALL?
What is the difference between GROUP BY and ORDER BY?
What is the difference between INNER JOIN, LEFT JOIN, RIGHT JOIN, and FULL OUTER JOIN?
What is a self join?
What is a cross join?
What is a subquery?
What is the difference between a subquery and a Common Table Expression (CTE)?
What are window functions, and when would you use them?
What is the difference between ROW_NUMBER(), RANK(), and DENSE_RANK()?
What are transactions?
What are transaction isolation levels?
What problems do different isolation levels solve?
What are dirty reads, non-repeatable reads, and phantom reads?
What is optimistic locking?
What is pessimistic locking?
What is the difference between optimistic and pessimistic locking?
What causes database deadlocks?
How do you detect and resolve database deadlocks?
What is connection pooling?
Why is connection pooling important?
What is query optimization?
How do you troubleshoot a slow SQL query?
How do you read an execution plan?
What causes full table scans?
What are common causes of poor database performance?
How would you optimize a query returning millions of rows?
What is pagination, and what are the common approaches to implementing it?
What is the difference between offset-based and cursor-based pagination?
What is database partitioning?
What is the difference between partitioning and sharding?
What is sharding, and when would you use it?
What is database replication?
What is the difference between synchronous and asynchronous replication?
What is the difference between read replicas and primary databases?
How do you scale a relational database?
What is database failover?
What is high availability in databases?
What is backup and recovery?
What is point-in-time recovery?
What is soft delete, and when would you use it?
What is database migration, and how do you manage schema changes?
What tools have you used for database migrations?
How do you ensure data consistency during schema migrations?
What is caching, and when should it be used instead of querying the database?
What are common cache invalidation strategies?
What are the trade-offs between consistency and performance?
What security practices should be followed for databases?
How do you protect sensitive data stored in a database?
How do you audit database access?
Describe the largest database you've worked with.
Describe a challenging database performance issue you've resolved.
How would you design the database schema for a high-traffic e-commerce application?
How would you model a one-to-many, many-to-many, and one-to-one relationship?
What are the most common database anti-patterns you've encountered?

## Challenges
- Implement a HeartBeat Scheduler


## Behavioral
- Who long do you wait until you ask for help?
- The team lead disagrees with your approach, how do you convince him?

## Organizar
- [ ] Future vs CompletableFuture vs Promise
- [ ] Using ExecutorService vs Threads
- [ ] Spring Bean vs Spring Component
- [ ] Whats the point of Static final methods?
- [ ] What is faster Concatenation or StringBuilder
- [ ] How do you deal with Maven Hell
- [ ] Tell me about final in Java
- [ ] What makes a project/code complex to you?
- [ ] Define Complexity?
- [ ] Final methods are more performant, why and in what cases?
- [ ] In telliJ theres several ways to refresh the project. what are they and what are the differnces?
- [ ] ClassDef vs NoClassDef
- [ ] Quantos valores possiveis para 1 char, e 1 string?
- [ ] Where can Strings live in Java?
