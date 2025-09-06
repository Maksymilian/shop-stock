CREATE TABLE "product" (
    id  UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    sku VARCHAR(255) UNIQUE NOT NULL,
    "barcode_number" VARCHAR(255) UNIQUE NOT NULL,
    "created_at" TIMESTAMP WITH TIME ZONE NOT NULL,
    price NUMERIC(19, 2) NOT NULL,
    "price_currency" VARCHAR(3) NOT NULL,
    review TEXT
);