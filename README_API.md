#API
List of most important REST API endpoints provided by Core module.
 
####Endpoints
 
##### Stations 
**`[GET] /brnogo/api/station`**
 
*Parameters:*
   * `none` - returns all available stations
 
*Data Format:*

```javascript
[
    {
        "id":1001,
        "name":"Achtelky",
        "zone":101
    },
    {
        "id":1006,
        "name":"Antonínská",
        "zone":100
    },
    ...
]
```

##### Vehicle

**`[GET] /brnogo/api/vehicle`**
 
*Parameters:*
   * `lC` - specifies line code of vehicle.
   * `lId` - specifies line id (vehicle number) of vehicle.
 
*Data Format:*

```javascript
{
    "routeId": 1409,
    "carNum": 1046,
    "lineId": 5,
    "lastPlatformId": 1378,
    "longitude": 16.59297,
    "latitude": 49.18988,
    "delay": 0,
    "barrierLess": false
}
```

##### Departures 
 
**`[GET] /brnogo/api/departures`**
 
*Parameters:*
   * `sId` - id of the station.
  
*Data Format:*

```javascript
[
    {
        "stationId": 1567,
        "direction": "Červinkova",
        "vehicles": [
            {
                "lineName": "12",
                "finalStationName": "Technologický park",
                "timeMark": "4 min",
                "barrierLess": false
            },
            {
                "lineName": "12",
                "finalStationName": "Technologický park",
                "timeMark": "13 min",
                "barrierLess": true
            },
            {
                "lineName": "12",
                "finalStationName": "Technologický park",
                "timeMark": "23 min",
                "barrierLess": false
            },
            {
                "lineName": "12",
                "finalStationName": "Technologický park",
                "timeMark": "20:48",
                "barrierLess": false
            },
            {
                "lineName": "12",
                "finalStationName": "Technologický park",
                "timeMark": "20:58",
                "barrierLess": true
            }
        ]
    },
    ...
]
```

##### Routes and Directions 
 
**`[GET] /brnogo/api/routes`**
 
*Parameters (Routes):*
   * `sId` - start station id.
   * `dId` - destination station id.
   * `dTime` - date time in epoch seconds.
   * `mTime` - min time to move (min transfer time).
   * `mTrans` - max transfers.
   * `live` - availability of live data.
   * `lim` -  number of routes to find.

**`[GET] /brnogo/api/directions`**

*Parameters (Directions):*
   * `sId` - start station id.
   * `dId` - destination station id.
   * `dTime` - date time in epoch seconds.
   * `mTime` - min time to move (min transfer time).
   * `mTrans` - max transfers.

*Data Format:*

```javascript
[
    {
        "id": "-604173808",
        "startStationId": 1586,
        "destinationStationId": 1659,
        "startStationName": "Slovanské náměstí",
        "destinationStationName": "Technologický park",
        "routeTime": 780,
        "minTimeToMove": 180,
        "vehicles": [
            {
                "lineCode": 1238,
                "lineId": 30,
                "type": 2,
                "delay": 0,
                "path": [
                    {
                        "stationId": 1586,
                        "stationName": "Slovanské náměstí",
                        "stationZone": 101,
                        "stopId": 3,
                        "stopLongitude": 16.591009,
                        "stopLatitude": 49.223525,
                        "stopDescription": ">Skácelova",
                        "timeOfArrival": -1,
                        "timeOfDeparture": 1526496060,
                        "formattedTimeOfArrival": "",
                        "formattedTimeOfDeparture": "20:41"
                    },
                    {
                        "stationId": 1567,
                        "stationName": "Skácelova",
                        "stationZone": 101,
                        "stopId": 5,
                        "stopLongitude": 16.584711000000002,
                        "stopLatitude": 49.221353,
                        "stopDescription": "bus > Přívrat",
                        "timeOfArrival": 1526496120,
                        "timeOfDeparture": -1,
                        "formattedTimeOfArrival": "20:42",
                        "formattedTimeOfDeparture": ""
                    }
                ]
            },
            {
                "lineCode": 1408,
                "lineId": 12,
                "type": 1,
                "delay": 60,
                "path": [
                    {
                        "stationId": 1567,
                        "stationName": "Skácelova",
                        "stationZone": 101,
                        "stopId": 1,
                        "stopLongitude": 16.585096,
                        "stopLatitude": 49.22188566666667,
                        "stopDescription": "Tram>Červinkova",
                        "timeOfArrival": -1,
                        "timeOfDeparture": 1526496480,
                        "formattedTimeOfArrival": "",
                        "formattedTimeOfDeparture": "20:48"
                    },
                    {
                        "stationId": 1072,
                        "stationName": "Kr. Pole, Červinkova",
                        "stationZone": 101,
                        "stopId": 1,
                        "stopLongitude": 16.582624,
                        "stopLatitude": 49.22545,
                        "stopDescription": ">TM,Kolejní",
                        "timeOfArrival": 1526496600,
                        "timeOfDeparture": 1526496600,
                        "formattedTimeOfArrival": "20:50",
                        "formattedTimeOfDeparture": "20:50"
                    },
                    {
                        "stationId": 1664,
                        "stationName": "Technické muzeum",
                        "stationZone": 101,
                        "stopId": 1,
                        "stopLongitude": 16.582285,
                        "stopLatitude": 49.2280465,
                        "stopDescription": "Tram >Tech.park",
                        "timeOfArrival": 1526496660,
                        "timeOfDeparture": 1526496660,
                        "formattedTimeOfArrival": "20:51",
                        "formattedTimeOfDeparture": "20:51"
                    },
                    {
                        "stationId": 1659,
                        "stationName": "Technologický park",
                        "stationZone": 101,
                        "stopId": 1,
                        "stopLongitude": 16.577036333333332,
                        "stopLatitude": 49.23136133333333,
                        "stopDescription": "smyčka příjezd",
                        "timeOfArrival": 1526496780,
                        "timeOfDeparture": -1,
                        "formattedTimeOfArrival": "20:53",
                        "formattedTimeOfDeparture": ""
                    }
                ]
            }
        ],
        "saved": false
    }
]
```
Note: In case of directions, delay will be always 0.
