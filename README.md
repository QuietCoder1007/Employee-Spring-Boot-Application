# Employee-Spring-Boot-Application

## CREATE
#### POST a new user
```curl -X POST -d username=? -d password=? -d birthYear=? http://localhost:8080/employees/add```

## READ
#### GET all users from database
```curl -X GET http://localhost:8080/employees/all ```

#### GET user by id from database
```curl -X GET http://localhost:8080/employees/{id}```

## UPDATE
#### PUT in new user info to user with specific id
```curl -X PUT -d username=? -d password=? -d birthYear=? http://localhost:8080/employees/add```

## DELETE
#### DELETE all users from database
```curl -X DELETE http://localhost:8080/employees/delete```

#### DELETE user by id from database
```curl -X DELETE http://localhost:8080/employees/{id}```
