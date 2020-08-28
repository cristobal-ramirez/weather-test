# Test MetaWeather REST service

Brief solution description: For simplicity I choosed a GET request by passing a parameter that defines what city or cities eventually I would like to ask for the current weather.
The implementation of a REST service approach is because it is the standard used for server side technologies and the client side as well. The less effort to make it run
Metaweather REST services integration was quite easy after some testing and I used the same approach of MetaWeather to define the response of the service and that is JSON format.

I used Spring framework to build the REST service app, spring boot to be specific and I just take advantage of the skeleton that Spring Boot runs behind the scene. 
I just focused to code the client implementation to call the Metaweather services and some bussines logic as well.

The mainly reason why I choosed spring over other frameworks to build this small implementation is the productivity this framework gives me to achive with 
less effort more features following proven standards in web development.

For the sake of time I generate part of the code using this website http://www.jsonschema2pojo.org just for transfer pojos.

Metaweather service endpoints:

https://www.metaweather.com/api/location/search/?query=${city}

https://www.metaweather.com/api/location/${woeid}/

The service was uploaded to be tested in the link below, just change the value passed to city parameter:

https://cramirez-weather-test.herokuapp.com/weather?city=santiago
