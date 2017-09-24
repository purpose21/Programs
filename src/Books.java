class Books {

String title;
String author;

  
public static void main(java.lang.String [] args){

Books[] mybooks = new Books[3];
int x= 0;

mybooks[0]=new Books();
mybooks[1]=new Books();
mybooks[2]=new Books();

mybooks[0].title="Hello";
mybooks[1].title="Bol";
mybooks[2].title="Mat";

mybooks[0].author="Don";


mybooks[1].author="Hoon";

mybooks[2].author="Main";

while (x<3){
	
	
	System.out.println(mybooks[x].title);
	
	System.out.println(mybooks[x].author);
	x=x+1;
	}

}
}

