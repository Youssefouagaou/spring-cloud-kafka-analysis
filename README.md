# ---------------- Spring Cloud Microservices ----------------
# 1. use case
![image](https://user-images.githubusercontent.com/62290643/206123723-0f5d7345-b23d-4ecb-84cb-83346104a73d.png)


# 2. Direct Endpoints with insomnia : contacting microservice via The Gatway
## 2.1 Inventory service - get all products
- Visiting http://localhost:9999/PRODUCT-SERVICE/products

![image](https://user-images.githubusercontent.com/62290643/199279561-8a0685cb-f8a5-4b23-9d6c-889a20a49fe7.png)
## 2.2 Customer Service - get All Customers
- Visiting http://localhost:9999/CUSTOMERS-SERVICE/customers

![image](https://user-images.githubusercontent.com/62290643/199280713-d61fec69-b2e3-4028-aa52-75219e92c1bc.png)
### 2.3 Registry Eureka Service  
- Visiting http://localhost:8761/ : Monitoring the state of every microservices registered in the discovery

![image](https://user-images.githubusercontent.com/62290643/199281126-a1092226-771c-4f14-84ad-65643e979169.png)
# 3. Endpoints with browser : contacting The Gateway
## 3.1 Customer Service
### 3.1.1 get All Customers
- Visiting http://localhost:9999/CUSTOMERS-SERVICE/customers

![image](https://user-images.githubusercontent.com/62290643/200776086-65ddf6e8-4513-46e7-986e-d0f4e76a5727.png)
### 3.1.2 One Customer (By Id)
- Visiting http://localhost:9999/CUSTOMER-SERVICE/customers/1

![image](https://user-images.githubusercontent.com/62290643/200776331-de954a06-02f6-4786-aee3-68cc917838df.png)
## 3.2 Products Service
### 3.2.1 All Products
- Visiting http://localhost:9999/PRODUCT-SERVICE/products

![image](https://user-images.githubusercontent.com/62290643/200777250-d7bc9122-d890-4239-b6c0-6a4ca1d6baf2.png)
### 3.2.2 One Product (By Id)
![image](https://user-images.githubusercontent.com/62290643/200777548-889d86ff-465f-4e0b-9176-5d0ba8bca5b4.png)
## 3.3 BIlling Service
### 3.3.1 get all orders
![image](https://user-images.githubusercontent.com/62290643/200775821-94485528-c462-45db-bbb4-3d4e97cb08ae.png)
![image](https://user-images.githubusercontent.com/62290643/200777870-0beb6941-30dc-4cdc-b48c-30acc4a1f057.png)

# 4. Angular Client 
web app with angular that will consume the microservices architecture
## 4.1 repository Link : https://github.com/boumohamed/Spring_cloud_Microservices-Angular-Client.git

## 4.2 Products List
![image](https://user-images.githubusercontent.com/62290643/202019727-5909dde8-634d-437a-a81d-f556084e9787.png)
## 4.3 Customers List
![image](https://user-images.githubusercontent.com/62290643/202019848-a360a512-7e6a-4a15-b3ce-960f9202d11c.png)
## 4.4 Customer Orders List
![image](https://user-images.githubusercontent.com/62290643/202019983-253bd49f-358c-4e9d-9f78-abb06a5dbc28.png)
## 4.5 Order Details
![image](https://user-images.githubusercontent.com/62290643/202020120-098fe060-970c-44d3-b76e-0507703720c7.png)

# 5. Secured Angular Client with keykcloak 
## 5.1 Login page
![image](https://user-images.githubusercontent.com/62290643/206132384-c6cfe9d0-9f00-4b58-a7fe-6d98a27cfe51.png)
## 5.2 Client Orders After LogedIn
![image](https://user-images.githubusercontent.com/62290643/206132904-f54adf37-f71c-4fd8-93b8-6188047b79e5.png)
## 5.3 product List
![image](https://user-images.githubusercontent.com/62290643/206139343-dd97f0ce-9460-42eb-aad9-f22b3b31ce25.png)


# 6. Kafka
## 6.1 Bills Analysis By Customer (Real Time Ordering)

![Analytics (1)](https://user-images.githubusercontent.com/62290643/212974331-cb72c423-d6f1-4b5f-a304-a50ad336d640.gif)
# 7. Docker part
repo link : https://github.com/boumohamed/microvervices-docker-compose.git



