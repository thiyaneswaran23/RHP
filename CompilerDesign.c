#include <stdio.h>
#include <conio.h>
#include <ctype.h>
#include<string.h>

int isopr(char c){
    return (c=='+' || c=='-' || c=='*' || c=='/');
}

void printMnemonics(char op){
    if(op=='+') printf("ADD");
    if(op=='-') printf("SUB");
    if(op=='*') printf("MUL");
    if(op=='/') printf("DIV");
}
int main(){
    int n,i;
    char code[50];

    printf("Enter the number of intermediate code = ");
    scanf("/d",&n);
    for(int i=0;i<n;i++){
        int n,i;
    char code[50];

    printf("Enter number of intermediate codes: ");
    scanf("%d",&n);

    for(i=0;i<n;i++){
        printf("Enter code %d: ",i+1);
        scanf("%s",code);

        char lhs[20],op1[20],op2[20],opr;
        int j=0,k=0,m=0,p=0;

        while(code[j]!='='&&code[j]!='\0'){
            lhs[k++]=code[j++];
        }
        lhs[k]='\0';
        j++;

        while(!isopr(code[j])&&code[j]!='\0'){
            op1[m++]=code[j++];
        }
        op1[m]='\0';

        opr=code[j++];

        while(code[j]!='\0'){
            op2[p++]=code[j++];
        }
        op2[p]='\0';

        printf("\nMOV %s, R0",op1);
        printf("\nMOV %s, R1",op2);
        printf("\n");
        printMnemonics(opr);
        printf(" R0, R1");
        printf("\nMOV R1, %s\n",lhs);

    }
}
}