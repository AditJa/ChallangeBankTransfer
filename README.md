# ChallangeBankTransfer
This is a project with basic functionality of transfer funds using Gradle 

Description :
Implemented a Simple Spring boot application which provide REST service for money transfer using Gradle. 
This project is added with some very basic functionality - create account, get account and fund transfer from one account to other.

Prerequisite :
- Gradle
- JDK 1.8+
- Lombok
- Spring Tool Suite 4

This application is for demo only. It provides APIs for following 2 features
- Creat account
- Retrieve Account Balance
- Create Transaction (fund transfer)

Basic API Information :

POST : Create Account
------
http://localhost:18080/v1/accounts

{"accountId": "1122", "balance": 9000}
{"accountId": "2233", "balance": 5000}

POST : Create Transaction (fund transfer)
----------
http://localhost:18080/v1/transfer

{
  "accountFromId": 2233,
  "accountToId": 1122,
  "amount": 20
}

GET : Retrieve Account Balance
-----
http://localhost:18080/v1/accounts/2233












