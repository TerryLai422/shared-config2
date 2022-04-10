# shared-config2
This one is an example of configuration server for Spring Cloud.<br />
It uses specified file name to seperate application specified configurations.<br />
<br />
The common configurations are stored in application.yml in the configuration directory.<br />
The configurations for specified application are stored as {application.name}.yml under configuration directory.<br />
Please refer to app1.yml under the following sample directory structure as an example.<br />
<br />
└─ configuration<br />
&nbsp;&emsp;&emsp;└─ application.yml<br />
&nbsp;&emsp;&emsp;└─ app1.yml<br />
&nbsp;&emsp;&emsp;└─ app1-dev.yml<br />
&nbsp;&emsp;&emsp;└─ app2.yml<br />
&nbsp;&emsp;&emsp;└─ app2-dev.yml<br />
