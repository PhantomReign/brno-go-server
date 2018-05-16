#Brno Go Server Application

Implementation of server for mobile application. It contains all source files in two modules.

##Core module

This module accepts all requests from clients and then processes them to based on the type of request received. 
It also provides an interface for managing and updating static data by authorized users through following end point:
`domain_name/admin`

Core module mainly consist of:

  * Input files processing and persistence
  * Route planing between two stations by using A* algorithm
  * REST service (controllers)
  * Admin section


##Live module
Retrieves and provides live data of vehicles and departures. Data are available through two services:
  * `DepartureService` - provides live departure data.
  * `VehicleService` - provides live vehicle data.

These data were provided by **Kordis J.M.K**. This provider is accessible only from one specific IP address. 
To reach this address a tunnel connection is required.


##Setup
1. Open project in IntelliJ Idea 2018.

2. Configure database information in application.properties file inside core module.

3. Create a tunnel on port `9001` to the device which can access Kordis J.M.K servers. 
Example: `ssh -D 9001 login@pcuifs2.fit.vutbr.cz`

4. Generate sources for Web Service (OPTIONAL - files are already generated):
   1.  Right click on kordis folder in live module.
   2.  Choose `WebServices` → `Generate Java Code From WSDL...`
   3.  Enter url `http://kordis.idsjmk.cz:8000/Traffic/?wsdl`
   4.  Generate (Don't forget setting up proxy inside IntelliJ)

5. Run application.

6. Access `domain_name/admin` endpoint and add necessary files. Don't forget to join content of day files to one file.


For accessing server outside localhost is recommended to use `https://localtunnel.github.io/www/`.
Example of use: `lt --port 8080 --subdomain brnogoserver`. Note: If different subdomain is generated, it means
the domain is taken. 

