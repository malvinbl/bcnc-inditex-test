INSERT INTO PRODUCT (ID, NAME)
    VALUES (35455, 'Jeans Levis 501');
INSERT INTO BRAND (NAME)
    VALUES ('ZARA');
INSERT INTO PRICE_LIST (NAME)
    VALUES ('Rate 1'),
           ('Rate 2'),
           ('Rate 3'),
           ('Rate 4');

INSERT INTO PRICE (PRODUCT_ID, BRAND_ID, PRICE_LIST_ID, PRIORITY, PRICE, CURR, START_DATE, END_DATE)
    VALUES (35455, 1, 1, 0, 35.50, 'EUR', '2020-06-14T00:00:00.000Z', '2020-12-31T23:59:59.000Z'),
           (35455, 1, 2, 1, 25.45, 'EUR', '2020-06-14T15:00:00.000Z', '2020-06-14T18:30:00.000Z'),
           (35455, 1, 3, 1, 30.50, 'EUR', '2020-06-15T00:00:00.000Z', '2020-06-15T11:00:00.000Z'),
           (35455, 1, 4, 1, 38.95, 'EUR', '2020-06-15T16:00:00.000Z', '2020-12-31T23:59:59.000Z');