# TheRetailStoreDiscounts

# Approches 
I was thinking about two ideas.
    - With Database 
    - Without Database as only discount processor

### Without Database 
This also should work if request contain all of the information required for the discount calculations. Just like as calculater with out any DB. 

### With Database - currently used in app
   I used with database intruction was not clear about the DB. Application  will create USER and PRODUCTS table with preloaded sample datas.
   
 ### Without Database 
    Java 8
    Spring Boot, JPA and Validation
    Maven
    Swagger
    jUnit
 
 #### How to Run:
 ```sh
$ cd ${basepath}/TheRetailStoreDiscounts
$ ./mvnw install 
$ ./mvnw spring-boot:run
```
   
Test url : http://localhost:8080/swagger-ui.html
We can test the service using the above URL.

#### How to Run the TEST:
 ```sh
$ cd ${basepath}/TheRetailStoreDiscounts
$ ./mvnw test
```

Code coverage URL: /RetailStoreDiscounts/target/jacoco-ut/index.html
Open above URL in browser to view code coverage

Table structures:

<table class="table table-bordered table-hover table-condensed">
<thead><tr><th colspan=2 title="Field #1">USER_TYPES</th>

</tr></thead>
<tbody><tr>
<td align="right">1</td>
<td>EMPLOYEE</td>
</tr>
<tr>
<td align="right">2</td>
<td>&#39;AFFILIATE&#39;</td>
</tr>
<tr>
<td align="right">3</td>
<td>CUSTOMER</td>
</tr>
</tbody></table>

<table class="table table-bordered table-hover table-condensed">
<thead><tr><th title="Field #1">USER ID</th>
<th title="Field #2">NAME</th>
<th title="Field #3">REGESTERED DATE</th>
<th title="Field #4">USER TYPE</th>
</tr></thead>
<tbody><tr>
<td align="right">1</td>
<td>RAJ</td>
<td>CURRENT_DATE()</td>
<td align="right">1</td>
</tr>
<tr>
<td align="right">2</td>
<td>KANAGARAJ</td>
<td>CURRENT_DATE()</td>
<td align="right">2</td>
</tr>
<tr>
<td align="right">3</td>
<td>JOHN</td>
<td>CURRENT_DATE()</td>
<td align="right">3</td>
</tr>
<tr>
<td align="right">4</td>
<td>JOE</td>
<td>CURRENT_DATE()</td>
<td align="right">2</td>
</tr>
<tr>
<td align="right">5</td>
<td>MOHAN</td>
<td>CURRENT_DATE()</td>
<td align="right">1</td>
</tr>
<tr>
<td align="right">6</td>
<td>MOHAMMAD</td>
<td>CURRENT_DATE()</td>
<td align="right">3</td>
</tr>
</tbody></table>


<table class="table table-bordered table-hover table-condensed">
<thead><tr><th colspan=2 title="Field #1">PRODUCT_TYPES</th>

</tr></thead>
<tbody><tr>
<td align="right">1</td>
<td>GROCERIES</td>
</tr>
<tr>
<td align="right">2</td>
<td>OTHER</td>
</tr>
</tbody></table>


<table class="table table-bordered table-hover table-condensed">
<thead><tr><th title="Field #1">ID</th>
<th title="Field #2">PRODUCTS</th>
<th title="Field #3">PRICE</th>
<th title="Field #4">PRODUCT_TYPE</th>
</tr></thead>
<tbody><tr>
<td align="right">1</td>
<td>Apple</td>
<td align="right">10.00</td>
<td>OTHER</td>
</tr>
<tr>
<td align="right">2</td>
<td>Beans</td>
<td align="right">15.00</td>
<td>GROCERIES</td>
</tr>
<tr>
<td align="right">3</td>
<td>Ladies Finger</td>
<td align="right">17.00</td>
<td>GROCERIES</td>
</tr>
<tr>
<td align="right">4</td>
<td>Orange</td>
<td align="right">19.00</td>
<td>OTHER</td>
</tr>
<tr>
<td align="right">5</td>
<td>Carrot</td>
<td align="right">90.00</td>
<td>GROCERIES</td>
</tr>
<tr>
<td align="right">6</td>
<td>TV</td>
<td align="right">75.00</td>
<td>OTHER</td>
</tr>
<tr>
<td align="right">7</td>
<td>Locker</td>
<td align="right">56.00</td>
<td>OTHER</td>
</tr>
<tr>
<td align="right">8</td>
<td>Leaf</td>
<td align="right">20.00</td>
<td>GROCERIES</td>
</tr>
<tr>
<td align="right">9</td>
<td>Mixer</td>
<td align="right">30.00</td>
<td>OTHER</td>
</tr>
</tbody></table>