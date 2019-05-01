# Brno Go Server Application
> **Not maintained, for study purposes only.**

Implementation of server for mobile application. It contains all source files in two modules.
Created as a part of [Master's Thesis](https://www.vutbr.cz/www_base/zav_prace_soubor_verejne.php?file_id=181410) at FIT BUT - understanding of Slovak language is required.

### Core module

This module accepts all requests from clients and then processes them to based on the type of request received. 
It also provides an interface for managing and updating static data by authorized users through following end point:
`domain_name/admin`

Core module consist mainly of:
  * Input files processing and persistence
  * Route planing between two stations by using A* algorithm
  * REST service (controllers)
  * Admin section


### Live module
Retrieves and provides live data of vehicles and departures. Data are available through two services:
  * `DepartureService` - provides live departure data.
  * `VehicleService` - provides live vehicle data.

These data were provided by **Kordis J.M.K**. This provider is accessible only from one specific IP address. 
To reach this address an access to FIT BUT's network is required.


## Setup
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
7. Update database information (stations first).

## Exposing localhost

For exposing localhost is recommended to use `https://localtunnel.github.io/www/`.

Example of usage: `lt --port 8080 --subdomain brnogoserver`. 
> Note: If different subdomain is generated, it means
the subdomain is taken. 

