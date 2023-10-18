#include <iostream>
#include <stack>
using namespace std;

void returnPGE(int arr[], int size)
{

    stack<int> Stack;
    Stack.push(arr[0]);
    cout << "-1"
         << " ";

    for (int i = 1; i < size; i++)
    {

        while (Stack.empty() == false && Stack.top() <= arr[i])
        {
            Stack.pop();
        }

        int pg = (Stack.empty()) ? -1 : Stack.top();

        cout << pg << " ";
        Stack.push(arr[i]);
    }
}

int main()
{
    int arr[] = {20, 30, 10, 5, 15};
    returnPGE(arr, 5);
}