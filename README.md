#####Q1：Cannot start compilation: the output path is not specified for module. Specify the output path in Configure Project.

1. 在Modules设置里勾选”Inherit project compile path”

2. 设置Project中的”Project compiler output”
3. 选择”Project的路径”+”\out”，比如说我的就是

#####Q2: Error:(3, 32) java: package org.springframework.boot does not exist

Settings -> Maven -> Import Maven projects automatically
Right click on the project;
Select the Maven|Reimport menu item in the pop-up menu.


