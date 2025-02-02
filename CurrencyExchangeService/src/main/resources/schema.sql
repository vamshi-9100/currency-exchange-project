-- Create the currency_conversion table with the required columns

CREATE TABLE IF NOT EXISTS currency_conversion(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,          -- Auto-incremented id
    from_Currency VARCHAR(50) NOT NULL,             -- The currency from which we're converting
    to_Currency VARCHAR(50) NOT NULL,               -- The currency we're converting to
    conversion_multiple DOUBLE NOT NULL          -- The conversion rate
);
