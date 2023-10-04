#include <bits/stdc++.h>
using namespace std;
#define MAX 1000

struct MyStackA {
    int *arr;
    int cap;
    int top;

    MyStackA(int c) {
        cap = c;
        arr = new int[cap];
        top = -1;
    }

    void push(int x) {
        if (top >= cap) {
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        return arr[top];
    }

    int size() {
        return (top + 1);
    }

    bool isEmpty() {
        return (top == -1);
    }
};

struct MystackV {
    vector<int> v;
    void push(int x) {
        v.push_back(x);
    }

    int pop() {
        if (v.empty()) {
            return -1;
        }
        int res = v.back();
        v.pop_back();
        return res;
    }

    int size() {
        return v.size();
    }

    bool isEmpty() {
        return v.empty();
    }
};



struct Node {
    int data;
    Node *next;
    Node(int d){
        data = d;
        next = NULL;
    }
};

struct MyStackL{
    Node *head;
    int sz;
    MyStackL(){
        head = NULL;
        sz=0;
    }

    void push(int x){
        Node *temp = new Node(x);
        temp->next=head;
        head = temp;
        sz++;
        
    }

    int pop(){
        if(head == NULL){
            return INT_MAX;

        }

        int res = head->data;
        Node *temp =  head;
        head = head->next;
        delete(temp);
        sz--;
        return res;
        
    }

    int size() {
        return sz;
    }

    bool isEmpty() {
        return head == NULL;

    }

    int peek(){
        if(head == NULL){
            return INT_MAX;
        }

        return head->data;
    }

}






int main() {
    MystackV s;  
    s.push(5);
    s.push(10);
    s.push(20);

    cout << s.pop() << endl;
    cout << s.size() << endl;
    cout << s.isEmpty() << endl;
}
