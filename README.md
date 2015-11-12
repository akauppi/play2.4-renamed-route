# public-hello

Sample for trying to make a modular Play 2.4 system.

- each module is a Play 2.4 project itself
    - separately runnable and testable (`sbt run`, `sbt test`)

- each module lives in a github repo (and sbt project) of its own

- modules can be brought together via Maven (by an umbrella project) 
    - run, deployed, integration tested etc. centrally

## References

Ideas from 

http://eng.kifi.com/multi-project-deployment-in-play-framework/

https://github.com/kifi/multiproject

But that's using Play 2.3.

