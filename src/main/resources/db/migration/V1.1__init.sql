-- 1.CREATE TABLE users
CREATE TABLE users
(
    id         BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主キー',
    username   VARCHAR(50)     NOT NULL UNIQUE COMMENT 'ユーザ名',
    email      VARCHAR(255)    NOT NULL COMMENT 'メアド',
    password   VARCHAR(255)    NOT NULL COMMENT '暗号化後のパスワード',
    created_at DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '作成日時',
    created_by VARCHAR(50)     NOT NULL COMMENT '作成者',
    updated_at DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新日時',
    updated_by VARCHAR(50)     NOT NULL COMMENT '更新者',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci COMMENT ='ユーザ表';
