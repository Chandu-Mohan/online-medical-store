package com.company;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        //Declaring ArrayList of all the entity's that are defined//
        ArrayList<Manufacturer> manufacturerr= new ArrayList<Manufacturer>();
        ArrayList<Customer> customerr= new ArrayList<Customer>();
        ArrayList<Product> productt = new ArrayList<Product>();
        ArrayList<Shop> shopp = new ArrayList<Shop>();
        ArrayList<DeliveryAgent> deliveryAgentt= new ArrayList<DeliveryAgent>();

        int opt =1,i,j,m;
        while (opt!=0){
            Scanner sc= new Scanner(System.in);
            //Created a main menu from which we can choose the required option
            System.out.println("\n::: Type the required option from below :::\n");
            System.out.println("| Type 1 to create/delete/print entity's, ");
            System.out.println("| Type 2 to Add a product to manufacturer, ");
            System.out.println("| Type 3 to Add a certain number of copies of a product to a shop.");
            System.out.println("| Type 4 to Place and process order ");
            System.out.println("| Type 5 to Get list of all the purchases made by a customer, ");
            System.out.println("| Type 6 to Get list of inventory of a shop (Products and counts), ");
            System.out.println("| Type 7 to Get list of Products made by a manufacturer , ");
            System.out.println("| Type 0 to exit: ");
            System.out.print("  Type here:-");

            opt = sc.nextInt();
            switch (opt){//This is the main switch in this all the cases are in main menu.
                case 1:
                    System.out.println("Type 1 to Create entity ");
                    System.out.println("Type 2 to Print entity ");
                    System.out.println("Type 3 to Delete entity ");
                    System.out.println("Type 0 to go to Main Menu ");
                    System.out.print("Type here:-");
                    int opt2 = sc.nextInt();
                    switch (opt2){//This is sub switch in Case 1 in which we can create/delete/print all entity's.
                        case 1://Creating entity
                            printEntitys();
                            int opt3 = sc.nextInt();
                            switch (opt3){//Separate cases to create different entity's.
                                case 1:
                                    System.out.println("Enter the name of manufacturer: ");
                                    String name=sc.next();
                                    System.out.println("Enter the id of manufacturer: ");
                                    int id=sc.nextInt();
                                    manufacturerr.add(new Manufacturer(id, name));
                                    break;
                                case 2:
                                    System.out.println("Enter the name of product: ");
                                    String name1=sc.next();
                                    System.out.println("Enter the id of product: ");
                                    int id1=sc.nextInt();
                                    System.out.println("Enter the name of manufacturer: ");
                                    String name9=sc.next();
                                    productt.add(new Product(id1,name1,name9));

                                    break;
                                case 3:
                                    System.out.println("Enter the name of customer: ");
                                    String name2=sc.next();
                                    System.out.println("Enter the id of customer: ");
                                    int id2=sc.nextInt();
                                    System.out.println("Enter the zipcode of customer: ");
                                    int zipCode2=sc.nextInt();
                                    customerr.add(new Customer(id2,name2,zipCode2));
                                    break;
                                case 4:
                                    System.out.println("Enter the name of Shop or Warehouse: ");
                                    String name3=sc.next();
                                    System.out.println("Enter the id of Shop or Warehouse: ");
                                    int id3 =sc.nextInt();
                                    System.out.println("Enter the zipcode of Shop or Warehouse: ");
                                    int zipCode3 =sc.nextInt();
                                    shopp.add(new Shop(id3,name3,zipCode3));
                                    break;
                                case 5:
                                    System.out.println("Enter the name of Delivery agent: ");
                                    String name4=sc.next();
                                    System.out.println("Enter the id of Delivery agent: ");
                                    int id4=sc.nextInt();
                                    System.out.println("Enter the zipcode of Delivery agent: ");
                                    int zipCode4=sc.nextInt();
                                    System.out.println("Enter number of products delevared by Delivery agent: ");
                                    int nopd=sc.nextInt();
                                    deliveryAgentt.add(new DeliveryAgent(id4,name4,zipCode4,nopd));
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("You selected invalid option Try again! :)");
                            }
                            break;
                        case 2://Printing entity
                            printEntitys();
                            int opt4 = sc.nextInt();
                            switch (opt4){//Separate cases to print different entity's.
                                case 1:
                                    if(manufacturerr.isEmpty()){//checking if the ArrayList is empty or not.
                                        System.out.println("No manufacturers found ! ");

                                    }
                                    else {//printing if the list is not empty.
                                        for ( i=0;i< manufacturerr.size();i++){
                                            System.out.println("Index:" + i + "=" + manufacturerr.get(i).name + ", id:" + manufacturerr.get(i).id);
                                        }
                                    }
                                    break;
                                case 2:
                                    if(productt.isEmpty()){
                                        System.out.println("No products found ! ");

                                    }
                                    else {
                                        for ( i=0;i< productt.size();i++){
                                            System.out.println("Index:" + i + ": " + productt.get(i).name+", id:"+productt.get(i).id);
                                        }
                                    }

                                    break;
                                case 3:
                                    if(customerr.isEmpty()){
                                        System.out.println("No customers found ! ");

                                    }
                                    else {
                                        for ( i=0;i< customerr.size();i++){
                                            System.out.println("Index:" + i + ": " + customerr.get(i).name + ", id:" + customerr.get(i).id +", zipCode:"+ customerr.get(i).zipCode);
                                        }
                                    }


                                    break;
                                case 4:
                                    if(shopp.isEmpty()){
                                        System.out.println("No shops found ! ");

                                    }
                                    else {
                                        for ( i=0;i< shopp.size();i++){
                                            System.out.println("Index:" + i + "=" + shopp.get(i).name + ", id:" + shopp.get(i).id +", zipCode:"+ shopp.get(i).zipCode);
                                        }
                                    }
                                    break;
                                case 5:
                                    if(deliveryAgentt.isEmpty()){
                                        System.out.println("No delivery agents found ! ");

                                    }
                                    else {
                                        for ( i=0;i< deliveryAgentt.size();i++){
                                            System.out.println("Index:" + i + "=" + deliveryAgentt.get(i).name + ", id:" + deliveryAgentt.get(i).id +", zipCode:"+ deliveryAgentt.get(i).zipCode);
                                        }
                                    }

                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println("You selected invalid option Try again! :)");
                            }
                            break;

                        case 3://Deleting entity
                            printEntitys();
                            int opt5 = sc.nextInt();
                            switch (opt5){//Separate cases to delete different entity's.
                                case 1:
                                    if(manufacturerr.isEmpty()){
                                        System.out.println("No manufacturers found ! ");

                                    }
                                    else {
                                        for ( i=0;i< manufacturerr.size();i++){
                                            System.out.println("Index:" + i + "=" + manufacturerr.get(i).name);
                                        }
                                    }
                                    System.out.println("select index you want to delete ");
                                    manufacturerr.remove(sc.nextInt());//removing from the ArrayList.
                                    System.out.println("item deleted successfully ");
                                    break;
                                case 2:
                                    if(productt.isEmpty()){
                                        System.out.println("No products found ! ");

                                    }
                                    else {
                                        for ( i=0;i< productt.size();i++){
                                            System.out.println("Index:" + i + "=" + productt.get(i).name);
                                        }
                                    }
                                    System.out.println("select index you want to delete ");
                                    productt.remove(sc.nextInt());
                                    System.out.println("item deleted successfully ");

                                    break;
                                case 3:
                                    if(customerr.isEmpty()){
                                        System.out.println("No products found ! ");

                                    }
                                    else {
                                        for ( i=0;i< customerr.size();i++){
                                            System.out.println("Index:" + i + "=" + customerr.get(i).name);
                                        }
                                    }
                                    System.out.println("select index you want to delete ");
                                    customerr.remove(sc.nextInt());
                                    System.out.println("item deleted successfully ");
                                    break;
                                case 4:
                                    if(shopp.isEmpty()){
                                        System.out.println("No products found ! ");

                                    }
                                    else {
                                        for ( i=0;i< shopp.size();i++){
                                            System.out.println("Index:" + i + "=" + shopp.get(i).name);
                                        }
                                    }
                                    System.out.println("select index you want to delete ");
                                    shopp.remove(sc.nextInt());
                                    System.out.println("item deleted successfully ");
                                    break;
                                case 5:
                                    if(deliveryAgentt.isEmpty()){
                                        System.out.println("No products found ! ");

                                    }
                                    else {
                                        for ( i=0;i< deliveryAgentt.size();i++){
                                            System.out.println("Index:" + i + "=" + deliveryAgentt.get(i).name);
                                        }
                                    }
                                    System.out.println("select index you want to delete ");
                                    deliveryAgentt.remove(sc.nextInt());
                                    System.out.println("item deleted successfully ");
                                    break;
                                case 0:
                                    break;
                                default:
                                    System.out.println(" OOP's! You selected invalid option Try again! :)");
                            }
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println(" OOP's! You selected invalid option Try again! :)");
                    }
                    break;

                case 2://Adding product to manufacturer//
                    System.out.println("Give id of manufacturer to which product should be added ");
                    int id5 = sc.nextInt();
                    for ( i=0;i<manufacturerr.size();i++){//finding manufacturer id which is matching with given id5
                        if(manufacturerr.get(i).id==id5){
                            System.out.println("name of product to be added ");
                            String name5 = sc.next();
                            manufacturerr.get(i).setOfProducts.add(name5);
                            System.out.println("Product added successfully");
                            break;
                        }
                    }
                    if(i==manufacturerr.size()){
                        System.out.println("Invalid manufacturer id");
                    }
                    break;
                case 3://Add a certain number of copies of a product to a shop.
                    System.out.println("Give shop id:");
                    int id9= sc.nextInt();
                    for (i=0;i<shopp.size();i++){//finding shop id matching given id9
                        if(shopp.get(i).id == id9){
                            break;
                        }
                    }
                    if(i==shopp.size()){
                        System.out.println("Invalid shop id or shop not registered");
                        break;
                    }
                    //Adding product in the inventory Map
                    System.out.println("Give name of the product");
                    String name8 = sc.next();
                    System.out.println("Give number of pieces you want add");
                    int noc = sc.nextInt();
                    /*if the product already exists in the inventory we increase the number of pieces
                    else we add the name,number of pieces to inventory map*/
                    if(shopp.get(i).inventory.get(name8)==null)shopp.get(i).inventory.put(name8,noc);
                    else {
                        int temp =shopp.get(i).inventory.get(name8);
                        temp+=noc;
                        shopp.get(i).inventory.put(name8,temp);
                    }
                    break;
                case 4://processing an order from a customer and assigning Delivery Agent//
                    System.out.println("Give customer id:");
                    int id7= sc.nextInt();

                    for (i=0;i<customerr.size();i++){//finding customer id which matches with given id
                        if(customerr.get(i).id == id7){
                            break;
                        }
                    }
                    if(i==customerr.size()){
                        System.out.println("Invalid customer id or customer not registered");
                        break;
                    }

                    for ( j=0;j<shopp.size();j++){//Checking if the shop is present in the customers Zipcode
                        if(customerr.get(i).zipCode == shopp.get(j).zipCode){
                            break;
                        }
                    }
                    if(j==shopp.size()){
                        System.out.println("No shops are available in your zip code");
                        break;
                    }
                    //Checking if the there are Delivery Agents in the customers Zipcode
                    // and assigning the agent with the least number of delivery's to deliver now
                    for(m=0;m<deliveryAgentt.size();m++){
                        //finding agent with same zipcode
                        if(customerr.get(i).zipCode==deliveryAgentt.get(m).zipCode){
                            //now finding minimum number of deliverys from rest of the agents.
                            for (int n=m+1;n<deliveryAgentt.size();n++){
                                if(deliveryAgentt.get(m).zipCode==deliveryAgentt.get(n).zipCode && deliveryAgentt.get(m).numberOfProductsDelevared > deliveryAgentt.get(n).numberOfProductsDelevared)
                                    m=n;
                            }
                            break;
                        }
                    }
                    if(m==deliveryAgentt.size()){
                        System.out.println("No delivery agents are available in your zip code");
                        break;
                    }
                    if(shopp.get(j).inventory.isEmpty()){
                        System.out.println("no products in the inventory of your zipcode shop");
                        break;
                    }
                    //Taking order if all the above conditions are satisfied.
                    System.out.println("Give your order:");
                    System.out.println("type your required Product name from the list below");

                    //printing the inventory of the shop from which the customer can select.
                    for(String k :shopp.get(j).inventory.keySet()){
                        System.out.println( k+" : " + shopp.get(j).inventory.get(k) + " pieces available");
                    }
                    String name7 =sc.next();
                    if(shopp.get(j).inventory.get(name7) == null){
                        System.out.println("incorrect product name or product not in the inventory");
                        break;
                    }
                    System.out.println("give amount of product you required");
                    int amount= sc.nextInt(),availableAmount =shopp.get(j).inventory.get(name7);
                    if(availableAmount < amount){
                        System.out.println("Sorry we don't have that much amount of the product available");
                        break;
                    }
                    (deliveryAgentt.get(m).numberOfProductsDelevared)++;
                    availableAmount-=amount;
                    shopp.get(j).inventory.replace(name7,availableAmount);
                    System.out.println("Thank You your order is processed");
                    if(customerr.get(i).ListOfPurchases.get(name7)==null)customerr.get(i).ListOfPurchases.put(name7,amount);
                    else {
                        amount+=customerr.get(i).ListOfPurchases.get(name7);
                        customerr.get(i).ListOfPurchases.put(name7,amount);
                    }
                    System.out.println("Your order will be delivered by "+deliveryAgentt.get(m).name);
                    break;

                case 5://List all the purchases made by a customer//
                    System.out.println("Give id of the customer");
                    int id6 = sc.nextInt();
                    for (i=0;i<customerr.size();i++){//finding customer id which matches with given id.//
                        if(customerr.get(i).id == id6){
                            if(customerr.get(i).ListOfPurchases.isEmpty())System.out.println("No Purchase History");
                            else {
                                System.out.println(customerr.get(i).ListOfPurchases);
                                break;
                            }

                        }
                        System.out.println("Invalid customer id");
                    }
                    break;
                case 6://List inventory of a shop (Products and counts)//
                    System.out.println("Select the index from the shop list given below");
                    //Print the list of shops from which we can choose one of them.//
                    for (int h=0;h<shopp.size();h++){
                        System.out.println("Index:" + h +"::" + shopp.get(h).name);
                    }
                    System.out.println("Give Index:");
                    int in = sc.nextInt();
                    //printing the inventory of selected shop.//
                    if(shopp.get(in).inventory.isEmpty())System.out.println("Inventory is empty");
                    else {
                        for(String k :shopp.get(in).inventory.keySet()){
                            System.out.println( k+" : " + shopp.get(in).inventory.get(k) + " Amount available");
                        }
                    }

                    break;
                case 7://Products made by a manufacturer//
                    System.out.println("Select the index from the manufacturer list given below");
                    //printing the list of the manufacturers.
                    for (int h=0;h<manufacturerr.size();h++){
                        System.out.println("Index:" + h +"::" + manufacturerr.get(h).name);
                    }
                    int in2 = sc.nextInt();
                    System.out.println(manufacturerr.get(in2).setOfProducts);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("select valid option");
            }
        }



    }

    public static void printEntitys() {//function to print all entity's//
        System.out.println("_________________________________________");
        System.out.println("| Type 1 to choose Manufacturer         |");
        System.out.println("| Type 2 to choose Product              |");
        System.out.println("| Type 3 to choose Customer             |");
        System.out.println("| Type 4 to choose Shops and Warehouses |");
        System.out.println("| Type 5 to choose Delivery agent       |");
        System.out.println("| Type 0 to go to Main Menu:            |");
        System.out.println("_________________________________________");
        System.out.print("Type here:-");
    }
}
