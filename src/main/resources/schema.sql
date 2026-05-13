-- 用户表
DROP TABLE IF EXISTS "user";
CREATE TABLE "user" (
                        id SERIAL PRIMARY KEY,
                        openid VARCHAR(100) NOT NULL UNIQUE,
                        nickname VARCHAR(50) NOT NULL DEFAULT 'F1车迷',
                        avatar VARCHAR(255) DEFAULT '/images/default_avatar.png',
                        create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        status INTEGER DEFAULT 1
);

-- 论坛表
DROP TABLE IF EXISTS discuss;
CREATE TABLE discuss (
                         id SERIAL PRIMARY KEY,
                         title VARCHAR(100) NOT NULL,
                         description VARCHAR(255) NOT NULL,
                         cover_image VARCHAR(255) DEFAULT '/images/discuss_default.png',
                         author VARCHAR(30) NOT NULL,
                         publish_time DATE NOT NULL,
                         view_count INTEGER DEFAULT 0,
                         status INTEGER DEFAULT 1,
                         create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 车手表
DROP TABLE IF EXISTS driver;
CREATE TABLE driver (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(50) NOT NULL,
                        team VARCHAR(50),
                        avatar VARCHAR(255),
                        number INTEGER,
                        country VARCHAR(50),
                        description TEXT,
                        create_time TIMESTAMP DEFAULT NOW()
);

-- 赛道表
DROP TABLE IF EXISTS track;
CREATE TABLE track (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       location VARCHAR(100),
                       length VARCHAR(50),
                       lap INTEGER,
                       image VARCHAR(255),
                       description TEXT,
                       create_time TIMESTAMP DEFAULT NOW()
);

-- 车队表
DROP TABLE IF EXISTS team;
CREATE TABLE team (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(100),
                      full_name VARCHAR(200),
                      country VARCHAR(100),
                      founded_year VARCHAR(20