#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
int data;
node *link;
}*start=NULL;

node* insert(int data)
{
node *temp=(struct node*)malloc(sizeof(struct node));
temp->data=data;
if(start==NULL)
{
temp->link=NULL;
start=temp;
}
else
{
node *p=start;
while(p->link!=NULL)
{
p=p->link;
}
p->link=temp;
temp->link=NULL;
}
return temp;
}

node* swap(node **first,node **second)
{
node *p,*p1,*r,*r1,*temp;
p=p1=r=r1=temp=start;
while(p!=*first)
{
p1=p;
p=p->link;
}
while(r!=*second)
{
r1=r;
r=r->link;
}
temp=r->link;
r->link=p->link;
p->link=temp;
p1->link=r;
r1->link=p;
return start;
}

void display(node *start)
{
node *p=start;
while(p!=NULL)
{
printf("%d—–>",p->data);
p=p->link;
}
printf("\n");
}

int main()
{
start=insert(1);
node *node1=start;
node *node2=insert(2);
node *node3=insert(3);
node *node4=insert(4);
node *node5=insert(5);

printf("before swapping the list\n");
display(start);
start=swap(&node2,&node4);
printf("after swapping the list\n");
display(start);
getch();
return 0;
}