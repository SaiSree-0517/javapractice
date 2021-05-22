#include<bits/stdc++.h>
using namespace std;
int main() 
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++) 
	{
		cin>>arr[i];
	}
	int min=arr[0];
	int c=0;
	for(int i=0;i<n;i++) 
	{
		if(min>=arr[i])
		{
			min = arr[i];
			c++;
		}
	}
	cout<<"The discount given for the person is "<<min<<" and his count is "<<c;
}
