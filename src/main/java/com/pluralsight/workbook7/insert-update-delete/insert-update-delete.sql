-- 1. Add a new supplier.
INSERT INTO northwind.suppliers
VALUES (NULL, 'Jenver Hot Dog Cart', 'Jenver Fernandez', 'Owner','123 Sesame St', 'Seattle', 'Washington', '98188', 'USA', '206-241-6767', '206-421-6767', NULL);
-- 2. Add a new product provided by that supplier
INSERT INTO northwind.products (ProductID, ProductName, SupplierID, CategoryID, QuantityPerUnit, UnitPrice, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued)
VALUES (NULL, 'Hot Dog', 30, 4, '1000 boxes', 6.70, 67, 41, 21, 0);
-- 3. List all products and their suppliers.
SELECT p.ProductID, p.ProductName, s.CompanyName
FROM products AS p
JOIN suppliers AS s
ON p.SupplierID = s.SupplierID;
-- 4. Raise the price of your new product by 15%.
UPDATE products
SET UnitPrice = UnitPrice * 1.15
WHERE ProductName = 'Hot Dog';
-- 5. List the products and prices of all products from that supplier.
SELECT * FROM Products WHERE SupplierID = (SELECT SupplierID FROM Suppliers WHERE CompanyName = 'Jenver Hot Dog Cart');
-- 6. Delete the new product.
DELETE FROM products
WHERE ProductName = 'Hot Dog';
-- 7. Delete the new supplier.
DELETE FROM suppliers
WHERE CompanyName = 'Jenver Hot Dog Cart';
-- 8. List all products.
SELECT * FROM products;
-- 9. List all suppliers.
SELECT * FROM suppliers;
