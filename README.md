# public-hello

Sample for trying to make a modular Play 2.4 system.

- each module is a Play 2.4 project itself
    - separately runnable and testable (`sbt run`, `sbt test`)

- each module lives in a github repo (and sbt project) of its own

- modules can be brought together via Maven (by an umbrella project) 
    - run, deployed, integration tested etc. centrally

## The Problem

If instead of `conf/routes` we're using some other file name (defined in `conf/hello-application.conf`), `sbt test` gives this:

```
[info] Hello should
[error]   ! give {hello: true}
[error]    Unable to provision, see the following errors:
[error]    
[error]    1) Error in custom provider, java.lang.ClassCastException: interface play.api.routing.Router is not assignable from class hello.routes
[error]      while locating play.api.test.FakeRouterProvider
[error]      while locating play.api.routing.Router
[error]    
[error]    1 error (InjectorImpl.java:1025)
```
It may be a Play 2.4 bug, or something needs to be done differently within Play 2.4. Posted this project to find a solution to this.


## References

Ideas from 

http://eng.kifi.com/multi-project-deployment-in-play-framework/

https://github.com/kifi/multiproject

But that's using Play 2.3.

