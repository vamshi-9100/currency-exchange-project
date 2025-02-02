-- Insert sample currency conversion rates with explicit IDs
INSERT INTO currency_conversion(id, from_Currency, to_Currency, conversion_multiple)
VALUES
    (1, 'USD', 'EUR', 0.85),    -- 1 USD = 0.85 EUR
    (2, 'EUR', 'USD', 1.18),    -- 1 EUR = 1.18 USD
    (3, 'GBP', 'USD', 1.30),    -- 1 GBP = 1.30 USD
    (4, 'USD', 'INR', 100.00),   -- 1 USD = 75 INR
    (5, 'JPY', 'USD', 0.007),   -- 1 JPY = 0.007 USD
    (6, 'AUD', 'GBP', 0.55),    -- 1 AUD = 0.55 GBP
    (7, 'CAD', 'EUR', 0.70),    -- 1 CAD = 0.70 EUR
    (8, 'INR', 'USD', 0.013),   -- 1 INR = 0.013 USD
    (9, 'CNY', 'USD', 0.14);    -- 1 CNY = 0.14 USD
