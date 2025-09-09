# INVENTORY

## KEYCLOAK JWT

````
curl -L -X POST 'http://localhost:7080/realms/inventory-dev/protocol/openid-connect/token' -H 'Content-Type: application/x-www-form-urlencoded' --data-urlencode 'client_id=inventory' --data-urlencode 'grant_type=password' --data-urlencode 'username=admin@inventory.com' --data-urlencode 'password=admin'  --data-urlencode  'client_secret=C0boqVzpEJUWS7wGp45PFBpsBEPNGoK7'
````

## SOME POSTS FOR TESTING 

#### Product 1: High-Tech Gadget
````
curl -X POST "http://localhost:8080/api/product" -H "Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJpMlVWaTgycUhMSzQtTHdES3hnRTJmRzlvaGs1VVFYeVNnNjBzejVqRmZJIn0.eyJleHAiOjE3NTc0NTY4ODksImlhdCI6MTc1NzQ1NjU4OSwianRpIjoiNmU5ZTQ4YzQtMWJmNS00MWE3LWIzYTctOWEwYTBkN2Q3OTkyIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo3MDgwL3JlYWxtcy9pbnZlbnRvcnktZGV2IiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjI4NGM4YjQzLWE4MTktNDk0OC1iNmNhLWI4N2E4ZTgxZWRkOSIsInR5cCI6IkJlYXJlciIsImF6cCI6ImludmVudG9yeSIsInNlc3Npb25fc3RhdGUiOiJkYzgwNjNmZS03NDQ1LTRhMDEtODA4NC1hZDc4YjMzYzI1NTQiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iLCJkZWZhdWx0LXJvbGVzLWludmVudG9yeSJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImludmVudG9yeSI6eyJyb2xlcyI6WyJhZGQtcHJvZHVjdCJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIGVtYWlsIiwic2lkIjoiZGM4MDYzZmUtNzQ0NS00YTAxLTgwODQtYWQ3OGIzM2MyNTU0IiwiZW1haWxfdmVyaWZpZWQiOnRydWUsIm5hbWUiOiJTdG9jayBLZWVwZXIiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJhZG1pbkBpbnZlbnRvcnkuY29tIiwiZ2l2ZW5fbmFtZSI6IlN0b2NrIiwiZmFtaWx5X25hbWUiOiJLZWVwZXIiLCJlbWFpbCI6ImFkbWluQGludmVudG9yeS5jb20ifQ.GBHcZkUiLseHUPlLAwmcPS0ZqmfLb3JNhAWXB7g2OS0CMK1AF80nrRO4F3ueNPGY_qR0s1pjKUnnAu9CCyZevXT-IfLDZezY3eJRJlz-yKXjljDb2a4NB5o-mTA-x_14fEY92XRQXhiSIgldS8RIXUvXCftWS6NJWULBnzM4QxA4h8Sw0HTj6iNSQ0W36Y-7MVE4-P0f0k2QoUg9xkezghlw8s1xcmbzchq5N5nFLfuxn7owW7bZXjGhMZXoUGrPZSXO4YciTWF8B11UL8iiB50zaUjuzzr6IzEmwXNzGKUtwOiHIphr8oJ0HBZ1mE1QAbLpHMRDvIPw34f2wJ2FbQ"  -H "Content-Type: application/json" -d '{
"name": "Quantum-Core Synthesizer",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "QCS-733-G5",
"price": "499.99",
"barcode": "9876543210987",
"stock": {
"amount": 25,
"locationId": "loc-B4"
},
"review": {
"text": "Revolutionized my workflow. Unbelievable performance."
}
}'
````
#### Product 2: Organic Food Item
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Eco-Harvested Quinoa",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "EHQ-901-KG",
"price": "12.50",
"barcode": "1029384756102",
"stock": {
"amount": 150,
"locationId": "loc-C7"
},
"review": {
"text": "Clean and fresh. A staple in my pantry now."
}
}'
````
#### Product 3: Home & Decor
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Minimalist Ceramic Vase",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "MCV-20-C3",
"price": "35.00",
"barcode": "5544332211005",
"stock": {
"amount": 75,
"locationId": "loc-A1"
},
"review": {
"text": "Adds a touch of elegance. The matte finish is perfect."
}
}'
````
#### Product 4: Fitness Equipment
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "DuraFlex Resistance Bands",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "DFRB-S4-KIT",
"price": "29.99",
"barcode": "6789012345678",
"stock": {
"amount": 200,
"locationId": "loc-B8"
},
"review": {
"text": "Great for travel workouts. Feels very durable."
}
}'
````
#### Product 5: Personal Care
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Aloe Vera Soothing Gel",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "AVSG-150-ML",
"price": "8.75",
"barcode": "3456789012345",
"stock": {
"amount": 300,
"locationId": "loc-C1"
},
"review": {
"text": "So refreshing and light. Absorbs quickly."
}
}'
````
#### Product 6: Electronics Accessory
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Ultra-Slim Laptop Stand",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "USLS-V2-BLK",
"price": "55.00",
"barcode": "8765432109876",
"stock": {
"amount": 90,
"locationId": "loc-A2"
},
"review": {
"text": "Sleek and highly functional. A must-have for remote work."
}
}'
````
#### Product 7: Kitchen Gadget
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Smart Coffee Grinder",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "SCG-500-WHT",
"price": "120.00",
"barcode": "1122334455667",
"stock": {
"amount": 30,
"locationId": "loc-B6"
},
"review": {
"text": "Perfect grind consistency every time. Worth the investment."
}
}'
````
#### Product 8: Pet Supplies
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Orthopedic Dog Bed",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "ODB-L-GRY",
"price": "75.50",
"barcode": "2233445566778",
"stock": {
"amount": 40,
"locationId": "loc-C9"
},
"review": {
"text": "My dog loves it! He sleeps like a king."
}
}'
````
#### Product 9: Baby Product
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Organic Cotton Swaddle",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "OCS-75-CRM",
"price": "22.00",
"barcode": "7654321098765",
"stock": {
"amount": 110,
"locationId": "loc-A5"
},
"review": {
"text": "Super soft and cozy for the little one."
}
}'
````
#### Product 10: Gardening Tool
````
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Ergonomic Hand Trowel",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "EHT-M-RED",
"price": "15.99",
"barcode": "4321098765432",
"stock": {
"amount": 80,
"locationId": "loc-B1"
},
"review": {
"text": "Makes weeding so much easier. Comfortable grip."
}
}'
````
