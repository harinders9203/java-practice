#include<stdio.h>
int main(){
	FILE *fp;
	char f[100];
	fp=fopen("data.txt","r");
	fgets(f,50,fp);
	printf("file contains:\n%s",f);
	fclose(fp);	
}