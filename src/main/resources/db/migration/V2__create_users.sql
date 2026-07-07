CREATE TABLE users
(
    id                UUID         NOT NULL,
    email             VARCHAR(255) NOT NULL,
    password_hash     VARCHAR(255) NOT NULL,

    first_name        VARCHAR(100),
    last_name         VARCHAR(100),

    status            VARCHAR(30)  NOT NULL,

    email_verified_at TIMESTAMPTZ,

    created_at        TIMESTAMPTZ  NOT NULL DEFAULT now(),
    updated_at        TIMESTAMPTZ  NOT NULL DEFAULT now(),
    deleted_at        TIMESTAMPTZ,

    version           BIGINT       NOT NULL DEFAULT 0,

    CONSTRAINT pk_users PRIMARY KEY (id),
    CONSTRAINT uk_users_email UNIQUE (email),
    CONSTRAINT chk_users_status CHECK (
        status IN ('PENDING', 'ACTIVE', 'BLOCKED', 'DELETED')
        )

);