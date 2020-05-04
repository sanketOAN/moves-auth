PUT: localhost:8001/users/create

DATA:

{
	"username":"sanket",
	"password":"abcd",
	"firstName":"Sanket",
	"lastName":"Apte",
	"addressLine1":"address line 1",
	"city":"Toronto",
	"Province":"ON"
}


// Using Spring Repositories
GET: localhost:8001/users/getbyusername?username=sanket

// Using Spring DB Templates
GET: localhost:8001/users/getbyuserid?userId={userId}
