**1 Introduction:**

This project is framework for testing restAPI. As an example we are calling https://open.er-api.com/v6/latest/USD and validating for below cases:

• API call is successful and returns valid price.

• Check the status code and status retuned by the API response.
o API could return multiple statuses like SUCCESS, FAILURE etc. Make sure this
is catered for.

• Fetch the USD price against the AED and make sure the prices are in range on 3.6 –
3.7.

• Verify that 162 currency pairs are retuned by the API.

• Make sure API response matches the Json schema.
o Generate a schema from the API response.

**2 Build and Run**

Please follow below steps to build and run

1. **Clone the repo**: git clone 
2. **change directory**: cd R3USDRates
3. **Execute**: mvn test -DxmlFilePath=src/main/java/testng.xml

or
3. Open Project in IDE and run UDSRatesTest.java file.

**3 Framework Design**

**3.1 Folder Structure**

*src/main/java/com/r3/DataProviders*: Contatins all the dataproviders to feed the test cases

*src/main/java/com/r3/Enums*: Contains Enums in the Request or Response, in this case result parameter in the response is added as enum

*src/main/java/com/r3/Models*: Contains Java POJOs for mapping request/ responses. 

*src/main/java/com/r3/Tests*: Contains the main  testng Tests

*src/main/java/com/r3/Utils*: Contains the utils needed for the test like APIUtil, which has http methods to call apis. 

*src/main/java/com/r3/Validators*: Contains the validators for the responses recieved from api. In this case it has validations for all the acceptance criteria.