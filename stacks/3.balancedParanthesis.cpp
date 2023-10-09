

// Question is of parenthesis that should be balanced in nature. Equal number of parenthesis and the first one to open should be last one to be closed 

// example1 "([)]"  ans-> no
// example2 "((())" ans -> no
// exampl23 "([])" ans -> yes


#include <iostream>
#include <stack>
#include <string>

using namespace std;

bool isBalanced(string s) {
    stack<char> st;
    for (char c : s) {
        if (c == '(' || c == '[' || c == '{') {
            st.push(c);
        } else {
            if (st.empty()) {
                return false;
            } else if (c == ')' && st.top() != '(') {
                return false;
            } else if (c == ']' && st.top() != '[') {
                return false;
            } else if (c == '}' && st.top() != '{') {
                return false;
            } else {
                st.pop();
            }
        }
    }
    return st.empty();
}

int main() {
    string s;
    cout << "Enter a string with parentheses: ";
    cin >> s;
    if (isBalanced(s)) {
        cout << "The parentheses in the string are balanced." << endl;
    } else {
        cout << "The parentheses in the string are not balanced." << endl;
    }
    return 0;
}
