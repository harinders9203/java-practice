#include<stdio.h>
int main(){
	FILE *fp;
	fp=fopen("data.txt","a");
	fprintf(fp,"I'm here");
	fclose(fp);
	printf("data updated");
}