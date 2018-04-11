CREATE table division
   (ID INTEGER NOT NULL ,
	NAME VARCHAR(31 CHAR) NOT NULL ,
	ORIGINALNAME VARCHAR(31) NOT NULL ,
	DIRECTOR VARCHAR(31) NOT NULL ,
	PARENTDIVISION INTEGER,
	 PRIMARY KEY (ID)
   );

CREATE TABLE ADDRESSES (
    ID INT PRIMARY KEY,
    STREET_NAME VARCHAR(255) NOT NULL,
    STREET_NUMBER VARCHAR(255) NOT NULL,
    POSTAL_CODE VARCHAR(255) NOT NULL,
    LABEL VARCHAR(255) NOT NULL
);

CREATE SEQUENCE ADDRESSES_SEQ
START WITH 1
INCREMENT BY 1;

CREATE TABLE CONTACT_INFOS (
    ID INT PRIMARY KEY,
    MOBILE_PHONE VARCHAR(255) NOT NULL,
    FIXED_LINE VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL
);

CREATE SEQUENCE CONTACT_INFOS_SEQ
START WITH 1
INCREMENT BY 1;

CREATE TABLE MEMBERS (
    ID INT PRIMARY KEY,
    NAME VARCHAR(255) NOT NULL,
    ADDRESS_ID INT,
    CONTACT_INFO_ID INT,
    FOREIGN KEY (ADDRESS_ID) REFERENCES ADDRESSES(ID),
    FOREIGN KEY (CONTACT_INFO_ID) REFERENCES CONTACT_INFOS(ID)
);

CREATE SEQUENCE MEMBERS_SEQ
START WITH 1
INCREMENT BY 1;
