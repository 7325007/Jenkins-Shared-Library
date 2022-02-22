# Jenkins-Shared-Library

- Create shared Library
https://www.jenkins.io/doc/book/pipeline/shared-libraries/
- how to configure in Jenkins
	- Dashboard -> Manage Jenkins -> Configure system -> Global Pipeline Libraries
	- Select Add
	- Give the SL a name and repo URL
- how to use shared Library
	- in your pipeline use @Library("shared-lib-name") _
	- you can now import classes and use them
- Shared Library unit test
	- test/com/hexaware/sharelib
