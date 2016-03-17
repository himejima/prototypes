#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

void reverse(char* str);

int main(void)
{
    char b[] = "abcdefg";
    reverse(b);
    cout << b << "\n";

    char s[] = {"ABCDEFGHIJ"};
    reverse(s);
    cout << s << "\n";

    return 0;
}

void reverse(char* str) {
    char tmp;
    int max_len;
    int middle_len;
    max_len = strlen(str);
    middle_len = max_len / 2;

    for (int i = 0; i < middle_len; i++) {
        tmp = str[i];
        str[i] = str[max_len - i - 1];
        str[max_len - i - 1] = tmp;
        // cout << str[max_len - i - 1] << "\n";
    }

    /// cout << tmp << "\n";
}
