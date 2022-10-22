Getting following error

org.springframework.dao.InvalidDataAccessApiUsageException: The EntityGraph-Feature requires at least a JPA 2.1 persistence provider


``` 
:~/Downloads/demo$ target/demo

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::            (v3.0.0-RC1)

2022-10-22T11:18:10.616-05:00  INFO 81456 --- [           main] com.example.demo.DemoApplication         : Starting AOT-processed DemoApplication using Java 17.0.4 on pop-os with PID 81456 (/home/gbuntu/Downloads/demo(1)/demo/target/demo started by gbuntu in /home/gbuntu/Downloads/demo(1)/demo)
2022-10-22T11:18:10.616-05:00  INFO 81456 --- [           main] com.example.demo.DemoApplication         : No active profile set, falling back to 1 default profile: "default"
2022-10-22T11:18:10.630-05:00  INFO 81456 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-10-22T11:18:10.633-05:00  INFO 81456 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:b1ccbb4f-8685-4dae-aa91-48ab4a0a0521 user=SA
2022-10-22T11:18:10.633-05:00  INFO 81456 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-10-22T11:18:10.634-05:00  INFO 81456 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-10-22T11:18:10.635-05:00  INFO 81456 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.1.4.Final
2022-10-22T11:18:10.636-05:00  WARN 81456 --- [           main] org.hibernate.orm.deprecation            : HHH90000021: Encountered deprecated setting [javax.persistence.sharedCache.mode], use [jakarta.persistence.sharedCache.mode] instead
2022-10-22T11:18:10.638-05:00  INFO 81456 --- [           main] SQL dialect                              : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2022-10-22T11:18:10.642-05:00  WARN 81456 --- [           main] o.h.id.enhanced.OptimizerFactory         : HHH000322: Unable to instantiate specified optimizer [pooled], falling back to noop
2022-10-22T11:18:10.642-05:00  WARN 81456 --- [           main] o.h.id.enhanced.OptimizerFactory         : HHH000322: Unable to instantiate specified optimizer [pooled], falling back to noop
2022-10-22T11:18:10.645-05:00  INFO 81456 --- [           main] o.h.tuple.entity.EntityMetamodel         : HHH000157: Lazy property fetching available for: com.example.demo.Note
2022-10-22T11:18:10.647-05:00  INFO 81456 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-10-22T11:18:10.647-05:00  INFO 81456 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-10-22T11:18:10.665-05:00 ERROR 81456 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.dao.InvalidDataAccessApiUsageException: The EntityGraph-Feature requires at least a JPA 2.1 persistence provider
        at org.springframework.orm.jpa.EntityManagerFactoryUtils.convertJpaAccessExceptionIfPossible(EntityManagerFactoryUtils.java:371) ~[na:na]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:235) ~[na:na]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:550) ~[demo:na]
        at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61) ~[na:na]
        at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242) ~[na:na]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152) ~[na:na]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:163) ~[na:na]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97) ~[na:na]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:218) ~[na:na]
        at com.example.demo.$Proxy51.findAll(Unknown Source) ~[demo:na]
        at com.example.demo.AService.ctxRefreshed(AService.java:16) ~[demo:na]
        at java.lang.reflect.Method.invoke(Method.java:568) ~[demo:na]
        at org.springframework.context.event.ApplicationListenerMethodAdapter.doInvoke(ApplicationListenerMethodAdapter.java:343) ~[demo:na]
        at org.springframework.context.event.ApplicationListenerMethodAdapter.processEvent(ApplicationListenerMethodAdapter.java:228) ~[demo:na]
        at org.springframework.context.event.ApplicationListenerMethodAdapter.onApplicationEvent(ApplicationListenerMethodAdapter.java:165) ~[demo:na]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:176) ~[na:na]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:169) ~[na:na]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:143) ~[na:na]
        at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:413) ~[demo:6.0.0-RC2]
        at org.springframework.context.support.AbstractApplicationContext.publishEvent(AbstractApplicationContext.java:370) ~[demo:6.0.0-RC2]
        at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:936) ~[demo:6.0.0-RC2]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:587) ~[demo:6.0.0-RC2]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:730) ~[demo:3.0.0-RC1]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:432) ~[demo:3.0.0-RC1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[demo:3.0.0-RC1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1302) ~[demo:3.0.0-RC1]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1291) ~[demo:3.0.0-RC1]
        at com.example.demo.DemoApplication.main(DemoApplication.java:20) ~[demo:na]
Caused by: java.lang.IllegalArgumentException: The EntityGraph-Feature requires at least a JPA 2.1 persistence provider
        at org.springframework.util.Assert.isTrue(Assert.java:121) ~[na:na]
        at org.springframework.data.jpa.repository.query.Jpa21Utils.tryGetFetchGraph(Jpa21Utils.java:103) ~[na:na]
        at org.springframework.data.jpa.repository.query.Jpa21Utils.getFetchGraphHint(Jpa21Utils.java:76) ~[na:na]
        at org.springframework.data.jpa.repository.support.DefaultQueryHints.lambda$getFetchGraphs$0(DefaultQueryHints.java:101) ~[na:na]
        at org.springframework.data.util.Optionals.lambda$mapIfAllPresent$5(Optionals.java:191) ~[na:na]
        at java.util.Optional.map(Optional.java:260) ~[demo:na]
        at org.springframework.data.util.Optionals.lambda$mapIfAllPresent$6(Optionals.java:191) ~[na:na]
        at java.util.Optional.flatMap(Optional.java:289) ~[demo:na]
        at org.springframework.data.util.Optionals.mapIfAllPresent(Optionals.java:191) ~[na:na]
        at org.springframework.data.jpa.repository.support.DefaultQueryHints.getFetchGraphs(DefaultQueryHints.java:100) ~[na:na]
        at org.springframework.data.jpa.repository.support.DefaultQueryHints.combineHints(DefaultQueryHints.java:94) ~[na:na]
        at org.springframework.data.jpa.repository.support.DefaultQueryHints.forEach(DefaultQueryHints.java:90) ~[na:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.applyQueryHints(SimpleJpaRepository.java:832) ~[demo:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.applyRepositoryMethodMetadata(SimpleJpaRepository.java:825) ~[demo:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.getQuery(SimpleJpaRepository.java:748) ~[demo:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.getQuery(SimpleJpaRepository.java:726) ~[demo:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.findAll(SimpleJpaRepository.java:405) ~[demo:na]
        at java.lang.reflect.Method.invoke(Method.java:568) ~[demo:na]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker$RepositoryFragmentMethodInvoker.lambda$new$0(RepositoryMethodInvoker.java:289) ~[na:na]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:137) ~[demo:na]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:121) ~[demo:na]
        at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:516) ~[demo:na]
        at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:285) ~[na:na]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:628) ~[na:na]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:160) ~[na:na]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:135) ~[na:na]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:77) ~[na:na]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123) ~[na:na]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:388) ~[demo:6.0.0-RC2]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[demo:6.0.0-RC2]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[demo:6.0.0-RC2]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137) ~[na:na]
        ... 25 common frames omitted

2022-10-22T11:18:10.665-05:00  INFO 81456 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2022-10-22T11:18:10.666-05:00  INFO 81456 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2022-10-22T11:18:10.666-05:00  INFO 81456 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.



```