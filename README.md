# INVENTORY

## SOME POSTS FOR TESTING 

#### Product 1: High-Tech Gadget
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
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

#### Product 2: Organic Food Item
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

#### Product 3: Home & Decor
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

#### Product 4: Fitness Equipment
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

#### Product 5: Personal Care
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

#### Product 6: Electronics Accessory
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

#### Product 7: Kitchen Gadget
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

#### Product 8: Pet Supplies
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

#### Product 9: Baby Product
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

#### Product 10: Gardening Tool
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

#### Product 11: Office Supplies
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Premium Gel Pens (Set of 12)",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "PGP-12-COL",
"price": "19.50",
"barcode": "5678901234567",
"stock": {
"amount": 250,
"locationId": "loc-A9"
},
"review": {
"text": "Smooth writing, no smudging. Perfect for notes."
}
}'

#### Product 12: Beauty Product
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Hydrating Face Serum",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "HFS-30-ML",
"price": "45.00",
"barcode": "6543210987654",
"stock": {
"amount": 60,
"locationId": "loc-C2"
},
"review": {
"text": "My skin feels so plump and hydrated. I love it!"
}
}'

#### Product 13: Toy
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "STEM Robotics Kit",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "SRK-EDU-V1",
"price": "150.00",
"barcode": "1122334455668",
"stock": {
"amount": 20,
"locationId": "loc-B3"
},
"review": {
"text": "Kept my son engaged for hours. A great educational toy."
}
}'

#### Product 14: Sportswear
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Moisture-Wicking Running Shirt",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "MWRS-L-GRN",
"price": "39.99",
"barcode": "9988776655443",
"stock": {
"amount": 120,
"locationId": "loc-A8"
},
"review": {
"text": "Very breathable and comfortable on long runs."
}
}'

#### Product 15: Books
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "The Art of Modern Cooking",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "TAMC-B-001",
"price": "28.50",
"barcode": "5432167890123",
"stock": {
"amount": 70,
"locationId": "loc-C5"
},
"review": {
"text": "A stunning cookbook with beautiful recipes. A joy to read."
}
}'

#### Product 16: Tool Kit
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Compact Screwdriver Set",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "CSS-15-PC",
"price": "21.99",
"barcode": "8765432101234",
"stock": {
"amount": 100,
"locationId": "loc-B7"
},
"review": {
"text": "Handy for all my small repairs. Good quality."
}
}'

#### Product 17: Tech Gadget
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Smart Home Hub",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "SHH-WIFI-V3",
"price": "89.99",
"barcode": "1112223334445",
"stock": {
"amount": 45,
"locationId": "loc-A3"
},
"review": {
"text": "Seamlessly connects all my devices. A great central control."
}
}'

#### Product 18: Art Supplies
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Professional Watercolor Paint Set",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "PWPS-24-PAL",
"price": "65.00",
"barcode": "2223334445556",
"stock": {
"amount": 35,
"locationId": "loc-C6"
},
"review": {
"text": "The pigments are vibrant and easy to blend. Highly recommend."
}
}'

#### Product 19: Furniture
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Adjustable Office Chair",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "AOC-ERG-BLK",
"price": "199.00",
"barcode": "9998887776665",
"stock": {
"amount": 15,
"locationId": "loc-B2"
},
"review": {
"text": "So comfortable for long workdays. My back feels much better."
}
}'

#### Product 20: Outdoor Gear
curl -X POST "http://localhost:8080/api/product" -H "Content-Type: application/json" -d '{
"name": "Ultralight Camping Tent",
"createdAt": "2023-10-27T10:00:00Z",
"sku": "UCT-2P-GRN",
"price": "249.99",
"barcode": "7776665554443",
"stock": {
"amount": 50,
"locationId": "loc-A4"
},
"review": {
"text": "Incredibly easy to set up and very lightweight. Perfect for backpacking."
}
}'