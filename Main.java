class ll{
    
    ll(){
        
    }
    node first;
    public int size=0;
    public class node{
        int n;
        node next;
        
        node(int n){
            this.n=n;
            this.next=null;
            size++;
        }
    }
    
   public void addFirst(int n){
       node newnode=new node(n);
       if(first == null){
           first=newnode;
       }
       newnode.next=first;
       first=newnode;
   }
    public void addlast(int n){
        node newnode = new node(n);
        if(first == null){
            first=newnode;
            return;
        }
       node cnode=first;
        while(cnode.next!=null){
            cnode=cnode.next;
        }
        cnode.next=newnode;
    }
     public void display(){
        if(first==null){
            System.out.println("Empty list:");
        }
        node cnode=first;
        while(cnode != null){
            System.out.print(cnode.n+"   " );
            cnode=cnode.next;
        }
        System.out.println();
    }
    
    public void linkdelet(int n){
       
        node cnode=first;
        node lnode=first;
        int k=2;
        if(n==1){
            System.out.println("deleted num is : "+first.n);
            first=first.next;
            size--;
            return;
        }
        while(cnode != null){
            if(k==n){
                System.out.println("deleted num is : "+cnode.next.n);
                lnode.next=cnode.next;
                size--;
                return;
            }
            k++;
            lnode=cnode;
            cnode=cnode.next;
        }
    }
    //
    //que-3
    //
     public void traverse(int n){
        node cnode=first;
        int k=0;
        int f=0;
        while(cnode.next != null){
            k=k+1;
          if(cnode.n ==n){
              f=1;
              break;
          }  
          cnode=cnode.next;
        }
        if(f==1){
            System.out.println(k);
        }else{
            System.out.println(-1);
        }
    }
    //
    //que-4
    //
     public void deletgreter25(){
       
        node cnode=first;
        node lnode=first;
        
        while(cnode != null){
            if(cnode.n > 25){
                size--;
                if(cnode == lnode){
                    cnode=cnode.next;
                    lnode=lnode.next;
                    first=first.next;
                }else{
                lnode.next=cnode.next;
                cnode=cnode.next;
                }
            }else{
            
            lnode=cnode;
            cnode=cnode.next;
            }
        }
    }
   
   
}
public class Main
{
	public static void main(String[] args) {
	 
	 ll list = new ll();
	 //
	 //que 2: addFirst, addLast,display,size function
	 //
	 list.addlast(4);
	 list.addlast(7);
	 list.addlast(20);
	 list.addlast(30);
	 list.addlast(20);
	 list.addlast(50);
	 list.addFirst(80);
	 //
	 //que 2: delet element in the list by index.
	 //
	 list.linkdelet(6);
	 //
	 //que 4:find index of element in list.
	 //
	 System.out.print("index of 7 in the list is:");
	 list.traverse(7);
	  list.display();
	  //
	  //que-5: delet all value greter than 25 in the list
	  //
	 list.deletgreter25();
	 System.out.println("list after delet value greter than 25 ");
	 list.display();
	 
	 
	}
}