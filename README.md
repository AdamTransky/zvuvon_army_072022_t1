Sample of zvuvon server activation : 
===================================

To run server use  : ./gradlew build bootRun

To send REST requests to server use curl , see sample of results: 
curl 'localhost:8080/calculate?velocity=3&height=5&angle=30'
{"strikeSpeed":10.348912986396204,"distanceX":0.7945187190682922,"strikeAngle":25.81470477286917}


$ curl 'localhost:8080/calculate?velocity=3&height=5&angle=80'
{"strikeSpeed":10.348912986396204,"distanceX":0.3137799480052008,"strikeAngle":5.176628086124677}

$ curl 'localhost:8080/calculate?velocity=3&height=10&angle=80'
{"strikeSpeed":14.324803663575986,"distanceX":0.3137799480052008,"strikeAngle":5.1927928852660195}

$ curl 'localhost:8080/calculate?velocity=6&height=10&angle=80'
{"strikeSpeed":15.238110119040353,"distanceX":1.2551197920208033,"strikeAngle":2.596518153191513}


