package saran;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




public class Main {


	private static String cellValue;
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException, EncryptedDocumentException, IOException, ParserConfigurationException, SAXException  {

		//reverseString();
		//reverseNum(1560);
		//primeNumbers();
		//isPrime();
		//floydTriangle(6);
		//printNumber(4);
		//stringimmutable();
		//getFileSize();
		//getconnection();
		//getCharOccurance();
		// getstringindex();
		// palindrome();
		//System.out.println(textorder());
		//digitroot();
		//firstDuplicate();
		//printFirstRepeating();
		//readexcelsheetJava8();
		//reversestring();--using stringBuffer
		//missingnumber() ;		
		//duplicateStringInArray();
		//largestAndSmallestNumInArray();
		//hashmapToArrayList();
		//arrayListtoHashmap();
		//isRotation();
		//readexcelby3methods();
		//XMLparser();
		//suminteger();
		//segrgatteoand1();
		//sumnum();
		//factorial();
		//factorial1();
		//fibanocci();
		// fibanocci1();
		//fibonnaci1();
		//recurssionex1();		
		//ascendNumDecendString();
		// regexspace();.
		// duplicatearrayseperate();
		 // tokenizer();
	    //	diamondnumberpattern(7);
		//vectorVSarraylist();
		//diamondstarpattern(5);
	//	swapnumbers();
		compare("Sheet3","Sheet4");
		//sortArray();
       //   lengthofstring();
		//sortarray();
 

	}

