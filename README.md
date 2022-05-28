# spring-cloud-config-refresh-poc
poc on git config, refresh the properties

----- Advantages:

------ Disadvantages

----GIT Cloud Config Refresh POC
Cloud Config Service
HealthSafeId Service
Process Engine Service
Admin Tool Service


spring-cloud-config-refresh-poc
spring-cloud-config-refresh-poc-config-repo

Service name - port number -- application name
cloud-config-service (2050) -- 
healthsafe-service  (2051)  -- HealthSafe
process-engine-service (2052) -- ProcessEngine
admin-tool-service (2053) -- AdminTool


http://localhost:2050/application/default
http://localhost:2050/application/default/main    -- To fetch from specific branch


http://localhost:2051/health/message
http://localhost:2051/health/flag
http://localhost:2051/actuator/refresh    - Post Operation to get the latest config from the GIT

http://localhost:2052/process/message
http://localhost:2052/process/flag
http://localhost:2052/actuator/refresh    - Post Operation to get the latest config from the GIT

http://localhost:2053/admin/message
http://localhost:2053/admin/flag
http://localhost:2053/actuator/refresh    - Post Operation to get the latest config from the GIT


Bus Refresh (Hit any of the URL to refresh the properties in all the services)
http://localhost:2051/actuator/busrefresh
http://localhost:2052/actuator/busrefresh
http://localhost:2053/actuator/busrefresh
