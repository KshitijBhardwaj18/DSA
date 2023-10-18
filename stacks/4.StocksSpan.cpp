void printSpan(int arr[], int n){
    for(int i = 0; i < n; i++){
        int span = 1;
        for(int j = i-1; j >= 0 && arr[j] <= arr[i]; j--){
            span++;
    cout<<span<<"+"<<" ";
        }
    }
}

int main(){
    printSpan([18,12,13,14,11,16],6);
}