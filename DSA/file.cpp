#include<stdio.h>
int main(){
	FILE *fp;
	fp=fopen("data.txt","w");
	fprintf(fp,"how are you");
	fclose(fp);
	printf("Data written");
}