	public static void lengthofstring() {
		String str= "saranraj";
		int count =0;
		for(char c : str.toCharArray()) {		
 		count ++;
		}
		System.out.println("length : "+count);	
	}
	

public static void sortArray() {
	
	int a[]= {20,47,25,87,17,20,8 ,10};
	
	//method1
     Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	//method2
	int size=a.length;
	for(int i=0;i<size-1;i++) {
		for(int j=0;j<size-1;j++) {
			System.out.println(a[j]);
			System.out.println(a[j+1]);
			
			if(a[j]>a[j+1]) {
				
				int temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;
				
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	//Method 3 when there is duplicates Array
	Set<Integer>sort= new TreeSet<>();
	
	
	for(int i=0;i<size;i++) {
	sort.add(a[i]);
	}
	
	System.out.println(sort);
}
	
	public static void compare(String sheetname1, String sheetname2) {
	
FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("./Mo Delhi agging Matching.xls");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook workbook = null;
		try {
			 workbook=new HSSFWorkbook (fis);
		} catch (IllegalFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		
		Sheet sheet1=workbook.getSheet(sheetname1);
		Sheet sheet2=workbook.getSheet(sheetname2);
		
		
		DataFormatter  dataFormatter = new DataFormatter();
		
		for(int i=0;i<sheet1.getLastRowNum();i++) {		
				String cellvalue= sheet1.getRow(i+1).getCell(3).toString();
				//System.out.println(cellvalue);		
				
				for(int j=0;j<sheet2.getLastRowNum();j++) {	
					String cellvalue1= sheet2.getRow(j+1).getCell(3).toString();
					
					if(cellvalue.equals(cellvalue1)){
						System.out.println(cellvalue);
					
					}
					break;
				}
				
			}
		
		
		}


	private static void reverseNum(int num) {

		int reversenum=0;
		while(num>0) {

			//to find the last digit in number 
			int lastdigit= num%10;

			/*append last digit to the reverse , we cannot concatenate last digit with reverse since both are integers therefore multiply 
			reverse with 10, so that one's column become tens and ten's become 100's and so on.*/			
			reversenum=reversenum*10+lastdigit;

			//remove the last digit from number.
			num=num/10;

		}

		System.out.println(reversenum);

	}

	public static void reverseString() {

		String text;
		text="saran raj";		
		text=text.replaceAll(" ", "");

		char[] reverse=text.toCharArray();


		int size= reverse.length;

		for(int i=size-1;i>=0; i--) {
			System.out.println(reverse[i]);
		}
	}


	public static void primeNumbers() {

		int num=50; int count;

		for(int i =2;i<=num;i++) {			
			count=0;

			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}

			if(count==0) {
				System.out.println(i);
			}
		}

	}

	public static void isPrime() {

		boolean isprime=true;
		int temp;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=scanner.nextInt();

		for(int i=2;i<=num/2;i++) {

			temp=num%i;

			if(temp==0) {
				isprime=false;
				break;
			}
		}
		if(isprime) {

			System.out.println(num+" number is prime number");

		}
		else {
			System.out.println(num+" number is not a prime number");
		}

	}


	public static void floydTriangle(int row) {

		int counter=0;
		int num=1;
		int j;

		for( counter=1;counter<=row;counter++) {

			for( j=1;j<=counter;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	public static int printNumber(int num) {

		if(num==0) {
			System.out.println(num);
			return 0; 
		}else {
			System.out.println(num);
			return printNumber(num-1);
		}
	}

	public static void stringimmutable() {



		String s = "saran";
		System.out.println(s.concat("Raj"));
		//System.out.println(s);

	}


	public static void getFileSize() {

		String FILE_NAME="S:\\Personal\\SARANRAJ-Resume.pdf";


		Path filepath = Paths.get(FILE_NAME);

		FileChannel filechannel;

		try {

			filechannel=FileChannel.open(filepath);
			long fileSize = filechannel.size();

			System.out.println("Size of the file :"+fileSize);

			filechannel.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void getconnection() throws ClassNotFoundException, SQLException {
		String	SERIALIZED = null;
		String oracledriver="oracle.jdbc.driver.OracleDriver";

		String url="jdbc:oracle:thin:@172.16.32.102:1521:orcl";



		Class.forName(oracledriver);

		Connection connection = DriverManager.getConnection(url, "CATS", "CATS");


		Statement st = connection.createStatement();

		ResultSet rs=st.executeQuery("SELECT * FROM CATS_PART WHERE PARTCODE ='AS1805104407046'");

		while (rs.next()) {		 
			SERIALIZED = rs.getString("SERIALIZED");
		}

		System.out.println(SERIALIZED);
	}


	public void readexcel() throws IOException {


		FileInputStream fis = new FileInputStream(new File(""));

		Workbook workbook=new HSSFWorkbook(fis);

		Sheet sheet=workbook.getSheet("");

		Iterator<Row> iterator=sheet.iterator();

		while(iterator.hasNext()) {
			Row nextRow=iterator.next();
			Iterator<Cell> CellIterator=nextRow.cellIterator();

			while(CellIterator.hasNext()) {

				Cell cell=CellIterator.next();

				switch(cell.getCellType()){

				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());

				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());

				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
				}

			}
		}

		workbook.close();
		fis.close();
	}


	public static void getCharOccurance() {

		String str;
		str="My name is Saranraj";
		str=str.replaceAll(" ", "").toLowerCase();


		char[] strarray=str.toCharArray();

		int length=strarray.length;
		int count=0;

		ArrayList<Character> distinctstring=new ArrayList<>();

		for(int i=0;i<length;i++) {

			char strtext1=strarray[i];


			if(!distinctstring.contains(strtext1)) {
				distinctstring.add(strtext1);

				for(int j=0;j<length;j++) {

					if(strtext1==strarray[j]) {

						count++;

					}
				}
				System.out.println(strarray[i]+"-"+count);
				count=0;
			}

		}
	}


	public static void getstringindex() {

		String str="Saranraj";
		str=str.toLowerCase();

		String str1="a";

		int index= str.indexOf(str1);

		while(index>=0) {
			System.out.println("Index :"+index);
			index=str.indexOf(str1, index+str1.length());
		}


		/*System.out.println(str.indexOf("a"));

		char [] strarray=str.toCharArray();

		int length=strarray.length;


		for(int i=0;i<length;i++) {

			char text=strarray[i];

			if(text=='a')

			System.out.println(text+" - "+i);


			}
		 */
	}

	public static void palindrome() {

		String str;

		str="madam";

		char [] strarray=str.toCharArray();

		int length=strarray.length;

		String reverestring = "";

		for(int i=length-1; i>=0;i--) {


			reverestring=reverestring+ strarray[i];
		}

		if(reverestring.equalsIgnoreCase(str)) {

			System.out.println("The given string is palindrome :"+str);

		}else {

			System.out.println("The given string is not palindrome :"+str);

		}

	}


	public static String textorder() {

		String strtext ;
		strtext = "is2 Thi1s T4est 3a";

		String[] str=strtext.split(" ");

		int length = str.length;
		String strtext1="";
		//ArrayList<String> orderarray= new ArrayList<>();

		for(int i=0; i<length; i++){

			for(int j=0; j<length;j++) {

				if(str[j].contains(String.valueOf(i+1))) {

					strtext1=strtext1+" "+str[j];

					//System.out.print(strtext1);
					break;

				}

			}

		}
		return strtext1;

	}


	public static void digitroot() {


		int num;
		int sum=0;

		num=123487;



		while (num > 0 || sum > 9)  {
			//Swapping Sum = num for finding last digit two digit;
			if (num == 0) {

				num = sum;
				sum = 0;
			}

			int lastdigit= num%10;

			sum = sum+lastdigit;

			num = num/10;
		}

		System.out.println(sum);


	}

	public static int firstDuplicate() {

		int[] a= {1,2,3,5,1};

		int length = a.length;
		int count = 0;

		ArrayList<Integer>compare = new ArrayList<>();

		for(int i=0;i<length;i++){

			for(int j=0; j<length;j++){

				if(a[i]==a[j]){
					count++;
				}
			}

			if(count>1) {
				if(!compare.contains(a[i])) {
					compare.add(a[i]);

					System.out.println(a[i]);
				}
			}

			count = 0;
		}

		if(compare.isEmpty()) {
			System.out.println("No Duplicate");
		}

		return count;

	}

	//
	public static void readexcelsheetJava8() throws EncryptedDocumentException, IOException {

		FileInputStream fis= new FileInputStream("./FBP_Sheet.xls");
		Workbook workbook= new HSSFWorkbook(fis);

		Sheet sheet = workbook.getSheetAt(0);


		DataFormatter  dataFormatter = new DataFormatter();


		sheet.forEach(row->{
			row.forEach(cell->{
				String cellValue= dataFormatter.formatCellValue(cell);
				System.out.print(cellValue+"\t");
			});
			System.out.println();
		});

		workbook.close();

	}

	public static void reversestring() {

		String str= "My name is saranraj";

		StringBuffer str1= new StringBuffer(str);

		System.out.println(str1.reverse());
	}


	public static void missingnumber() {

		int[] a= {1,2,4,5,6,8,10};
	
		for(int i=0;i<a.length-1;i++) {
			
			int diff=a[i+1]-a[i];
						
			if(diff>1) {
				
				for(int j=1;j<diff;j++) {
					System.out.println(a[i]+j);
				}
				
			}
		
		}
	}

	public static void duplicateStringInArray() {

		String [] strarray= {"Saran", "Sam", "Viyan","Raj","Saran","Saran"};


		Set<String> store= new HashSet<>();

		for(int i=0;i<strarray.length;i++) {


			for(int j=i+1;j<strarray.length;j++) {

				String  str1=strarray[i];
				String  str2=strarray[j];

				if(!store.contains(strarray[i])) {
					if(str1==str2) {
						store.add(strarray[i]);
						System.out.println(strarray[i]);

					}
				}

			}

		}
	}

	public static void largestAndSmallestNumInArray() {

		int []num= {10,-8,-98,87985,474,-5,52};

		int largest= num[0];
		int smallest= num[0];


		for(int i=1;i<num.length;i++) {

			if(num[i]>largest) {

				largest=num[i];

			}
		}

		for(int i=1;i<num.length;i++) {

			if(num[i]<smallest) {

				smallest=num[i];
			}

		}

		System.out.println(largest);
		System.out.println(smallest);

	}


	public static void hashmapToArrayList() {


		Map<Integer, String>  map=new  HashMap<>();

		map.put(1,"Saran");
		map.put(2,"faran");
		map.put(3,"earan");
		map.put(4,"caran");


		ArrayList<Integer> key= new ArrayList<>(map.keySet());

		ArrayList<String>  value= new ArrayList<>(map.values());	

		for(Integer i:key) {

			System.out.println(i);	
		}

		for(String i:value) {

			System.out.println(i);		
		}


		ArrayList<Entry<Integer,String> >entry= new ArrayList<>(map.entrySet());


		for(Entry<Integer,String> e: entry) {


			System.out.println(e.getKey()+"--->"+e.getValue());

		}

	}


	public static void arrayListtoHashmap() {


		ArrayList<String> ary= new ArrayList<>();

		ary.add("Saran"); 
		ary.add("daran");
		ary.add("faran");
		ary.add("garan");
		ary.add("jaran");

		Map<Integer,String> map= new HashMap<>();

		//Map sycronizedMap= Collections.synchronizedMap(map);

		for(int i=1;i<=ary.size();i++) {

			//sycronizedMap.put( i,ary.get(i-1));

			map.put( i,ary.get(i-1));
		}

		System.out.println(map);

	}

	public static void isRotation() {

		String str1="ABCDE";
		String str2="EDCBA";


		char [] strArr2=str2.toCharArray();

		String str = "";

		for(int i=strArr2.length-1;i>=0;i--) {

			str=str+strArr2[i];

		}

		if(str.equals(str1)) {
			System.out.println("TRUE");
		}else {
			System.out.println("FALSE");
		}

		
	



	}


	public static void readexcelby3methods() {

		try(FileInputStream fis= new FileInputStream(new File("./FBP_Sheet.xls"));){

			Workbook workbook= new HSSFWorkbook(fis);
			DataFormatter data= new DataFormatter();

			Sheet sheet= workbook.getSheet("Sheet1");

			/***
			 * Reading excel using for each
			 */


			for(Row row:sheet) {
				for(Cell cell:row) {

					String cellvalue= data.formatCellValue(cell);
					System.out.print(cellvalue);

				}

				System.out.println();
			}

			/***
			 * Reading excel using lambda
			 */

			sheet.forEach(row->{
				row.forEach(cell->{

					String cellvalue=data.formatCellValue(cell);
					System.out.print(cellvalue);

				});

				System.out.println();
			});


			/***
			 * Reading excel using Iterator
			 */
			Iterator<Row>rowIterator= sheet.iterator();
			while(rowIterator.hasNext()) {

				Row row= rowIterator.next();

				Iterator<Cell> celliterator= row.iterator();

				while(celliterator.hasNext()) {

					Cell cell= celliterator.next();

					String cellvalue= data.formatCellValue(cell);
					System.out.print(cellvalue);

				}

				System.out.println();
			}

		}
		catch(Exception e){

		}
	}
	
	public static void XMLparser() throws ParserConfigurationException, SAXException, IOException {
		
		File xmlfile= new File("S:\\Personal\\MyWorkspace\\Mylearning\\test.xml");
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder dbuilder= dbFactory.newDocumentBuilder();
		
		Document doc = dbuilder.parse(xmlfile);
		
		doc.getDocumentElement().normalize();
		
		System.out.println("Root Element :"+ doc.getDocumentElement().getNodeName());
		
		NodeList nList = doc.getElementsByTagName("staff");
		
		
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

			}
		}
		
		
	}
	
	
	public static void concat1(String s1) {
		
		s1=s1+"saran";
		System.out.println(System.identityHashCode(s1));
				
	}
	
	public static void suminteger() {
		
		String str= "Input25";
		String str1=str.replaceAll("[^0-9]","");
		
		int sum=0;
		
		int num= Integer.parseInt(str1);
		
		
		while(num>0||sum>9)	{	
			
			if (num == 0) {

				num = sum;
				sum = 0;
			}
				
		int lastdigit=num %10;
		
		sum=sum+lastdigit;
		
		num=num/10;
		}
			
		System.out.println(sum);

}
	
	
	
	public static void segrgatteoand1() {

		int arr[]= {0,1,1,0,1,0,0,1,1,1};
		
		//Method1
		System.out.println("**********Method1**********");
		
		List<Integer> list= new ArrayList<>();
		
		int length= arr.length;
		
		for(int i=0;i<length;i++) {
			
			list.add(arr[i]);
		}
		
		Collections.sort(list);
		
		Object[] obj= list.toArray();
		
		for(Object num: obj) {
			System.out.print(num+" ");
			
		}
		
		//Method2
		System.out.println("**********Method2**********");
		int count = 0;
		
		for(int i=0; i<length;i++) {
			if(arr[i]==0) {
				
				count++;
			}
		}
		
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		
		for(int i=count;i<length;i++) {
			
			arr[i]=1;
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void ascendNumDecendString() {
		
		int a[]= {1,2,3};
		String b[]= {"a","b","c"};
		
		
	  int length1=a.length;
	  
	  
	  for(int i=0;i<length1;i++) {
		  
		  System.out.print(a[i]);
		  System.out.print(b[length1-i-1]);
	  }
	  
	}	
	
	public static void sumnum() {
		
		String str="abdc123e56";
		
		String str1=str.replaceAll("[^0-9]", "");
		
		int num= Integer.parseInt(str1);
		int sum=0;
		
		
		while(num>0||sum>9) {
			
			if(num==0) {
				num=sum;
				sum=0;
			}
			
			int lastdigit= num%10;
			
		
			sum=sum+lastdigit;
			
			num=num/10;
			
		}
		
		System.out.println(sum);
	
	}
	
	public static void factorial() {
		
		int fact =1,num=5;
		
		for(int i=1;i<=num;i++) {
			
			fact= fact*i;
		}
		
		System.out.println(fact);
	}
	
	
	public static void factorial1() {
		
	int num=	factorialrecursion(5);
	System.out.println(num);
		
	}
	
	public static int factorialrecursion(int n) {
		
		if(n==0) {
		return 1;
		
		}else {
			return n*factorialrecursion(n-1);
		}
		
		
		
	}
		
	public static void fibanocci() {
		
		int n1=0,n2=1,n3,num=10;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<=num;i++) {
			
			n3=n1+n2;
			
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;						
		}			
	}
	
	static int n1=0,n2=1,n3,num=10;
	public static void fibanocci1() {
		
		System.out.print(n1+" "+n2);
		
		fibanoccirecursion(num-2);
		
		
	}
	
	public static void fibanoccirecursion(int n) {
		
		if(n>=0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;				
		System.out.print(" "+n3);
		fibanoccirecursion(n-1);
		}
		
	}
	
	
	public static void regexspace() {
		
		String a= "My  name   is Saranraj";
		
		a=a.replaceAll("\\s", "1");//it will replace each whitespace character with given character 
		
		String a1=a.replaceAll("\\s+", "1");//it will replace each set of whitespace character with single given character 
		
		System.out.println(a);
		
		System.out.println(a1);
		
	}
	
	
	public static void duplicatearrayseperate() {
		
		int arr[] = {1,3,3,4,1,3,5};

		
		int length=arr.length;
		
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> list1= new ArrayList<>();
		
		for(int i=0;i<length;i++) { 
			
			
			for(int j=0;j<length;j++) {
				
				if(i!=j) {
				
				if(arr[i]==arr[j]) {
					
					if(!list.contains(arr[i])) {					
					list.add(arr[i]);	
					}

				}
			  }
			}

		}

		
		for(int k=0;k<length;k++) {
			
			if(!list.contains(arr[k])) { 
				list1.add(arr[k]);
			}
		}

		System.out.println(list);
		System.out.println(list1);		
	}
	
	

	public static void diamondnumberpattern(int n) {

		int sp = n / 2, st = 1;

		// Outer for loop for number of lines
		for (int i = 1; i <= n; i++) {

			// Inner for loop for printing space
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			// Inner for loop for printing number
			int count = st / 2 + 1;
			for (int k = 1; k <= st; k++) {
				System.out.print(count);
				if (k <= st / 2) {
					count--;
				} else {
					count++;
				}
			}

			// To goto next line
			System.out.println();
			if (i <= n / 2) {

				// sp decreased by 1
				// st increased by 2
				sp = sp - 1;
				st = st + 2;
			}

			else {

				// sp increased by 1
				// st decreased by 2
				sp = sp + 1;
				st = st - 2;
			}
		}

	}
	

	public  static void tokenizer() {
		
		System.out.println("Using the Constructor 1");
		
		StringTokenizer str1= new StringTokenizer("My name is Saranraj"," ");
		
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
		
	StringTokenizer str2= new StringTokenizer("SDET : JAVA : SELENIUM"," :");
		
		while(str2.hasMoreTokens()) {
			System.out.println(str2.nextToken());
		}
		
      StringTokenizer str3= new StringTokenizer("SDET : JAVA : SELENIUM"," :" , false);
		
		while(str3.hasMoreTokens()) {
			System.out.println(str3.nextToken());
		}
		
		
	}

	
	public static void exceptionexample() {
		
		
		///FileInputStream fis = new FileInputStream(new File(""));
		

	}
	
	
	public static void diamondstarpattern(int n) {
		
int space= n-1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=space;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.print("\n");
	space--;
}
space=0;
for(int i=n;i>=0;i--) {
	for(int j=1;j<=space;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.print("\n");
	space++;
}

	}
	
	 
	public static void vectorVSarraylist() {
		
		
		ArrayList<String> arr= new ArrayList<>();
		
		arr.add("Saran");
		arr.add("karan");
		arr.add("paran");
		arr.add("uaran");
		
		for(String a:arr) {
			System.out.println(a);
			
		}
		
		Iterator it=arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Vector<String> vec= new Vector<>();

		vec.add("Saran");
		vec.add("karan");
		vec.add("paran");
		vec.add("uaran");
		
		for(String a:vec) {
			System.out.println(a);
			
		}
		
		
		Enumeration e= vec.elements();
		
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}
		
	}
	
	public static void swapnumbers() {
		//method1: without using temp
		int x=10;
		int y=20;

		System.out.println("Before Swaping-Method1");
		System.out.println(x);
		System.out.println(y);

		System.out.println("After Swaping-Method1");

		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
		System.out.println(x);
		System.out.println(y);		

		//method2:with using temp
		int temp = 0; 
		int a=10;
		int b=20;
		System.out.println("Before Swaping-Method2");
		System.out.println(a);
		System.out.println(b);

		System.out.println("After Swaping-Method2");
		
		temp=a;
		a=b;
		b=temp;

		System.out.println(a);
		System.out.println(b);		

	}
	
	
	public static void sortarray(){
        
        int arr[]={0,1,7,5,0,3,4,0,0,8,0} ;
        //Expected output- {1,7,5,3,4,8,0,0,0,0,0}
        int count=0;
        for(int i=0;i<arr.length;i++){  
        	
            if(arr[i]!=0){           
              arr[  count++]=arr[i];
        }
        }
        
      int size=arr.length;
        
      while(count<size){
        
          arr[count++]=0;
        }
      
      System.out.println(Arrays.toString(arr));
        
    }
	
}



















