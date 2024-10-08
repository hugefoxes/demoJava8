package com.example.demo.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Java8Reduce {

	public static void main(String[] args) {
		  int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		  // 1st argument, init value = 0
//		  int sum = Arrays.stream(numbers).reduce(0,(a, b) -> a + b);
		  int sum = Arrays.stream(numbers).reduce(0,Integer::sum);
		  System.out.println("sum : " + sum); // 55
		  
		  //get Min and max by using reduce
		  
		  int min = Arrays.stream(numbers).reduce(1, (a, b) -> a < b ? a : b);
		  System.out.println("min: "+ min);
		  
		  int min2 = Arrays.stream(numbers).reduce(1, Integer::min);
		  System.out.println("min2: "+min2);
		  
		  //get max by using reduce
		  int max = Arrays.stream(numbers).reduce(1, (a, b) -> a > b ? a : b);
		  System.out.println("max :"+ max);
		  
		  int max2 = Arrays.stream(numbers).reduce(1, Integer::max);
		  System.out.println("max2 :"+ max2);
		  
		  //join string using reduce
		  String[] strings = {"a", "b", "c", "d", "e"};
		  // |a|b|c|d|e , the initial | join is not what we want
		  String updatedString = Arrays.stream(strings).collect(Collectors.joining("|"));
		  System.out.println("updatedString: "+ updatedString);
		  
		  String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);
		  System.out.println("reduce: "+ reduce);
		  
		  String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
			  if (!"".equals(a)) {
		          return a + "|" + b;
		      } else {
		          return b;
		      }
		  });
		  System.out.println("reduce2: "+ reduce2);		  
		  
		  // a|b|c|d|e , better uses the Java 8 String.join :)
		  String join = String.join("|", strings);
		  
		  List<Invoice> invoices = Arrays.asList(
	                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
	                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
	                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
	        );

	        BigDecimal sum1 = invoices.stream()
	                .map(x -> x.getQty().multiply(x.getPrice()))    // map
	                .reduce(BigDecimal.ZERO, BigDecimal::add);      // reduce

	        System.out.println(sum1);    // 49.955
	        System.out.println(sum1.setScale(2, RoundingMode.HALF_UP));  // 49.96
	}

}

class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;
    
    public Invoice() {}
    
	public Invoice(String invoiceNo, BigDecimal price, BigDecimal qty) {
		super();
		this.invoiceNo = invoiceNo;
		this.price = price;
		this.qty = qty;
	}
	
    // getters, stters n constructor
    
	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}
}
