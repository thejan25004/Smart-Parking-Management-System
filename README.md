![eureka_ss](https://github.com/user-attachments/assets/28a903b2-60b0-4a9c-a81b-1f8431a421c2)

{
	"info": {
		"_postman_id": "44f5d2c5-eefa-49a2-8953-bc6864053a74",
		"name": "Smart_Parking_Management_System",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "31904847"
	},
	"item": [
		{
			"name": "User",
			"item": [
				{
					"name": "Logs",
					"item": [
						{
							"name": "Get All Logs",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/user_service/api/logs",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"user_service",
										"api",
										"logs"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Logs By User",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/user_service/api/logs/user/123",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"user_service",
										"api",
										"logs",
										"user",
										"123"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Logs By Id",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/user_service/api/logs/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"user_service",
										"api",
										"logs",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Delete Logs",
							"request": {
								"method": "DELETE",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/user_service/api/logs/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"user_service",
										"api",
										"logs",
										"1"
									]
								}
							},
							"response": []
						}
					]
				},
				{
					"name": "Register User",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"username\": \"john_doe02\",\r\n  \"password\": \"SecurePass12345\",\r\n  \"email\": \"john.doe01@example.com\",\r\n  \"role\": \"USER\",\r\n  \"fullName\": \"John Doe 02\",\r\n  \"phone\": \"+1234567190\"\r\n}\r\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/user_service/api/auth/register",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"user_service",
								"api",
								"auth",
								"register"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get User",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzUxMiJ9.eyJyb2xlIjoiVVNFUiIsInN1YiI6ImpvaG4uZG9lMDFAZXhhbXBsZS5jb20iLCJpYXQiOjE3NTA4MTk0NjcsImV4cCI6MTc1MDkwNTg2N30.mGQMdJfXIwPn1xyylIff0hLfQxFfxPrfc1lHLByQHfmbv3LSzpsp39JF216FJ-HYoYWrMqhOnwML4uTg1tGhgw",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/user_service/api/users/2",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"user_service",
								"api",
								"users",
								"2"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update User",
					"request": {
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"username\": \"Harsha\",\r\n  \"password\": \"SecurePass123!\",\r\n  \"email\": \"john.doe@example.com\",\r\n  \"role\": \"USER\",\r\n  \"fullName\": \"John Doe\",\r\n  \"phone\": \"+1234567890\"\r\n}\r\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/user_service/api/users/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"user_service",
								"api",
								"users",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Delete User",
					"request": {
						"method": "DELETE",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"username\": \"Harsha\",\r\n  \"password\": \"SecurePass123!\",\r\n  \"email\": \"john.doe@example.com\",\r\n  \"role\": \"USER\",\r\n  \"fullName\": \"John Doe\",\r\n  \"phone\": \"+1234567890\"\r\n}\r\n"
						},
						"url": {
							"raw": "http://localhost:8080/user_service/api/users/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"user_service",
								"api",
								"users",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Reservation History",
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzUxMiJ9.eyJyb2xlIjoiVVNFUiIsInN1YiI6ImpvaG4uZG9lMDFAZXhhbXBsZS5jb20iLCJpYXQiOjE3NTA4MTk0NjcsImV4cCI6MTc1MDkwNTg2N30.mGQMdJfXIwPn1xyylIff0hLfQxFfxPrfc1lHLByQHfmbv3LSzpsp39JF216FJ-HYoYWrMqhOnwML4uTg1tGhgw",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/user_service/api/users/123/history",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"user_service",
								"api",
								"users",
								"123",
								"history"
							]
						}
					},
					"response": []
				},
				{
					"name": "Login",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n    \"email\": \"john.doe01@example.com\",\r\n    \"password\": \"SecurePass12345\"\r\n}",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/user_service/api/auth/login",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"user_service",
								"api",
								"auth",
								"login"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Vehicle",
			"item": [
				{
					"name": "Save Vehicle",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"userId\": 123,\r\n  \"licensePlate\": \"ABC-1234\",\r\n  \"vehicleType\": \"Sedan\",\r\n  \"brand\": \"Toyota\",\r\n  \"model\": \"Corolla\"\r\n}\r\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/vehicle_service/api/vehicles",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"vehicle_service",
								"api",
								"vehicles"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Vehicles By User",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"auth": {
							"type": "jwt",
							"jwt": [
								{
									"key": "algorithm",
									"value": "HS256",
									"type": "string"
								},
								{
									"key": "isSecretBase64Encoded",
									"value": false,
									"type": "boolean"
								},
								{
									"key": "payload",
									"value": "{}",
									"type": "string"
								},
								{
									"key": "addTokenTo",
									"value": "header",
									"type": "string"
								},
								{
									"key": "headerPrefix",
									"value": "Bearer",
									"type": "string"
								},
								{
									"key": "queryParamKey",
									"value": "token",
									"type": "string"
								},
								{
									"key": "header",
									"value": "{}",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"userId\": 123,\r\n  \"licensePlate\": \"ABC-1234\",\r\n  \"vehicleType\": \"Sedan\",\r\n  \"brand\": \"Toyota\",\r\n  \"model\": \"Corolla\"\r\n}\r\n"
						},
						"url": {
							"raw": "http://localhost:8080/vehicle_service/api/vehicles/user/123",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"vehicle_service",
								"api",
								"vehicles",
								"user",
								"123"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Vehicle By ID",
					"protocolProfileBehavior": {
						"disableBodyPruning": true
					},
					"request": {
						"auth": {
							"type": "bearer",
							"bearer": [
								{
									"key": "token",
									"value": "eyJhbGciOiJIUzUxMiJ9.eyJyb2xlIjoiVVNFUiIsInN1YiI6ImpvaG4uZG9lMDFAZXhhbXBsZS5jb20iLCJpYXQiOjE3NTA4MjAwNDYsImV4cCI6MTc1MDkwNjQ0Nn0.7d3kR7zK4drAjdRB4nJ2c36yPqlWH7AuQXHtwkuIfObywOxtNVXITfmAjF06oixqhu9OQpPzpw-ZggXG47oXUQ",
									"type": "string"
								}
							]
						},
						"method": "GET",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"userId\": 123,\r\n  \"licensePlate\": \"ABC-1234\",\r\n  \"vehicleType\": \"Sedan\",\r\n  \"brand\": \"Toyota\",\r\n  \"model\": \"Corolla\"\r\n}\r\n"
						},
						"url": {
							"raw": "http://localhost:8080/vehicle_service/api/vehicles/2",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"vehicle_service",
								"api",
								"vehicles",
								"2"
							]
						}
					},
					"response": []
				},
				{
					"name": "Update Vehicle",
					"request": {
						"method": "PUT",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"userId\": 123,\r\n  \"licensePlate\": \"ABC-1334\",\r\n  \"vehicleType\": \"Sedan\",\r\n  \"brand\": \"Toyota\",\r\n  \"model\": \"Corolla\"\r\n}\r\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/vehicle_service/api/vehicles/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"vehicle_service",
								"api",
								"vehicles",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Delete Vehicle",
					"request": {
						"method": "DELETE",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"userId\": 123,\r\n  \"licensePlate\": \"ABC-1334\",\r\n  \"vehicleType\": \"Sedan\",\r\n  \"brand\": \"Toyota\",\r\n  \"model\": \"Corolla\"\r\n}\r\n"
						},
						"url": {
							"raw": "http://localhost:8080/vehicle_service/api/vehicles/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"vehicle_service",
								"api",
								"vehicles",
								"1"
							]
						}
					},
					"response": []
				}
			]
		},
		{
			"name": "Parking",
			"item": [
				{
					"name": "Zone",
					"item": [
						{
							"name": "Add Zone",
							"request": {
								"method": "POST",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"name\": \"Downtown Zone\",\r\n  \"city\": \"Colombo\",\r\n  \"latitude\": 6.9271,\r\n  \"longitude\": 79.8612\r\n}\r\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/zones",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"zones"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get All Zones",
							"protocolProfileBehavior": {
								"disableBodyPruning": true
							},
							"request": {
								"method": "GET",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"name\": \"Downtown Zone\",\r\n  \"city\": \"Colombo\",\r\n  \"latitude\": 6.9271,\r\n  \"longitude\": 79.8612\r\n}\r\n"
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/zones",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"zones"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Zone",
							"protocolProfileBehavior": {
								"disableBodyPruning": true
							},
							"request": {
								"method": "GET",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"name\": \"Downtown Zone\",\r\n  \"city\": \"Colombo\",\r\n  \"latitude\": 6.9271,\r\n  \"longitude\": 79.8612\r\n}\r\n"
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/zones/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"zones",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Update Zone",
							"request": {
								"method": "PUT",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"name\": \"Downtown Zone\",\r\n  \"city\": \"Horana\",\r\n  \"latitude\": 6.9271,\r\n  \"longitude\": 79.8612\r\n}\r\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/zones/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"zones",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Delete Zone",
							"request": {
								"method": "DELETE",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/zones/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"zones",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Zone have Space",
							"protocolProfileBehavior": {
								"disableBodyPruning": true
							},
							"request": {
								"method": "GET",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"name\": \"Downtown Zone\",\r\n  \"city\": \"Colombo\",\r\n  \"latitude\": 6.9271,\r\n  \"longitude\": 79.8612\r\n}\r\n"
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/zones/1/spaces",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"zones",
										"1",
										"spaces"
									]
								}
							},
							"response": []
						}
					]
				},
				{
					"name": "Space",
					"item": [
						{
							"name": "Add Space",
							"request": {
								"method": "POST",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"ownerId\": 123,\r\n  \"zoneId\": 456,\r\n  \"locationDescription\": \"Near the main entrance, next to the elevator\",\r\n  \"isAvailable\": true,\r\n  \"status\": \"AVAILABLE\",\r\n  \"hourlyRate\": 2.50,\r\n  \"iotDeviceId\": \"device-001\"\r\n}\r\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/spaces",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"spaces"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get All Space",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/spaces",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"spaces"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Space",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/spaces/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"spaces",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Update Space",
							"request": {
								"method": "PUT",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"ownerId\": 12,\r\n  \"zoneId\": 456,\r\n  \"locationDescription\": \"Near the main entrance, next to the elevator\",\r\n  \"isAvailable\": true,\r\n  \"status\": \"AVAILABLE\",\r\n  \"hourlyRate\": 2.50,\r\n  \"iotDeviceId\": \"device-001\"\r\n}\r\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/spaces/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"spaces",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Delete Space",
							"request": {
								"method": "DELETE",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/spaces/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"spaces",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Change Status",
							"request": {
								"method": "PATCH",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/spaces/1/status?status=RESERVED",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"spaces",
										"1",
										"status"
									],
									"query": [
										{
											"key": "status",
											"value": "RESERVED"
										}
									]
								}
							},
							"response": []
						}
					]
				},
				{
					"name": "Reservation",
					"item": [
						{
							"name": "Add Resrvation",
							"request": {
								"method": "POST",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"userId\": 123,\r\n  \"vehicleId\": 456,\r\n  \"spaceId\": 789,\r\n  \"startTime\": \"2024-07-01T10:00:00\",\r\n  \"endTime\": \"2024-07-01T12:00:00\",\r\n  \"status\": \"PENDING\"\r\n}\r\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get All Reservation By User",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations/user/123",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations",
										"user",
										"123"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get All Reservation By Space",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations/space/789",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations",
										"space",
										"789"
									]
								}
							},
							"response": []
						},
						{
							"name": "Get Reservation By Id",
							"request": {
								"method": "GET",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Update Reservation",
							"request": {
								"method": "PUT",
								"header": [],
								"body": {
									"mode": "raw",
									"raw": "{\r\n  \"userId\": 123,\r\n  \"vehicleId\": 34,\r\n  \"spaceId\": 789,\r\n  \"startTime\": \"2024-07-01T10:00:00\",\r\n  \"endTime\": \"2024-07-01T12:00:00\",\r\n  \"status\": \"PENDING\"\r\n}\r\n",
									"options": {
										"raw": {
											"language": "json"
										}
									}
								},
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Delete Reservation",
							"request": {
								"method": "DELETE",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations/1",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations",
										"1"
									]
								}
							},
							"response": []
						},
						{
							"name": "Change Status",
							"request": {
								"method": "PATCH",
								"header": [],
								"url": {
									"raw": "http://localhost:8080/parking_space_service/api/reservations/1/status?status=ACTIVE",
									"protocol": "http",
									"host": [
										"localhost"
									],
									"port": "8080",
									"path": [
										"parking_space_service",
										"api",
										"reservations",
										"1",
										"status"
									],
									"query": [
										{
											"key": "status",
											"value": "ACTIVE"
										}
									]
								}
							},
							"response": []
						}
					]
				}
			]
		},
		{
			"name": "Payment",
			"item": [
				{
					"name": "Add Payment",
					"request": {
						"method": "POST",
						"header": [],
						"body": {
							"mode": "raw",
							"raw": "{\r\n  \"reservationId\": 123,\r\n  \"userId\": 456,\r\n  \"amount\": 50.00,\r\n  \"paymentMethod\": \"Credit Card\",\r\n  \"paymentStatus\": \"PENDING\",\r\n  \"transactionId\": \"txn_7890\",\r\n  \"receiptUrl\": \"https://example.com/receipts/txn_7890.pdf\",\r\n  \"paidAt\": \"2024-07-01T14:30:00\"\r\n}\r\n",
							"options": {
								"raw": {
									"language": "json"
								}
							}
						},
						"url": {
							"raw": "http://localhost:8080/payment_service/api/payments",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"payment_service",
								"api",
								"payments"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payment By Id",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/payment_service/api/payments/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"payment_service",
								"api",
								"payments",
								"1"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payment By User",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/payment_service/api/payments/user/456",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"payment_service",
								"api",
								"payments",
								"user",
								"456"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Payment By Reservation",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/payment_service/api/payments/reservation/123",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"payment_service",
								"api",
								"payments",
								"reservation",
								"123"
							]
						}
					},
					"response": []
				},
				{
					"name": "Get Receipt",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/payment_service/api/payments/receipt/1",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"payment_service",
								"api",
								"payments",
								"receipt",
								"1"
							]
						}
					},
					"response": []
				}
			]
		}
	]
}
