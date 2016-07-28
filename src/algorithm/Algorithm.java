package algorithm;
//ArrayList공부
//입출력  공부

//http://01027921288.tistory.com/entry/JAVA%EB%91%90%EA%B0%80%EC%A7%80-for-%EB%B0%98%EB%B3%B5%EB%AC%B8

import java.util.ArrayList;
import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args){
		//Range();
		//SortingThreeNumbers();
		//CircleInRectangle();
		//PrintTestClass();
		//SwappringTwoNumbers();
		//HowManyDivisors13d();
		//ABProblem14a();
		//Circle14b();
		//SimpleCalculator();
		//MisMaxSum14d();
		//PrintARectangle15a();
		//PrintAFrame();
		//PrintAChessBoard15c();
		//StructuredProgram15d();
		//RevercingNumbers16a();
		//FindingMissingCards16b();
		//OfficialHouse16c();
		//MatrixVectorMultiplication();
		//StructuredProgram2_Grading17a();
		//StructuredProgram2_HOwMAnyWays17b();
		//StructuedProgram2_Spreadsheet17c();
		//StructredProgram2_MatrixMultiprication17d();
		//Character_ToggringCases18a();
		//Charactor_SUmOfNumbers18b();
		Character_COuntingCharacters18c();
	}


	private static void Character_COuntingCharacters18c() {
		Scanner scanner = new Scanner(System.in);
		char[] str = scanner.nextLine().toCharArray();
		int[] count = new int[26];

		for(int i=0;i<str.length; i++){  //to count characters
			if('A'<=str[i] && str[i]<='Z'){
				count[str[i]-'A']++;
			}
			else if('a'<=str[i] && str[i]<='z'){
				count[str[i]-'a']++;
			}
		}

		for(int i=0; i<26; i++){
			System.out.println((char)(i+'a') +" : " + count[i]);
		}
	}


	private static void Charactor_SUmOfNumbers18b() {
		Scanner scanner = new Scanner(System.in);
		char[] x;

		do{
			x = scanner.nextLine().toCharArray();

			if(x[0]-'0'==0){
				break;
			}

			int sum = 0;
		    for(int i=0; i<x.length; i++){
		    	sum += x[i]-'0';
		    }
		    System.out.println(sum);
		}while(x[0]-'0'!=0);
	}


	private static void Character_ToggringCases18a() {
		Scanner scanner = new Scanner(System.in);
		char[] inputs = scanner.nextLine().toCharArray();//!!

		for(int i = 0; i < inputs.length; i++){
			if('A' <= inputs[i] && inputs[i] <= 'Z'){
				inputs[i] =Character.toLowerCase(inputs[i]);
			}
			else if('a'<=inputs[i] && inputs[i]<='z'){
				inputs[i] = Character.toUpperCase(inputs[i]);
			}
		}

		System.out.print(inputs);
	}


	private static void StructredProgram2_MatrixMultiprication17d() {
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int l = scanner.nextInt();

		int[][] matrix1 = new int[n][m];
		int[][] matrix2 = new int[m][l];
		int[][] answer = new int[n][l];

		int i,j;

		for(i=0; i<n; i++){ //input1/2
			for(j=0; j<m; j++){
				matrix1[i][j] = scanner.nextInt();
			}
		}
		for(i=0; i<m; i++){ //input2/2
			for(j=0; j<l; j++){
				matrix2[i][j] = scanner.nextInt();
			}
		}
		for(i=0; i<n; i++){ //calculation & output
			System.out.println();
			for(j=0; j<l; j++){
				for(int z=0; z<m; z++){
					answer[i][j] += matrix1[i][z] * matrix2[z][j];
				}
				System.out.print(answer[i][j] + " ");
			}
		}

	}


	private static void StructuedProgram2_Spreadsheet17c() {
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int c = scanner.nextInt();
		int[][] matrix = new int[r+1][c+1];
		int i,j;

		for(i=0; i<r; i++){
			for(j=0; j<c; j++){
				matrix[i][j] = scanner.nextInt();

				matrix[i][c]+=matrix[i][j];
				matrix[r][j]+=matrix[i][j];
			}
			matrix[r][c]+=matrix[i][c];
		}

		for(i=0; i<r+1; i++){
			System.out.println();

			for(j=0; j<c+1; j++){
				System.out.print(matrix[i][j] + " ");
			}
		}
	}


	private static void StructuredProgram2_HOwMAnyWays17b() {
		Scanner scanner = new Scanner(System.in);
		int n,x;

		do{
			int count = 0;
			n = scanner.nextInt();
			x = scanner.nextInt();
			if(n==0 && x==0){
				break;
			}

			for(int i = 1; i < n-1; i++){
				for(int j = i+1; j < n; j++){
					for(int k = j+1; k <= n; k++){

						if((i+j+k)==x){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}while(n !=0 && x != 0);

	}


	private static void StructuredProgram2_Grading17a() {
		Scanner scanner = new Scanner(System.in);
		int m,f,r,sum;

		while(true){
			m = scanner.nextInt();
			f = scanner.nextInt();
			r = scanner.nextInt();
			sum=m+f;

			if(m==-1 && f==-1 && r==-1) break;

			if(m==-1 || f==-1){
				System.out.println("F");
				continue;
			}
			else if(80 < sum){
				System.out.println("A");
				continue;
			}
			else if(65 <= sum && sum < 80){
				System.out.println("B");
				continue;
			}
			else if(50 <= sum && sum < 65){
				System.out.println("C");
				continue;
			}
			else if(30 <= sum && sum < 50){
				if(r >= 50){
					System.out.println("C");
					continue;
				}
				else{
					System.out.println("D");
					continue;
				}
			}
			else if(sum < 30){
				System.out.println("F");
				continue;
			}
		}
	}


	private static void MatrixVectorMultiplication() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int[][] matrix = new int[n][m];
		int[] vector = new int[m];
		int[] answer = new int[n];

		int i,j;

		for(i = 0 ; i<n;i++){
			for(j = 0; j<m; j++){
				matrix[i][j] = scanner.nextInt();
			}
		}
		for(i = 0; i<m; i++){
			vector[i] = scanner.nextInt();
		}

		for(i = 0; i<n; i++){    //calculation
			for(j = 0; j<m; j++){
				answer[i] += matrix[i][j]*vector[j];
			}
			System.out.println(answer[i]);
		}
	}


	private static void OfficialHouse16c() {
		Scanner scanner = new Scanner(System.in);
		int[][][] house = new int[4][3][10]; //동,충,호
		int n = scanner.nextInt();

		for(int i=0;i<n;i++){ //input
			int b = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();
			int v = scanner.nextInt();
			house[b-1][f-1][r-1]+=v;
		}
		//output
		for(int bb=0; bb<4; bb++){
			if(bb!=0){
				System.out.println("####################");
			}
			for(int ff=0;ff<3;ff++){
				for(int rr=0;rr<10;rr++){
					System.out.print(" "+house[bb][ff][rr]);
				}
				System.out.println();
			}
		}
	}


	private static void FindingMissingCards16b() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String mark ="";
		int lank = 0;

		boolean[][] cards = new boolean[4][13];

		for(int i=0; i<n ;i++){ //to input cards
			mark = scanner.next();
			lank = scanner.nextInt();

			switch(mark){
			case "S":
				cards[0][lank-1] = true;
				break;
			case "H":
				cards[1][lank-1] = true;
				break;
			case "C":
				cards[2][lank-1] = true;
				break;
			case "D":
				cards[3][lank-1] = true;
				break;
			default:
					break;
			}
		}

		System.out.println("");
		for(int i=0; i<13; i++){ //speed
			if(cards[0][i]==false){
				System.out.println("S " + (i+1));
			}
		}
		for(int i=0; i<13; i++){ //hart
			if(cards[1][i]==false){
				System.out.println("H " + (i+1));
			}
		}
		for(int i=0; i<13; i++){ //clab
			if(cards[2][i]==false){
				System.out.println("C " + (i+1));
			}
		}
		for(int i=0; i<13; i++){ //dia
			if(cards[3][i]==false){
				System.out.println("D " + (i+1));
			}
		}
	}


	private static void RevercingNumbers() {
		Scanner scanner = new Scanner(System.in);
		int i;
		int n = scanner.nextInt();

		int[] numbers = new int[n];

		for(i=0; i<n ;i++){
			numbers[i] = scanner.nextInt();
		}
		/*for(int x:numbers){
			System.out.print(x+" ");
		}*/
		for(i=n-1; i>=0;i--){
			System.out.print(numbers[i]);
			if(i !=0){
				System.out.print(" ");
			}
		}
	}


	private static void StructuredProgram15d() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i=1; i<=n; i++){
			int x = i;
			if(x%3==0){ System.out.print(" "+ i); }
			else do{
				if(x%10==3){ System.out.print(" "+ i); }
			}while((x/=10)!=0);
		}
	}


	private static void PrintAChessBoard15c() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int[] hlist = new int[30];
		int[] wlist = new int[30];

		do{
			hlist[count] = scanner.nextInt();
			wlist[count] = scanner.nextInt();
			count++;
		}while(hlist[count-1] != 0 && wlist[count-1] !=0);

		for(int i=0; i<count; i++){
			System.out.println("");
			for(int h=0;h<hlist[i]; h++){
				System.out.println("");
				if(h%2==0){
					for(int w=0;w<wlist[i];w++){
						if(w%2==0){System.out.print("#");}
						else{System.out.print(".");}
					}
				}
				else{
					for(int w=0;w<wlist[i];w++){
						if(w%2==0){System.out.print(".");}
						else{System.out.print("#");}
					}
				}
			}

		}

	}


	private static void PrintAFrame() {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int[] hlist = new int[30];
		int[] wlist = new int[30];

		do{
			hlist[count] = scanner.nextInt();
			wlist[count] = scanner.nextInt();
			count++;
		}while(hlist[count-1] != 0 && wlist[count-1] !=0);

		for(int i=0; i<count; i++){
			System.out.println("\n");

			for(int w=0; w<wlist[i]; w++){
				System.out.print("#");
			}

			for(int h=0; h<(hlist[i]-2); h++){
				System.out.print("\n#");
				for(int w=0; w<(wlist[i]-2);w++){
					System.out.print(".");
				}
				System.out.print("#");
			}
			System.out.println("");
			for(int w=0; w<wlist[i]; w++){
				System.out.print("#");
			}
		}
	}


	private static void PrintARectangle15a() {
		Scanner scanner = new Scanner(System.in);
		int[] hlist = new int[30];
		int[] wlist = new int[30];
		int count = 0;

		do{
			hlist[count]=scanner.nextInt();
			wlist[count]=scanner.nextInt();
			count++;
		}while(hlist[count-1]!=0 && wlist[count-1] != 0);

		for(int i = 0 ; i<count; i++){
			System.out.println("");
			for(int h=0; h<hlist[i]; h++){
				for(int w=0; w<wlist[i]; w++){
					System.out.print("#");
				}
				System.out.println("");
			}
		}
		/*LinkedList<Integer> H = new LinkedList<Integer>();
		LinkedList<Integer> W =new LinkedList<Integer>();
		do{
			H.add(scanner.nextInt());
			W.add(scanner.nextInt());
		}while(H.peekLast() != 0 && W.peekLast() != 0);

		while(H.peek() != 0 && W.peek() != 0){
			System.out.println("");
			for(int i = 0; i < H.poll();i++){
				for(int j = 0; i < W.poll(); j++){
					System.out.print("#");
				}
				System.out.println("");
			}
		}*/
	}


	private static void MisMaxSum14d() {//array불필요했네
		Scanner scanner = new Scanner(System.in);
		int max,min;
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		numbers[0]=scanner.nextInt();
		max=numbers[0];
		min=numbers[0];
		int sum = numbers[0];
		for(int i = 1;i<n;i++){
			numbers[i]=scanner.nextInt();
			sum+=numbers[i];
			if(max<numbers[i]){
				max=numbers[i];
			}
			if(min>numbers[i]){
				min=numbers[i];
			}
		}
		System.out.print(min+" "+max+" "+sum);
	}


	private static void SimpleCalculator() {
		Scanner scanner = new Scanner(System.in);

		int a=0,b=0;
		String op ="";
		ArrayList<Integer>result = new ArrayList<Integer>();

		while(!op.equals("?")){
			a = scanner.nextInt();
			op = scanner.next();
			b = scanner.nextInt();
			switch(op){
			case "+":
			 	result.add(a+b);
			 	break;
			 case "-":
			 	result.add(a-b);
			 	break;
			 case "*":
			 	result.add(a*b);
			 	break;
			 case "/":
			 	result.add(a/b);
			 	break;
			 default:
			 	break;
			 	}
		 }
		 for(int r:result){
			 System.out.println(r);
		 }

		     /* try{
		     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		     while(true){
		       String str = br.readLine();

		     }

		      System.out.println("今入力されたデータは:" + str + "です");

		  }catch(IOException e){
		       System.out.println("Exception :" + e);    }
		    } */
	}


	private static void Circle14b() {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextInt();
		System.out.print(r*r*3.14+" "+2*r*3.14); //MATH.PI
		}


	private static void ABProblem14a() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int d = a/b;
		int r = a%b;
		double f = a/(double)b;
		System.out.print(d+" "+r+" "+f);
	}


	private static void HowManyDivisors13d() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int count = 0;

		for(int i = a;i<=b;i++){
			if((c%i)==0){
				count++;
			}
		}
		System.out.print(count);

	}


	private static void SwappringTwoNumbers() {
		Scanner scanner = new Scanner(System.in);
		int[][] dataset = new int[3000][3000];
		int i = 0;
		while(i<3000){
			dataset[i][0] = scanner.nextInt();
			dataset[i][1] = scanner.nextInt();
			if(dataset[i][0]==0 && dataset[i][1]==0){
				break;
			}
			if(dataset[i][0] > dataset[i][1]){
				int tmp = dataset[i][0];
				dataset[i][0] = dataset[i][1];
				dataset[i][1] = tmp;
			}
			i++;
		}
		for(int j=0;j<=i;j++){
			System.out.println(dataset[j][0] + " " + dataset[j][1]);
		}
	}


	private static void PrintTestClass() {
		Scanner scan = new Scanner(System.in);
		int i=0;
		int[] dataSet = new int[10000];
		while(i<10000){
			dataSet[i] = scan.nextInt();
			if(dataSet[i]==0){
				break;
			}
			i++;
		}
		for(int j=0;j<=i;j++){
			System.out.println("case "+(j+1)+": "+ dataSet[j]);
		}
	}


	private static void CircleInRectangle() {
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();

		if(((x-r)>=0)&&((y-r)>=0)&&((x+r)<=W)&&((y+r)<=H)){
			System.out.print("yes");
		}
		else System.out.print("no");

	}


	private static void SortingThreeNumbers(){
		int[] number = new int [3];
		int i,tmp;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<3;i++){
			 number[i] = sc.nextInt();
		}
		for(int j=0;j<2;j++){
			for(i=j+1;i<3;i++){
				if((tmp=number[j])>number[i]){
					number[j]=number[i];
					number[i]=tmp;
				}
			}
		}
		for(i=0;i<3;i++){
			System.out.print(number[i]+" ");
		}
	}


	public static void Range(){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if((x<y)&&(y<z)){
			System.out.print("yes");
		}
		else {
			System.out.print("no");
		}
	}

}



