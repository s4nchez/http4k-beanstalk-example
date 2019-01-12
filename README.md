# Deploy http4k app to AWS Beanstalk

setup AWS credentials
### Pre-requisites

* An AWS account
* The AWS command line tool (`awscli`) installed (for setup only)

Create the example application in Beanstalk:

```bash
aws elasticbeanstalk create-application --application-name http4-beanstalk-example
```

Create an environment where the application will be deployed to:

```bash
aws elasticbeanstalk create-environment --application-name http4-beanstalk-example --environment-name staging --solution-stack-name "64bit Amazon Linux 2018.03 v2.7.8 running Java 8"
```

This step should take a while (AWS will setup EC2 instances)

Deploy:
```bash
./gradlew deployStaging
``