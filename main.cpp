#include<bits/stdc++.h>
using namespace std;
struct node{
    int key;
    int data;
    struct node *next;
};
 struct  node *head=NULL;
    struct node *curr=NULL;
void insertFirst(int key,int data){
    struct  node *newnode=(struct node*)malloc(sizeof(struct node));
    newnode->key=key;
    newnode->data=data;
    newnode->next=head;
    head=newnode;
}
void printlist(){
    if(head==NULL){
        cout << "list is empty" <<endl;
    }else{
        struct node *cur=head;
        while(cur!=NULL){
            cout<<"("<<cur->key<<","<<cur->data<<") ";
            cur=cur->next;
        }
        cout<<endl;
    }
}
 struct node* deleteFirst(){
    struct node *temp = head;
    head=head->next;
    return temp;
}
bool isEmpty(){
    return head==NULL;
}
int length(){
    struct node *temp=head;
    int l=0;
    while(temp != NULL){
        l++;
        temp=temp->next;
    }
    return l;
}
void find(int key,int data){
    if(head==NULL){
        cout<<"not found"<<endl;
        return;
    }
    struct node *temp=head;
    int k=1;
    while(temp != NULL){
        if(temp->key==key && temp->data==data){
            cout<<"value("<<key<<","<<data<<") stored at index : "<<k<<endl;
            return;
        }
        temp=temp->next;
        k++;
    }
    cout<<"not found"<<endl;
}
 void delet(int n){
    struct node *temp=head;
    int k=1;
    if(n==1){
        struct node *tem=deleteFirst();
        cout<<"deleted value: ("<<tem->next->key <<","<<tem->next->data<<")"<<endl;
        return;
        
    }
    while(temp !=NULL){
        if(k==n-1){
            cout<<"deleted value: ("<<temp->next->key <<","<<temp->next->data<<")"<<endl;
           temp->next=temp->next->next; 
           return;
        }
        k++;
        temp=temp->next;
    }
}

int main(){
    insertFirst(1,10);
    insertFirst(2,20);
     insertFirst(3,30);
    insertFirst(4,40);
     insertFirst(5,50);
    insertFirst(6,60);
    cout<<"original list: "<<endl;
    printlist();
    delet(3);
    cout<<"after delete list:"<<endl;
    printlist();
    find(3,30);
}