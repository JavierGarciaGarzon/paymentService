INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com');
INSERT INTO users (name, email) VALUES ('Jane Doe', 'jane.doe@example.com');

INSERT INTO payments (card_number, amount, payment_date, description, user_id)
VALUES ('1234-5678-9012-3456', 100.50, '2024-09-06', 'Pago de prueba', 1);

INSERT INTO payments (card_number, amount, payment_date, description, user_id)
VALUES ('9876-5432-1098-7654', 250.75, '2024-09-07', 'Pago en tienda B', 2);
